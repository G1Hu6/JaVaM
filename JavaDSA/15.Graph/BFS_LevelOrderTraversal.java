import java.util.*;

class BFS_LevelOrderTraversal{

    // (1).Check if there is a route for source to destination.
    //     s = 1,d = 6
    // (2).Print shortest length path.

    int getDistance(Integer source, Integer destination, Map<Integer, List<Integer>> graph){

        int vertex = graph.keySet().size();
        Queue<Integer> que = new LinkedList<>(); // create queue for bfs.
        // initially set distance array to infinity.
        int[] distance = new int[vertex + 1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        // create a parent array to track path
        int[] parent = new int[vertex + 1];
        Arrays.fill(parent, -1);
        parent[source] = source;
        // set souce node distance to 0 and add to queue.
        distance[source] = 0;
        que.add(source);


        while(!que.isEmpty()){

            Integer node = que.poll();// get and remove
            for(Integer nbr : graph.get(node)){
                if(distance[nbr] == Integer.MAX_VALUE){ // add only not visited nodes
                    distance[nbr] = distance[node] + 1; // distance of nbr is equal to distance of parent + 1.
                    parent[nbr] = node;
                    que.add(nbr);
                }
            }
        }

        System.out.println("Distance of all nodes from source " + source + " = " + Arrays.toString(distance));
        System.out.print("Shortest length path from " + source + " to " + destination + " is = " );
        
        int temp = destination;
        System.out.print("[");
        while(temp != source && distance[destination] != Integer.MAX_VALUE){
        
            System.out.print(temp + " ");
            temp = parent[temp];
            if(temp == source) System.out.print(temp);
        }
        System.out.println("]");
        return distance[destination];
    }

    public static void main(String[] args){

        BFS_LevelOrderTraversal obj = new BFS_LevelOrderTraversal();
        // Step 1:- store the graph and create adj list
        MyGraph<Integer> graph = new MyGraph<>();

        boolean isBidirectional = true;
        graph.addEdge(1, 2, isBidirectional);
        graph.addEdge(1, 4, isBidirectional);
        graph.addEdge(2, 3, isBidirectional);
        graph.addEdge(2, 4, isBidirectional);
        graph.addEdge(2, 6, isBidirectional);
        graph.addEdge(3, 5, isBidirectional);
        graph.addEdge(4, 5, isBidirectional);
        graph.addEdge(5, 6, isBidirectional);
        graph.addEdge(7, 8, isBidirectional);
        
        System.out.println(graph);

        Integer source = 2;
        Integer destination = 5;

        int distance = obj.getDistance(source, destination, graph.getMap());
        System.out.println("Distance of " + source + " from " + destination + " is = " + distance);
    }
}
