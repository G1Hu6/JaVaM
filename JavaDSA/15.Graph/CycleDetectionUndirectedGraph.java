import java.util.*;

class CycleDetectionUndirectedGraph{

    // (1).Given a undirected graph, check if the cycle is present or not
    // BFS or DFS both used for cycle detection.
    // Cycle detection :- If you hit node whichis already marked visited and(&&) its not through parent.

    boolean isCyclePresent(Map<Character, List<Character>> graph, boolean[] visited, Character[] parent, Character source){

        Queue<Character> que = new LinkedList<>();
        visited[source-65] = true; // 0 based indexing
        que.add(source);

        while(!que.isEmpty()){

            Character node = que.poll();
            for(Character nbr : graph.get(node)){
                if(!visited[nbr-65]){
                    visited[nbr-65] = true;
                    parent[nbr-65] = node;
                    que.add(nbr);
                }else if(visited[nbr-65] && parent[node-65] != nbr){
                    //System.out.println(Arrays.toString(parent));
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args){
        CycleDetectionUndirectedGraph obj = new CycleDetectionUndirectedGraph();
        MyGraph<Character> graph = new MyGraph<>();

        graph.addEdge('A', 'B', true);
        graph.addEdge('B', 'C', true);
        //graph.addEdge('C', 'E', true);
        graph.addEdge('C', 'D', true);
        graph.addEdge('D', 'E', true);
        graph.addEdge('E', 'F', true);

        System.out.println("Graph :- \n" + graph);
        int n = graph.getMap().keySet().size();
        Character[] parent = new Character[n];
        boolean[] visited = new boolean[n];

        boolean isCycle = obj.isCyclePresent(graph.getMap(), visited, parent, 'A');
        if(isCycle){
            System.out.println("Cycle is present");
        }else{
            System.out.println("Cycle is not present");
        }
    }
}
