import java.util.ArrayList;

class RatInMazeProblem{

    int count = 0;

    boolean solveMaze(int[][] maze, int x, int y, int n, int m){

        // boundry condition
        if(x < 0 || x > n - 1 || y < 0 || y > m - 1){
            return false;
        }

        // block or visited
        if(maze[x][y] == 1 || maze[x][y] == 2){
            count++;
            return false;
        }

        // found cheese
        if(x == n - 1 && y == m - 1){
            return true;
        }

        maze[x][y] = 2; // visited
        return solveMaze(maze, x, y - 1, n, m) || solveMaze(maze, x + 1, y, n, m) || solveMaze(maze, x, y + 1, n, m) || solveMaze(maze, x - 1, y, n, m);
    }

    // to print path to cheese
    ArrayList<Integer> pathX = new ArrayList<>();
    ArrayList<Integer> pathY = new ArrayList<>();
    int ways(int[][] maze, int x, int y, int n, int m){

        if(x < 0 || x > n-1 || y < 0 || y > m-1){
            return 0;
        }

        if(x == n-1 && y == m-1){
            pathX.add((Integer)x);
            pathY.add((Integer)y);
            System.out.println(pathX);
            System.out.println(pathY);

            //backtracking step
            pathX.remove(pathX.size()-1);
            pathY.remove(pathY.size()-1);
            System.out.println("------------------------------------------------------------");
            return 1;
        }

        pathX.add((Integer)x);
        pathY.add((Integer)y);
        
        int w1 = ways(maze, x, y+1, n, m);
        int w2 = ways(maze, x+1, y, n, m); 

        //backtracking step
        pathX.remove(pathX.size()-1);
        pathY.remove(pathY.size()-1);
        
        return w1 + w2;
    }

    public static void main(String[] args){

        RatInMazeProblem pro2 = new RatInMazeProblem();
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

        int[][] maze2 = {
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0}
        };
        boolean isFound = pro2.solveMaze(maze, 2, 1, n, m);
        System.out.println(pro2.count);
        System.out.println(pro2.ways(maze2, 0, 0, 5, 4));
    }
}
