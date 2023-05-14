/*Program 3: Write a program to count the digits of the given number.
Input: 942111423
Output: count of digits = 9
 */

import java.io.*;
class Pro3{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number =");
		int n=Integer.parseInt(br.readLine());
		int count=0;
		while(n!=0){
			count++;
			n=n/10;
		}
		System.out.println("Count of Digits =" +count);
	}
}
