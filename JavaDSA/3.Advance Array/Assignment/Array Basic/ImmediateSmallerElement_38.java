/*
 * 38] Immediate Smaller Element

 Given an integer array Arr of size N. For each element in the array, check whether
the right adjacent element (on the next immediate position) of the array is smaller.
If the next element is smaller, update the current index to that element. If not, then
-1.


Example 1:
Input:
N=5
Arr[] = {4, 2, 1, 5, 3}
Output:
2 1 -1 3 -1
Explanation: Array elements are 4, 2, 1, 5, 3. Next to 4 is 2 which is
smaller, so we print 2. Next of 2 is 1 which is smaller, so we print 1. Next of
1 is 5 which is greater, so we print -1. Next of 5 is 3 which is smaller, so we
print 3. Note that for the last element, output is always going to be -1
because there is no element on the right.

Example 2:
Input:
N=6
Arr[] = {5, 6, 2, 3, 1, 7}
Output:
-1 2 -1 1 -1 -1
Explanation: Next to 5 is 6 which is greater, so we print -1.Next of 6 is 2
which is smaller, so we print 2. Next of 2 is 3 which is greater, so we print
-1. Next of 3 is 1 which is smaller, so we print 1. Next of 1 is 7 which is
greater, so we print -1.

Note that for the last element, output is always going to be -1 because there
is no element on the right.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 10^7
1 ≤ Arr[i] ≤ 10^5
*/

import java.util.*;

class ArrayB38{
	static void updateIndex(int arr[], int n){
		for(int i = 0;i < n; i++){
			if(i == n-1){
				int tempIndex = -1;
				System.out.print(tempIndex + " ");
			}else if(arr[i+1] < arr[i]){
				System.out.print(arr[i+1] + " ");
			}else{
				int tempIndex = -1;
				System.out.print(tempIndex + " ");
			}
		}
		System.out.println();
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
		System.out.println("New Updated index are :");
		updateIndex(arr, size);
	}
}

