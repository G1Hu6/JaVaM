/*
 5] Replace all 0's with 5

You are given an integer N. You need to convert all zeros of N to 5.

Example 1:
Input:
N = 1004
Output: 1554
Explanation: There are two zeroes in 1004
on replacing all zeroes with "5", the new
number will be "1554".

Example 2:
Input:
N = 121
Output: 121
Explanation: Since there are no zeroes in
"121", the number remains as "121".

Expected Time Complexity: O(K) where K is the number of digits in N
Expected Auxiliary Space: O(1)

Constraints:
1 <= n <= 10000
 */

import java.util.*;
import java.lang.Math;
class Replace0To5{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number:");
                int num = sc.nextInt();
		String n = new Integer(num).toString();
		int a = n.length();
		System.out.println(replace(num, a));
	}

	static int replace(int n, int s){
		int i = 0;
		int sum = 0;
		int arr[] = new int[s];
		while(n != 0){
			int a = n % 10;
			arr[i] = a;
			if(arr[i] == 0){
				arr[i] = 5;
			}
			n = n / 10;
			sum = sum + arr[i]*(int)Math.pow(10, i);
			i++;
		}
		return sum;


	}
}
