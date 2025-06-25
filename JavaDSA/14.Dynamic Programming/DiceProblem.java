import java.util.*;

class DiceProblem{

    // (1).Given a 6 faced dice, count the the no. of ways to get sum N if you can roll the dice as may times 
    // Time complexity = O(6^N)
    // Space complexity = O(N)
    int rollDiceUsingRecursion(int n){

        if(n == 0){
            return 1;
        }

        if(n < 0){
            return 0;
        }

        return rollDiceUsingRecursion(n - 1) + rollDiceUsingRecursion(n - 2) + rollDiceUsingRecursion(n - 3) + rollDiceUsingRecursion(n - 4) + rollDiceUsingRecursion(n - 5) + rollDiceUsingRecursion(n - 6);
    }

    // Top-Down DP[Recursion + memoization]
    // Time complexity = O(N*6)= O(N)
    // Space complexity = O(N)
    int rollDiceUsingTopDownDp(int n, int[] dp){

        if(n == 0){
            return 1;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        int sum = 0;
        for(int i = 1; i <= 6; i++){ // O(6) constant time

            if(n - i >= 0){
                sum = sum + rollDiceUsingTopDownDp(n - i, dp);
            }
        }

        return dp[n] = sum;
    }

    // Bottom-Up DP[Iterative + Tabulation]
    // Time complexity = O(N*6)= O(N)
    // Space complexity = O(N)
    int rollDiceUsingBottomUpDp(int n){

        int[] dpArr = new int[n + 1];
        DPUtility.initDPArray(dpArr);

        dpArr[0] = 1;

        for(int i = 1; i <= n; i++){    // O(N)
            int sum = 0;
            for(int j = 1; j <= 6; j++){  // O(6)
                if(i - j >= 0){
                        sum += dpArr[i - j];
                }
            }
            dpArr[i] = sum;
        }

        return dpArr[n];
    }

    // Here we can optimize space complexity to O(1) by using fixed sixed dp array of length 6
    // or by using queue.
    // Time complexity = O(N)
    // Space complexity = O(1) 
    int rollDiceSpaceOptimized(int n){

        Queue<Integer> dpQueue = new LinkedList<>(); // fixed sized queue O(1)
        dpQueue.add(1);

        for(int i = 1; i <= n ; i++){
            /*
            Integer sum = 0;
            Iterator<Integer> itr = dpQueue.iterator();
            if(itr.hasNext()){
                int element = itr.next();
                System.out.print(element + " --> ");
                sum += element;
            }
            dpQueue.add(sum);
            if(dpQueue.size() > 6 ){
                dpQueue.poll();
            }
            System.out.println();
            */
            int sum = 0;
            for (int val : dpQueue) {
                System.out.print(val + " --> ");
                sum += val;
            }
            dpQueue.add(sum);
            System.out.println();
            if (dpQueue.size() > 6) {
                dpQueue.poll(); // Maintain size of 6
            }
        }

        int ans = 0;
        for(int val : dpQueue){
            ans = val; 
        }
        return ans;
    }

    // Sliding window ans DP most optimized
    int rollDiceSlidingWindowSpaceOptimized(int n){

        Queue<Integer> dpQueue = new LinkedList<>(); // fixed sized queue O(1)
        dpQueue.add(1);
        dpQueue.add(1);

        for(int i = 2; i <= n ; i++){

            if (dpQueue.size() > 6) {
                int ele = dpQueue.poll(); // Maintain size of 6
                dpQueue.add(2*((Integer)dpQueue.toArray()[5]) - ele);
            }else{
                dpQueue.add(2*((Integer)dpQueue.toArray()[i - 1]));
            }
        }

        int ans = 0;
        for(int val : dpQueue){
            ans = val; 
        }
        return ans;
    }

    // Reference ModifiedLadderProblem.java (connected...)

    public static void main(String[] args){

        DiceProblem obj = new DiceProblem();
        int n = 10;

        int ans1 = obj.rollDiceUsingRecursion(n);
        int[] dp = new int[n + 1];
        DPUtility.initDPArray(dp);
        int ans2 = obj.rollDiceUsingTopDownDp(n, dp);
        int ans3 = obj.rollDiceUsingBottomUpDp(n);
        int ans4 = obj.rollDiceSpaceOptimized(n);
        int ans5 = obj.rollDiceSlidingWindowSpaceOptimized(n);

        System.out.println("Recursion Ans :- " + ans1);
        System.out.println("Top-Down Dp Ans :- " + ans2);
        System.out.println("Bottom-Up Dp Ans :- " + ans3);
        System.out.println("Bottom-Up Space Optimized Ans :- " + ans4);
        System.out.println("Sliding Window and Space Optimized Ans :- " + ans5);
    }
}
