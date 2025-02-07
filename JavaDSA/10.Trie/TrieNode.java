import java.util.HashMap;

public class TrieNode{

    char data;
    boolean isTerminal;
    HashMap<Character, TrieNode> hashMap;

    TrieNode(char data){

        this.data = data;
        this.isTerminal = false;
        this.hashMap = new HashMap<>();
    }
    
}
