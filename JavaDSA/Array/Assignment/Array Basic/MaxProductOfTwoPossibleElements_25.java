/*
 25] Maximum product of two numbers
Given an array Arr of size N with all elements greater than or equal to zero. Return
the maximum product of two numbers possible.
Example 1:
Input:
N=6
Arr[] = {1, 4, 3, 6, 7, 0}
Output: 42
Example 2:
Input:
N=5
Arr = {1, 100, 42, 4, 23}
Output: 4200
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
Constraints:
2 ≤ N ≤ 10^7
0 ≤ Arr[i] ≤ 10^4
 */

import java.util.*;
class ArrayB25{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of Array :");
                int size = sc.nextInt();

                int arr[] = new int[size];
                System.out.println("Enter elements in array :");
                for(int i = 0; i<arr.length; i++){
                        arr[i] = sc.nextInt();
                }
		System.out.println("Maximum product of two elements :");
		System.out.println(ArrayB25.maxProductOfTwo(arr, size));
	}
	static int maxProductOfTwo(int arr[], int n){
		int max = Integer.MIN_VALUE;
		int smax =Integer.MIN_VALUE;
		for(int i = 0; i<n; i++){
			if(arr[i]>max){
				smax = max;
				max = arr[i];
			}
			if(arr[i]<max && arr[i]>smax){
				smax = arr[i];
			}
		}
		return max*smax;
	}
}

