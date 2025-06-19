class CountSubsetsWithSumK{

    int countSubsets(int i, int[] input, int currentSum, int k){

        // base case
        if(i == input.length){
            
            if(currentSum == k){
                return 1;
            }
            return 0;
        }

        // prune(cut-off) the search
        if(currentSum > k){
            return 0;
        }

        // recursion case
        int x = countSubsets(i + 1, input, currentSum + input[i], k); // include 
        int y = countSubsets(i + 1, input, currentSum, k);            // exclude

        return x + y;
    }

    public static void main(String[] args){

        CountSubsetsWithSumK pro1 = new CountSubsetsWithSumK();
        int k = 9;
        int[] input = new int[]{3, 2, 6, 7};
        int answer = pro1.countSubsets(0, input, 0, k);
        System.out.println("count = " + answer);
    }
}
