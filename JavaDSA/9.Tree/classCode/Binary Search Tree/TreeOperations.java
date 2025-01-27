public class TreeOperations{

    public static void preOrderBT(TreeNode root){
	
		if(root == null){
		
			return;
		}

		System.out.print(root.data + " ");
		preOrderBT(root.left);
		preOrderBT(root.right);
	}
	
	public static void inOrderBT(TreeNode root){
	
		if(root == null){
		
			return;
		}

		inOrderBT(root.left);
		System.out.print(root.data + " ");
		inOrderBT(root.right);
	}

	public static void postOrderBT(TreeNode root){
	
		if(root == null){
		
			return;
		}
	
		postOrderBT(root.left);
		postOrderBT(root.right);
		System.out.print(root.data + " ");
	}

    // Height of binary tree
    public static int heightOfBT(TreeNode root){

        if(root == null){

            return 0;
        }

        int leftHeight = heightOfBT(root.left);
        int rightHeight = heightOfBT(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

     // 1. Print the nodes that are are present at K_th level
    public static void printNodesAtKthLevel(TreeNode root, int k){

        if(root == null){

            return;
        }

        // If value of k is 0 then we reached to target level
        if(k == 0){

            System.out.print(root.data + " ");
            return;
        }

        // Otherwise do reverse call by decrementing k
        printNodesAtKthLevel(root.left, k-1);
        printNodesAtKthLevel(root.right, k-1);
    }

    // 2. Print all nodes present at each level
    public static void printAllNodesAtEachLevel(TreeNode root){

        // These way having time complexity O(N^2) and it always start from root
        // so it is not optimized way
        for(int i = 0; i < heightOfBT(root); i++){ // N

            printNodesAtKthLevel(root, i); // N
            System.out.println("");
        }
    }
}
