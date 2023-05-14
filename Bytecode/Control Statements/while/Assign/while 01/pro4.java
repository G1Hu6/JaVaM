/*Program 4: Write a program to count the Odd digits of the given number.
Input: 942111423
Output: count of odd digits = 4
 */

import java.io.*;
class Pro4{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number =");
		int n=Integer.parseInt(br.readLine());
		int count=0;
		while(n!=0){
			if((n%10)%2!=0){
				count++;
			}
			n=n/10;
		}
		System.out.println("Count of odd Digits ="+count);
	}
}
