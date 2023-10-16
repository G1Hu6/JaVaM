/*
   Q.(1) Given an array of size N.
         Print all the elements in given subarray from start to end.

   Time Complexity = O(N);
   Space Complexity = O(1);
*/

class PrintGivenSubArray{
	public static void main(String[] args){
		int arr[] = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
		int start = 3;
		int end = 8;

		for(int i = start; i <= end; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
