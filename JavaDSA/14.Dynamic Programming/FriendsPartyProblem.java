class FriendsPartyProblem{
    
    // (1). N friends are going for party each friend can go solo or as a couple find the number of ways of going to party.

    // Approach 1 :- Rucersive
    // Time complexity :- (2^N)
    int waysForParty(int n){

        // base case
        if(n == 1 || n == 2){
            return n;
        }

        // recursive case
        // recurrence relation :- [(either A can go solo) and(*) (rest friends also go)] or(+) [(A can from couple with any one from n-1 friends) and (rest n-2 friends can go)]
        // f(n) = 1*f(n-1) + (n-1)*f(n-2)
        return waysForParty(n - 1) + (n - 1)*waysForParty(n - 2);
    }

    // Approach 2 :- Top-Down DP
    // Time complexity :- O(N)
    int waysForPartyTopDownDP(int n, int[] dp){

        if(n <= 2){
            return n;
        }
        
        if(dp[n] != -1){
            return dp[n];
        }

        return dp[n] = waysForPartyTopDownDP(n - 1, dp) + (n - 1)*waysForPartyTopDownDP(n - 2, dp);
    }

    // Approach 1 :- Bottom-Up DP
    // Time complexity :- O(N)
    int waysForPartyBottomUpDP(int n){

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i <= n; i++){
            dp[i] = dp[i - 1] + (i - 1)*dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args){

        FriendsPartyProblem obj = new FriendsPartyProblem();
        
        int n = 5;
        int[] dp = new int[n + 1];
        DPUtility.initDPArray(dp);

        int ans1 = obj.waysForParty(n);
        int ans2 = obj.waysForPartyTopDownDP(n, dp);
        int ans3 = obj.waysForPartyBottomUpDP(n);
        System.out.println("Number of ways for going party with " + n + " friends by Recursion :- " + ans1);
        System.out.println("Number of ways for going party with " + n + " friends by Top-Down DP :- " + ans2);
        System.out.println("Number of ways for going party with " + n + " friends by Bottom-Up DP :- " + ans3);
    }
}
