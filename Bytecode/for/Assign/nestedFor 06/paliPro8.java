/*
 Write a program to take range as input from the user and print Palindrome numbers. ( Take a start and
end number from a user )
Input: Enter start: 100
Enter end: 250
Output: Palindrome numbers between 100 and 250
101 111 121 131 141 151 161 171 181 191 202 212 222
 
 */
import java.io.*;
class PaliPro8{
	public static void main(String[] args)throws IOException{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in ));
	    System.out.println("Start =");
	    int start=Integer.parseInt(br.readLine());
	    System.out.println("end =");
	    int end=Integer.parseInt(br.readLine());

	    for(int i=start;i<=end;i++){
		int rev=0;
	    	for(int j=i;j!=0;){
			rev=rev*10 +(j%10);
			j=j/10;
		}
		if(rev==i){
			System.out.println(i);
		}
	    }
	}
}
