
// Dynamic Programming (DP)
// (1) optimal substructure :- such that we can break down problem into smaller substructure.
// (2) overlaping subproblems.

class FibonacciSeriesUsingDP{

    // Brute force :- using recursion
    // Time complexity = O(2^N)
    // Space complexity = O(N)
    int fiboUsingRecursion(int n){

        if(n == 0 || n == 1){
            return n;
        }

        return fiboUsingRecursion(n - 1) + fiboUsingRecursion(n - 2);
    }

    // we can optimize this usinbg dynamic programming.
    // Idea :- store the solution of subproblem and reuse it.(array/ hashmap)
    
    // Top-Down DP[Recursion + Memoization] 
    // Time complexity = O(N)
    // Space complexity = O(N)
    int fiboUsingTopDownDP(int n, int[] dp){

        // base case
        if(n <= 1){
            return n;
        }

        // reusing the past
        if(dp[n] != -1){
            return dp[n];
        }

        // storing values of overlaping subproblems
        // remember the past.          
        
        dp[n] = fiboUsingTopDownDP(n - 1, dp) + fiboUsingTopDownDP(n - 2, dp);
        return dp[n];
    }

    // Bottom-Up DP[Iterative + Tabulation] 
    // Time complexity = O(N)
    // Space complexity = O(N)
    int fiboUsingBottomUpDp(int n, int[] dp){

        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i <= n; i++){

            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args){

        FibonacciSeriesUsingDP obj = new FibonacciSeriesUsingDP();
        int n = 5;
        int[] dp = new int[n + 1];

        DPUtility.initDPArray(dp);
        //System.out.println(java.util.Arrays.toString(dp));
        int ans1 = obj.fiboUsingRecursion(n);
        int ans2 = obj.fiboUsingTopDownDP(n, dp);

        DPUtility.initDPArray(dp);
        //System.out.println(java.util.Arrays.toString(dp));
        
        int ans3 = obj.fiboUsingBottomUpDp(n, dp);
        System.out.println("Recursion :- " + ans1);
        System.out.println("Top-Down DP :- " + ans2);
        System.out.println("Bottom-Up DP :- " + ans3);
    }
}
