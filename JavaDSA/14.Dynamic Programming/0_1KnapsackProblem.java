import java.util.Arrays;

class Item{

    int id;
    int price;
    int weight;

    Item(int id, int price, int weight){

        this.id = id;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public String toString(){
        return this.id + " " + this.price + "\n";
    }
}

class KnapsackProblem{

    // for unbounded 0-1 knapsack problem i + 1 to i in include recursive call.
    int knapRecursion(int[] prices, int[] weights, int i, int n, int cap){

        if(cap == 0 || i == n){
            return 0;
        }

        // recursive case
        int inc = 0;
        int exc = 0;
        if(cap - weights[i] >= 0){
            inc = prices[i] + knapRecursion(prices, weights, i + 1, n, cap - weights[i]);
        }
        exc = knapRecursion(prices, weights, i + 1, n, cap);
        return Math.max(inc, exc);
    }

    int knapTopDownDP(int[] prices, int[] weights, int i, int n, int cap, int[][] dp){

        if(cap == 0 || i == n){
            return 0;
        }

        if(dp[i][cap] != -1){
            return dp[i][cap];
        }

        // recursive case
        int inc = 0;
        int exc = 0;
        if(cap - weights[i] >= 0){
            inc = prices[i] + knapTopDownDP(prices, weights, i + 1, n, cap - weights[i], dp);
        }
        exc = knapTopDownDP(prices, weights, i + 1, n, cap, dp);
        return dp[i][cap] = Math.max(inc, exc);
    }

    int knapBottomUpDP(int[] prices, int[] weights, int n, int cap){

        int dp[][] = new int[n+1][cap+1];
        
        for(int i = 0; i <= n; i++){
            for(int c = 0; c <= cap; c++){

                // set first row and column to 0
                if(i == 0 || c == 0){
                    dp[i][c] = 0;
                    continue;
                }

                int inc = 0;
                int exc = 0;
                if(c - weights[i-1] >= 0){
                    inc = prices[i-1] + dp[i-1][c - weights[i-1]];
                }
                exc = dp[i-1][c];
                dp[i][c] = Math.max(inc, exc);
            }
        }

        System.out.println(Arrays.deepToString(dp));
        return dp[n][cap];
    }

    public static void main(String[] args){
        
        KnapsackProblem obj = new KnapsackProblem();
        int prices[] = new int[]{12, 20, 15, 6, 10};
        int weights[] = new int[]{3, 6, 5, 2, 4};
        int n = 5;
        int cap = 7;
        int[][] dp = new int[n][cap+1];
        DPUtility.initDPArray(dp);

        int ans1 = obj.knapRecursion(prices, weights, 0, n, cap);
        int ans2 = obj.knapTopDownDP(prices, weights, 0, n, cap, dp);
        int ans3 = obj.knapBottomUpDP(prices, weights, n, cap);
        System.out.println("Total max cost Recursion = " + ans1);
        System.out.println(Arrays.deepToString(dp));
        System.out.println("Total max cost Top-Down = " + ans2);
        System.out.println("Total max cost Bottom-Up = " + ans3);
    }
}
