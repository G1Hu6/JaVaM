/*
 write a program to print a series of strong numbers from entered range. ( Take a start and end number
from a user )

Input:-
Enter starting number: 1
Enter ending number: 150

Output:-
Output: strong numbers between 1 and 150
1 2 145
 */

import java.io.*;
class FcatPro9{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Start And End =");
		int start=Integer.parseInt(br.readLine());
		int end=Integer.parseInt(br.readLine());

		for(int i=start;i<=end;i++){
			int num=i;
			int sum=0;
			for(int j=0;num!=0;j++){
				int a=num%10;
				int fact=1;
				for(int k=1;k<=a;k++){
					fact=fact*k;
				}
				sum=sum+fact;
				num=num/10;
			}
			if(sum==i){
				System.out.println(i);
			}
		}
	}
}
