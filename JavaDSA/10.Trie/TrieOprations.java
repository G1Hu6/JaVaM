import java.util.*;

class TrieOperations{

    TrieNode root;

    TrieOperations(){

        root = new TrieNode('\0');
    }

    void insertNodeInTrie(String word){

        TrieNode temp = root;
        for(int i = 0; i < word.length(); i++){

            Character data = word.charAt(i);
            if(!temp.hashMap.containsKey(data)){

                TrieNode newNode = new TrieNode(data);
                temp.hashMap.put(data, newNode);
            }
            // move temp pointer to next value
            temp = temp.hashMap.get(data);
        }
        // make the last node as terminal node.
        temp.isTerminal = true;
    }

    boolean searchNodeInTrie(String queryWord){

        TrieNode temp = root;
        for(int i = 0; i < queryWord.length(); i++){

            Character data = queryWord.charAt(i);
            if(!temp.hashMap.containsKey(data)){

                return false;
            }
            temp = temp.hashMap.get(data);
        }
        // if last node of queryWord is terminal node 
        // in trie then return true otherwise false
        return temp.isTerminal;
    }

    void printNodesInTrie(TrieNode root, int index, StringBuilder sequence){

        //base case
        if(root.isTerminal){

            System.out.println(sequence);
        }
        
        //recursive case
        Iterator<Character> iterator = root.hashMap.keySet().iterator();

        while(iterator.hasNext()){

            char character = iterator.next();
            sequence = sequence.insert(index, character);
            printNodesInTrie(root.hashMap.get(character), index+1, sequence);
            sequence.deleteCharAt(index);
        }
    }

    public static void main(String[] args){

        TrieOperations op = new TrieOperations();
        op.insertNodeInTrie("cat");
        op.insertNodeInTrie("bat");
        op.insertNodeInTrie("batman");
        op.insertNodeInTrie("ape");
        op.insertNodeInTrie("apple");
        op.insertNodeInTrie("tab");
        op.insertNodeInTrie("news");

        TrieNode myRoot = op.root;
        op.printNodesInTrie(myRoot, 0, new StringBuilder(""));

        System.out.println(op.searchNodeInTrie("cat"));
        System.out.println(op.searchNodeInTrie("apple"));
        System.out.println(op.searchNodeInTrie("apes"));
        System.out.println(op.searchNodeInTrie("ape"));
        System.out.println(op.searchNodeInTrie("newspaper"));
    }
}
