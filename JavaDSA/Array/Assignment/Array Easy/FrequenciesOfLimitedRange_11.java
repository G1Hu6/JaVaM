/*
 * Que 11 : Frequencies of limited Range Array Elements
Given an array A[] of N positive integers which can contain integers from 1 to P where
elements can be repeated or can be absent from the array. Your task is to count the
frequency of all elements from 1 to N.
Note: The elements greater than N in the array can be ignored for counting and do modify
the array in-place.
Example 1:
Input:
N=5
arr[] = {2, 3, 2, 3, 5}
P=5
Output:
02201
Explanation: Counting frequencies of each array element
We have:
1 occurring 0 times.
2 occurring 2 times.
3 occurring 2 times.
4 occurring 0 times.
5 occurring 1 time.
Example 2:
Input:
N=4
arr[] = {3,3,3,3}
P=3
Output:
0040
Explanation: Counting frequencies of each array element
We have:
1 occurring 0 times.
2 occurring 0 times.
3 occurring 4 times.4 occurring 0 times.
Can you solve this problem without using extra space (O(1) Space)?
Constraints:
1 ≤ N ≤ 105
1 ≤ P ≤ 4*104
1 <= A[i] <= P
*/
import java.util.*;
class ArrayE11{
	static void countFreq(int arr[], int n){
		for(int i = 1; i <= n; i++){
			int count = 0;
			for(int j = 0; j < n; j++){
				if(i == arr[j])
					count++;
			}
			System.out.print(count + " ");
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

		System.out.println("Counting frequencies of each array element :");
		countFreq(arr, size);
	}
}
