/*
 	22] Exceptionally odd

 
 Given an array of N positive integers where all numbers occur even number of
times except one number which occurs odd number of times. Find the exceptional
number.

Example 1:
Input:
N=7
Arr[] = {1, 2, 3, 2, 3, 1, 3}
Output: 3
Explanation: 3 occurs three times.

Example 2:
Input:
N=7
Arr[] = {5, 7, 2, 7, 5, 2, 5}
Output: 5
Explanation: 5 occurs three times.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 10^5
1 ≤ arr[i] ≤ 10^6
 */
import java.util.*;
class ArrayB22{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of Array :");
                int size = sc.nextInt();

                int arr[] = new int[size];
                System.out.println("Enter elements in array :");
                for(int i = 0; i<arr.length; i++){
                        arr[i] = sc.nextInt();
                }
		
		System.out.println("Element occuring three times =");
		System.out.println(ArrayB22.exceptionallyOddElement(arr, size));
	}
	static int exceptionallyOddElement(int arr[], int n){
		int ans = 0;
		for(int i = 0; i < n; i++){
			ans = ans^arr[i];
		}
		return ans;
	}
}
