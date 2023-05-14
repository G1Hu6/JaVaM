/*Program 5: Write a program to print the square of even digits of the

given number.
Input: 942111423
Output: 4 16 4 16
 */
import java.io.*;
class Pro5{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number =");
		int n=Integer.parseInt(br.readLine());
		System.out.println("Square of Even Digits =");
		while(n!=0){
			int a=n%10;
			if(a%2==0){
				System.out.print(a*a +" ");
			}
			n=n/10;

		}
	}
}
