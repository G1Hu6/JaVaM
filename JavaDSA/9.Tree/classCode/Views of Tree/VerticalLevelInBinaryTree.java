// Find Vertical level print of binary tree

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

class VerticalLevelInBinaryTree{

    // 1. First find vertical distance of each node
    void printVerticalDistanceWithEachNode(TreeNode root, int distance){

        if(root == null){

            return;
        }

        // Print distance
        System.out.println("Node (" + root.data + ") --> VerticalDistance ( " + distance +" )");

        // Magic :- try with pre and post increment, decrement operators...
        // If we are traversing left of node then decrement distance by 1 (Relative distance)
        printVerticalDistanceWithEachNode(root.left, distance-1);
        // If we are traversing right of node then increment distance by 1 (Relative distance)
        printVerticalDistanceWithEachNode(root.right, distance+1);
    }


    // 2. Use HashMap to store all nodes having key as same distance
    HashMap<Integer, List<TreeNode>> levelMap = new HashMap<>();
    
    void printVerticalLevelOfBinaryTree(TreeNode root, Integer distance){

        if(root == null){

            return;
        }

        // Get the list of nodes if present otherwise create new add respected node
        List<TreeNode> selectedNodes = levelMap.getOrDefault(distance, new ArrayList<>());
        selectedNodes.add(root);
        levelMap.put(distance, selectedNodes);
        
        /*
        for (Map.Entry<Integer, List<TreeNode>> entry : levelMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        */

        // If we are traversing left of node then decrement distance by 1 (Relative distance)
        printVerticalLevelOfBinaryTree(root.left, distance-1);
        // If we are traversing right of node then increment distance by 1 (Relative distance)
        printVerticalLevelOfBinaryTree(root.right, distance+1);
    }

    Integer maxValue = Integer.MIN_VALUE;
    Integer minValue = Integer.MAX_VALUE;
    int findMaxKey(int key){

        if(key > maxValue){

            maxValue = key;
        }

        return maxValue;
    }

    int findMinKey(int key){

        if(key < minValue){

            minValue = key;
        }

        return minValue;
    }

    public static void main(String[] args){
    
        VerticalLevelInBinaryTree vertiLevel = new VerticalLevelInBinaryTree();

        int[] nodes = new int[]{ 9, 6, 2, 7, -1, 14, -1, -1, 11, -1, -1, 3, 5, -1, 19, -1, -1, -1, 4, 8, -1, -1, 1, 12, -1, -1, -1 };
        TreeNode root = BinaryTreeOperationsFromArray.buildTreeFromArray(nodes);
        BinaryTreeOperationsFromArray.printAllNodesAtEachLevel(root);

        // Vertical Distance with node
        System.out.println("Vertical distance with each respective node :");
        vertiLevel.printVerticalDistanceWithEachNode(root, 0);
        

        System.out.println("Find Vertical Distance Recursively :-");
        vertiLevel.printVerticalLevelOfBinaryTree(root, 0);
        for (Map.Entry<Integer, List<TreeNode>> entry : vertiLevel.levelMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        int maxKey = 0, minKey = 0;
        for(int key : vertiLevel.levelMap.keySet()){

            maxKey = vertiLevel.findMaxKey(key);
            //System.out.println(maxKey);
            minKey = vertiLevel.findMinKey(key);
            //System.out.println(minKey);
        }

        //System.out.println(maxKey);
        //System.out.println(minKey);
        System.out.println("Vertical Level in BT :");
        for(int i = minKey; i <= maxKey; i++){

            for(TreeNode node : vertiLevel.levelMap.get(i)){

                System.out.print(node.data + " ");
            }
            System.out.println();
        }
        
    }
}
