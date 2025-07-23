import java.util.*;

class TopoligicalSortingForDirectedAcyclicGraph{

    void printTopologicalOrder(Map<Integer, List<Integer>> graph){

        // Step 1:- create indegree array
        int vertex = graph.keySet().toArray().length;
        int[] inDegree = new int[vertex];
        for(Integer node : graph.keySet()){
            for(Integer nbr : graph.get(node)){
                inDegree[nbr]++;
            }
        }
        System.out.println("Indegree Array :- " + Arrays.toString(inDegree));

        // Step 2:- build queue push all nodes with 0 indegree
        Queue<Integer> que = new LinkedList<>();
        for(int i = 0; i < vertex; i++){
            if(inDegree[i] == 0){
                que.add(i);
            }
        }

        // Step 3:-
        System.out.print("Topological Order :- ");
        while(!que.isEmpty()){
            Integer f = que.poll();
            System.out.print(f + " ");
            for(Integer nbr : graph.get(f)){
                inDegree[nbr]--;
                if(inDegree[nbr] == 0){
                    que.add(nbr);
                }
            }
            //System.out.println(Arrays.toString(inDegree));
        }

    }

    public static void main(String[] args){
        TopoligicalSortingForDirectedAcyclicGraph obj = new TopoligicalSortingForDirectedAcyclicGraph();
        MyGraph<Integer> graph = new MyGraph<>();

        graph.addEdge(0, 1, false);
        graph.addEdge(0, 2, false);
        graph.addEdge(1, 3, false);
        graph.addEdge(1, 4, false);
        graph.addEdge(2, 3, false);
        graph.addEdge(2, 5, false);
        graph.addEdge(3, 4, false);
        graph.addEdge(3, 5, false);
        graph.addEdge(4, 5, false);
        graph.addEdge(6, 1, false);
        graph.addEdge(6, 4, false);
    
        System.out.println("Graph :- \n" + graph);
        obj.printTopologicalOrder(graph.getMap());
    }
}
