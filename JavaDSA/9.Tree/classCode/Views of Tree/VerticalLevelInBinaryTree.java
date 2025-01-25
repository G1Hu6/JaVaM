// Find Vertical level print of binary tree

import java.util.HashMap;
import java.util.List;

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
    
    void printVerticalLevelOfBinaryTree(TreeNode root, int distance){

        if(root == null){

            return;
        }

        // Get the list of nodes if present otherwise create new add respected node
        levelMap.getOrDefault(distance).add(root);

        // If we are traversing left of node then decrement distance by 1 (Relative distance)
        printVerticalDistanceWithEachNode(root.left, distance-1);
        // If we are traversing right of node then increment distance by 1 (Relative distance)
        printVerticalDistanceWithEachNode(root.right, distance+1);
    }

    Integer maxValue = Integer.MIN_VALUE;
    Integer minValue = Integer.MAX_VALUE;
    private int findMaxKey(int key){

        if(key > maxValue){

            maxValue = key;
        }

        return maxValue;
    }

    private int findMinkey(int key){

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
        
        int maxKey, minKey;
        for(int key : vertiLevel.levelMap.keySet()){

            maxKey = vertiLevel.findMaxKey(key);
            minKey = vertiLevel.findMinKey(key);
        }

        System.out.println("Vertical Level in BT :");
        for(int i = minKey; i <= maxKey; i++){

            for(TreeNode node : vertiLevel.levelMap.get(i)){

                System.out.println(node.data);
            }
        }
        
    }
}
