class CoinCangeUsingDP{

    //Top-Down DP
    int minCoins(int n, int[] coins, int[] dp){

        if(n == 0){
            return 0;
        }
        
        int ans = Integer.MAX_VALUE;
        for(int coin : coins){
            
            int remainingCoins = n - coin;
            if(remainingCoins >= 0){
                ans = Math.min(minCoins(remainingCoins, coins, dp) + 1, ans);
            }
        }
        
        dp[n] = ans;
        return dp[n];
    }

    //Bottom-Up DP
    int minCoins(int n, int[] coins){

        int[] dpArr = new int[n + 1];
        dpArr[0] = 0;

        for(int i = 1; i <= n; i++){

            int ans = Integer.MAX_VALUE;
            for(int coin : coins){
                int remCoins = i - coin;
                if(remCoins >= 0)
                    ans = Math.min(dpArr[remCoins] + 1, ans);
            }
            dpArr[i] = ans;
        }

        return dpArr[n];
    }

    public static void main(String[] args){

        CoinCangeUsingDP obj = new CoinCangeUsingDP();
        int[] coins = new int[]{1, 7, 10};
        int n = 10;
        int[] dp = new int[n + 1];
        DPUtility.initDPArray(dp);
        int ans1 = obj.minCoins(n, coins, dp);
        int ans2 = obj.minCoins(n, coins);

        System.out.println("Min conins required to make change of " + n + " Rs is by TopDown :- " + ans1);
        System.out.println("Min conins required to make change of " + n + " Rs is by BottomUp :- " + ans2);
    }
}
