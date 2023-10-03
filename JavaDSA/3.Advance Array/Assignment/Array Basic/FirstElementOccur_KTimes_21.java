/*
 			21] First element to occur k times

Given an array of N integers. Find the first element that occurs at least K number
of times.

Example 1:
Input :
N = 7, K = 2
A[] = {1, 7, 4, 3, 4, 8, 7}
Output :
4
Explanation:
Both 7 and 4 occur 2 times.
But 4 is first that occurs 2 times
As at index = 4, 4 has occurred
at least 2 times whereas at index = 6,
7 has occurred at least 2 times.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

Constraints:
1 <= N <= 10^4
1 <= K <= 100
1<= A[i] <= 200
 */

import java.util.*;
class ArrayB21{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of Array :");
                int size = sc.nextInt();

                int arr[] = new int[size];
                System.out.println("Enter elements in array :");
                for(int i = 0; i<arr.length; i++){
                        arr[i] = sc.nextInt();
                }
		System.out.println("Enter k :");
                int k = sc.nextInt();

		System.out.println(ArrayB21.firstKTimesOccuring(arr, size, k));
	}
	static int firstKTimesOccuring(int arr[], int n, int k){
		int num = Integer.MAX_VALUE;
		for(int i = 0; i<n; i++){
			int count = 0;
			int j;
			for(j = i+1; j<n; j++){
				count++;
				if(count == k){
					if(j < num)
						num = j;
					break;
				}
			}
		}
		return arr[num];
	}
}
