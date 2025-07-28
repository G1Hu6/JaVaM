import java.util.*;

class BoggleBoardGame_GuidedSearchTrie{

    static int N = 3, M = 4;

    static class Node{

        char data;
        boolean isTerminal;
        HashMap<Character, Node> children;
        String word;

        Node(char data){
            this.data = data;
            this.isTerminal = false;
            this.children = new HashMap<>();
            this.word = "";
        }
    }

    static class Trie{

        Node root;

        Trie(){
            this.root = new Node('\0');
        }

        void addWord(String word){

            Node temp = root;
            for(int i = 0; i < word.length(); i++){
                char data = word.charAt(i);
                if(!temp.children.containsKey(data)){
                    temp.children.put(data, new Node(data));
                }
                // move temp
                temp = temp.children.get(data);
            }
            // last node
            temp.isTerminal = true;
            temp.word = word;
        }
    }
    
    //main algorithm (8-way dfs + trie guided search)
    static void dfs(char[][] board, Node node, int i, int j, boolean[][] visited, HashSet<String> output){

        // base case
        char ch = board[i][j];
        if(!node.children.containsKey(ch)){
            return;
        }

        // otherwise trie contains node
        visited[i][j] = true;
        node = node.children.get(ch); // update node
        // node is a terminal node
        if(node.isTerminal){
            output.add(node.word); // add word to output
        }

        //explore the neigbours
        int dx[] = {1, -1, 0,  0, 1, -1, -1,  1};
        int dy[] = {0,  0, 1, -1, 1,  1, -1, -1};

        for(int k = 0; k < 8; k++){

            int ni = i + dx[k];
            int nj = j + dy[k];
            // if inside board bound and not visited
            if(ni >= 0 && nj >= 0 && ni < N && nj < M && !visited[ni][nj]){
                dfs(board, node, ni, nj, visited, output);
            }
        }
        // last backtracking step
        visited[i][j] = false;
    }

    public static void main(String[] args){

        String words[] = {"SNAKE", "FOR", "QUEZ", "SNACK", "SNACKS", "GO","TUNES","CAT" };

        char[][] board = { 
            { 'S', 'E', 'R' ,'T'},
            { 'U', 'N', 'K' ,'S'},
            { 'T', 'C', 'A' ,'T'} 
        };

        // Step 1:- Create a Trie and insert all words in it.
        Trie t = new Trie();
        for(String w : words){
            t.addWord(w);
        }

        // Step 2:- Create visited array and output set.
        boolean visited[][] = new boolean[N][M]; // by default false
        HashSet<String> output = new HashSet<>();

        // Step 3:- 8-Way dfs from every cell (with guided search using trie)
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                 dfs(board,t.root,i,j,visited,output);
                 //reset the visited array after every call (while backtracking)
            }
        }

        // Step 4:- Print the Output
        for(String word: output){
            System.out.println(word);
        }
        
    }
}
