class MinStepsToOne{

    int findStepsTopDownDP(int n, int[] dp){

        if(n == 1){
            return 0;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        int x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE;
        if(n % 3 == 0){
            x = findStepsTopDownDP(n/3, dp);
        }
        if(n % 2 == 0){
            y = findStepsTopDownDP(n/2, dp);
        }
        int z = findStepsTopDownDP(n - 1, dp);
        
        dp[n] = Math.min(x, Math.min(y, z)) + 1;
        return dp[n];
    }

    int findStepsBottomUpDP(int n, int[] dp){

        dp[1] = 0;
        for(int i = 2; i <= n; i++){

            int x = Integer.MAX_VALUE;
            int y = Integer.MAX_VALUE;
            if(i % 3 == 0){
                x = dp[i/3];
            }
            if(i % 2 == 0){
                y = dp[i/2];
            }
            int z = dp[i - 1];

            dp[i] = Math.min(x, Math.min(y, z)) + 1;
        }

        return dp[n];
    }

    public static void main(String[] args){
        int n = 10;
        int[] dp = new int[n + 1];
        DPUtility.initDPArray(dp);
        MinStepsToOne obj = new MinStepsToOne();
        System.out.println(obj.findStepsTopDownDP(n, dp));
        
        DPUtility.initDPArray(dp);
        System.out.println(obj.findStepsBottomUpDP(n, dp));
    }
}
