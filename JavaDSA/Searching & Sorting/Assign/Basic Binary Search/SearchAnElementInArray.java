/*
 Q2.
Given a sorted array of size N and an integer K, find the position(0-based
indexing) at which K is present in the array using binary search.

Example 1:
Input:
N=5
arr[] = {1 2 3 4 5}
K=4
Output: 3
Explanation: 4 appears at index 3.
*/

import java.util.*;
class SearchAnElement{
	// Using loop
	static int findIndex(int arr[], int key){
		int start = 0;
		int end = arr.length-1;

		while(start <= end){
			int mid = start + (end - start)/2;

			if(arr[mid] == key){
				return mid;
			}
			if(arr[mid] > key){
				end = mid - 1;
			}
			if(arr[mid] < key){
				start = mid + 1;
			}
		}
		return -1;
	}

	//Using Recursion
	static int findIndexUsingRec(int arr[], int start, int end, int key){
		if(start > end)
			return -1;
		int mid = start + (end - start)/2;

		if(arr[mid] == key){
			return mid;
		}else if(arr[mid] < key){
			start = mid + 1;
		}else{
			end = mid - 1;
		}

		return findIndexUsingRec(arr, start, end, key);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of Array :");
                int size = sc.nextInt();

		System.out.println("Enter element to search");
		int key = sc.nextInt();
                int arr[] = new int[size];
                System.out.println("Enter elements in array :");
                for(int i = 0; i<arr.length; i++){
                        arr[i] = sc.nextInt();
                }

		//System.out.println("Index = " + findIndex(arr, key));\

		int start = 0; 
		int end = arr.length -1;
		System.out.println("Index = " + findIndexUsingRec(arr, start, end, key));
	}
}
