/*
 Write a program to take a range as input from the user and print perfect squares between that range.
Input: Enter start: 1
Enter end: 100
Output: perfect squares between 1 and 100
 */
import java.io.*;
class SqPro3{
	public static void main(String[] args)throws IOException{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in ));
	    System.out.println("Start =");
	    int start=Integer.parseInt(br.readLine());
	    System.out.println("end =");
	    int end=Integer.parseInt(br.readLine());
	    
	    for(int i=start;i<=end;i++){
	    	if(i*i<=end){
		System.out.println(i*i);
		}
	    }	
	}
}
