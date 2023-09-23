/*
		41]Countries at war
	
The two countries of A and B are at war against each other. Both countries have N
number of soldiers. The power of these soldiers are given by A[i]...A[N] and
B[i]....B[N].
These soldiers have a peculiarity. They can only attack their counterpart enemies,
like A[i] can attack only B[i] and not anyone else. A soldier with higher power can
kill the enemy soldier. If both soldiers have the same power, they both die. You
need to find the winning country.

Example 1:
Input : a[ ] = {2, 2}, b[ ] = {5, 5}
Output : B
Explanation:
Both countries have 2 soldiers.
B[0] kills A[0], B[1] kills A[1].
A has 0 soldiers alive at the end.
B has both soldiers alive at the end.
Return "B" as a winner.

Example 2:
Input : a[ ] = {9}, b[ ] = {8}
Output : A
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 ≤ N ≤ 10^5
0 ≤ Ai ≤ 10^7
0 ≤ Bi ≤ 10^7

*/

import java.util.*;
class ArrayB41{

	static void winingCountry(int arr1[], int arr2[], int n1, int n2){
		int s1 = 0, s2 = 0;
		int winA = -1, winB = -1;
		while(s1 < n1 && s2 < n2){
			if(arr1[s1] > arr2[s2]){
				winA++;
			}else if(arr1[s1] < arr2[s2]){
				winB++;
			}
			s1++;
			s2++;
		}
		if(winA > winB)
			System.out.println("A");
		else if(winB > winA)
			System.out.println("B");
		else	
			System.out.println("Tie");
	}
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Total Soldiers in country A :");
                int size1 = sc.nextInt();

                int arr1[] = new int[size1];
                System.out.println("Enter Power of soldiers in A :");
                for(int i = 0; i<arr1.length; i++){
                        arr1[i] = sc.nextInt();
                }

		System.out.println("Total Soldiers in country B :");
                int size2= sc.nextInt();

                int arr2[] = new int[size2];
                System.out.println("Enter Power of soldiers in B :");
                for(int i = 0; i<arr2.length; i++){
                        arr2[i] = sc.nextInt();
                }

		System.out.println("War Result :");
		winingCountry(arr1, arr2, size1, size2);
	}
}
