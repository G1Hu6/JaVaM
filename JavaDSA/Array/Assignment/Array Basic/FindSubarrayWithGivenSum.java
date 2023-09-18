/*
 18] Find Subarray with given sum | Set 1 (Non-negative
Numbers)
Given an array arr[] of non-negative integers and an integer sum, find a subarray
that adds to a given sum.
Note: There may be more than one subarray with sum as the given sum, print first
such subarray.
Examples:
Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
Output: Sum found between indexes 2 and 4
Explanation: Sum of elements between indices 2 and 4 is 20 + 3 + 10 = 33
Input: arr[] = {1, 4, 0, 0, 3, 10, 5}, sum = 7
Output: Sum found between indexes 1 and 4
Explanation: Sum of elements between indices 1 and 4 is 4 + 0 + 0 + 3 = 7
Input: arr[] = {1, 4}, sum = 0
Output: No subarray found
Explanation: There is no subarray with 0 sum
 */

import java.util.*;
class ArrayB18{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of Array :");
                int size = sc.nextInt();

                int arr[] = new int[size];
                System.out.println("Enter elements in array :");
                for(int i = 0; i<arr.length; i++){
                        arr[i] = sc.nextInt();
                }

		System.out.println("Sum :");
                int sum = sc.nextInt();

		ArrayB18 obj = new ArrayB18();
		obj.findSubArray(arr, size, sum);
	}

	void findSubArray(int arr[], int n, int sum){
		for(int i = 0; i<n; i++){
			int s = 0;
			s = s + arr[i];
			for(int j = i+1; j<n; j++){
				s = s +arr[j];
				if(s > sum){
					break;
				}
				if(sum == s){
					System.out.println("Sum found between indexes " + i + " and " + j);
					return;
				}
			}
		}
		System.out.println("No SubArray Found");
	}
}
