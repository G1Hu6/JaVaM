import java.util.*;

class NqueenProblem{

    //(1).Given a NxN board, fit N queens on this chess board such that no queen cuts any other queen.
    // Time complexity = O(N^N)
    // Space complexity = O(N + N^2)
    boolean findOneSolution(int[][] chess, int i, int n){

        // base case
        if(i == n){
            printBoard(chess);
            return true;
        }

        // recursive case
        for(int j = 0; j < n; j++){

            if(isSafe(chess, i, j, n)){
                chess[i][j] = 1; // place queen
                
                boolean success = findOneSolution(chess, i + 1, n);
                if(success){
                    // comment this line to get all possible solutions (hack)
                    return true; // prune search
                }
                // is not success then try other position
                // backtrack step
                chess[i][j] = 0;
            }
        }
        //no success in ith row
        return false;
    }

    int findAllSolutions(int[][] chess, int i, int n){

        // base case
        if(i == n){
            printBoard(chess);
            System.out.println("-------------------------------------------------------------");
            return 1;
        }

        // recursive case
        int count = 0;
        for(int j = 0; j < n; j++){

            if(isSafe(chess, i, j, n)){
                chess[i][j] = 1; // place queen
                
                count  += findAllSolutions(chess, i + 1, n);
                // backtrack step
                chess[i][j] = 0;
            }
        }
        //no success in ith row
        return count;
    }

    boolean isSafe(int[][] chess, int i, int j, int n){

        // check any queen present in jth colum.
        for(int x = 0; x < i; x++){
            if(chess[x][j] == 1){
                return false;
            }
        }
        // check left digonal
        int x = i - 1;
        int y = j - 1;
        while(x >= 0 && y >= 0){
            if(chess[x][y] == 1){
                return false;
            }
            x -= 1;
            y -= 1;
        }
        // check right digonal
        x = i - 1;
        y = j + 1;
        while(x >= 0 && y < n){
            if(chess[x][y] == 1){
                return false;
            }
            x -= 1;
            y += 1;
        }

        // safe
        return true;
    }
    
    void printBoard(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static void main(String[] args){

        NqueenProblem obj = new NqueenProblem();
        int N = 10;
        int board[][] = new int[N][N];
        System.out.println("One possible solution :-");
        obj.findOneSolution(board, 0, N);
        System.out.println("\nAll possible solutions :-");
        System.out.println("Total ways to solve :- " + obj.findAllSolutions(board, 0, N));
    }
}
