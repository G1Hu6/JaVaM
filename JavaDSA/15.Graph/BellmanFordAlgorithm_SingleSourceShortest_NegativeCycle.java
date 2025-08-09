import java.util.*;

class BellmanFordAlgorithm_SingleSourceShortest_NegativeCycle{

    // Bellman Ford Algorithm :- Single source shortest path
    //                           Work for negative edges
    //                           Work for negative cycle
    //                           Only for directed graph (undireced graph must be converted to directed).

    static class Pair{

        int node;
        int weight;

        Pair(int node, int weight){
            this.node = node;
            this.weight = weight;
        }
    }

    static class Graph{

        int vertex;
        ArrayList<ArrayList<Pair>> adj;

        Graph(int vertex){
            this.vertex = vertex;
            this.adj = new ArrayList<ArrayList<Pair>>();
            for(int i = 0; i <= vertex; i++){
                this.adj.add(new ArrayList<Pair>());
            }
        }

        void addEdge(int u, int v, int weight, boolean isUndirected){
            adj.get(u).add(new Pair(v, weight));
            if(isUndirected) adj.get(v).add(new Pair(u, weight));
        }

        // Relax all edges N-1 times
        // Relax :- if :- dis[u] + weight < dis[v] :: then :- dis[v] = dis[u] + weight
        int[] bellmanford(int source){

            int[] distance = new int[vertex];
            Arrays.fill(distance, Integer.MAX_VALUE); // fill initially with infinity
            distance[source] = 0; // distance of source must be 0

            for(int r = 0; r < vertex-1; r++){
                
                for(int i = 0; i <= vertex; i++){
                    for(Pair pair : adj.get(i)){
                        int u = i;
                        int v = pair.node;
                        int weight = pair.weight;
                        if(distance[u] != Integer.MAX_VALUE && distance[u] + weight < distance[v]){
                            distance[v] = distance[u] + weight;
                        }
                    }
                }
            }

            // Nth iteration to check negative cycle is present or not
            
            for(int i = 0; i <= vertex; i++){
                for(Pair pair : adj.get(i)){
                    int u = i;
                    int v = pair.node;
                    int weight = pair.weight;
                    if(distance[u] != Integer.MAX_VALUE && distance[u] + weight < distance[v]){
                        int[] temp = new int[1];
                        temp[0] = -1;   // Negative edge is present
                        return temp;
                    }
                }
            }

            System.out.println("Distance of all nodes form source " + source + " is :- "+ Arrays.toString(distance));
            return distance;
        }
    }

    public static void main(String[] args){
        Graph graph = new Graph(6);

        graph.addEdge(3, 2, 6, false);
        graph.addEdge(5, 3, 1, false);
        graph.addEdge(0, 1, 5, false);
        graph.addEdge(1, 5, -3, false);
        graph.addEdge(1, 2, -2, false);
        graph.addEdge(3, 4, -2, false);
        graph.addEdge(2, 4, 3, false);
        
        graph.bellmanford(0);
    }
}
