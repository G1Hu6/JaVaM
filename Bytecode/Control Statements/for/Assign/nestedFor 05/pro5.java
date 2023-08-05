/*
write a program to print the following pattern
Row =4
0
1 1
2 3 5
8 13 21 34
*/

import java.io.*;
class Pro5{
	public static void main(String []p)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Row =");
		int row=Integer.parseInt(br.readLine());
		int a=0;
		int b=1;
		int temp;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				System.out.print(a+" ");
				temp=a+b;
				a=b;
				b=temp;	
			}
			System.out.println();
		}
	}
}
