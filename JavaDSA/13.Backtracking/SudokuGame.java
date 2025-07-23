import java.util.*;

class SudokuGame{

    boolean solveSudoku(int board[][], int i, int j, int n){

        if(i == n){
            printBoard(board);
            return true;
        }

        // recursive case
        // cross the right boundry to next row
        if(j == n){
            return solveSudoku(board, i + 1, 0, n);
        }
        // prefilled cell
        if(board[i][j] != 0){
            return solveSudoku(board, i, j + 1, n);
        }
        //blank cell
        for(int number = 0; number <= n; number++){
            if(canPlace(board, i, j, number, n)){
                board[i][j] = number;
                boolean success = solveSudoku(board, i, j + 1, n);
                if(success){
                    //return true;
                }
                // backtrack step ->
            }
        }
        // backtrack step
        board[i][j] = 0;
        return false;
    } 

    private void printBoard(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    private boolean canPlace(int[][] board, int i, int j, int number, int n){

        // row and column
        for(int x = 0; x < n ; x++){
            if(board[x][j] == number || board[i][x] == number){
                return false;
            }
        }

        // subgird asuming 9x9 board
        int sx = (i/3)*3;
        int sy = (j/3)*3;
        for(int x = sx; x < sx + 3; x++){
            for(int y = sy; y < sy + 3; y++){
                if(board[x][y] == number){
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args){

        SudokuGame obj = new SudokuGame();
        int n = 9;
        int board[][] = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        obj.solveSudoku(board, 0, 0, n);
    }
}
