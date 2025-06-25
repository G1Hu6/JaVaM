class MinCostPath2DMatrix{

    //ArrayList<Integer> minCostPathX = new ArrayList<>();
    //ArrayList<Integer> minCostPathY = new ArrayList<>();
    int findMinCostPathRecursion(int[][] matrix, int x, int y, int n, int m){

        if(x == n - 1 && y == m - 1){
            return matrix[x][y];
        }

        // outbound condition
        if(x > n - 1 || y > m - 1){
            return Integer.MAX_VALUE;
        }

        return Math.min(findMinCostPathRecursion(matrix, x, y + 1, n, m), findMinCostPathRecursion(matrix, x + 1, y, n, m)) + matrix[x][y];
    }

    int findMinCostPathBottomUpDp(int[][] matrix, int x, int y, int n, int m){

        int[][] dp = new int[n][m];
        dp[0][0] = matrix[0][0];

        for(int i = 1; i < n; i++){
            dp[i][0] = dp[i - 1][0] + matrix[i][0]; 
        }

        for(int j = 1; j < m; j++){
            dp[0][j] = dp[0][j - 1] + matrix[0][j];
        }

        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + matrix[i][j];
            }
        }

        System.out.println(java.util.Arrays.deepToString(dp));
        return dp[n - 1][m - 1];
    }

    public static void main(String[] args){
        
        MinCostPath2DMatrix obj = new MinCostPath2DMatrix();

        int n = 3;
        int m = 3;
        int matrix[][] = {
            {1, 3,-4},
            {2, 1, 1},
            {6, 1, 1}
        };
        int minCost = obj.findMinCostPathRecursion(matrix, 0, 0, n, m);
        System.out.println("Minium cost using Reursion :- " + minCost);
        System.out.println("Minium cost using Reursion :- " + obj.findMinCostPathBottomUpDp(matrix, 0, 0, n, m));
    }
}
