class MaximumSubArrSum{
	public static void main(String[] args){
		int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

		int sum = 0;
		int maxSum = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++){
			sum = sum + arr[i];	// Step 1

			if(sum > maxSum){
				maxSum = sum;	// Step 2
			}

			if(sum < 0){
				sum = 0;	// Step 3
			}
		}

		System.out.println("Maximum Subarray sum : " + maxSum);
	}
}
