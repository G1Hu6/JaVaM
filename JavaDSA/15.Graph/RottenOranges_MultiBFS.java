import java.util.*;

class Pair{
    int value1;
    int value2;

    Pair(int value1, int value2){
        this.value1 = value1;
        this.value2 = value2;
    }
}

class RottenOranges_MultiBFS{

    // Rotten Oranges :- every day fresh oranges adjcent to to rotten orange becomes rotten find
    //                   min days in which all oranges become rotten.
    //                   0 - empty
    //                   1 - fresh orange
    //                   2 - rotten orange

    private void fill2D(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            Arrays.fill(arr[i], Integer.MIN_VALUE);
        }
    }

    int findMinDaysRotten(int[][] matrix){

        int n = matrix.length;
        int m = matrix[0].length;
        int[][] distance = new int[n][m];
        fill2D(distance); // fill with infinity distance
        Queue<Pair> que = new LinkedList<>();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == 2){
                    distance[i][j] = 0; // set distance of rotten orranges to 0.
                    que.add(new Pair(i, j)); // push in que multi souce bfs
                }
            }
        }

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        while(!que.isEmpty()){
            
            Pair pair = que.poll();
            int i = pair.value1;
            int j = pair.value2;
            
            for(int dir = 0; dir < 4; dir++){
                int nbrI = i + dx[dir];
                int nbrJ = j + dy[dir];

                if(nbrI < 0 || nbrI >= n || nbrJ < 0 || nbrJ >= m){
                    continue;
                }
                if(matrix[nbrI][nbrJ] == 0){
                    continue;
                }
                if(matrix[nbrI][nbrJ] == 1){
                    matrix[nbrI][nbrJ] = 2;
                    distance[nbrI][nbrJ] = distance[i][j] + 1;
                    que.add(new Pair(nbrI, nbrJ));
                }
            }
        }

        System.out.println("Distance matrix :-  " + Arrays.deepToString(distance));
        return getMax2D(distance);
    }

    private int getMax2D(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            Arrays.sort(arr[i]);
            if(arr[i][arr[i].length - 1] > max){
                max = arr[i][arr[i].length - 1];
            }
        }
        return max;
    }

    public static void main(String[] args){
        
        RottenOranges_MultiBFS obj = new RottenOranges_MultiBFS();
        int matrix[][] = {
            {1, 0, 1, 2, 1},
            {1, 1, 1, 1, 1},
            {0, 2, 0, 1, 0},
            {0, 1, 1, 1, 1},
            {1, 1, 1, 2, 0},
        };
        int minDays = obj.findMinDaysRotten(matrix);
        System.out.println("Min days to rotten all oranges :- " + minDays);
    }
}
