import java.util.*;

class CycleDetectionDirectedGraph{

    // DFS- backedge detection or cycle detection in directed graph
    boolean isCyclePresentUsingDFS(Map<Integer, List<Integer>> graph, boolean[] inStack, boolean[] visited, int source){

        // if node is inStack then it must be visited.
        // inStack[source] && visited[source]
        if(inStack[source]){
            return true;
        }

        // visited but not in stack
        // visited[source] && !inStack[source]
        if(visited[source]){ 
            return false;
        }

        visited[source] = true; // visited
        inStack[source] = true; // add in stack
        for(Integer nbr : graph.get(source)){
            boolean success = isCyclePresentUsingDFS(graph, inStack, visited, nbr);
            if(success){
                return true;
            }
        }

        // backtrack step
        inStack[source] = false; // remove from stack
        return false;
    }

    public static void main(String[] args){

        CycleDetectionDirectedGraph obj = new CycleDetectionDirectedGraph();
        MyGraph<Integer> graph = new MyGraph<Integer>();

        graph.addEdge(1, 2, false);
        graph.addEdge(1, 6, false);
        graph.addEdge(2, 4, false);
        graph.addEdge(3, 2, false);
        graph.addEdge(4, 5, false);
        graph.addEdge(4, 6, false);
        graph.addEdge(5, 3, false);
        
        System.out.println("Graph :- \n" + graph);

        int source = 1;
        int n = graph.getMap().keySet().size();
        boolean[] inStack = new boolean[n + 1];
        boolean[] visited = new boolean[n + 1];
        
        boolean isCycle = obj.isCyclePresentUsingDFS(graph.getMap(), inStack, visited, source);
        if(isCycle){
            System.out.println("Cycle is present");
        }else{
            System.out.println("Cycle is not present");
        }
    }
}
