import java.util.*;
class ArticulationPointInGraph{

    static private int timer = 1;

    static private void dfs(int node, int parent, Map<Integer, List<Integer>> adj, boolean[] visited, int[] tin, int[] low, List<Integer> artiPoints){
        
        visited[node] = true;
        tin[node] = low[node] = timer;
        timer++;
        int child = 0;
//System.out.println("Hello");
        for(int nbr : adj.get(node)){
            if(nbr ==  parent) continue;
            if(!visited[node]){
                dfs(nbr, node, adj, visited, tin, low, artiPoints);
                low[node] = Math.min(low[node], low[nbr]);
                // node --> nbr
                if(low[nbr] >= tin[node] && parent != -1){
                    artiPoints.add(node);
                }
                child++;
            }else{
                low[node] = Math.min(low[node], tin[nbr]);
            }
        }

        // check of root
        if(child > 1 && parent == -1){
            artiPoints.add(node);
        }
    }

    static int countArtiPoint(Map<Integer, List<Integer>> adj){

        int v = adj.keySet().size() + 1;
        boolean[] visited = new boolean[v];
        int[] tin = new int[v];
        int[] low = new int[v];
        List<Integer> artiPoints = new ArrayList<>();
        for(int i = 0; i < v - 1; i++){
           if(!visited[i])dfs(i, -1, adj, visited, tin, low, artiPoints);
        }
        //dfs(0, -1, adj, visited, tin, low, artiPoints);
        System.out.println("Articulation Points :- " + artiPoints);

        return artiPoints.size();
    }

    public static void main(String[] args){
        MyGraph<Integer> graph = new MyGraph<>();

        graph.addEdge(0, 1, true);
        graph.addEdge(0, 2, true);
        graph.addEdge(0, 3, true);
        graph.addEdge(2, 3, true);
        graph.addEdge(2, 4, true);
        graph.addEdge(2, 5, true);
        graph.addEdge(4, 6, true);
        graph.addEdge(5, 6, true);

        System.out.println("Total count of articulation points :- " + countArtiPoint(graph.getMap()));
    }
}
