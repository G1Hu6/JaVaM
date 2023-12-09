/*
12] First and last occurrences of X

Given a sorted array having N elements, find the indices of the first and last
occurrences of an element X in the given array.

Note: If the number X is not found in the array, return '-1' as an array.

Example 1:
Input:
N=4,X=3
arr[] = { 1, 3, 3, 4 }
Output:
12
Explanation:
For the above array, first occurance of X = 3 is at index = 1 and last
occurrence is at index = 2.

Example 2:
Input:
N = 4, X = 5
arr[] = { 1, 2, 3, 4 }
Output:
-1
Explanation:
As 5 is not present in the array, so the answer is -1.

Expected Time Complexity: O(log(N))
Expected Auxiliary Space: O(1)

Constraints:
1 <= N <= 10^50 <= arr[i], X <= 10^9
*/

import java.util.*;
class ArrayB12{
	int firstOccurrence(int arr[], int n, int key){
		int s = 0;
		int e = n-1;
		int m = 0;
		int ans = -1;

		while(s <= e){
			m = s +(e - s)/2;
			if(arr[m] < key){
				s = m+1;
			}else if(arr[m] > key){
				e = m-1;
			}else if(arr[m] == key){
				ans = m;
				e = m-1;
			}
		}
		return ans;
	}

	int lastOccurrence(int arr[], int n, int key){
                int s = 0;
                int e = n-1;
                int m = 0;
                int ans = -1;

                while(s <= e){
                        m = s +(e - s)/2;
                        if(arr[m] < key){
                                s = m+1;
                        }else if(arr[m] > key){
                                e = m-1;
                        }else if(arr[m] == key){
                                ans = m;
                                s = m+1;
                        }
                }
		return ans;
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

		System.out.println("Enter Element :");
                int ele = sc.nextInt();

		ArrayB12 obj = new ArrayB12();
		System.out.println("First and Last occurrence =");
		System.out.print(obj.firstOccurrence(arr, size, ele) + " " + obj.lastOccurrence(arr, size, ele) + "\n");
	}
}
