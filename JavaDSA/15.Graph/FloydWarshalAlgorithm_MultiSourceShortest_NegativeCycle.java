import java.util.*;
class FloydWarshalAlgorithm_MultiSourceShortest_NegativeCycle{

    static int[][] floydWarshal(int[][] matrix){

        int n = matrix.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == -1){
                    matrix[i][j] = Integer.MAX_VALUE;
                }
                if(i == j) matrix[i][j] = 0;
            }
        }
        //System.out.println(Arrays.deepToString(matrix));
        
        // Time complexity :- O(N^3)
        for(int via = 0; via < n; via++){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(matrix[i][via] != Integer.MAX_VALUE && matrix[via][j] != Integer.MAX_VALUE)
                        matrix[i][j] = Math.min(matrix[i][j], matrix[i][via] + matrix[via][j]);
                }
            }
            //System.out.println(Arrays.deepToString(matrix));
        }

        // Negative cycle detection
        for(int i = 0; i < n; i++) {
            if (matrix[i][i] < 0) {
                System.out.println("Negative weight cycle detected.");
                break;
            }
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == Integer.MAX_VALUE){
                    matrix[i][j] = -1;
                }
            }
        }

        return matrix;
    }

    public static void main(String[] args){
        
        int[][] matrix = {
            { 0,  2, -1, -1},
            { 1,  0,  3, -1},
            {-1, -1,  0, -1},
            { 3,  5,  4,  0}
        };

        System.out.println(Arrays.deepToString(floydWarshal(matrix)));
    }
}
