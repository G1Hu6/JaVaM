import java.util.*;

public class MyGraph<T>{

    private Map<T, List<T>> map = new HashMap<>();

    public Map<T, List<T>> getMap(){
        return this.map;
    }

    public void addVertex(T vertex){

        map.put(vertex, new LinkedList<T>());
    }

    public void addEdge(T source, T destination, boolean isBidirectional){

        if(!map.containsKey(source)){
            addVertex(source);
        }
        if(!map.containsKey(destination)){
            addVertex(destination);
        }

        map.get(source).add(destination);
        if(isBidirectional){
            map.get(destination).add(source);
        }
    }

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
}
