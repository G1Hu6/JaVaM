import java.util.Arrays;

class HouseRobberProblem{

    // (2). Rob houces to get max sum without selecting consecutive houces.

    // Approach 1 :- Recursive
    // Time complexity :- O(2^N)
    int robMoney(int[] houses, int n){
        
        if(n == 1){
            return houses[0];
        }

        if(n == 2){
            return Math.max(houses[0], houses[1]);
        }

        // include ith house
        int inc = houses[n - 1] + robMoney(houses, n - 2); // current money of ith + skip consecutive
        //exclude ith houce
        int exc = robMoney(houses, n - 1); // money upto (i-1)th house
        // recturn max from both cases
        return Math.max(inc, exc);
    }

    // Approach 1 :- Top-Down Dp
    // Time complexity :- O(N)
    int robMoneyTopDownDP(int[] houses, int n, int[] dp){

        if(n == 1){
            return houses[0];
        }

        if(n == 2){
            return Math.max(houses[0], houses[1]);
        }

        if(dp[n] != -1){
            return dp[n];
        }

        // include ith house
        int inc = houses[n - 1] + robMoneyTopDownDP(houses, n - 2, dp); // current money of ith + skip consecutive
        //exclude ith houce
        int exc = robMoneyTopDownDP(houses, n - 1, dp); // money upto (i-1)th house
        // recturn max from both cases
        return dp[n-1] = Math.max(inc, exc);
    }

    // Approach 1 :- Bottom-Up DP
    // Time complexity :- O(N)
    int robMoneyBottomUpDP(int[] houses, int n){
        
        int[] dp = new int[n + 1];
        dp[0] = houses[0];
        dp[1] = Math.max(houses[0], houses[1]);

        for(int i = 2; i < n; i++){
            dp[i] = Math.max(houses[i] + dp[i-2], dp[i-1]);
        }

        return dp[n-1];
    }

    public static void main(String[] args){
        
        HouseRobberProblem obj = new HouseRobberProblem();

        int[] houces1 = new int[]{2, 7, 9, 3, 1};
        int[] houces2 = new int[]{1, 1, 100, 2, 1, 100};
        int[] dp1 = new int[houces1.length + 1];
        int[] dp2 = new int[houces2.length + 1];
        DPUtility.initDPArray(dp1);
        DPUtility.initDPArray(dp2);

        int ans1 = obj.robMoney(houces1, houces1.length);
        int ans2 = obj.robMoney(houces2, houces2.length);
        int ans3 = obj.robMoneyTopDownDP(houces1, houces1.length, dp1);
        int ans4 = obj.robMoneyTopDownDP(houces2, houces2.length, dp2);
        int ans5 = obj.robMoneyBottomUpDP(houces1, houces1.length);
        int ans6 = obj.robMoneyBottomUpDP(houces2, houces2.length);

        System.out.println("Max robbed money from " + Arrays.toString(houces1) + " Recursion :- " + ans1);
        System.out.println("Max robbed money from " + Arrays.toString(houces2) + " Recursion :- " + ans2);
        System.out.println("Max robbed money from " + Arrays.toString(houces1) + " Top-Down :- " + ans3);
        System.out.println("Max robbed money from " + Arrays.toString(houces2) + " Top-Down :- " + ans4);
        System.out.println("Max robbed money from " + Arrays.toString(houces1) + " Bottom-Up :- " + ans5);
        System.out.println("Max robbed money from " + Arrays.toString(houces2) + " Bottom-Up :- " + ans6);
    }
}
