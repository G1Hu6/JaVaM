class Pair{

    TreeNode head;
    TreeNode tail;

    Pair(TreeNode head, TreeNode tail){

        this.head = head;
        this.tail = tail;
    }
}

class AdvancedTreeProblems{

    // 1. Sum of all nodes in tree
    int sumOfAllNodes(TreeNode root){

        if(root == null){

            return 0;
        }

        return root.data + sumOfAllNodes(root.left) + sumOfAllNodes(root.right);
    }

    // 2. Replace every nodes in tree with sum of all its desendants expect leaf nodes.
    // Approach 1:- PreOrder Traversal [Not optimized]
    void replaceNodes(TreeNode root){

        if(root == null){

            return;
        }

        if(root.left == null && root.right == null){

            root.data = sumOfAllDecendents(root);
        }else{
        
            root.data = sumOfAllDecendents(root) - root.data;
        }

        replaceNodes(root.left);
        replaceNodes(root.right);
    }

    // Approach 2:- PostOrder Traversal
    int replaceNodesWithSumOfDecendents(TreeNode root){

        if(root == null){

            return 0;
        }

        if(root.left == null && root.right == null){

            return root.data;
        }

        int leftSum = replaceNodesWithSumOfDecendents(root.left);
        int rightSum = replaceNodesWithSumOfDecendents(root.right);
        int tempData = root.data;
        root.data = leftSum + rightSum;
        return root.data + tempData;
    }

    private int sumOfAllDecendents(TreeNode root){

        if(root == null){

            return 0;
        }

        if(root.left == null && root.right == null){

            return root.data;
        }

        return root.data + sumOfAllDecendents(root.left) + sumOfAllDecendents(root.right);
    }

    // 3. Convert binary search tree to singly linked list.
    Pair tree2LinkedList(TreeNode root){
        
        // Case 1:- If left and right are null
        if(root.left == null && root.right == null){

            return new Pair(root, root);
        }

        // Case 2:- Only right is null
        if(root.left != null && root.right == null){

            Pair leftPairLL = tree2LinkedList(root.left);
            leftPairLL.tail.right = root;
            root.left = null;

            return new Pair(leftPairLL.head, root);
        }
        // Case 3:- Only left is null
        else if(root.left == null && root.right != null){

            Pair rightPairLL = tree2LinkedList(root.right);
            root.left = rightPairLL.head;

            return new Pair(root, rightPairLL.tail);
        }
        // Case 4 :- Both left and right are exists
        else{

            Pair leftPairLL = tree2LinkedList(root.left);
            Pair rightPairLL = tree2LinkedList(root.right);
            
            leftPairLL.tail.right = root;
            root.right = rightPairLL.head;
            root.left = null;
            
            return new Pair(leftPairLL.head, rightPairLL.tail);
        }

    }

    public static void main(String[] args){
       
        AdvancedTreeProblems pro = new AdvancedTreeProblems();

        TreeOperations op = new TreeOperations();
        int[] nodes = new int[]{5, 3, 2, 1, -1, -1, -1, 4, -1, -1, 7, 6, -1, -1, 8, -1, -1};
        TreeNode root = op.buildTreeFromArray(nodes);
        System.out.println("----------------- Tree -----------------");
        op.printAllNodesAtEachLevel(root);
        System.out.println("----------------- Tree -----------------");
        System.out.println("Sum of all nodes : " + pro.sumOfAllNodes(root));

        System.out.println("Replace with sum of decendents");
        //pro.replaceNodes(root);
        //pro.replaceNodesWithSumOfDecendents(root);
        op.printAllNodesAtEachLevel(root);
        
        System.out.println("Tree 2 Linked List :-");
        Pair sortedLinkedList = pro.tree2LinkedList(root); 
        TreeNode tempNode = sortedLinkedList.head;
        while(tempNode.right != null){

            System.out.print( tempNode.data + " --> ");
            tempNode = tempNode.right;
        }
    }
}
