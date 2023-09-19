/*
 * 27] Count pair sum
Given two sorted arrays(arr1[] and arr2[]) of size M and N of distinct elements.
Given a value Sum. The problem is to count all pairs from both arrays whose sum
is equal to Sum.
Note: The pair has an element from each array.
Example 1:
Input:
M=4, N=4 , Sum = 10
arr1[] = {1, 3, 5, 7}
arr2[] = {2, 3, 5, 8}
Output: 2
Explanation: The pairs are: (5, 5) and (7, 3).
Example 2:
Input:
N=4, M=4, sum=5
arr1[] = {1, 2, 3, 4}
arr2[] = {5, 6, 7, 8}
Output: 0
Expected Time Complexity: O(M+N).
Expected Auxiliary Space: O(1).
Constraints:
1 ≤ M, N ≤ 10^5
 */

import java.util.*;
class ArrayB27{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of Array1 :");
                int size1 = sc.nextInt();

                int arr1[] = new int[size1];
                System.out.println("Enter elements in array1 :");
                for(int i = 0; i<arr1.length; i++){
                        arr1[i] = sc.nextInt();
                }

		System.out.println("Enter size of Array2 :");
                int size2 = sc.nextInt();

                int arr2[] = new int[size2];
                System.out.println("Enter elements in array2 :");
                for(int i = 0; i<arr2.length; i++){
                        arr2[i] = sc.nextInt();
                }
		System.out.println("Enter sum :");
                int sum = sc.nextInt();

		System.out.println("The Pairs with Given sum are :");
		ArrayB27.countPairSumFromtwo(arr1, size1, arr2, size2, sum);
	}

	static void countPairSumFromtwo(int arr1[], int n1, int arr2[], int n2, int sum){
		int count = 0;
		for(int i = 0; i<n1; i++){
			for(int j = n2-1; j>=0; j--){
				if(arr1[i]+arr2[j] < sum)
					break;
				if(arr1[i]+arr2[j] == sum){
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
