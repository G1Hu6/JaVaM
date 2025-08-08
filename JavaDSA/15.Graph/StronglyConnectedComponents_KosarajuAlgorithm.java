import java.util.*;

class StronglyConnectedComponents_KosarajuAlgorithm{

    // SCC :- only applicable for directed graph
    // Kosaraju's Algorithm :- 
    // Step 1:- sort all edges according to finishing time.
    // Step 2:- reverse the graph
    // Step 3:- start dfs and count scc

    static class Graph{

        int vertex;
        ArrayList<ArrayList<Integer>> list;

        Graph(int vertex){
            this.vertex = vertex;
            this.list = new ArrayList<ArrayList<Integer>>();
            for(int i = 0; i <= vertex; i++){
                this.list.add(new ArrayList<>());
            }
        }

        void addEdge(int u, int v, boolean isUndirected){
            list.get(u).add(v);
            if(isUndirected) list.get(v).add(u);
        }

        private void dfs(ArrayList<ArrayList<Integer>> list, int node, boolean[] visited, Stack<Integer> stack){

            visited[node] = true;
            for(int nbr : list.get(node)){
                if(!visited[nbr]){
                    dfs(list, nbr, visited, stack);
                }
            }
            // push into stack
            stack.push(node);
        }

        private void dfs(ArrayList<ArrayList<Integer>> list, int node, boolean[] visited){

            visited[node] = true;
            System.out.print(node + " ");
            for(int nbr : list.get(node)){
                if(!visited[nbr]){
                    dfs(list, nbr, visited);
                }
            }
        }
        
        int kosarajuSCC(){

            boolean[] visited = new boolean[vertex + 1];
            Stack<Integer> stack = new Stack<>();

            // Step 1:- sort according to finishing time
            for(int i = 0; i < vertex; i++){
                if(!visited[i]){
                    dfs(list, i, visited, stack);
                }
            }

            ArrayList<ArrayList<Integer>> revList = new ArrayList<ArrayList<Integer>>();
            for(int i = 0; i <= vertex; i++){
                revList.add(new ArrayList<>());
            }
            //Graph revList = new Graph(vertex);
            // Step 2:- reverse graph
            for(int node = 0; node <= vertex; node++){
                // unvisit all nodes
                visited[node] = false;

                for(int nbr : list.get(node)){
                    // node ---> nbr
                    // nbr  ---> node
                    revList.get(nbr).add(node);
                    //revList.addEdge(nbr, node, false);
                }
            }

            // Step 3:- dfs
            int sccCount = 0;
            while(!stack.isEmpty()){
                int node = stack.pop();
                if(!visited[node]){
                    sccCount++;
                    dfs(revList, node, visited);
                    System.out.println();
                }
            }

            return sccCount;
        }
    }

    public static void main(String[] args){
        
        Graph adj = new Graph(8);

        adj.addEdge(0, 1, false);
        adj.addEdge(1, 2, false);
        adj.addEdge(2, 0, false);
        adj.addEdge(2, 3, false);
        adj.addEdge(3, 4, false);
        adj.addEdge(4, 5, false);
        adj.addEdge(4, 7, false);
        adj.addEdge(5, 6, false);
        adj.addEdge(6, 4, false);
        adj.addEdge(6, 7, false);

        System.out.println("Strongly Connected Components :- " + adj.kosarajuSCC());
    }
}
