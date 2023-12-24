/*
 Q 3. First Occurrence of an Element
Modify the binary search function to find the first occurrence of a given element in
a sorted array. Return -1 if the element is not present.
 */

import java.util.*;
class FirstOccurrence{
	static int firstIndex(int arr[], int num){
		int start = 0;
		int end = arr.length- 1;
		int ans = -1;
		while(start <= end){
			int mid = start + (end - start)/2;

			if(arr[mid] == num){
				ans = mid;
				end = mid - 1;
			}if(arr[mid] < num){
				start = mid + 1;
			}if(arr[mid] > num){
				ans = mid;
				end = mid - 1;
			}
		}
		return ans;
	}

	static int ans = -1;
	static int firstIndexUsingRec(int arr[], int start, int end, int num){
		if(start > end)
			return ans;

		int mid = start + (end - start)/2;
		if(arr[mid] == num){
			ans = mid;
			end = mid -1;
		}else if(arr[mid] > num){
			ans = mid;
			end = mid -1;
		}else{
			start = mid +1;
		}


		return firstIndexUsingRec(arr, start, end, num);

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

		System.out.println("First occurrence Index = " + firstIndexUsingRec(arr,0, arr.length-1, 4));
	}
}
