import java.util.*;

class MultipleSourceBFS{

    // Given N nodes and nultiple source nodes find the sortest path for all nodes to any
    // of the source node.
    void multiSourceBFS(Map<Integer, List<Integer>> graph, int[] sources){

        int n = graph.keySet().size();
        int[] distance = new int[n];
        Arrays.fill(distance, Integer.MAX_VALUE);
        Queue<Integer> que = new LinkedList<>();
        // push all sources to que (start the fire from all source nodes)
        for(int i = 0; i < sources.length; i++){
            distance[sources[i]] = 0;
            que.add(sources[i]);
        }
        while(!que.isEmpty()){

            int node = que.poll();
            for(Integer nbr : graph.get(node)){
                if(distance[nbr] == Integer.MAX_VALUE){
                    distance[nbr] = distance[node] + 1;
                    que.add(nbr);
                }
            }
        }

        System.out.println("Shortest distance form any node :- " + Arrays.toString(distance));
    }

    public static void main(String[] args){
        MultipleSourceBFS obj = new MultipleSourceBFS();
        MyGraph<Integer> graph = new MyGraph<>();

        graph.addEdge(0, 2, true);
        graph.addEdge(0, 3, true);
        graph.addEdge(1, 3, true);
        graph.addEdge(1, 5, true);
        graph.addEdge(1, 7, true);
        graph.addEdge(2, 4, true);
        graph.addEdge(3, 4, true);
        graph.addEdge(4, 5, true);
        graph.addEdge(4, 6, true);
        graph.addEdge(7, 8, true);
        graph.addEdge(8, 9, true);

        obj.multiSourceBFS(graph.getMap(), new int[]{0, 1, 6});
    }
}
