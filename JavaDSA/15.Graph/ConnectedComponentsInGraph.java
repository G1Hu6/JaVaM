import java.util.*;

class ConnectedComponentsInGraph{

    // Given an undirected graph find the number of connected components ?
    // Connected Components :- a component is said to be connected, if from every node we can visit all the nodes
    //                         inside that components.

    // Time complexity= O(V + E)
    // Space complexity= O(V)
    // Here we caan use any one of BFS or DFS traversal.

    // Refer next -> Iland and Water problem.
    int findTotalComponents(Map<Integer, List<Integer>> graph){
        
        int vertex = graph.keySet().size();
        boolean[] visited = new boolean[vertex];
        int compCount = 0;
        for(Integer i : graph.keySet()){
            if(!visited[i]){
                compCount++;
                System.out.println("Connected Component "+ compCount + " :-");
                //dfsTraversal(i, graph, visited); // dfs
                bfsTraversal(i, graph, visited); // bfs
                System.out.println();
            }
        }
        return compCount;
    }

    void dfsTraversal(Integer node, Map<Integer, List<Integer>> graph, boolean[] visited){
        
        System.out.print(node + " ");
        visited[node] = true;
        for(Integer nbr : graph.get(node)){
            if(!visited[nbr]){
                dfsTraversal(nbr, graph, visited);
            }
        }
    }

    void bfsTraversal(Integer node, Map<Integer, List<Integer>> graph, boolean[] visited){

        Queue<Integer> que = new LinkedList<>();
        que.add(node);
        visited[node] = true;
        while(!que.isEmpty()){
            int n = que.poll();
            System.out.print(n + " ");
            for(Integer nbr : graph.get(n)){
                if(!visited[nbr]){
                    visited[nbr] = true;
                    que.add(nbr);
                }
            }
        }
    }

    public static void main(String[] args){
        
        ConnectedComponentsInGraph obj = new ConnectedComponentsInGraph();
        MyGraph<Integer> graph = new MyGraph<>();

        graph.addEdge(0, 0, true);
        graph.addEdge(1, 2, true);
        graph.addEdge(1, 4, true);
        graph.addEdge(2, 3, true);
        graph.addEdge(2, 4, true);
        graph.addEdge(3, 4, true);
        graph.addEdge(5, 6, true);
        graph.addEdge(5, 7, true);
        graph.addEdge(6, 7, true);

        int connectedComp = obj.findTotalComponents(graph.getMap());    
        System.out.println("Total connected components :- " + connectedComp);
    }
}
