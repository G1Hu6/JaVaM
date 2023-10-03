/*
 1] Search an Element in an array

Given an integer array and another integer element. The task is to find if the given
element is present in the array or not.

Expected Time Complexity: O(n).
Expected Auxiliary Space: O(1).

Constraints:
1 <= n <= 10^6
0 <= arr[i] <= 10^6
0 <= x <= 10^5
*/


import java.util.*;

class SearchAnElement_1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array :");
		int size = sc.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter elements in array :");
		for(int i = 0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter Element for Searching operation :");
		int key = sc.nextInt();
		int flag = 0;
		for(int i = 0; i<arr.length; i++){
			if(key == arr[i]){
				flag = 1;
				System.out.println("Element is Preaent at index " + i);
			}
		}
		if(flag ==0){
			System.out.println("Element is not present");
		}
	}
}

/*
class SearchAnElement_1{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of Array :");
                int size = sc.nextInt();

                int arr[] = new int[size];
                System.out.println("Enter elements in array :");
                for(int i = 0; i<arr.length; i++){
                        arr[i] = sc.nextInt();
                }

                System.out.println("Enter Element for Searching operation :");
                int key = sc.nextInt();
             
               
        }

	int binarySearch(int arr[], int n, int key){
		int s = 0;
		int e = n-1;
		int m = 0;

		while(s<=e){
			if(arr[m]<arr[])
		}
	}
}
*/
