import java.util.*;

class MST_PrimsAlgorithmUsingPQ{

    static class Edge{

        int node;
        int weight;
        int parent;

        Edge(int node, int weight, int parent){
            this.node = node;
            this.weight = weight;
            this.parent = parent;
        }
    }

    static class Pair{

        int node;
        int weight;

        Pair(int node, int weight){
            this.node = node;
            this.weight = weight;
        }

        public String toString(){
            return "( "+ this.node + " ," + this.weight + " )";
        }
    }

    static class Graph{

        int vertex;
        List<Pair>[] list;

        Graph(int vertex){
            this.vertex = vertex;
            @SuppressWarnings("unchecked")
            List<Pair>[] temp = (ArrayList<Pair>[]) new ArrayList[vertex + 1];
            this.list = temp;
            for(int i = 0; i <= vertex; i++){
                this.list[i] = new ArrayList<>();
            }
        }

        void addEdge(int u, int v, int weight, boolean isBidirected){
            
            list[u].add(new Pair(v, weight));
            if(isBidirected) list[v].add(new Pair(u, weight));
        }

        int primsMST(int source){
             
            boolean[] visited = new boolean[vertex + 1];
            // create min priority queue.
            PriorityQueue<Edge> pq = new PriorityQueue<>((x, y) -> x.weight - y.weight);
            // add first node having parent -1
            pq.add(new Edge(source, 0, -1));
            int mstWeight = 0;
            ArrayList<Pair> mstEdges = new ArrayList<>();

            while(!pq.isEmpty()){

                Edge edge = pq.poll();
                int node = edge.node;
                int weight = edge.weight;
                int parent = edge.parent;

                if(visited[node]){
                    continue; // if visied then not perform further task
                }
                // add to mst
                if(parent != -1) mstEdges.add(new Pair(node, parent));
                visited[node] = true; // visit
                mstWeight += weight; // add to total weight
                for(Pair pair : list[node]){
                    if(!visited[pair.node]){
                        pq.add(new Edge(pair.node, pair.weight, node));
                    }
                }
            }

            System.out.println("Min cost Edges :- " + mstEdges);
            return mstWeight;
        }
    }

    public static void main(String[] args){
        Graph g = new Graph(5);

        g.addEdge(0, 1, 2, true);
        g.addEdge(0, 2, 1, true);
        g.addEdge(1, 2, 1, true);
        g.addEdge(2, 3, 2, true);
        g.addEdge(2, 4, 2, true);
        g.addEdge(3, 4, 1, true);
        
        int mstCost = g.primsMST(0);
        System.out.println("Cost of MST :- " + mstCost);
    }
}
