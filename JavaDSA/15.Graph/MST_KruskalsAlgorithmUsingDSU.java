import java.util.*;

class MST_KruskalsAlgorithmUsingDSU{
    
    static class Edge implements Comparable<Edge>{

        int node1;
        int node2;
        int weight;

        Edge(int node1, int node2, int weight){
            this.node1 = node1;
            this.node2 = node2;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge edge){
            return this.weight - edge.weight;
        }
    }

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
        List<Pair>[] list;

        Graph(int vertex){
            this.vertex = vertex;
            @SuppressWarnings("unchecked") 
            ArrayList<Pair>[] temp = (ArrayList<Pair>[]) new ArrayList[vertex + 1];
            this.list = temp;
            for(int i = 0; i <= vertex; i++){
                this.list[i] = new ArrayList<>();
            }
        }

        void addEdge(int u, int v, int weight, boolean isBidirected){
            this.list[u].add(new Pair(v, weight));
            if(isBidirected){
                this.list[v].add(new Pair(u, weight));
            }
        }

        int kruskalsMST(){

            // create list of edges
            // time = O(N + E)
            List<Edge> edges = new ArrayList<>();
            for(int i = 0; i < vertex; i++){
                for(Pair nodePair : list[i]){
                    int nbr = nodePair.node;
                    int weight = nodePair.weight;
                    int node = i;

                    edges.add(new Edge(i, nbr, weight));
                }
            }

            // init DSU
            DisjointSet ds = new DisjointSet(vertex);
            
            // Step 1:- sort all edges according to weight
            // time = O(E*logE)
            Collections.sort(edges);
            int mstWeight = 0;
            
            // Step 2:- unite those edges having different ultimate parent
            for(Edge edge : edges){
                int node = edge.node1;
                int adjNode = edge.node2;
                int weight = edge.weight;
                if(ds.findUParent(node) != ds.findUParent(adjNode)){
                    ds.unionBySize(node, adjNode);
                    mstWeight += weight;
                }
            }

            return mstWeight;
        }
    }

    public static void main(String[] args){
        
        Graph g = new Graph(5);

        g.addEdge(0, 1, 8, true);
        g.addEdge(0, 4, 7, true);
        g.addEdge(1, 4, 2, true);
        g.addEdge(1, 2, 4, true);
        g.addEdge(2, 3, 6, true);
        g.addEdge(2, 4, 3, true);
        g.addEdge(3, 4, 5, true);

        int mstCost = g.kruskalsMST();
        System.out.println("Cost of MST :- " + mstCost);
    }
}
