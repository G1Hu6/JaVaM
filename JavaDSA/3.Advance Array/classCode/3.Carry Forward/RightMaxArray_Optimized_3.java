/*
   Q.(2) Given intnteger array of size N,
         build an array of rightMax of size N.
	 RightMax of i contains max for the index i to index N-1 
*/


import java.util.*;
class Array{
	static int[] returnRightMax(int arr[], int N){
		int rightMax[] = new int[N];

		rightMax[N-1] = arr[N-1];
		for(int i = N-2; i >= 0; i--){	// N
			if(rightMax[i+1] < arr[i])
				rightMax[i] = arr[i];			// leftMax[i] = max{arr[i], leftMax[i-1]}
			else
				rightMax[i] = rightMax[i+1];
		}
		return rightMax;
	}

	static void printArray(int arr[]){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of Array :");
                int N = sc.nextInt();

		/*
                int arr[] = new int[size];
                System.out.println("Enter elements in array :");
                for(int i = 0; i<arr.length; i++){
                        arr[i] = sc.nextInt();
                }
		*/
		int arr[] = new int[]{-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};

		System.out.println("LeftMax Array = ");
		printArray(returnRightMax(arr, N));
	}
}


