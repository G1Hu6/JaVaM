class RatInMazeProblemUsingDP{
    
    // rat can moves only in 2 direction down and up.
    // Time complexity = O(N * M)
    // Space complexity = O(N + M)
    int ratWaysUsingTopDownDP(int[][] maze, int x, int y, int n, int m, int[][] dp){

        if(x < 0 || x > n-1 || y < 0 || y > m-1){
            return 0;
        }

        if(x == n-1 && y == m-1){
            return 1;
        }

        if(maze[x][y] == -1 || maze[x][y] == 2){
            return 0;
        }

        if(dp[x][y] != -1){
            return dp[x][y];
        }

        dp[x][y] = ratWaysUsingTopDownDP(maze, x, y + 1, n, m, dp) + ratWaysUsingTopDownDP(maze, x + 1, y, n, m, dp);
        return dp[x][y];
    }

    int ratWaysUsingBottomUpDP(int[][] maze, int x, int y, int n, int m, int[][] dp){
        
        for(int i = 0; i < m; i++){
            dp[x][i] = 1;
        }
        //System.out.println(java.util.Arrays.deepToString(dp));
        
        for(int i = 0; i < n; i++){
            dp[i][y] = 1;
        }
        //System.out.println(java.util.Arrays.deepToString(dp));
        
        for(int i = x + 1; i < n; i++){
            for(int j = y + 1; j < m; j++){

                dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
            }
        }

        //System.out.println(java.util.Arrays.deepToString(dp));
        return dp[n-1][m-1];
    }

    public static void main(String[] args){

        int n = 9;
        int m = 7;
        int[][] maze = {
            {0, 0, 0, 1, 0, 0, 1},
            {0, 1, 0, 1, 0, 0, 0},
            {1, 1, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 0, 0},
            {1, 0, 0, 1, 0, 0, 0},
            {0, 1, 0, 1, 0, 0, 0}
        };

        int[][] dp = new int[n][m];
        DPUtility.initDPArray(dp);
        //System.out.println(java.util.Arrays.deepToString(dp));
        //int ways = new RatInMazeProblemUsingDP().ratWaysUsingTopDownDP(maze, 2, 1, n, m, dp);
        int ways =   new RatInMazeProblemUsingDP().ratWaysUsingBottomUpDP(maze, 2, 1, n, m, dp);
        System.out.println("Ways :- " + ways);
    }
}
