import java.util.*;

class GraphInput{



    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        MyGraph<Integer> graph = new MyGraph<Integer>();

        System.out.println("Graph Input :- ");
        System.out.println("Enter total number of edges :- ");
        boolean isBidirectional = true;
        int edges = sc.nextInt();
        
        for(int i = 0 ; i < edges; i++){
            System.out.println("Enter source and destination for "+ i +" edge :-");
            Integer source = sc.nextInt();
            Integer desti = sc.nextInt();
            graph.addEdge(source, desti, isBidirectional);
        }

        System.out.println(graph);
    }
}
