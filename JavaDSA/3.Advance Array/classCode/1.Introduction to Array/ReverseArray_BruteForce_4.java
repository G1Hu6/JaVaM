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
		int ans[] = new int[n];
		for(int i = 0; i < n; i++){
			ans[i] = arr[n-i-1];
		}

		for(int i = 0; i<arr.length; i++){
                        System.out.print(ans[i] + " ");
		}
		System.out.println();
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
	}
}

