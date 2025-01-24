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

        System.out.println("Enter data to insert into tree : ");
        int data = sc.nextInt();

        TreeNode newNode = new TreeNode(data);

        System.out.println("Do you want to insert data at left of ( " + newNode.data + " ) node : (Y|N)");
        char choice = sc.next().charAt(0);
        if(choice == 'Y' || choice == 'y'){

            newNode.left = buildBinaryTree();
        }

        System.out.println("Do you want to insert data at right of ( " + newNode.data + " ) node : (Y|N)");
        choice = sc.next().charAt(0);
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
    void takeMirrorImage(TreeNode root){

        if(root == null){

            return;
        }
        takeMirrorImage(root.left);
        takeMirrorImage(root.right);
        swap(root, root.left, root.right);
    }

    private void swap(TreeNode root, TreeNode left, TreeNode right){

        root.left = right;
        root.right = left;
    }
    
    // 2. Check if two trees are identical or not
    public static boolean isIdentical(TreeNode root1, TreeNode root2){

        // If both nodes are null then they are identical so return true
        if(root1 == null && root2 == null){

            return true;
        }

        // If any of them is not null then trees are not identical
        if(root1 == null || root2 == null){

            return false;
        }

        if(root1.data == root2.data && isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right)){

            return true;
        }

        return false;
    }

    // 3. Find the number of nodes which is greater than all his ansisters
    public static int countNodesHavingValueGreaterThenAnsisters(TreeNode root, int maxAnsister){

        if(root == null){

            return 0;
        }

        int count = 0;
        if(root.data > maxAnsister){
            
            // Update count and maxAnsister
            count = 1;
            maxAnsister = root.data;
        }

        int leftCount = countNodesHavingValueGreaterThenAnsisters(root.left, maxAnsister);
        int rightCount = countNodesHavingValueGreaterThenAnsisters(root.right, maxAnsister);

        // Count is having value either 0 or 1.
        return leftCount + rightCount + count;
    }

    public static void main(String[] args){

        TreeNode root = null;
        BinaryTree_Questions bt = new BinaryTree_Questions();

        root = bt.buildBinaryTree();
        TreeNode tempRoot = root;
        
        System.out.println("Pre-order of Binary tree : "); 
        bt.printPreOrder(root);
        
        // Identical trees
        System.out.println("Check that two trees are identical or not :");
        if(bt.isIdentical(root, null)){

            System.out.println("Identical");
        }else{

            System.out.println("Not Identical");
        }

        // Take mirror image
        System.out.println("Take mirror image :");
        bt.takeMirrorImage(root);
        System.out.println("Pre-order of Mirrored Binary tree : "); 
        bt.printPreOrder(root);
        
        System.out.println("Check that two trees are identical or not :");
        
        // Find count of nodes greater than ansisters
        System.out.println("Count of nodes greater than ansisters = " + bt.countNodesHavingValueGreaterThenAnsisters(root, root.data));
        }
}
