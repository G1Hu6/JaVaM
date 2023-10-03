/*
	 28] Remove Duplicates from unsorted array

Given an array of integers which may or may not contain duplicate elements. Your
task is to remove duplicate elements, if present.

Example 1:
Input:
N=6
A[] = {1, 2, 3, 1, 4, 2}
Output:
1234

Example 2:
Input:
N=4
A[] = {1, 2, 3, 4}
Output:
1234

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

Constraints:
1<=N<=10^5
1<=A[i]<=10^5
 */
import java.util.*;
class ArrayB28{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of Array :");
                int size = sc.nextInt();

                int arr[] = new int[size];
                System.out.println("Enter elements in array :");
                for(int i = 0; i<arr.length; i++){
                        arr[i] = sc.nextInt();
                }
		ArrayB28 obj = new ArrayB28();
		System.out.println("Array After removing duplicate Elements :");
		obj.removeDuplicate(arr, size);
	}

	static void removeDuplicate(int arr[], int n){
		Set s = new LinkedHashSet();
		for(int i = 0; i<n; i++){
			s.add(arr[i]);
		}
		for(var data : s){
			System.out.print(data + " ");
		}
		System.out.println();
	}
}
