import java.util.Queue;
import java.util.LinkedList;

class TreeNode{

	int data;
	TreeNode left;
	TreeNode right;

	TreeNode(int data){
	
		this.data = data;
		left = right = null;
	}
}

class BinaryTreeLevelOrder{

	// Basic Approach #1
	
	void levelOrder(TreeNode root){
	
		Queue<TreeNode> que = new LinkedList<>();

		que.add(root);

		while(!que.isEmpty()){
		
			TreeNode tempNode = que.remove();

			if(tempNode == null){
			
				break;
			}else{
			
				System.out.print(tempNode.data + " ");

				if(tempNode.left != null){
				
					que.add(tempNode.left);
				}

				if(tempNode.right != null){
				
					que.add(tempNode.right);
				}
			}
		}
	}


	// Approach #2
	
	void levelOrderWithNull(TreeNode root){
	
		Queue<TreeNode> que = new LinkedList<>();

		que.add(root);
		que.add(null);

		while(!que.isEmpty()){
			
			TreeNode tempNode = que.remove();

			if(tempNode == null){
			
				System.out.println();	// Print next line(go to next line)

				if(que.isEmpty()){
				
					break;
				}else{
				
					que.add(null);
				}
			}else{

				System.out.print(tempNode.data + " ");

				if(tempNode.left != null){
				
					que.add(tempNode.left);
				}

				if(tempNode.right != null){
				
					que.add(tempNode.right);
				}

			}
		}
	}	

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

		BinaryTreeLevelOrder bt = new BinaryTreeLevelOrder();
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

		bt.levelOrder(root);
		System.out.println();
		bt.levelOrderWithNull(root);
	}
}			
