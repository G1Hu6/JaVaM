import java.util.PriorityQueue;
import java.util.Comparator;

class FindTopKStudents{

    // Approach 1 :- Brute force
    // Time complexity :- O(N * logN)
    int[] getTopKUsingSort(int[] studentsMark, int k){

        // sort
        java.util.Arrays.sort(studentsMark);
        
        int[] topStudents = new int[k];
        // get top k
        for(int i = 0; i < k; i++){

            topStudents[i] = studentsMark[studentsMark.length-i-1];
        }

        return topStudents;
    }

    // Approach 2 :- Build max heap and extract(remove) k elements.
    // Time complexity :- O(N + k*logN)
    int[] getTopKUsingMaxHeap(int[] studentsMark, int k){

        //PriorityQueue pQueue = new PriorityQueue(Collections.reverseOrder());
        //PriorityQueue pQueue = new PriorityQueue((a, b) -> b - a);
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(
                new Comparator<Integer>(){

                    @Override
                    public int compare(Integer a, Integer b){
                        return b - a;
                    }
                }
        );

        // 1.build max heap from array  time = O(N)
        for(int i = 0; i < studentsMark.length; i++){

            pQueue.add(studentsMark[i]);
        }

        int[] topStudents = new int[k];
        int n = k;
        // 2.remove k elements time = O(k * logN)
        while(k > 0){

            int max = pQueue.poll();
            topStudents[n - k] = max;
            k--;
        }

        return topStudents;
    }

    // Algorithm 3 :-(Optimal) Build a min heap of size k.
    // Time complexity = O(N * logk)
    int[] getTopKUsingMinHeap(int[] studentsMark, int k){

        // 1.create min heap of first k elements from array 
        // time = O(k * logk)
        PriorityQueue<Integer> minQueue = new PriorityQueue<>(k);
        for(int i = 0; i < k; i++){ 
            minQueue.add(studentsMark[i]);
        }

        // 2.compair rest of elements of array with root(min) in heap
        //   if it is greater then replace with root and heapify
        //   time = O((n-k) * log k)
        int[] topStudents = new int[k];
        for(int i = k; i < studentsMark.length; i++){

            if(studentsMark[i] > minQueue.peek()){
                minQueue.poll();
                minQueue.add(studentsMark[i]);
            }
        }
        
        for(int i = 0; i < k; i++){
            topStudents[i] = minQueue.poll();
        }
        return topStudents;
    }

    public static void main(String[] args){

        FindTopKStudents pro1 = new FindTopKStudents();
        int[] studentsMark = new int[]{1, 23, 12, 9, 30, 2, 50};
        int k = 3;

        //int[] answer = pro1.getTopKUsingSort(studentsMark, k);
        //int[] answer = pro1.getTopKUsingMaxHeap(studentsMark, k);
        int[] answer = pro1.getTopKUsingMinHeap(studentsMark, k);

        for(int i = 0; i < k; i++){

            System.out.print(answer[i] +  " ");
        }

    }
}
