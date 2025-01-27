import java.util.Scanner;
/*
    (*) Binary Search Tree
        
        1. BST is optimized for searching just like HashMap.
        2. Property :- All nodes having value greater than rooot node are
                       placed in right subtree.
                       All nodes having value lesser then or equal to are 
                       placed in left subtree.
        3. left.data <= root.data < right.data  Or left.data < root.data <= right.data
        4. If left subtree is BST and right subtree is also BST then complete tree may
           or may not BST.
        5. Time complexity to search element in BST is 
                O(logN) <=  O(H)  <= O(N)
            [balanced-tree]     [skewed-tree]

    (*) Balanced Binary Tree/BST
        1. A binary tree or binary search tree is height blanced if height of left
           subtree and right subtree differ by at max 1.
        2. | H_LST - H_RST | <= 1
*/

class BinarySearchTreeOperations{
    
    static Scanner sc;

    BinarySearchTreeOperations(){

        sc = new Scanner(System.in);
    }

    // Insert node in BST
    private TreeNode insertNodeInBinarySearchTree(TreeNode root, int value){

        if(root == null){

            TreeNode newNode = new TreeNode(value);
            root = newNode;

            return root;
        }

        if(root.data < value){

            root.right = insertNodeInBinarySearchTree(root.right, value);
        }else{

            root.left = insertNodeInBinarySearchTree(root.left, value);
        }

        return root;
    }

    // 1. Given N inputes, write a function to construct BST.
    // Iterative
    TreeNode buildBinarySearchTreeFromInputs(TreeNode root){

        System.out.println("Enter value of how may nodes you want? :");
        int n = sc.nextInt();

        System.out.println("Enter data :-");
        for(int i = 0; i < n; i++){ // O(N)

            int data = sc.nextInt();
            // Insert this node in binary search tree at correct position.
            root = insertNodeInBinarySearchTree(root, data); // O(H) [ H = height of tree ]
        }
        // Time Complexity :- O(N * H) = O(N^2)
        
        return root;
    }

    // Recursive
    int lastIdx = -1;
    TreeNode buildBinarySearchTreeFromInputsRecursive(TreeNode root, int index){

        if(index == lastIdx){

            return root;
        }
        
        int data = sc.nextInt();
        root = insertNodeInBinarySearchTree(root, data);
        return buildBinarySearchTreeFromInputsRecursive(root, index+1);
    }

    // 2. In above BST, write a function to search element in BST
    // Approach 1 :- Iterative
    boolean searchElement(TreeNode root, int element){

        while(root != null){

            if(root.data == element){

                return true;
            }else if(root.data < element){

                root = root.right;
            }else{

                root = root.left;
            }
        }

        return false;
    }

    // Approach 2 :- Recursive
    boolean searchElementRecursive(TreeNode root, int element){

        if(root == null){

            return false;
        }

        if(root.data == element){

            return true;
        }

        if(root.data < element){

            return searchElementRecursive(root.right, element);
        }
        
        // root.data >= element
        return searchElementRecursive(root.left, element);
    }

    public static void main(String[] args){

        BinarySearchTreeOperations bst = new BinarySearchTreeOperations();

        TreeNode root = null;
        // Iterative
        // root = bst.buildBinarySearchTreeFromInputs(root);
        
        System.out.println("---------------------- BST -----------------------");
        // Recursive
        System.out.println("Enter value of total nodes :-");
        bst.lastIdx = sc.nextInt();
        
        System.out.println("Enter data :-");
        root = bst.buildBinarySearchTreeFromInputsRecursive(root, 0);

        // Inorder of BST is always sorted
        System.out.println("Inorder of BST :-");
        TreeOperations.inOrderBT(root);


        System.out.println("\n---------------------- Search Element in  BST -----------------------");
        System.out.println("Enter element to search :-");
        int element = sc.nextInt();

        boolean isPresent = bst.searchElementRecursive(root, element);
        if(isPresent){

            System.out.println("Node ( "+ element + " ) is Present.");
        }else{

            System.out.println("Node ( "+ element + " ) is NotPresent.");
        }
    }
}
