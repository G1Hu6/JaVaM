import java.util.*;

class SnakeLadderGame{

    // (2).we can throw any number on dice. win the game in min no. of ways.no double 
    // turn on 6.
    int minTrowsDie(int source, int destination, Map<Integer, List<Integer>> graph){

        int n = graph.keySet().size();
        int[] distance = new int[n+1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[source] = 0;
        Queue<Integer> que = new LinkedList<>();
        que.add(source);

        while(!que.isEmpty()){

            int node = que.poll();
            for(Integer nbr : graph.get(node)){
                if(distance[nbr] == Integer.MAX_VALUE){
                    distance[nbr] = distance[node] + 1;
                    que.add(nbr);
                }
            }
        }
        return distance[destination];
    }

    public static void main(String[] args){

        SnakeLadderGame obj = new SnakeLadderGame();
        MyGraph<Integer> graph = new MyGraph<>();

        int[] board = {0, 0, 13, 0, 0, 2, 0, 0, 18, 0, 0, 0, 0, 0, 0, 0, -13, 11, 0, -14, 0, 0, 0 , -8, 10, 0, 0, 0, 0, 0, 0, -2, 0, -24, 0, 0, 0};
        for(int i = 1; i < board.length; i++){
            for(int dice = 1; dice <= 6; dice++){
                 int j = i + dice;
                 j = j + board[i]; // sncak or ladder
                 if(j <= 36){
                     graph.addEdge(i, j, true);
                 }
            }
        }
        int ans = obj.minTrowsDie(1, 36, graph.getMap());
        System.out.println("Min no of throw to win game :- " + ans);

    }
}
