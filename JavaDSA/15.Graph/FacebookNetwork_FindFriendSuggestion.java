import java.util.*;

// find 2nd degree connections
// friends of friends of A.
class FacebookNetwork_FindFriendSuggestion{

    int findFriendSuggestions(Map<Character, List<Character>> graph, char node){

        int count = 0;
        Set<Character> friendSuggestions = new HashSet<>();
        List<Character> nodeFriends = graph.get(node);
        for(Character nbr : graph.get(node)){
            for(Character suggestion : graph.get(nbr)){
                //suggestion is valid and not in adjecency list of node
                if(suggestion != node && !nodeFriends.contains(suggestion) && !friendSuggestions.contains(suggestion)){
                    friendSuggestions.add(suggestion);
                    count++;
                }
            }
        }

        System.out.println("Friend Suggestion :- " + friendSuggestions);
        return count;
    }

    public static void main(String[] args){
        FacebookNetwork_FindFriendSuggestion obj = new FacebookNetwork_FindFriendSuggestion();
        MyGraph<Character> graph = new MyGraph<>();

        graph.addEdge('A', 'B', true);
        graph.addEdge('A', 'C', true);
        graph.addEdge('A', 'D', true);
        graph.addEdge('A', 'K', true);
        graph.addEdge('B', 'K', true);
        graph.addEdge('B', 'G', true);
        graph.addEdge('C', 'E', true);
        graph.addEdge('D', 'E', true);
        graph.addEdge('D', 'F', true);
        graph.addEdge('E', 'F', true);
        graph.addEdge('G', 'H', true);
        graph.addEdge('H', 'I', true);
        graph.addEdge('H', 'J', true);
        
        System.out.println("Graph :- \n" + graph);
        int count = obj.findFriendSuggestions(graph.getMap(), 'A');
        System.out.println("Total suggestion count = " + count);
    }
}
