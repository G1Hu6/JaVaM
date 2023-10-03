/*
 (2) Given an integer array N.
     Count of no of elements having atleast 1 element greater than itself.

Arr : {2, 5, 1, 4, 8, 0, 8, 1, 3, 8}
N : 10

*/

//Brute Force

import java.util.*;
class CountElements{
	static int printCount(int arr[], int n){
		int count = 0;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(arr[i] < arr[j]){
					count++;
					break;
				}
			}
		}

		return count;
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
		System.out.println("Count of no of elements having atleast 1 element greater than itself =");
		System.out.println(printCount(arr, size));

	}
}
