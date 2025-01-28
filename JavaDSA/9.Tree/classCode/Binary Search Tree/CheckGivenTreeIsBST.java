
// 2. Check if a binary tree is a binary search tree or not
// Approach 1 :- Inoreder is an sorted array
// Approach 2 :- If root lies between max of left sub-tree and min of right sub-tree
//               then it is BST

public class CheckGivenTreeIsBST{

    // Approach 2
    // Algorithm 1 :- Preorder traversal with Top-Down approach
    // Time Complexity :- O(N^2)
    // Space Complexity :- O(H)
    boolean isValidBSTWithPreOrder(TreeNode root, int minValue, int maxValue){

        if(root == null){

            return true;
        }

        if( (root.data >= minValue && root.data <= maxValue) && isValidBSTWithPreOrder(root.left, minValue, root.data-1) && isValidBSTWithPreOrder(root.right, root.data+1, maxValue)){
            
            return true;
        }

        return false;
    }

}
