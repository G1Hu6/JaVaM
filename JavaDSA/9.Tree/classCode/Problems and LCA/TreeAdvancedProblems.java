import java.util.List;
import java.util.ArrayList;


class HDPair{

    int height;
    int diameter;

    HDPair(int height, int diameter){

        this.height = height;
        this.diameter = diameter;
    }
}

class TreeAdvancedProblems{

    // 1. Search element in BST
    boolean findNode(TreeNode root, int key){

        if(root == null){

            return false;
        }

        if(root.data == key){

            return true;
        }

        return findNode(root.left, key) || findNode(root.right, key);
    }

    // 2. Print the path of target element
    //    If the element is present in the path then either one of
    //    the recursive call will return true
    boolean printPath(TreeNode root, int target){

        if(root == null){

            return false;
        }

        if(root.data == target){

            System.out.print(root.data + " ");
            return true;
        }

        if(printPath(root.left, target) || printPath(root.right, target)){

            System.out.print(root.data + " ");
            return true;
        }

        return false;
    }

    // 2. Print path of each leaf node from root
    void printRoot2LeafPaths(TreeNode root, List<Integer> list){

        // Base Case 1
        if(root == null){

            return;
        }

        // Base Case 2
        if(root.left == null && root.right == null){

            list.add(root.data);
            System.out.println(list);
            list.remove((Object)root.data);

            return;
        }

        // Recursion
        list.add(root.data);
        printRoot2LeafPaths(root.left, list);
        printRoot2LeafPaths(root.right, list);

        list.remove((Object)root.data);
        return;
    }

    // 3. Diameter of Tree :- Largest distance between any two nodes on
    //                        the tree.
    //    Algorithm 1 :- PreOrder Approach
    //    Time Complexity :- O(N * H) = O(N^2)
    //    Space Complexity :- O(H)
    int diameterOfTree(TreeNode root){

        if(root == null){

            return 0;
        }

        int leftHeight = heightOfBT(root.left);
        int rightHeight = heightOfBT(root.right);

        int diameter1 = leftHeight + rightHeight;
        int diameter2 = diameterOfTree(root.left);
        int diameter3 = diameterOfTree(root.right);

        return Math.max(diameter1, Math.max(diameter2, diameter3));
    }

    // Algorithm 2 :- PostOrder + BottomUp Approach
    HDPair diameterOfTreePostOrder(TreeNode root){

        if(root == null){

            return new HDPair(0, 0);
        }

        HDPair leftPair = diameterOfTreePostOrder(root.left);
        HDPair rightPair = diameterOfTreePostOrder(root.right);

        int height = Math.max(leftPair.height, rightPair.height) + 1;
        int diameter = Math.max(leftPair.height + rightPair.height, Math.max(leftPair.diameter, rightPair.diameter));

        return new HDPair(height, diameter);
    }

    private int heightOfBT(TreeNode root){

        if(root == null){

            return 0;
        }

        int leftHeight = heightOfBT(root.left);
        int rightHeight = heightOfBT(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args){

        BinarySearchTreeOperations op = new BinarySearchTreeOperations();
        
        TreeAdvancedProblems pro = new TreeAdvancedProblems();

        TreeNode root = null;
        root = op.buildBinarySearchTreeFromInputs(root);

        System.out.println("---------------------- Advanced Tree Questions -----------------------");
        System.out.println("Path to target node : " + 10);
        pro.printPath(root, 10); 

        System.out.println("Print path to all leaf nodes :-");
        List<Integer> list = new ArrayList<>();
        pro.printRoot2LeafPaths(root, list);

        int[] nodes = new int[]{ 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, 7, -1, -1, 8, -1, -1};
        TreeNode tree = TreeOperations.buildTreeFromArray(nodes);
        int diameter = pro.diameterOfTreePostOrder(tree).diameter;
        System.out.println("Diameter of Tree :- " + diameter);
    }
}
