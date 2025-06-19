class LadderProblem{

    // (3).Find the number of ways to reach N step of ladder in which kid can climb
    //     in 1, 2 or 3 jump at each level.

    // Brute force :- recursion
    // Time complexity :- O(3^N)
    int jumpUsingRecursion(int n){

        if(n < 0){
            return 0;
        }

        if(n == 0){
            return 1;
        }

        return jumpUsingRecursion(n - 1) + jumpUsingRecursion(n - 2) + jumpUsingRecursion(n - 3);
    }

    int jumpUsingTopDownDP(int n, int[] dp){

        if(n == 0){
            return 1;
        }

        if(n < 0){
            return 0;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        dp[n] = jumpUsingTopDownDP(n - 1, dp) + jumpUsingTopDownDP(n - 2, dp) + jumpUsingTopDownDP(n - 3, dp);
        return dp[n];
    }

    int jumpUsingBottomUpDP(int n, int[] dp){

        dp[0] = 1;
        for(int i = 1; i <= n; i++){
            int x = 0, y = 0, z = 0;
            if(i >= 2){
                y = dp[i - 2];
            }
            if(i >= 3){
                z = dp[i - 3];
            }
            x = dp[i - 1];

            dp[i] = x + y + z;
        }

        return dp[n];
    }

    public static void main(String[] args){

        int n = 4;
        LadderProblem obj = new LadderProblem();
        int[] dp = new int[n + 1];
        DPUtility.initDPArray(dp);
        System.out.println(java.util.Arrays.toString(dp));
        int ans1 = obj.jumpUsingRecursion(n);
        int ans2 = obj.jumpUsingTopDownDP(n, dp);
        
        DPUtility.initDPArray(dp);
        System.out.println(java.util.Arrays.toString(dp));
        int ans3 = obj.jumpUsingBottomUpDP(n, dp);

        System.out.println(java.util.Arrays.toString(dp));
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
    }
}
