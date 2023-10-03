/*
 15] Sum of distinct elements

 You are given an array Arr of size N. Find the sum of distinct elements in an array.

Example 1:
Input:
N=5
Arr[] = {1, 2, 3, 4, 5}
Output: 15
Explanation: Distinct elements are 1, 2, 3
4, 5. So the sum is 15.

Example 2:
Input:
N=5
Arr[] = {5, 5, 5, 5, 5}
Output: 5
Explanation: Only Distinct element is 5.
So the sum is 5.

Expected Time Complexity: O(N*logN)
Expected Auxiliary Space: O(N*logN)

Constraints:
1 ≤ N ≤ 10^7
0 ≤ A[i] ≤ 10^4
 */
import java.util.*;
class ArrayB15{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of Array :");
                int size = sc.nextInt();

                int arr[] = new int[size];
                System.out.println("Enter elements in array :");
                for(int i = 0; i<arr.length; i++){
                        arr[i] = sc.nextInt();
                }

		System.out.println("Sum of Distinct Elements =");
		System.out.println(ArrayB15.sumOfDistinct(arr, size));
	}

	static int sumOfDistinct(int arr[], int n){
		TreeSet ts = new TreeSet();
		for(int i = 0; i<n; i++){
			ts.add(arr[i]);
		}
		int sum = 0;
		for(var x:ts){
			sum = sum + (int)x;
		}
		return sum;
	}
}
