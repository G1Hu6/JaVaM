/*
 Q(1). Given an array of size N. find total number of possible subarrays ?

       (A) N*(N-1)
       (B) N*(N-1)+2
       (C) N*(N+1)/2
       (D) N*(N+1)
*/

// Time Complexity = O(1)
// Space Complexity = O(1)

class CountSubArray{
        public static void main(String[] args){
                int arr[] = new int[]{4, 2, 10, 3, 12, -2, 15};
		int N = arr.length;
                System.out.println(N*(N+1)/2);
        }
}

