class CountIslandInWater_ConnectedComponents{

    int findIslands(int[][] matrix, int n, int m){

        boolean[][] visited = new boolean[n][m];
        int islands = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == 1 && !visited[i][j]){
                    islands++;
                    dfsTraversal(matrix, visited, i, j, n, m);
                }
            }
        }

        return islands;
    }

    void dfsTraversal(int[][] matrix, boolean[][] visited, int i, int j, int n, int m){
    
        // base case
        if(i < 0 || i >= n || j < 0 || j >= m){
            return;
        }
        if(matrix[i][j] == 0 || visited[i][j]){
            return;
        }

        // recursive case
        visited[i][j] = true;
        dfsTraversal(matrix, visited, i + 1, j, n, m);
        dfsTraversal(matrix, visited, i - 1, j, n, m);
        dfsTraversal(matrix, visited, i, j + 1, n, m);
        dfsTraversal(matrix, visited, i, j - 1, n, m);
    }

    public static void main(String[] args){

        CountIslandInWater_ConnectedComponents obj = new CountIslandInWater_ConnectedComponents();
        int[][] matrix = {
            {1, 1, 0, 0, 1},
            {0, 1, 0, 1, 1},
            {1, 0, 0, 1, 0},
            {1, 1, 0, 1, 0},
            {1, 0, 0, 1, 0}
        };
        int n = matrix.length;
        int m = matrix[0].length;

        int totalIslands = obj.findIslands(matrix, n, m);
        System.out.println("Total islands :- " + totalIslands);
    }
}
