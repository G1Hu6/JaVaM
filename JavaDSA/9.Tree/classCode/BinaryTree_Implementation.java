import java.util.Scanner;

class Node{
	
	int data;
	Node left;
	Node right;

	/*
	 This constructor is used to create node having left and right sub-tree as null.
	*/
	Node(int data){
	
		this.data = data;
		left = right = null;
	}
}

class BinaryTree{

	Scanner sc = new Scanner(System.in);

	Node constructBT(){
	
		System.out.println("Enter data for Node :");
		int data = sc.nextInt();

		Node newNode = new Node(data);

		System.out.println("Do you want to enter data at left of Node " + newNode.data + " : (Y/N)");
		char leftNode = sc.next().charAt(0);
		if(leftNode == 'y' || leftNode == 'Y'){
		
			newNode.left = constructBT();
		}

		System.out.println("Do you want to enter data at right of Node " + newNode.data + " : (Y/N)");
		char rightNode = sc.next().charAt(0);
		if(rightNode == 'y' || rightNode == 'Y'){
		
			newNode.right = constructBT();
		}

		return newNode;
	} 

	void inOrderBT(Node root){
	
		if(root == null){
			
			return;
		}	

		inOrderBT(root.left);
		System.out.print(root.data + " ");
		inOrderBT(root.right);
	}

	void preOrderBT(Node root){
	
		if(root == null){
			
			return;
		}	

		System.out.print(root.data + " ");
		preOrderBT(root.left);
		preOrderBT(root.right);
	}
	
	void postOrderBT(Node root){
	
		if(root == null){
			
			return;
		}	

		postOrderBT(root.left);
		postOrderBT(root.right);
		System.out.print(root.data + " ");
	}

	public static void main(String[] args){
		
		Node root = null;

		BinaryTree bt = new BinaryTree();
		root = bt.constructBT();

		System.out.print("Pre-Order Traversal = ");
		bt.preOrderBT(root);
		System.out.println();
		
		System.out.print("In-Order Traversal = ");
		bt.inOrderBT(root);
		System.out.println();
		
		System.out.print("Post-Order Traversal = ");
		bt.postOrderBT(root);
		System.out.println();
	}
}
