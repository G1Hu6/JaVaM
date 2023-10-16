/*
   Q.(3) Given array of size N.
         int arr = new int[]{2, 4, 1, 3}

         (A) Print the sum of every single subarray.
         (B) Print the sum of every single subarray using Prefix Sum.
         (C) Print the sum of every single subarray with time Complexity O(N^2) and without extra space.
 */

//Approach (A) :-
//Time Complexity = O(N^2)
//Space Complexity = O(N)


class PrintSum{
        public static void main(String[] args){
        	int arr[] = new int[]{2, 4, 1, 3};
		int totalSum = 0;

		for(int i = 0; i < arr.length; i++){
			int sum = 0;
			for(int j = i; j < arr.length; j++){
				sum = sum + arr[j];
				totalSum = totalSum + sum;
				System.out.println(sum);
			}
		}

		System.out.println("\nTotal sum of Subarray = " + totalSum);
	}
}
