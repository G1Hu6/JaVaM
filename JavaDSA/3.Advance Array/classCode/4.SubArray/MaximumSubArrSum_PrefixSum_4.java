class MaximumSubArrSum{
	public static void main(String[] args){
		int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

		int prefixSum[] = new int[arr.length];
		prefixSum[0] = arr[0];
		for(int i = 1; i < arr.length; i++){
			prefixSum[i] = prefixSum[i-1] + arr[i];
		}

		int maxSum = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++){
			int sum = 0;
			for(int j = i; j < arr.length; j++){
				if(i == 0){
					sum = prefixSum[j];
				}else{
					sum = prefixSum[j] - prefixSum[i-1];
				}
				if(maxSum < sum){
					maxSum = sum;
				}
			}
		}

		System.out.println("Maximum Subarray sum : " + maxSum);
	}
}
