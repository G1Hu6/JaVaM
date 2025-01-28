import java.util.*;

class LowestCommonAnsisters{

     boolean printPath(TreeNode root, int target, List<Integer> pathList){
         
        if(root == null){

            return false;
        }

        if(root.data == target){

            System.out.print(root.data + " ");
            pathList.add(root.data);
            return true;
        }

        if(printPath(root.left, target, pathList) || printPath(root.right, target, pathList)){

            System.out.print(root.data + " ");
            pathList.add(root.data);
            return true;
        }

        return false;
    }
    // Find lowest common ansister for given two nodes
    
    List<Integer> pathNum1 = new ArrayList<>();
    List<Integer> pathNum2 = new ArrayList<>();
    
    // For BT
    public int findLCA(TreeNode root, int num1, int num2){
        
        printPath(root, num1, pathNum1);
        Collections.reverse(pathNum1);
        System.out.println(pathNum1);
        printPath(root, num2, pathNum2);
        Collections.reverse(pathNum2);
        System.out.println(pathNum2);

        int i = 0;
        for(; i <= Math.min(pathNum1.size(), pathNum2.size())-1; i++){

            if(pathNum1.get(i) != pathNum2.get(i)){

                break;
            }
        }

        return pathNum1.get(i-1);
    }

    // For BST
    int findLCAForBST(TreeNode root, int num1, int num2){

        //if(root == null) return -1;

        if(num1 > root.data && num2 > root.data){

            return findLCAForBST(root.right, num1, num2);
        }else if(num1 < root.data && num2 < root.data){

            return findLCAForBST(root.left, num1, num2);
        }else{

            return root.data;
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        TreeOperations op = new TreeOperations();
        int[] nodes = new int[]{3, 7, 8, -1, -1, -1, 9, 6, 18, 33, 41, -1, -1, -1, 12, 19, 17, -1, -1, -1, -1, 14, -1, 25, -1, 14, -1, -1, 4, -1, 9, -1, -1};
        TreeNode root = op.buildTreeFromArray(nodes);

        System.out.println("Enter two numbers :- ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int lca = new LowestCommonAnsisters().findLCA(root, num1, num2);
        System.out.println("LCA :- " + lca);
    }
}
