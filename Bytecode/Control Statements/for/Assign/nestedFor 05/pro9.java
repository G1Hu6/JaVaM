/*Q9
Write a program to take a number as input and print the Addition of Factorials of each
digit from that number.
Input: 1234
Output: Addition of factorials of each digit from 1234 = 33
*/

import java.io.*;
class Pro9{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number =");
		int n=Integer.parseInt(br.readLine());
		int num=n;
		int sum=0;
		while(n!=0){
			sum=sum + fact(n%10);
			n=n/10;
		}
		System.out.println("Addition of Factorials of each digit from "+num +" ="+ sum);
	}
	static int fact(int a){
		int f=1;
		for(int i=1;i<=a;i++){
			f=f*i;
		}
		return f;
	}
}
