/*
8] Even occurring elements

Given an array Arr of N integers that contains an odd number of occurrences for all
numbers except for a few elements which are present even number of times. Find
the elements which have even occurrences in the array.

Example 1:
Input:
N = 11
Arr[] = {9, 12, 23, 10, 12, 12,
15, 23, 14, 12, 15}
Output: 12 15 23

Example 2:
Input:
N=5
Arr[] = {23, 12, 56, 34, 32}
Output: -1

Explanation:
Every integer is present odd number of times.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 10^5
0 ≤ Arr[i] ≤ 63
*/

import java.util.*;
class EvenOccuring_8{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of Array :");
                int size = sc.nextInt();

                int arr[] = new int[size];
                System.out.println("Enter elements in array :");
                for(int i = 0; i<arr.length; i++){
                        arr[i] = sc.nextInt();
                }

		TreeSet v = EvenOccuring_8.EvenOccuringEle(arr, size);
		System.out.println(v);
	}

	static TreeSet EvenOccuringEle(int arr[], int n){
		int flag = 0;
		TreeSet v = new TreeSet();
		for(int i = 0; i < n; i++){
			int count = 0;
			for(int j = 0; j < n; j++){
				if(arr[i] == arr[j]){
					count++;
				}
			}
			if(count%2 == 0){
				flag = 1;
				v.add(arr[i]);
			}
		}
		if(flag == 0){
			v.add(-1);
			return v;
		}
		return v;
	}
}
