import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

class ViewsOfTrees{

    // Algorithm 1 :- Iterative
    // Left View :- First element of each level. (Node bofore null in level order travelsal)
    void leftViewOfTree(TreeNode root){

            Queue<TreeNode> que = new LinkedList<>();
            que.add(root);
            System.out.println(root.data);
            que.add(null);

            while(!que.isEmpty()){

                TreeNode tempNode = que.poll();
                if(tempNode == null){

                    if(que.isEmpty()){

                        return;
                    }else{

                        System.out.println(que.peek().data);
                        que.add(null);
                    }
                }else{
            
                    if(tempNode.left != null){

                        que.add(tempNode.left);
                    }
                    
                    if(tempNode.right != null){

                        que.add(tempNode.right);
                    }
                }
            }
    }

    
    // Algorithm 2 :- Recursive
    int maxLevel = -1;

    void leftViewOfTreeRecursive(TreeNode root, int level){

        if(root == null){

            return;
        }
        if(level > maxLevel){

            // Then we are at first node of level
             System.out.println(root.data);
             maxLevel = level;
        }

        leftViewOfTreeRecursive(root.left, level+1);
        leftViewOfTreeRecursive(root.right, level+1);
    }

    public static void main(String[] args){

        ViewsOfTrees view = new ViewsOfTrees();

        int[] nodes = new int[]{1, 2, 3, -1, -1, 4, -1, -1, 5, -1, 6, -1, 7, -1, -1};
        TreeNode root = BinaryTreeOperationsFromArray.buildTreeFromArray(nodes);
        
        System.out.println("Iterative Algorithm :-");
        view.leftViewOfTree(root);
        
        //BinaryTreeOperationsFromArray.printAllNodesAtEachLevel(root);    
        
        System.out.println("Recursive Algorithm :-");
        view.leftViewOfTreeRecursive(root, 0);
            
    }
}
