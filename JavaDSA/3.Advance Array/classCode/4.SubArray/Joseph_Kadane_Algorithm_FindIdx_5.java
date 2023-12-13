class MaximumSubArrSum{
	public static void main(String[] args){
		int arr[] = { 12, 1, -3, 4, -1, 2, 1, -5, -4};

		int sum = 0;
		int startIdx = -1;
		int endIdx = -1;

		int maxSum = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++){
			if(sum == 0){
				startIdx = i;
			}

			sum = sum + arr[i];

			if(sum > maxSum){
				maxSum = sum;	
				endIdx = i;
			}

			if(sum < 0){
				sum = 0;	
			}
		}

		System.out.println("Start Index = " + startIdx + " and End Index = " + endIdx);
	}
}
