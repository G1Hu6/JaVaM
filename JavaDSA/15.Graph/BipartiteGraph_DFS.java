import java.util.*;

class BipartiteGraph_DFS{

    static private boolean dfs(int node, int col, Map<Integer, List<Integer>> adj, int[] color){

        color[node] = col;

        if(adj.get(node) == null) return true;
        for(int nbr : adj.get(node)){
            if(color[nbr] == -1){
                if(dfs(nbr, 1 - col, adj, color) == false) return false;
            }
            else if(color[nbr] == col){
                return false;
            }
        }

        return true;
    }

    static boolean isBipartite(int v, Map<Integer, List<Integer>> adj){

        int[] color = new int[v + 1];
        Arrays.fill(color, -1); // initially all nodes not colored.

        for(int i = 0; i <= v; i++){  // check for graph having multipe components
            if(color[i] == -1){
                if(dfs(i, 0, adj, color) == false) return false;
            }
        }

        return true;
    }

    public static void main(String[] args){
        MyGraph<Integer> graph = new MyGraph<>();

        graph.addEdge(1, 2, true);
        graph.addEdge(2, 3, true);
        graph.addEdge(2, 6, true);
        graph.addEdge(3, 4, true);
        graph.addEdge(4, 7, true);
        graph.addEdge(4, 5, true);
        graph.addEdge(5, 6, true);
        graph.addEdge(7, 8, true);

        int v = graph.getMap().keySet().size();
        boolean flag = isBipartite(v, graph.getMap());
        if(flag){
            System.out.println("Bipartite Graph");
        }else{
            System.out.println("Non-Bipartite Graph");
        }
    }
}
