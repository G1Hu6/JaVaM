/*
 * Que 16 : Rotation
Given an ascending sorted rotated array Arr of distinct integers of size N. The array is
right rotated K times. Find the value of K.
Example 1:
Input:
N=5
Arr[] = {5, 1, 2, 3, 4}
Output: 1
Explanation: The given array is 5 1 2 3 4. The original sorted array is 1 2 3 4 5.
We can see that the array was rotated 1 time to the right.
Example 2:
Input:
N=5
Arr[] = {1, 2, 3, 4, 5}
Output: 0
Explanation: The given array is not rotated.
Expected Time Complexity: O(log(N))
Expected Auxiliary Space: O(1)
Constraints:
1 <= N <=105
1 <= Arri <= 107
 */

import java.util.*;
class ArrayE16{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of Array :");
                int size = sc.nextInt();

                int arr[] = new int[size];
                System.out.println("Enter elements in array :");
                for(int i = 0; i<arr.length; i++){
                        arr[i] = sc.nextInt();
                }
		System.out.println("Rotated by = " + rotatedValue(arr, size));
	}

	static int rotatedValue(int arr[], int n){
		int s = 0;
		int e = n-1;
		int ans = -1;

		while(s < e){
			int m = (s + e)/2;
			if(arr[m] > arr[m + 1]){
				s = m + 1;
			}else{
				ans = m;
				e = m;
			}
		}
		return ans;
	}
}
