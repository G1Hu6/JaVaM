/*
   Q.(2) Given an array of size N.
         Print all Subarrays.

   Time Complexity = O(N^3)
   Space Complexity = O(1)
*/


/*
class PrintGivenSubArray{
	public static void main(String[] args){
		int arr[] = new int[]{2, 4, 1, 3};
		int itr = 0;

		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr.length; j++){
				for(int k = i; k <= j; k++){
					if(j != k)
						System.out.print(arr[k] + ",");
					else
						System.out.println(arr[k]);

					itr++;
				}
			}
		}
		System.out.println("\nIterations = " + itr);
	}
}

*/

// Iterations = 20
class PrintGivenSubArray{
        public static void main(String[] args){
                int arr[] = new int[]{2, 4, 1, 3};
                int itr = 0;

                for(int i = 0; i < arr.length; i++){
                        for(int j = i; j < arr.length; j++){
                                for(int k = i; k <= j; k++){
                                        if(j != k)
                                                System.out.print(arr[k] + ",");
                                        else
                                                System.out.println(arr[k]);

                                        itr++;
                                }
                        }
                }
                System.out.println("\nIterations = " + itr);
        }
}

