import java.util.*;

class LongestCommonSequence{

    // (1).LCS: Find longest common sequence in strings. In given 2 strings, find out
    //          1.length of LCS
    //          2.print the LCS
    
    // Approach 1 :- Recursive
    // Time complexity :- O(2^M+N) where,N = s1.length() and M = s2,length()
    int findLengthOfLCS(char[] s1, char[] s2, int i, int j){

        // base case
        if(i == s1.length || j == s2.length){
            return 0;
        }

        // recursive case
        if(s1[i] == s2[j]){
            return 1 + findLengthOfLCS(s1, s2, i + 1, j + 1);
        }
        // exclude ith element
        int excI = findLengthOfLCS(s1, s2, i + 1, j);
        // exclude jth element
        int excJ = findLengthOfLCS(s1, s2, i, j + 1);
        return Math.max(excI, excJ);
    }

    // Approach 2 :- Top-Down DP
    // Time complexity :- O(N*M)
    int findLengthOfLCSTopDownDp(char[] s1, char[] s2, int i, int j, int[][] dp){

        // base case
        if(i == s1.length || j == s2.length){
            return 0;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        // recursive case
        if(s1[i] == s2[j]){
            return dp[i][j] = 1 + findLengthOfLCSTopDownDp(s1, s2, i + 1, j + 1, dp);
        }
        // exclude ith element
        int excI = findLengthOfLCSTopDownDp(s1, s2, i + 1, j, dp);
        // exclude jth element
        int excJ = findLengthOfLCSTopDownDp(s1, s2, i, j + 1, dp);
        return dp[i][j] = Math.max(excI, excJ);
    }

    // Approach 3 :- Bottom-Up DP
    // Time complexity :- O(N*M)
    int findLengthOfLCSBottomUpDP(char[] s1, char[] s2, int n, int m){
        
        int[][] dp = new int[n + 1][m + 1];
        char[][] dir = new char[n + 1][m + 1];
        dp[0][0] = 0;

        // dp[0][x] = dp[x][0] = 0 [one string is empty]
        for(int i = 1; i <= m; i++){
            dp[0][i] = 0; // 0th row
        }
        for(int j = 1; j <= n; j++){
            dp[j][0] = 0; // 0th column
        }

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(s1[i-1] == s2[j-1]){ // diagonal cell
                    dir[i][j] = 'd';
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{  // top and left
                    if(dp[i-1][j] > dp[i][j-1]){
                        dir[i][j] = 't';
                    }else{
                        dir[i][j] = 'l';
                    }
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        System.out.println(java.util.Arrays.deepToString(dp));
        printLCS(dir, dp, s1, s2, n, m);
        return dp[n][m];
    }

    void printLCS(char[][] dir,int[][] dp, char[] s1, char[] s2, int n, int m){

        int i = n;
        int j = m;
        System.out.println(Arrays.deepToString(dir));
        ArrayList<Character> dirArray = new ArrayList<Character>();
        while(i > 0 || j > 0){
            char currentDir = dir[i][j];
            if(currentDir == 'd'){
                dirArray.add(s1[i - 1]);
                i = i - 1;
                j = j - 1;
            }else if(currentDir == 't'){
                i = i - 1;
            }else{
                j = j - 1;
            }
        }
        Collections.reverse(dirArray);
        for(Character letter : dirArray){
            System.out.print(letter);
        }
        System.out.println();
    }

    public static void main(String[] args){

        LongestCommonSequence obj = new LongestCommonSequence();

        char[] s1 = {'A', 'B', 'C', 'D', 'G', 'H', 'X'}; 
        char[] s2 = {'A', 'E', 'D', 'F', 'H'};
        int[][] dp = new int[s1.length][s2.length];
        DPUtility.initDPArray(dp);

        int ans1 = obj.findLengthOfLCS(s1, s2, 0, 0);
        int ans2 = obj.findLengthOfLCSTopDownDp(s1, s2, 0, 0, dp);
        int ans3 = obj.findLengthOfLCSBottomUpDP(s1, s2, s1.length, s2.length);
        System.out.println("length LCS using Recursion :- " + ans1);
        System.out.println("length LCS using Top-Down :- " + ans2);
        System.out.println(java.util.Arrays.deepToString(dp));
        System.out.println("length LCS using Bottom-Up :- " + ans3);
    }
}
