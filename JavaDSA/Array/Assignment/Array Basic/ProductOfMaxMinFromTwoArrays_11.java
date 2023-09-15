/*

 11] Product of maximum in first array and minimum in second

 Given two arrays of A and B respectively of sizes N1 and N2, the task is to
calculate the product of the maximum element of the first array and minimum
element of the second array.

Example 1:
Input : A[] = {5, 7, 9, 3, 6, 2},
B[] = {1, 2, 6, -1, 0, 9}
Output : -9
Explanation:
The first array is 5 7 9 3 6 2.
The max element among these elements is 9.
The second array is 1 2 6 -1 0 9.
The min element among these elements is -1.
The product of 9 and -1 is 9*-1=-9.

Example 2:
Input : A[] = {0, 0, 0, 0},
B[] = {1, -1, 2}
Output : 0
Expected Time Complexity: O(N + M).
Expected Auxiliary Space: O(1).
Output:
For each test case, output the product of the max element of the first array and the
minimum element of the second array.

Constraints:
1 ≤ N, M ≤ 10^6-10^8 ≤ Ai, Bi ≤ 10^8
 */

import java.util.*;
class ArrayB11{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of Array1 :");
                int size1 = sc.nextInt();

                int arr1[] = new int[size1];
                System.out.println("Enter elements in array :");
                for(int i = 0; i<arr1.length; i++){
                        arr1[i] = sc.nextInt();
                }

		System.out.println("Enter size of Array2 :");
                int size2= sc.nextInt();

                int arr2[] = new int[size2];
                System.out.println("Enter elements in array :");
                for(int i = 0; i<arr2.length; i++){
                        arr2[i] = sc.nextInt();
                }
		
		ArrayB11 obj = new ArrayB11();
		System.out.println("Product of Max and Min from two array :");
		System.out.println(obj.productOfMaxMin(arr1, size1, arr2, size2));
	}

	int productOfMaxMin(int arr1[], int n1, int arr2[], int n2){
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i = 0;i < n1; i++){
			if(arr1[i] > max){
				max = arr1[i];
			}
		}
		for(int i = 0; i < n2; i++){
			if(arr2[i] < min){
				min = arr2[i];
			} 
		}

		return max * min;
	}
}
