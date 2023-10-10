/*
    Q.(1) Given an array of size N. 
    	  Build an array leftMax of size N,
	  leftMax of i contains the maximum of index 0 to the index i

	Arr: [-3, 6, 2, 4, 5, 2, 8, -9, 3, 1]
	N  : 10
	leftMax : [-3, 6, 6, 6, 6, 6, 8, 8, 8, 8]
 */

// Brute Force :-
// Time Complixity = O(N^2)
// Space Complixity = O(N)

import java.util.*;
class Array{
	static int[] returnLeftMax(int arr[], int N){
		int leftMax[] = new int[N];

		for(int j = 0; j < N; j++){
			int max = Integer.MIN_VALUE;
			for(int k = 0; k <= j; k++){
				if(arr[k] > max)
					max = arr[k];
			}
			leftMax[j] = max;
		}
		return leftMax;
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
		printArray(returnLeftMax(arr, N));
	}
}
