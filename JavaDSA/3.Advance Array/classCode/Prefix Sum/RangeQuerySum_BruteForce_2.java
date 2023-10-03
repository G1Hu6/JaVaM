/*
   Q.(2) Given an array of size N and Q number of Queries.Query contain two parameters (s, e)
         s => starting index
	 e => ending index
	 For all queries, print sum of all elements from s to e.

	 Arr : [-3, 6, 2, 4, 5, 2, 8, -9 , 1]
	 N   : 10
	 Q   : 3

	 Queries	s	e	sum  
	 query 1  	1	3	12
	 query 2  	2	7	12
	 query 3	1	1	6
 */

//Brute Force :-
//Time Complexity = O(Q * N)
//Space Complexity = O(1)

import java.util.*;
class ArrayDemo2{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of Array :");
                int N = sc.nextInt();
		
                int arr[] = new int[N];
                System.out.println("Enter elements in array :");
                for(int i = 0; i<arr.length; i++){
                        arr[i] = sc.nextInt();
                }
		System.out.println("Enter total Queries :");
                int Q = sc.nextInt();

		for(int i = 0; i < Q; i++){	// O(Q)
			int sum = 0;
			System.out.println("Enter start and end value");
	                int startIndex = sc.nextInt();
			int endIndex = sc.nextInt();
			for(int j = startIndex; j <= endIndex; j++){	//O(N)
				sum = sum + arr[j];
			}
			System.out.println(sum);
		}
	}
}
