/*
 (4) Given a Array of size N.
     Reverse without using extra space O(1).

   
   	 Brute Force :-
	 Time Complexity = O(N)
	 Space Complexity = O(N)
*/

import java.util.*;
class Array{
	static void reverseArr(int arr[], int n){
		/*
		for(int i = 0; i < n/2; i++){	// N
			//Swap array
			int temp = arr[i];
			arr[i] = arr[n-1-i];
			arr[n-1-i] = temp;
		}
		*/
		int start = 0;
		int end = n-1;
		while(start <= end){
			int temp = arr[start];
                        arr[start] = arr[end];
                        arr[end] = temp;
			
			start++;
			end--;
		}
	}
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of Array :");
                int size = sc.nextInt();

                int arr[] = new int[size];
                System.out.println("Enter elements in array :");
                for(int i = 0; i<arr.length; i++){
                        arr[i] = sc.nextInt();
                }

		System.out.println("Reverced Array = ");
		reverseArr(arr, size);
		for(int i = 0; i<arr.length; i++){
                        System.out.print(arr[i] + " ");
                }
                System.out.println();
	}
}

