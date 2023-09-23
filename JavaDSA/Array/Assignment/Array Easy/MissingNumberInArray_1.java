/*
 * Que 1 : Missing number in array
Given an array of size N-1 such that it only contains distinct integers in the range of 1 to
N. Find the missing element.
Example 1:
Input:
N=6
A[] = {1,2,4,5,6}
Output: 3
Example 2:
Input:
N = 11
A[] = {1,3,2,5,6,7,8,11,10,4}
Output: 9
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
Constraints:
1 ≤ N ≤ 106
1 ≤ A[i] ≤ 106
*/
import java.util.*;
class ArrayE01{
	static int findMissing(int arr[], int n){
		int sum = 0;
		for(int j =0; j < n-1; j++){
			sum = sum + arr[j];
		}
		return n*(n+1)/2 - sum;
	}

        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of Array :");
                int size = sc.nextInt();

                int arr[] = new int[size];
                System.out.println("Enter elements in array :");
                for(int i = 0; i<arr.length-1; i++){
                        arr[i] = sc.nextInt();
                }
		System.out.println("Missing Element = " + findMissing(arr, size));
	}
}
