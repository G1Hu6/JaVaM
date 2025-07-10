class CoinSelectionGame{

    // (4).Consider a row of n conins where values are from V1 to Vn. Where n is even. 
    //     we play a game against an opponent by attempting turns. In each turen a player 
    //     select either the first or the last coin from the row, removes it from row
    //     permanently, and receives the value of the coin. Determine the maximum possible
    //     amount of the money we can definitely wins if we move first.
    // Note :- Opponent is as cleaver as user.

    int maxAmountWins(int[] coins, int i, int j){

        // base case
        if(j == i + 1){
            return Math.max(coins[i], coins[j]); // pick max from two remaining conis
        }
        if(i > j){
            return 0;
        }

        // recursive case
        int firstCoinPicked = coins[i] + Math.min(maxAmountWins(coins, i + 2, j), maxAmountWins(coins, i + 1, j - 1)); // opponet tries to minimize our result
        int lastCoinPicked = coins[j] + Math.min(maxAmountWins(coins, i + 1, j - 1), maxAmountWins(coins, i, j - 2));
        return Math.max(firstCoinPicked, lastCoinPicked);
    }

    int maxAmountWinsTopDownDP(int[] coins, int[][] dp, int i, int j){

        // base case
        if(j == i + 1){
            return Math.max(coins[i], coins[j]); // pick max from two remaining conis
        }
        if(i > j){
            return 0;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        // recursive case
        int firstCoinPicked = coins[i] + Math.min(maxAmountWinsTopDownDP(coins, dp, i + 2, j), maxAmountWinsTopDownDP(coins, dp, i + 1, j - 1)); // opponet tries to minimize our result
        int lastCoinPicked = coins[j] + Math.min(maxAmountWinsTopDownDP(coins, dp, i + 1, j - 1), maxAmountWinsTopDownDP(coins, dp, i, j - 2));
        return dp[i][j] = Math.max(firstCoinPicked, lastCoinPicked);
    }

    int maxAmountWinsBootomUpDP(int[] coins){

        int[][] dp = new int[coins.length][coins.length];

        /*
        for(int i = 0; i < dp.length; i++){
            dp[i][i] = coins[i];
        }

        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){

                if(i >= j){
                    continue;
                }

                if(j == i + 1){
                    dp[i][j] = Math.max(dp[i][i], dp[j][j]);
                    continue;
                }

                int firstCoinPicked = coins[i] + Math.min(dp[i + 2][j], dp[i + 1][j - 1]);
                int lastCoinPicked = coins[j] + Math.min(dp[i + 1][j - 1], dp[i][j - 2]);
                dp[i][j] = Math.max(firstCoinPicked, lastCoinPicked);
            }
        }
        */

        for(int i = 0; i < coins.length; i++){
            for(int j = i; j < coins.length; j++){
                if(i == 0){
                    dp[j - i][j] = coins[j - i];
                    continue;
                }
                if(i == 1){
                    dp[j - i][j] = Math.max(coins[j - i], coins[j]);
                    continue;
                }
                int firstCoinPicked = coins[j - i] + Math.min(dp[j - i + 2][j], dp[j - i + 1][j - 1]);
                int lastCoinPicked = coins[j] + Math.min(dp[j - i + 1][j - 1], dp[j - i][j - 2]);
                dp[j - i][j] = Math.max(firstCoinPicked, lastCoinPicked);
            }
        }

        System.out.println(java.util.Arrays.deepToString(dp));
        return dp[0][coins.length-1];
    }

    public static void main(String[] args){

        CoinSelectionGame obj = new CoinSelectionGame();
        int[] coins = {4, 1, 6, 3};
        int[][] dp = new int[coins.length][coins.length];
        DPUtility.initDPArray(dp);

        int ans1 = obj.maxAmountWins(coins, 0, coins.length-1);
        int ans2 = obj.maxAmountWinsTopDownDP(coins, dp, 0, coins.length-1);
        int ans3 = obj.maxAmountWinsBootomUpDP(coins);
        System.out.println("Max amount of money Recursion :- " + ans1);
        System.out.println("Max amount of money Top-Down :- " + ans2);
        System.out.println("Max amount of money Bottom-Up :- " + ans3);
    }
}
