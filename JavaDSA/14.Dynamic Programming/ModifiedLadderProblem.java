class ModifiedLadderProblem{

    // (2).Modified ladder problem to take K jump to reach Nth step.
    // Recursive time complexity = O(K^N)

    // Approach 1 :- Bottom-Up Dp[Iterative + Tabulation]
    // Time complexity :- O(N*K)
    int climbLadder(int n, int k){

        int[] dp = new int[n + 1];
        dp[0] = 1;

        for(int i = 1; i <= n; i++){ // O(N)

            int ans = 0;
            for(int j = 1; j <= k; j++){  // O(K)
                if(i - j >= 0){
                    ans += dp[i - j];
                }
            }
            dp[i] = ans;
        }

        return dp[n];
    }

    // Approach 2 :- Sliding window and DP
    // Time complexity :- O(N)
    int climbLadderSlidingWindow(int n, int k){

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i <= n; i++){

            if(i <= k){
                dp[i] = 2 * dp[i - 1];
            }else{
                dp[i] = 2 * dp[i - 1] - dp[i -k -1];
            }
        }

        return dp[n];
    }

    // Approach 3 :- Matrix Exponentiation[most optimized] O(K^3 logN)
    //               Any linear recurrences problem i.e. dp[i] = dp[i-1] + dp[i-2] + dp[i-3] + ... + dp[i-k] 
    //               can be sovled by this mathematical technique.
    // Time complexity :- O(K^3 logN)
    int climbLadderMatrixExploration(int n, int k){

    }

    public static void main(String[] args){
        
        ModifiedLadderProblem obj = new ModifiedLadderProblem();

        int n = 10, k = 6;
        int ans1 = obj.climbLadder(n, k);
        int ans2 = obj.climbLadderSlidingWindow(n, k);

        System.out.println("Bottom-Up Ans to climb n = " + n + " steps :- " + ans1);
        System.out.println("Sliding window optimized Ans to climb n = " + n + " steps :- " + ans2);
    }
}
