/*
 *26] Positive and negative elements
Given an array arr[ ] containing equal number of positive and negative elements,
arrange the array such that every positive element is followed by a negative
element.
Note- The relative order of positive and negative numbers should be maintained.
Example 1:
Input:
N=6
arr[] = {-1, 2, -3, 4, -5, 6}
Output:
2 -1 4 -3 6 -5
Explanation: Positive numbers in order are 2, 4 and 6. Negative numbers in
order are -1, -3 and -5. So the arrangement we get is 2, -1, 4, -3, 6 and -5.
Example 2:
Input:
N=4
arr[] = {-3, 2, -4, 1}
Output:
2 -3 1 -4
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)
Constraints:
1 ≤ N ≤ 10^6
1 ≤ arr[i] ≤ 10^927]
*/

import java.util.*;
class ArrayB26{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of Array :");
                int size = sc.nextInt();

                int arr[] = new int[size];
                System.out.println("Enter elements in array :");
                for(int i = 0; i<arr.length; i++){
                        arr[i] = sc.nextInt();
                }

		System.out.println("Sorted array :");
		new ArrayB26().sortPositiveNegative(arr, size);
                for(int i = 0; i<arr.length; i++){
                        System.out.print(arr[i] + " ");
                }
		System.out.println();
	}

	void sortPositiveNegative(int arr[], int n){
		int s = 0;
		while(s < n-1){
			if(arr[s]<0 && arr[s+1]<0)
				s++;
			if(arr[s]<0 && arr[s+1]>0){
				int temp = arr[s];
				arr[s] = arr[s+1];
				arr[s+1] = temp;

				s++;
			}
			if(arr[s]>0 && arr[s+1]<0)
				s++;
			if(arr[s]>0 && arr[s+1]>0)
				s++;
		}
	}
}
