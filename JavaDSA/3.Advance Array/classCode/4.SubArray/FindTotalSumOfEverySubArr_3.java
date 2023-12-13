/*
 Q.(4) Given an array of N.
       Find the sum of all subarray sum.
 */

class TotalSubArrSum{
	public static void main(String[] args){
		int arr[] = {10, 20, 30};

		int totalSum = 0;
		for(int i = 0; i < arr.length; i++){
			int sum = 0;
			for(int j = i; j < arr.length; j++){
				sum = sum + arr[j];
				totalSum = totalSum + sum;
			}
		}

		System.out.println("Total Sum of all possible SumArrays : " + totalSum);
	}
}
