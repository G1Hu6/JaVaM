class CoinCange_MinCoinForRupees{

    // Alorithm 1 :- Brute force
    // Time complexity = O(N^T) (exponential)
    int minCoins(int[] coins, int N){

        if(N == 0){
            return 0;
        }

        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < coins.length; i++){

            int remainingAmount = N - coins[i];
            if(remainingAmount >= 0){
             
                int remainingCoins = minCoins(coins, remainingAmount);
                ans = Math.min(ans, remainingCoins + 1);
            }
        }

        return ans;
    }

    // Algorithm 2 :- Greedy approach(algorithm)
    // time complexity :- O()
    int minCoinsGreedy(int[] coins, int N){

        if(N == 0){
            return 0;
        }

        int ans = Integer.MAX_VALUE;
        int peek = 0;
        java.util.Arrays.sort(coins); // sort array
        for(int i = 0; i < coins.length; i++){

            if(coins[i] <= N){
                peek = coins[i];
            }
        }

        int remainingAmount = N - peek;
        int remainingCoins = minCoinsGreedy(coins, remainingAmount);
        ans = remainingCoins + 1;

        return ans;
    }

    public static void main(String[] args){

        CoinCange_MinCoinForRupees pro1 = new CoinCange_MinCoinForRupees(); 
        int[] coins = new int[]{1, 7, 10};
        int N = 15;
        int answer = pro1.minCoins(coins, N);
        System.out.println("Min coins for " + N + " rupees :- " + answer);
        int answer2 = pro1.minCoinsGreedy(coins, N);
        System.out.println("Min coins for " + N + " rupees using greedy :- " + answer2);
    }
}
