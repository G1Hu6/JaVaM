import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class BinaryTreeOperationsFromArray{

    static Scanner sc = new Scanner(System.in);
	
    // Basic Approach #1
	public static void levelOrder(TreeNode root){
	
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

    // Level Order traversal from left to right
	public static void levelOrderRightToLeft(TreeNode root){
	
		Queue<TreeNode> que = new LinkedList<>();

		que.add(root);

		while(!que.isEmpty()){
		
			TreeNode tempNode = que.remove();

			if(tempNode == null){
			
				break;
			}else{
			
				System.out.print(tempNode.data + " ");

                if(tempNode.right != null){
				
					que.add(tempNode.right);
				}
				
                if(tempNode.left != null){
				
					que.add(tempNode.left);
				}
			}
		}
	}

	// Approach #2
	public static void levelOrderWithNull(TreeNode root){
	
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
    public static TreeNode buildTreeByBFS(){

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

	static int index = -1;
	
    // Built tree from array
	public static TreeNode buildTreeFromArray(int nodesArr[]){
	
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

	public void preOrderBT(TreeNode root){
	
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

}
