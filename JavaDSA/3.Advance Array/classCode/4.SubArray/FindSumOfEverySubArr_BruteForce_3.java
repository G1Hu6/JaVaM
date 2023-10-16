/*
   Q.(3) Given array of size N.
         int arr = new int[]{2, 4, 1, 3}

	 (A) Print the sum of every single subarray.
	 (B) Print the sum of every single subarray using Prefix Sum.
	 (C) Print the sum of every single subarray with time Complexity O(N^2) and without extra space.
 */

//Approach (A) :-
//Time Complexity = O(N^3)
//Space Complexity = O(1)


class PrintSum{
	public static void main(String[] args){
	int arr[] = new int[]{2, 4, 1, 3};
	
	for(int i = 0; i < arr.length; i++){
		for(int j = i; j < arr.length; j++){
			int sum = 0;
			for(int k = i; k <= j; k++){
				sum = sum + arr[k];
			}
			System.out.println(sum);
		}
	}
	}
}
