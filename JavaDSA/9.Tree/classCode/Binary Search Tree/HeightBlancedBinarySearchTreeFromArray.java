
// 1. Given a sorted array, build a height blanced blanced binary tree.
//    Input :- [1, 2, 4, 8, 9, 10, 20, 30]

class HeightBlancedBinarySearchTreeFromArray{

    TreeNode buildBSTFromArray(int[] nodes, int start, int end){

        if(start > end){
            
            return null;
        }

        int mid = (start + end)/2;
        TreeNode root = new TreeNode(nodes[mid]);
        root.left = buildBSTFromArray(nodes, start, mid-1);
        root.right =buildBSTFromArray(nodes, mid+1, end);

        return root;
    }

    public static void main(String[] args){

        int[] nodes = new int[]{ 1, 2, 4, 8, 9, 10, 20, 30};

        HeightBlancedBinarySearchTreeFromArray bst = new HeightBlancedBinarySearchTreeFromArray();
        TreeNode root = bst.buildBSTFromArray(nodes, 0, nodes.length-1);
        TreeOperations.inOrderBT(root);
        System.out.println(new CheckGivenTreeIsBST().isValidBSTWithPreOrder(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
}
