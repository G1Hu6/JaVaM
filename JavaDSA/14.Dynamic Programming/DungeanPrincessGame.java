import java.util.Arrays;

class DungeanPrincessGame{

    // (1).Given matrix NxM where matrix[i][j] denotes the health gained at that cell.Find the min helth required
    //     at the matrix[0][0] so that we can reach the last cell [N-1][M-1].
    
    int findMinHealth(int[][] matrix, int i, int j, int n, int m){
        
        if(i == n-1 && j == m-1){
            return Math.max(1, 1 - matrix[i][j]);
        }

        if(i == n || j == m){
            return Integer.MAX_VALUE;
        }

        int right = findMinHealth(matrix, i, j + 1, n, m);
        int down = findMinHealth(matrix, i + 1, j, n, m);

        return Math.max(1, Math.min(right, down) - matrix[i][j]);
    }

    int findMinHealthTopDownDP(int[][] matrix,int[][] dp, int i, int j, int n, int m){
       
       if(i == n-1 && j == m-1){
           return Math.max(1, 1 - matrix[i][j]);
       }

       if(i == n || j == m){
           return Integer.MAX_VALUE;
       }

       if(dp[i][j] != -1){
           return dp[i][j];
       }

       int right = findMinHealthTopDownDP(matrix, dp, i, j + 1, n, m);
       int down = findMinHealthTopDownDP(matrix, dp, i + 1, j, n, m);

       return dp[i][j] = Math.max(1, Math.min(right, down) - matrix[i][j]);
    }

    int findMinHealthBottomUpDP(int[][] matrix, int n, int m){

        int[][] dp = new int[n + 1][m + 1];

        for(int i = n; i >= 0; i--){
            for(int j = m; j >= 0; j--){

                if(i == n-1 && j == m-1){
                    dp[i][j] = Math.max(1, 1 - matrix[i][j]);
                    continue;
                }

                if(j == m || i == n){
                    dp[i][j] = Integer.MAX_VALUE;
                    continue;
                }

                dp[i][j] = Math.max(1, Math.min(dp[i][j + 1], dp[i + 1][j]) - matrix[i][j]);
            }
        }

        System.out.println(Arrays.deepToString(dp));
        return dp[0][0];
    }
          
    public static void main(String[] args){

        DungeanPrincessGame obj = new DungeanPrincessGame();
        int[][] matrix = {
            {3, 6,-3},
            {-5,9,-2},
            {2,-4,-5}
        };
        int n = 3;
        int m = 3;
        int[][] dp = new int[n][m];
        DPUtility.initDPArray(dp);

        int ans1 = obj.findMinHealth(matrix, 0, 0, n, m);
        int ans2 = obj.findMinHealthTopDownDP(matrix, dp, 0, 0, n, m);
        int ans3 = obj.findMinHealthBottomUpDP(matrix, n, m);
        System.out.println("Min health to reach last cell using Recursion :- " + ans1);
        System.out.println("Min health to reach last cell using Top-Down  :- " + ans2);
        System.out.println("Min health to reach last cell using Bottom-Up  :- " + ans3);
    }
}
