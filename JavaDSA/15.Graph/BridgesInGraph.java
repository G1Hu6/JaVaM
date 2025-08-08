import java.util.*;

class BridgesInGraph{

    private static int timer = 1;

    private static void dfs(int node, int parent, Map<Integer, List<Integer>> adj, boolean[] visited, int[] tin, int[] low, List<List<Integer>> bridges){

        visited[node] = true;
        tin[node] = low[node] = timer;
        timer++;

        for(int nbr : adj.get(node)){
            if(nbr == parent) continue; // skip
            if(!visited[nbr]){
                dfs(nbr, node, adj, visited, tin, low, bridges);
                // node ---> nbr
                low[node] = Math.min(low[node], low[nbr]);
                if(low[nbr] > tin[node]){
                    bridges.add(Arrays.asList(nbr, node));
                }
            }else{
                low[node] = Math.min(low[node], low[nbr]);
            }
        }
    }

    static int countBriges(Map<Integer, List<Integer>> adj){
        
        int v = adj.keySet().size() + 1;
        int[] tin = new int[v];
        int[] low = new int[v];
        boolean[] visited = new boolean[v];
        List<List<Integer>> bridges = new ArrayList<>();
        dfs(1, -1, adj, visited, tin, low, bridges);

        for(int i = 0; i < bridges.size(); i++){
            System.out.println(bridges.get(i));
        }
        return bridges.size();
    }

    // Bridge :- It is a edge such that if we remove these edge the graph is broke in two or more components.
    public static void main(String[] args){
        MyGraph<Integer> graph = new MyGraph<>();

        graph.addEdge(1, 2, true);
        graph.addEdge(1, 4, true);
        graph.addEdge(2, 3, true);
        graph.addEdge(3, 4, true);
        graph.addEdge(4, 5, true);
        graph.addEdge(5, 6, true);
        graph.addEdge(6, 7, true);
        graph.addEdge(6, 9, true);
        graph.addEdge(7, 8, true);
        graph.addEdge(8, 9, true);
        graph.addEdge(8, 10, true);
        graph.addEdge(10, 11, true);
        graph.addEdge(10, 12, true);
        graph.addEdge(11, 12, true);

        int bridges = countBriges(graph.getMap());
        System.out.println("Total Bridges :- " + bridges);
    }
}
