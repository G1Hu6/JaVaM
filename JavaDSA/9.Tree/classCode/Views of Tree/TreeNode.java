public class TreeNode{

    int data;
    TreeNode left;
    TreeNode right;
 
    TreeNode(int data){
 
        this.data = data;
        left = right = null;
    }

    @Override
    public String toString(){
        return "( " + this.left + " ) <-- ( " + this.data + " ) --> ( " + this.right + " )";
    }
}
