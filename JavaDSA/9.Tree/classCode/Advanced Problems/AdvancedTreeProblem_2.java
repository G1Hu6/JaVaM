
import java.util.Stack;

class AdvancedTreeProblem_2{
    
    // 4. Given a binary search tree (BST), and a target value find the closest value to the target
    //    present in the tree.
    //    [ Assume one closest value always exists ]

    // Approach 1:- Brute Force 
    //              Traverse and trak the minium distance |target - node.data|
    // Time Complexity:- O(N)
    int closestNode = -1;
    void findClosestNodeInBST(TreeNode root, int target, int minDifference){

        if(root == null){

            return;
        }

        if(Math.abs(target - root.data) < minDifference){

            minDifference = Math.abs(target - root.data);
            closestNode = root.data;
        }

        findClosestNodeInBST(root.left, target, minDifference);
        findClosestNodeInBST(root.right, target, minDifference);
    }

    // Approach 2:- Optimized
    //              Traverse only one branch
    // Time Complexity:- O(H)  [ O(log N) <= O(H) <= O(N) ]
    int findClosestItr(TreeNode root, int target){

        TreeNode tempNode = root;
        int closestNode = tempNode.data;
        int minDifference = Integer.MAX_VALUE;

        while(tempNode != null){

            int diff = Math.abs(target - tempNode.data);

            if(diff < minDifference){
                
                // Update minium difference till now and answer
                minDifference = diff;
                closestNode = tempNode.data;
            }
            
            if(tempNode.data < target){
                // Go right
                tempNode = tempNode.right;
            }else if(tempNode.data > target){
                // Go left
                tempNode = tempNode.left;
            }else{

                return tempNode.data;
            }
        }

        return closestNode;
    }

    // Approach 2:- Recursive
    int answer = -1;

    int findClosestRec(TreeNode root, int target, int minDifference){

        // Base case
        
        // Recursive case
        int diff = Math.abs(target - root.data);
        if(diff < minDifference){

            minDifference = diff;
            answer = root.data;
        }

        if(root.data < target && root.right != null){

            findClosestRec(root.right, target, minDifference);
        }else if(root.data > target && root.left != null){

            findClosestRec(root.left, target, minDifference);
        }

        return answer;
    }

    // 2. Iterative way for PreOrder traversal
    void printInOrderIterative(TreeNode root){

        Stack<TreeNode> s = new Stack<>();
        TreeNode temp = root;

        while(!s.empty() || temp != null){

            // left
            while(temp != null){

                s.push(temp);
                temp = temp.left;
            }

            // pop
            temp = s.peek();
            s.pop();
            System.out.print(temp.data + " ");

            // right
            temp = temp.right;
        }
    }

    public static void main(String[] args){
        
        AdvancedTreeProblem_2 pro = new AdvancedTreeProblem_2();

        //-------------------------- Advanced Tree Questions 2 ------------------------------//
        TreeOperations op = new TreeOperations();
        int nodes[] = new int[]{10, 5, 3, 1, -1, -1, -1, 8, -1, -1, 15, 12, -1, 14, -1, -1, 20, 18, -1, -1, 22, -1, -1};
        TreeNode root = op.buildTreeFromArray(nodes);
        System.out.println("------------------ Tree ------------------");
        op.printAllNodesAtEachLevel(root);
        System.out.println("------------------ Tree ------------------");
        
        int target = 17;
        int result = pro.findClosestItr(root, target);

        System.out.println("------------------ Iterative ------------------");
        System.out.println("Closest Node from target " + target + " is : " + result );
        
        result = pro.findClosestRec(root, target, Integer.MAX_VALUE);
        System.out.println("------------------ Recursive ------------------");
        System.out.println("Closest Node from target " + target + " is : " + result );
        pro.findClosestNodeInBST(root, target, Integer.MAX_VALUE);
        System.out.println("Closest Node from target " + target + " is : " + pro.closestNode);
        
        System.out.println("-------------------- Iterative InOrder ----------------");
        pro.printInOrderIterative(root);
    }
}
