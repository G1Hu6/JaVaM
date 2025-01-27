class SearchElementInSimpleBinaryTree{

    // Binary Tree is not optimized for searching.
    // Use Binary Search Tree (BST) for searching...
    // Write a code for searching element in Binary Tree.
    boolean searchElement(TreeNode root, int element){

        if(root == null){

            return false;
        }

        // If anyone of them is true then return true
        if(root.data == element || searchElement(root.left) || searchElement(root.right)){

            return true;
        }

        return false;
    }
}
