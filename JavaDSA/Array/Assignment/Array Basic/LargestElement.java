/*
 3] Largest Element in Array

Given an array A[] of size n. The task is to find the largest element in it.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 <= n<= 10^3
0 <= A[i] <= 10^3

Arrays may contain duplicate elements.
*/
import java.util.*;

class LargestElement2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array :");
		int size = sc.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter elements in array :");
		for(int i = 0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}

		int max = Integer.MIN_VALUE;
        	
        	for(int i =0; i < arr.length; i++){
                	if(arr[i] > max){
                        	max = arr[i];
                	}
		}

		System.out.println("Largest Element in Array = ");
		System.out.println(max);

	}
}

