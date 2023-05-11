/*
 Write a program to take range as input from the user and print the reverse of all numbers. ( Take a
start and end number from a user )

Input: Enter start: 100
Enter end: 200 
 */ 
import java.io.*;
class RevPro7{
        public static void main(String[] args)throws IOException{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in ));
            System.out.println("Start =");
            int start=Integer.parseInt(br.readLine());
            System.out.println("end =");
            int end=Integer.parseInt(br.readLine());

	    for(int i=start;i<=end;i++){
		int rev=0;
	    	for(int j=i;j!=0;j=j/10){
			rev=rev*10+(j%10);
		}
		System.out.print(rev +" ");
	    }
	}
}


