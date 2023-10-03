/*
 * Que 13 : Minimum distance between two number

You are given an array A, of N elements. Find minimum index based distance between
two elements of the array, x and y such that (x!=y).

Example 1:
Input:
N=4
A[] = {1,2,3,2}
x = 1, y = 2
Output: 1
Explanation: x = 1 and y = 2. There are two distances between x and y, which are
1 and 3 out of which the least is 1.
Example 2:
Input:
N=7
A[] = {86,39,90,67,84,66,62}
x = 42, y = 12
Output: -1
Explanation: x = 42 and y = 12. We return -1 as x and y don't exist in the array.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
Constraints:
1 <= N <= 105
0 <= A[i], x, y <= 105
 */
import java.util.*;
class ArrayE13{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of Array :");
                int size = sc.nextInt();

                int arr[] = new int[size];
                System.out.println("Enter elements in array :");
                for(int i = 0; i<arr.length; i++){
                        arr[i] = sc.nextInt();
                }

		System.out.println("Enter Two elements for finding distance :");
                int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Distance between " + a + " & " + b + " is :");
		System.out.println(distanceBet2(arr, size, a, b));
	}

	static int distanceBet2(int arr[], int n, int a, int b){
		int s1 = 0;
		int s2 = 1;
		while(s1 < n && s2 < n){
			if(arr[s1] == a && arr[s2] == b)
				return s2 - s1;
			else if(arr[s1] == a)
				s2++;
			else{
				s1++;
				s2++;
			}
		}
		return -1;
	}
	
}
