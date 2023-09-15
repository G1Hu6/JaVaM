/*
2] Find minimum and maximum element in an array

Given an array A of size N of integers. Your task is to find the minimum and
maximum elements in the array.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 <= N <= 10^5
1 <= Ai <=10^12
*/


import java.util.*;

class MaxAndMinElement{
	Vector printMaxMin(int arr[], int n){
        	int max = Integer.MIN_VALUE;
        	int min = Integer.MAX_VALUE;
		Vector ans = new Vector();
        	for(int i =0; i < n; i++){
                	if(arr[i] > max){
                        	max = arr[i];
                	}
			if(arr[i] < min){
				min = arr[i];
			}
        	}
		ans.add(min);
		ans.add(max);
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

		SearchAnElement_1 obj = new SearchAnElement_1();
		Vector v = obj.printMaxMin(arr, size);

		System.out.println(v);
	}
}
