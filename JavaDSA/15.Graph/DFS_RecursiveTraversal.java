import java.util.*;

class DFS_RecursiveTraversal{

    // DFS :- Depth First Search
    // Recursive way
    void dfsTraversal(int node, Map<Integer, List<Integer>> graph, boolean[] visited){
        
        System.out.print( node + " ");
        visited[node] = true;
        for(Integer nbr : graph.get(node)){
            if(!visited[nbr]){
                dfsTraversal(nbr, graph, visited);
            }
        }
    }

    public static void main(String[] args){

        DFS_RecursiveTraversal obj = new DFS_RecursiveTraversal();
        MyGraph<Integer> graph = new MyGraph<>();

        graph.addEdge(0, 1, true);
        graph.addEdge(1, 2, true);
        graph.addEdge(1, 5, true);
        graph.addEdge(2, 3, true);
        graph.addEdge(2, 4, true);
        graph.addEdge(3, 4, true);
        graph.addEdge(4, 6, true);

        System.out.println("Graph :- \n" + graph);
        int n = graph.getMap().keySet().size();
        boolean[] visited = new boolean[n];
        obj.dfsTraversal(0, graph.getMap(), visited);
    }
}
