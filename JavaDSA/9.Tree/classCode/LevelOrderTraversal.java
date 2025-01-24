import java.util.Queue;
import java.util.Scanner;
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

    final Scanner sc = new Scanner(System.in);
	
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
			
				System.out.println();	// print next line(go to next line)
				if(que.isEmpty()){
					
					break;
				}
			}
		}
	}

    // Approach #3
    TreeNode buildTreeByBFS(){

        int data = sc.nextInt(); 

        TreeNode newNode = new TreeNode(data);
        
        Queue<TreeNode> que = new LinkedList<>();
        que.add(newNode);

        TreeNode tree = null;
        while(!que.isEmpty()){

            TreeNode node = que.remove();
            int left = sc.nextInt();
            int right = sc.nextInt();

            if(left != -1){

                node.left = new TreeNode(left);
                tree.left = node.left;
                que.add(node.left);
            }

            if(right != -1){

                node.right = new TreeNode(right);
                tree.right = node.right;
                que.add(node.right);
            }
        }

        return tree;

    }

	int index = -1;
	
    // Built tree from array
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

    // 1. Print the nodes that are are present at K_th level
    void printNodesAtKthLevel(TreeNode root, int k){

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
    void printAllNodesAtEachLevel(TreeNode root){

        // These way having time complexity O(N^2) and it always start from root 
        // so it is not optimized way
        for(int i = 0; i < heightOfBT(root); i++){ // N

            printNodesAtKthLevel(root, i); // N
            System.out.println("");
        }
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

    // Height of binary tree
    int heightOfBT(TreeNode root){

        if(root == null){

            return 0;
        }

        int leftHeight = heightOfBT(root.left);
        int rightHeight = heightOfBT(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
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

        // Print nodes by k_th level
        bt.printNodesAtKthLevel(root, 0);
        System.out.println("");
        bt.printNodesAtKthLevel(root, 1);
        System.out.println("");
        bt.printNodesAtKthLevel(root, 2);
        System.out.println("");
        bt.printNodesAtKthLevel(root, 3);
        System.out.println("");

        // Print all nodes level order brute force
        bt.printAllNodesAtEachLevel(root);

        // Built tree by BFS
        TreeNode newTree = bt.buildTreeByBFS();
        bt.printAllNodesAtEachLevel(newTree);
	}
}
