/*

  13] Find unique element

Given an array of size n which contains all elements occurring in multiples of K,
except one element which doesn't occur in multiple of K. Find that unique element.

Example 1:
Input :
n = 7, k = 3
arr[] = {6, 2, 5, 2, 2, 6, 6}
Output :
5
Explanation:
Every element appears 3 times except 5.

Example 2:
Input :
n = 5, k = 4
arr[] = {2, 2, 2, 10, 2}
Output :
10
Explanation:
Every element appears 4 times except 10.

Expected Time Complexity: O(N. Log(A[i]) )
Expected Auxiliary Space: O( Log(A[i]) )

Constraints:
3<= N<=2*10^5
2<= K<=2*10^5
1<= A[i]<=10^9
 */

import java.util.*;
class ArrayB13{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of Array :");
                int size = sc.nextInt();

                int arr[] = new int[size];
                System.out.println("Enter elements in array :");
                for(int i = 0; i<arr.length; i++){
                        arr[i] = sc.nextInt();
                }
		
		System.out.println("Enter multiple K :");
                int k = sc.nextInt();
		System.out.println("Unique Element :");
		System.out.println(ArrayB13.unique(arr, size));
	}

	static int unique(int arr[], int n){
		int ans = -1;
		for(int i = 0; i<n; i++){
			int flag = 0;
			for(int j = 0; j<n; j++){
				if(arr[i]==arr[j] && i != j){
					flag = 1;
					break;
				}
			}
			if(flag == 0){
				ans = arr[i];
				return ans;
			}
		}
		return ans;
	}
}
