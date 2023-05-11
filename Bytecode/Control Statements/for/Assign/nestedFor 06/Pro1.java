/*
 Write a program to print the numbers divisible by 5 from 1 to 50 & the number is even also print the
count of even numbers.
Input: Enter a lower limit: 1
Enter upper limit: 50
Output: 10, 20, 30, 40, 50
Count = 5
 */
import java.io.*;
class Pro1{
	public static void main(String[] args)throws IOException{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in ));
	    System.out.println("Start =");
	    int start=Integer.parseInt(br.readLine());
	    System.out.println("end =");
	    int end=Integer.parseInt(br.readLine());
	    int count=0;
	    for(int i=start;i<=end;i++){
	    	if((i%10)==0){
			System.out.println(i);
			count++;
		}
	    }
	    System.out.println("count ="+count);
	    }
}
