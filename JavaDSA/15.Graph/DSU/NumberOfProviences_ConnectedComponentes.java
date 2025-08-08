import java.util.*;

class NumberOfProviences_ConnectedComponentes{

    static int findProviences(Map<Integer,List<Integer>> graph){
        
        DisjointSet ds = new DisjointSet(graph.keySet().size());

        for(int i : graph.keySet()){
            for(int j : graph.get(i)){
                // i --- j
                ds.unionBySize(i, j);
            }
        }

        int count = 0;
        for(Integer i : graph.keySet()){
            if(ds.findUParent(i) == i) count++;
        }

        return count;
    }

    public static void main(String[] args){
        MyGraph<Integer> graph = new MyGraph<>();
        
        graph.addEdge(1, 2, true);
        graph.addEdge(2, 3, true);
        graph.addEdge(4, 5, true);
        graph.addEdge(6, 7, true);
    
        System.out.println("Total Proviences(Connected Components) :- " + findProviences(graph.getMap()));
    }
}
