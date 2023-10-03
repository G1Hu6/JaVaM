/*
16] Last index of One
Given a string S consisting only '0's and '1's, find the last index of the '1' present in
it.
Example 1:
Input:
S = 00001
Output:
4
Explanation:
Last index of 1 in the given string is 4.
Example 2:
Input:
0
Output:
-1
Explanation:
Since, 1 is not present, so output is -1.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
Constraints:
1 <= |S| <= 10^6
S = {0,1}
 */
import java.util.*;
class ArrayB16{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of Array :");
              
                System.out.println("Enter Number :");
                String num = sc.next();

		System.out.println("Last index of 1 =");
		System.out.println(ArrayB16.lastOne(num));
	}

	static int lastOne(String str){
		char arr[] = str.toCharArray();
		int e = arr.length-1;
		int s = 0;
		while(s <= e){
			if(arr[e] == '1'){
				return e;
			}else{
				e--;
			}
		}
		return -1;
	}
}
