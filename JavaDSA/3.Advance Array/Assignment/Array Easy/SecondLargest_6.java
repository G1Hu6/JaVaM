/*
 * Que 6 : Second Largest

 Given an array Arr of size N, print the second largest distinct element from an array.
Example 1:
Input:
N=6
Arr[] = {12, 35, 1, 10, 34, 1}
Output: 34
Explanation: The largest element of the array is 35 and the second largest element
is 34.
Example 2:
Input:
N=3
Arr[] = {10, 5, 10}
Output: 5
Explanation: The largest element of the array is 10 and the second largest element
is 5.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
Constraints:
2 ≤ N ≤ 105
1 ≤ Arri ≤ 105

*/

import java.util.*;
class ArrayE06{
	static int secondMax(int arr[], int n){
		int max = Integer.MIN_VALUE;
		int smax = Integer.MIN_VALUE;

		for(int i = 0; i < n; i++){
			if(arr[i] > max){
				smax = max;
				max = arr[i];
			}
			if(arr[i] < max && arr[i] > smax){
				smax = arr[i];
			}
		}
		return smax;
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
		System.out.println("Second Maximum = " + secondMax(arr, size));
	}
}
