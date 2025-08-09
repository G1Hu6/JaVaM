import java.util.*;

class BipartiteGraph_BFS{

    // Bipartite Graph :- Color the graph with two colors such that no 
    //                    adjecent nodes having same color then the 
    //                    graph is called as bipartite graph.

    // Every linear graph (with no cycles) is always bipartite graph.
    // Every graph with even cycle length is always bipartite graph.
    // Graph with odd length cycle is non-bipartite graph.
    
    static private boolean bfs(int start, int v, Map<Integer, List<Integer>> adj, int[] color){

        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        color[start] = 0; // set color

        while(!q.isEmpty()){
            int node = q.poll();
            if(adj.get(node) == null) continue;
            for(int nbr : adj.get(node)){
                // if the nbr is yet not colored
                // then give opposite color of node
                if(color[nbr] == -1){
                    color[nbr] = 1 - color[node];
                    q.add(nbr);
                }
                // if nbr is already colored with same 
                // color someone did color on other path
                else if(color[nbr] == color[node]){
                    return false;
                }
            }
        }

        return true;
    }

    static boolean isBipartite(int v, Map<Integer, List<Integer>> adj){

        int[] color = new int[v + 1];
        Arrays.fill(color, -1); // initially all nodes not colored.

        for(int i = 0; i <= v; i++){  // check for graph having multipe components
            if(color[i] == -1){    
                if(bfs(i, v, adj, color) == false) return false;    
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
