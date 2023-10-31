class MaxSumOfklenSubArray{
	public static void main(String[] args){
		int arr[] = new int[]{-3, 4, -2, 5, 3, -2, 8, 2, 1, 4};
		int k = 4;

		int sum = 0;
		int end = k-1;
		int start = 0;
		
		for(int i = start; i <= end; i++){
			sum = sum + arr[i];
		}

		int maxSum = sum;
		end = k;
		start = 1;

		while(end < arr.length){
			sum = sum - arr[start-1] + arr[end];

			if(sum > maxSum){
				maxSum = sum;
			}
			start++;
			end++;
		}

		System.out.println(maxSum);
	}
}
