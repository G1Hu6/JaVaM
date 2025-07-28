import java.util.*;

class DijkstraAlogorithm_SingleSourceShortestPath{

    static class Pair implements Comparable<Pair>{

        int node;
        int weight;

        Pair(int node, int weight){
            this.node = node;
            this.weight = weight;
        }

        @Override
        public int compareTo(Pair pair){
            return this.weight - pair.weight;
        }
    }

    static class Graph{

        int vertex;
        List<Pair>[] list;

        Graph(int vertex){
            this.vertex = vertex;
            this.list = new ArrayList[vertex];
            for(int i = 0; i < vertex; i++){
                list[i] = new ArrayList<>();
            }
        }

        void addEdge(int s, int v, int weight, boolean isBidirected){
            list[s].add(new Pair(v, weight));
            if(isBidirected){
                list[v].add(new Pair(s, weight));
            }
        }

        int dijkstra(int source, int destination){
            // create distance array and init with infinity.
            int[] distance = new int[vertex];
            Arrays.fill(distance, Integer.MAX_VALUE);
            // create unordered set(TreeSet) to store nodes sorted by distance.
            SortedSet<Pair> set = new TreeSet<>();
            // set distance of source to0 0 and insert in set.
            distance[source] = 0;
            set.add(new Pair(source, 0));

            while(!set.isEmpty()){
                Pair pair = set.removeFirst(); // remove
                int node = pair.node;
                int nodeDistance = pair.weight;
                for(Pair nbrPair : list[node]){
                    int nbrNode = nbrPair.node;
                    int nbrDisance = nbrPair.weight;
                    int newDistnce = nodeDistance + nbrDisance;

                    if(newDistnce < distance[nbrNode]){
                        set.remove(new Pair(nbrNode, distance[nbrNode])); // remove old pair
                        distance[nbrNode] = newDistnce;
                        set.add(new Pair(nbrNode, distance[nbrNode])); // insert new pair
                    }
                }
            }

            //Single Source Shortest Dist to all other nodes
            for(int i=0;i<vertex;i++){
                System.out.println("Node i "+i +" Dist "+distance[i]);
            }

            return distance[destination];
        }
        /*
        public String toString(){

            StringBuilder builder = new StringBuilder();
            for(T node : map.keySet()){
                builder.append(node + " : ");
                for(T ele : map.get(node)){
                    builder.append(ele + " ");
                }
                builder.append("\n");
            }

            return builder.toString();
        }
        */
    }

    public static void main(String[] args){
        
        DijkstraAlogorithm_SingleSourceShortestPath obj = new DijkstraAlogorithm_SingleSourceShortestPath();
        Graph graph = new Graph(6);

        graph.addEdge(0, 1, 1, true);
        graph.addEdge(0, 2, 5, true);
        graph.addEdge(0, 3, 2, true);
        graph.addEdge(1, 5, 25, true);
        graph.addEdge(2, 3, 2, true);
        graph.addEdge(2, 4, 3, true);
        graph.addEdge(3, 4, 6, true);
        graph.addEdge(4, 5, 6, true);

        // System.out.println("Graph :-\n" + graph);
        graph.dijkstra(0, 5);
    }
}
