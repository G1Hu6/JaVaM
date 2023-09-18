/*

  	 23] Find the smallest and second smallest element in an array

Given an array of integers, your task is to find the smallest and second smallest
element in the array. If smallest and second smallest do not exist, print -1.

Example 1:
Input :
5
24356
Output :
23
Explanation:
2 and 3 are respectively the smallest
and second smallest elements in the array.

Example 2:
Input :
6
121367
Output :
12
Explanation:
1 and 2 are respectively the smallest
and second smallest elements in the array.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1<=N<=10^5
1<=A[i]<=10^5
 */
import java.util.*;
class ArrayB23{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of Array :");
                int size = sc.nextInt();

                int arr[] = new int[size];
                System.out.println("Enter elements in array :");
                for(int i = 0; i<arr.length; i++){
                        arr[i] = sc.nextInt();
                }
		System.out.println("Smallest and SecondSmallest elements from array =");
		ArrayB23.printSmallestAndSecondsmall(arr, size);
	}
	static void printSmallestAndSecondsmall(int arr[],int n){
		int min = Integer.MAX_VALUE;
		int smin =Integer.MAX_VALUE;
		for(int i = 0; i < n; i++){
			if(arr[i] < min){
				smin = min;
				min = arr[i];
			}
			if(arr[i]>min && arr[i]<smin){
				smin = arr[i];
			}
		}
		System.out.print(min + " " + smin + "\n");
	}
}
