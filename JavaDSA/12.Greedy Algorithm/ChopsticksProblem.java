class ChopsticksProblem{

    int findMaxPairs(int[] chopsticks, int D){

        java.util.Arrays.sort(chopsticks);
        int i = 0;
        int totalPairs = 0;
        while(i < chopsticks.length-1){

            if(chopsticks[i] - chopsticks[i + 1] <= D){
                totalPairs += 1;
                i += 2;
            }else{
                i += 1;
            }
        }

        return totalPairs;
    }

    public static void main(String[] args){

        ChopsticksProblem pro2 = new ChopsticksProblem();   
        int[] chopsticks = new int[]{3, 5, 10, 12, 14, 15, 18};
        int D = 3;
        int answer = pro2.findMaxPairs(chopsticks, D);
        System.out.println("Max pairs of chopsticks :- " + answer);
    }
}
