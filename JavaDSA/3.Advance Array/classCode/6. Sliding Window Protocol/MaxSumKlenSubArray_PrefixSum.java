
// Time Complexity = O(N + (N-k))	     Or    Time Complexity = O(N)
// Space Complexity = O(N)

class MaxSumOfklenSubArray{
	public static void main(String[] args){
		int arr[] = new int[]{-3, 4, -2, 5, 3, -2, 8, 2, 1, 4};
		int k = 4;

		int count = 0;
		int end = k-1;
		int start = 0;

		int prefixSum[] = new int[arr.length];
		prefixSum[0] = arr[0];
		for(int i = 1; i < arr.length; i++){	// N
			prefixSum[i] = prefixSum[i-1] + arr[i];
		}

		int maxSum = Integer.MIN_VALUE;
		int sum = 0;
		while(end < arr.length){	// (N - k)

			if(start == 0){
				sum = prefixSum[end];
			}else{
				sum = prefixSum[end] - prefixSum[start-1];
			}

			if(sum < maxSum){
				maxSum = sum;
			}
			start++;
			end++;
		}
	}
}
