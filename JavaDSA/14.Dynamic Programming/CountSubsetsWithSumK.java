class CountSubsetsWithSumK{
    
    int countSubsetsRecusion(int[] numbers, int i, int sum){
        
        if(sum == 0){
            return 1;
        }

        if(i == -1){
            return 0;
        }

        int include = 0;
        if(sum - numbers[i] >= 0){
            include = countSubsetsRecusion(numbers, i - 1, sum-numbers[i]);
        }
        int exclude = countSubsetsRecusion(numbers, i - 1, sum);
        return include + exclude;
    }

    int countSubsetsTopDown(int[] numbers, int[][] dp, int i, int sum){
        
        if(sum == 0){
            return 1;
        }
        if(i == -1){
            return 0;
        }
        if(dp[i][sum] != -1){
            return dp[i][sum];
        }

        int include = 0;
        if(sum - numbers[i] >= 0){
            include = countSubsetsTopDown(numbers, dp, i - 1, sum-numbers[i]);
        }
        int exclude = countSubsetsTopDown(numbers, dp, i - 1, sum);
        return dp[i][sum] = include + exclude;
    }

    int countSubsetsBottomUpDP(int[] numbers, int sum){

        int[][] dp = new int[numbers.length+1][sum+1];

        for(int i = 0; i < dp.length; i++){
            for(int s = 0; s < dp[0].length; s++){

                if(s == 0){
                    dp[i][s] = 1;
                    continue;
                }
                if(i == 0){
                    dp[i][s] = 0;
                    continue;
                }

                int include = 0;
                if(s - numbers[i - 1] >= 0){
                    include = dp[i - 1][s -numbers[i - 1]];
                }
                int exclude = dp[i - 1][s];
                dp[i][s] = include + exclude;
            }
        }

        return dp[numbers.length][sum];
    }

    public static void main(String[] args){
        
        CountSubsetsWithSumK obj = new CountSubsetsWithSumK();
        int[] numbers = {8, 4, 1, 3, 5};
        int sum = 9;
        int[][] dp = new int[numbers.length][sum+1];
        DPUtility.initDPArray(dp);

        int ans1 = obj.countSubsetsRecusion(numbers, numbers.length-1, sum);
        int ans2 = obj.countSubsetsTopDown(numbers, dp, numbers.length-1, sum);
        int ans3 = obj.countSubsetsBottomUpDP(numbers, sum);
        System.out.println("total substes having sum " + sum + " using Recursion are :- " + ans1);
        System.out.println("total substes having sum " + sum + " using Top-Down are :- " + ans2);
        System.out.println("total substes having sum " + sum + " using Bootom-Up are :- " + ans3);
    }
}
