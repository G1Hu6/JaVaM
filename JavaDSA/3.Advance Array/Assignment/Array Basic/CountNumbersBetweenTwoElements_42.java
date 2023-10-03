/*

42] Count number of elements between two given elements in
array

Given an unsorted array and two elements num1 and num2. The task is to count the
number of elements occurring between the given elements (excluding num1 and
num2). If there are multiple occurrences of num1 and num2, we need to consider
the leftmost occurrence of num1 and rightmost occurrence of num2.

Example 1:
Input : Arr[] = {4, 2, 1, 10, 6}
num1 = 4 and num2 = 6
Output : 3
Explanation:
We have an array [4, 2, 1, 10, 6] and
num1 = 4 and num2 = 6.
So, the leftmost index of num1 is 0 and the rightmost index of num2 is 4.
So, the total number of elements between them is [2, 1, 10] So, the function
will return 3 as an answer.

Example 2:
Input : Arr[] = {3, 2, 1, 4}
num1 = 2 and num2 = 4
Output : 1

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
2 ≤ N ≤ 10^5
1 ≤ A[i], num1, num2 ≤ 10^5
*/

import java.util.*;
class ArrayB43{
	static int countBetween2Elements(int arr[], int n, int num1, int num2){
		int s = 0, e = n-1;
		while(s < e){

			if(arr[s] == num1 && arr[e] != num2){
				e--;
			}else if(arr[s] != num1 && arr[e] == num2){
				s++;
			}else if(arr[s] == num1 && arr[e] == num2){
				return e-s-1;
			}else{
				s++;
				e--;
			}

		}
		System.out.println("Elements are not found in array");
		return -1;
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
	
	System.out.println("Enter Two elements for finding count between two :");
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	
	System.out.println("Total elements Between " + num1 + " and " + num2 + " are : ");
	System.out.println(countBetween2Elements(arr, size, num1, num2));
	}
}
