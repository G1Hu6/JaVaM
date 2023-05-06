/*
Q4
WAP to print all even numbers in reverse order and odd numbers in the standard way. Both separately.
Within a range. Take the start and end from user

Input: Enter start number - 2
Enter End number - 9

Output:
8 6 4 2
3 5 7 9
*/

import java.io.*;
class Pro4{
	public static void main(String[]pp)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Start Number=");
		int sNum=Integer.parseInt(br.readLine());
		System.out.println("End Number=");
		int eNum=Integer.parseInt(br.readLine());
		/*
		for(int sNum=Integer.parseInt(br.readLine());sNum<=eNum;){
			System.out.print(sNum +" ");
			sNum=sNum+2;
		}
		*/
		int num=0,num1=0;

		if(sNum%2==0 && eNum%2==0){
			num=eNum;
			num1=sNum+1;
		}
		else if(sNum%2!=0 && eNum%2!=0){
			num=eNum-1;
                        num1=sNum;
		}
		else if(sNum%2!=0 && eNum%2==0){
                        num=eNum;
                        num1=sNum;
                }
		else if(sNum%2==0 && eNum%2!=0){
                        num=eNum-1;
                        num1=sNum+1;
                }

		for(int i=1;num>=sNum;i++){
			System.out.print(num +" ");
			num=num-2;
		}
		System.out.println();
		for(int i=1;num1<=eNum;i++){
			System.out.print(num1 +" ");
			num1=num1+2;
		}
	}
}
