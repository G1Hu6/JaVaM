/*
 * Que 12 : Number of occurance
Given a sorted array Arr of size N and a number X, you need to find the number of
occurrences of X in Arr.
Example 1:
Input:
N = 7, X = 2
Arr[] = {1, 1, 2, 2, 2, 2, 3}
Output: 4
Explanation: 2 occurs 4 times in the
given array.
Example 2:
Input:
N = 7, X = 4
Arr[] = {1, 1, 2, 2, 2, 2, 3}
Output: 0
Explanation: 4 is not present in the given array.
Expected Time Complexity: O(logN)
Expected Auxiliary Space: O(1)
Constraints:
1 ≤ N ≤ 105
1 ≤ Arr[i] ≤ 106
1 ≤ X ≤ 106
 */
import java.util.*;
class ArrayE12{
	static int firstOccur(int arr[], int n, int num){
		int s = 0;
		int e = n-1;
		int val = -1;
		while(s <= e){
			int m = s + (e - s)/2;
			if(arr[m] < num){
				s = m + 1;
			}else if(arr[m] > num){
				e = m - 1;
			}else{
				val = m;
				e = m - 1;
			}
		}
		return val;
	}

	static int lastOccur(int arr[], int n, int num){
                int s = 0;
                int e = n-1;
                int val = -1;
                while(s <= e){
                        int m = s + (e - s)/2;
                        
			if(arr[m] < num){
                                s = m + 1;
                        }else if(arr[m] > num){
                                e = m - 1;
                        }else{
				val = m;
                                s = m + 1;
                        }
                }
                return val;
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

		System.out.println("Enter Number :");
                int num = sc.nextInt();

		int firstIndex = firstOccur(arr, size, num);
		int lastIndex = lastOccur(arr, size, num);
		int total = 0;
		if(firstIndex == -1)
			total = 0;
		else
			total = lastIndex - firstIndex +1;

		System.out.println("Total occurance = " + total);
		System.out.println(firstIndex);
		System.out.println(lastIndex);
	}
}
