/*
 20] Check if pair with given Sum exists in Array (Two Sum)

Given an array A[] of n numbers and another number x, the task is to check
whether or not there exist two elements in A[] whose sum is exactly x.
Examples:
Input: arr[] = {0, -1, 2, -3, 1}, x= -2
Output: Yes
Explanation: If we calculate the sum of the output,1 + (-3) = -2
Input: arr[] = {1, -2, 1, 0, 5}, x = 0
Output: No
 */

import java.util.*;
class ArrayB20{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of Array :");
                int size = sc.nextInt();

                int arr[] = new int[size];
                System.out.println("Enter elements in array :");
                for(int i = 0; i<arr.length; i++){
                        arr[i] = sc.nextInt();
                }

		System.out.println("Enter Sum :");
                int sum = sc.nextInt();
		ArrayB20.pairSum(arr, size, sum);
	}

	static void pairSum(int arr[], int n, int sum){
		int s = 0;
		for(int i = 0; i < n; i++){
			for(int j = i+1; j < n; j++){
				if(arr[i] + arr[j] == sum){
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
	}
}
