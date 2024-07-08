/*
 Q.(1) Construct a binary tree from a given Array of nodes.
       int nodesArr = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1}
       here -1 represents null in the tree.
 */

class TreeNode{

	int data;
	TreeNode left;
	TreeNode right;

	TreeNode(int data){
	
		this.data = data;
		left = right = null;
	}
}

class BinaryTreeQue{

	int index = -1;
	
	TreeNode buildTreeFromArray(int nodesArr[]){
	
		index++;
		if(nodesArr[index] == -1){
			
			return null;
		}

		TreeNode newNode = new TreeNode(nodesArr[index]);
		newNode.left = buildTreeFromArray(nodesArr);
		newNode.right = buildTreeFromArray(nodesArr);

		return newNode;
	}	

	/* Q.(2) Count the total nodes in Binary Tree. */

	int countNodes(TreeNode root){
	
		if(root == null){
		
			return 0;
		}
		
		int leftSTCount = countNodes(root.left);
		int rightSTCount = countNodes(root.right);
		
		return leftSTCount + rightSTCount + 1;
	}

	/* Q.(3) Find the Sum of Binary Tree */

	int sumOfBT(TreeNode root){
		
		if(root == null){
		
			return 0;
		}

		int sumOfLST = sumOfBT(root.left);	// Sum of Leftsub tree
		int sumOfRST = sumOfBT(root.right);	// Sum of Righttsub tree

		return sumOfLST + sumOfRST + root.data;
	}
	
	/* Q.(4) Find Height of Binary Tree */
	
	int max(int heightOfLST, int heightOfRST){
	
		if(heightOfLST <= heightOfRST){
			
			return heightOfRST;
		}else{
		
			return heightOfLST;
		}
	}

	int heightOfBT(TreeNode root){
	
		if(root == null){
			
			return 0;
		}

		int heightOfLST = heightOfBT(root.left);	// Height of Leftsub Tree
		int heightOfRST = heightOfBT(root.right);	// Height of Rightsub Tree
	
		return max(heightOfLST, heightOfRST) + 1;
	}

	void preOrderBT(TreeNode root){
	
		if(root == null){
		
			return;
		}

		System.out.print(root.data + " ");
		preOrderBT(root.left);
		preOrderBT(root.right);
	}
	
	void inOrderBT(TreeNode root){
	
		if(root == null){
		
			return;
		}

		inOrderBT(root.left);
		System.out.print(root.data + " ");
		inOrderBT(root.right);
	}

	void postOrderBT(TreeNode root){
	
		if(root == null){
		
			return;
		}
	
		postOrderBT(root.left);
		postOrderBT(root.right);
		System.out.print(root.data + " ");
	}

	public static void main(String[] args){
	
		int[] nodesArr = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

		BinaryTreeQue bt = new BinaryTreeQue();
		TreeNode root = bt.buildTreeFromArray(nodesArr);

		System.out.print("Pre-Order Traversal = ");
		bt.preOrderBT(root);
		System.out.println();
		
		System.out.print("In-Order Traversal = ");
		bt.inOrderBT(root);
		System.out.println();

		System.out.print("Post-Order Traversal = ");
		bt.postOrderBT(root);
		System.out.println();
		
		System.out.println("Total Nodes = "+ bt.countNodes(root));
		System.out.println("Total Sum of Nodes = " + bt.sumOfBT(root));
		System.out.println("Height of Tree = " + bt.heightOfBT(root));
	}
}
