class SubsetSum{

    // Time complexity = O(2^N)
    boolean isSumFormed(int[] numbers, int sum, int i){

        // base case
        if(sum == 0){
            return true;
        }

        if(i == -1){
            return false;
        }

        // recursive case
        boolean include = false;
        if(sum - numbers[i] >= 0){
            include = isSumFormed(numbers, sum - numbers[i], i - 1);
        }
        boolean exclude = isSumFormed(numbers, sum, i - 1);
        
        return include || exclude;
    }

    // Time complexity = O(N*K)
    boolean isSumFormedTopDownDP(int[] numbers, int[][] dp, int sum, int i){

        // base case
        if(sum == 0){
            return true;
        }

        if(i == -1){
            return false;
        }

        if(dp[i][sum] != -1){
            if(dp[i][sum] == 0){
                return false;
            }else{
                return true;
            }
        }

        // recursive case
        boolean include = false;
        if(sum - numbers[i] >= 0){
            include = isSumFormedTopDownDP(numbers, dp, sum - numbers[i], i - 1);
        }
        boolean exclude = isSumFormedTopDownDP(numbers, dp, sum, i - 1);
        if(include || exclude){
            dp[i][sum] = 1;
        }else{
            dp[i][sum] = 0;
        }

        return include || exclude;
    }

    // Time complexity = O(N*K)
    boolean isSumFormedBottomUpDP(int[] numbers, int sum){

        boolean[][] dp = new boolean[numbers.length+1][sum+1];

        for(int i = 0; i < dp.length; i++){
            for(int s = 0; s < dp[0].length; s++){

                if(s == 0){ 
                    dp[i][s] = true; // set first column to true because sum is 0.
                    continue;
                }
                // no need for this step
                if(i == 0){
                    dp[i][s] = false; // set first row to false where i from 1 to s.
                    continue;
                }

                boolean include = false;
                if(s - numbers[i-1] >= 0){
                    include = dp[i - 1][s - numbers[i-1]];
                }
                boolean exclude = dp[i-1][s];
                dp[i][s] = include || exclude; 
            }
        }

        System.out.println(java.util.Arrays.deepToString(dp));
        return dp[numbers.length][sum];
    } 

    public static void main(String[] args){

        SubsetSum obj = new SubsetSum();
        int[] numbers = {7, 4, 9, 6, 10, 13, 11, 14};
        int sum = 22;
        int[] numbers2 = {4, 2, 1, 3};
        int sum2 = 7;
        int[][] dp = new int[numbers2.length][sum2+1];
        DPUtility.initDPArray(dp);

        boolean ans1 = obj.isSumFormed(numbers, sum, numbers.length-1);
        System.out.println(java.util.Arrays.deepToString(dp));
        boolean ans2 = obj.isSumFormedTopDownDP(numbers2, dp, sum2, numbers2.length-1);
        boolean ans3 = obj.isSumFormedBottomUpDP(numbers2, sum2);
        System.out.println(java.util.Arrays.deepToString(dp));
        System.out.println("Sum formed by numbers Recursion :- " + ans1);
        System.out.println("Sum formed by numbers Top-Down :- " + ans2);
        System.out.println("Sum formed by numbers Bottom-Up :- " + ans3);

    }
}
