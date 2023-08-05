/*
Write a program, and take two characters if these characters are equal then print them as it is but if
they are unequal then print their difference.
{Note: Consider Positional Difference Not ASCIIs}

Input: a p
Output: The difference between a and p is 15 
*/

import java.io.*;
class Pro6{
	public static void main(String []k)throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	char ch1=(char)br.read();
	br.skip(1);
	char ch2=(char)br.read();
	br.skip(1);

	if(ch1==ch2){
		System.out.println(ch2);
	}
	else{
		int n1=(int)ch1;
		int n2=(int)ch2;

		System.out.println("The difference between a and p is ="+(n2-n1));
		}
	}
}
