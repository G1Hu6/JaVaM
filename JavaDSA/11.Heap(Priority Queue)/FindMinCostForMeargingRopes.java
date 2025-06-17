import java.util.PriorityQueue;

class FindMinCostForMeargingRopes{

    // (2).Given length of N ropes, the cost of mearging two ropes is equal to 
    //     sum of their lengths. find the min cost of mearging all ropes into 
    //     single rope.
    // Time complexity = O(N * logN)
    int getMinCost(int[] ropes){

        // 1.create min heap from array
        // time = O(N * logN)
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();
        for(int i = 0; i < ropes.length; i++){
            minPQ.add(ropes[i]);
        }

        int cost = 0;
        // 2.pick two min values from array and add resultent value to heap again
        // time = O(N * logN)
        while(minPQ.size() != 1){ // O(N)

            // removes and return value
            // time = O(logN)
            int rope1 = minPQ.poll();
            int rope2 = minPQ.poll();
            cost = cost + (rope1 + rope2);
            minPQ.add(rope1 + rope2);
        }

        return cost;
    }

    public static void main(String[] args){

        FindMinCostForMeargingRopes pro2 = new FindMinCostForMeargingRopes();
        int[] ropes = new int[]{1, 4, 2, 5};
        System.out.println("Total min cost to merge all ropes = " + pro2.getMinCost(ropes));
    }
}
