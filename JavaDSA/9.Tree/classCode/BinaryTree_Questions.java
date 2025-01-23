class TreeNode{

    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data){

        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree_Questions{

    java.util.Scanner sc = new java.util.Scanner(System.in);

    // Build binary tree
    TreeNode buildBinaryTree(){

        System.out.println("Enter data to insert into tree : ")
        int data = sc.nextInt();

        TreeNode newNode = new TreeNode(data);

        System.out.println("Do you want to insert data at left of ( " + newNode.data + " ) node : (Y|N)");
        int choice = sc.nextLine().charAt(0);
        if(choice == 'Y' || choice == 'y'){

            newNode.left = buildBinaryTree();
        }

        System.out.println("Do you want to insert data at right of ( " + newNode.data + " ) node : (Y|N)");
        choice = sc.nextLine().charAt(0);
        if(choice == 'y' || choice == 'Y'){

            newNode.right = buildBinaryTree();
        }

        return newNode;
    }

    // Print tree in pre-order
    void printPreOrder(TreeNode root){

        if(root == null){

            return;
        }

        System.out.println(root.data);
        printPreOrder(root.left);
        printPreOrder(root.right);
    }

    // 1. Take mirror image of binary tree
    void takeMirrorImage(Node root){

        if(root == null){

            return;
        }
        takeMirrorImage(root.left);
        takeMirrorImage(root.right);
        swap(root, root.left, root.right);
    }

    private swap(TreeNode root, TreeNode left, TreeNode right){

        root.left = right;
        root.right = left;
    }
    
    public static void main(String[] args){

        TreeNode root = null;
        BinaryTree_Questions bt = new BinaryTree_Questions();

        root = bt.buildBinaryTree();

        System.out.println("Pre-order of Binary tree : " + bt.printPreOrder(root));
    }
}
