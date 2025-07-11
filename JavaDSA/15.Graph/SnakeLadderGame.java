class SnakeLadderGame{

    // (2).we can throw any number on dice. win the game in min no. of ways.no double 
    // turn on 6.

    public static void main(String[] args){

        int[] board = {0, 0, 13, 0, 0, 2, 0, 0, 18, 0, 0, 0, 0, 0, 0, 0, -13, 11, 0, -14, 0, 0, 0 , -8, 10, 0, 0, 0, 0, 0, 0, -2, 0, -24, 0, 0};
        for(int i = 1; i < board.length; i++){
            for(int dice = 1; dice <= 6; dice++){
                 int j = i + dice;
                 j = j + board[i]; // sncak or ladder
                 if(j <= 36){
                     graph.addEdge(i, j, true);
                 }
            }
        }

    }
}
