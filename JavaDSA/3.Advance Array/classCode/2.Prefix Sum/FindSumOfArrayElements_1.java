/*
 (1) Find Sum of array [2, 5, 3, 11, 7, 9, 4]

 Brute Force :-
 Time complexity = O(N)
 Space Complexity = O(1)
 */

import java.util.*;
class ArrayDemo1{
	static void findSum(int arr[], int n){
		int sum = 0;
		for(int i = 0; i < n; i++){
			sum = sum + arr[i];
		}
		System.out.println(sum);
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
		findSum(arr, size);
	}
}
