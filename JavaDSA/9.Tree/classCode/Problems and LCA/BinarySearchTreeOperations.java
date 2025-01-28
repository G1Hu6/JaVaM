
import java.util.Scanner;
 
public class BinarySearchTreeOperations{
    
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

}
