class TreeAdvancedProblems{

    // 1. Search element in BST
    boolean findNode(TreeNode root, int key){

        if(root == null){

            return false;
        }

        if(root.data == key){

            return true;
        }

        return findNode(root.left, key) || findNode(root.right, key);
    }

    // 2. Print the path of target element
    //    If the element is present in the path then either one of
    //    the recursive call will return true
    boolean printPath(TreeNode root, int target){

        if(root == null){

            return false;
        }

        if(root.data == target){

            System.out.print(root.data + " ");
            return true;
        }

        if(printPath(root.left, target) || printPath(root.right, target)){

            System.out.print(root.data + " ");
            return true;
        }

        return false;
    }

    public static void main(String[] args){

        BinarySearchTreeOperations op = new BinarySearchTreeOperations();
        
        TreeAdvancedProblems pro = new TreeAdvancedProblems();

        TreeNode root = null;
        root = op.buildBinarySearchTreeFromInputs(root);
        pro.printPath(root, 10);
        
    }
}
