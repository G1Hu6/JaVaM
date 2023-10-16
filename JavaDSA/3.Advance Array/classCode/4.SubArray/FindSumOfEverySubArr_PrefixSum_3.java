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

		//Find prefixSum array
		int prefixSum[] = new int[arr.length];
		prefixSum[0] = arr[0];
		for(int i = 1; i < prefixSum.length; i++){
			prefixSum[i] = prefixSum[i-1] + arr[i];
		}

		//Find Subarray Sum using prefixSum
	        for(int i = 0; i < arr.length; i++){
			int sum = 0;
                	for(int j = i; j < arr.length; j++){
                		if(i == 0){
					sum = prefixSum[j];
				}else{
					sum = prefixSum[j] - prefixSum[i-1];
				} 
	   			System.out.println(sum);			
                	}
        	}

		/*
		int prefixSum[] = new int[arr.length];

		for(int i = 0; i < arr.length; i++){
			prefixSum[i] = arr[i];
			System.out.println(prefixSum[i]);
			for(int j = i+1; j < arr.length; j++){
				prefixSum[j] = prefixSum[j-1] + arr[j];
				System.out.println(prefixSum[j]);
			}
		}
		*/
        }
}

