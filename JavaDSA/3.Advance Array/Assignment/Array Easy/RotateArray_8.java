/*
 * Que 8 : Rotate Array
Given an unsorted array arr[] of size N. Rotate the array to the left (counter-clockwise
direction) by D steps, where D is a positive integer.
Example 1:
Input:
N = 5, D = 2
arr[] = {1,2,3,4,5}
Output: 3 4 5 1 2
Explanation: 1 2 3 4 5 when rotated
by 2 elements, it becomes 3 4 5 1 2.
Example 2:
Input:
N = 10, D = 3
arr[] = {2,4,6,8,10,12,14,16,18,20}
Output: 8 10 12 14 16 18 20 2 4 6
Explanation: 2 4 6 8 10 12 14 16 18 20
when rotated by 3 elements, it becomes
8 10 12 14 16 18 20 2 4 6.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
Constraints:
1 <= N <= 106
1 <= D <= 106
0 <= arr[i] <= 105
 */

import java.util.*;
class ArrayE08{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of Array :");
                int size = sc.nextInt();

                int arr[] = new int[size];
                System.out.println("Enter elements in array :");
                for(int i = 0; i<arr.length; i++){
                        arr[i] = sc.nextInt();
                }
		System.out.println("Enter stapes by which array is rotated :");
                int k= sc.nextInt();

		System.out.println("Rotated Array :");
		
		int ans[] = rotatedArray(arr, size, k);
		for(int i = 0; i<ans.length; i++){
                        System.out.print(ans[i] + " ");
                }
		System.out.println();
	}
	static int[] rotatedArray(int arr1[], int n, int k){
                int ans[] = new int[n];
		int arr[] = new int[n+k];
                for(int i = 0; i < n+k; i++){
			if(i < n)
				arr[i] = arr1[i];
                        if(i > k-1){
				if(i > n-1){
					arr[i] = 0;
				}
                                ans[i-k] = arr[i];
                	}
		}
		
                int s = 0;
                int e = n-k;
                while(s < k){
                        int temp = arr1[s];
                        arr1[s] = ans[e];
                        ans[e] = temp;

                        s++;
                        e++;
                }
                return ans;
	}
}

