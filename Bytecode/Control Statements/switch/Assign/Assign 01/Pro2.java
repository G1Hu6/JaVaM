//Q2.
//Write a program in which ask the user to enter a number from 0 to 5 and print it's spelling,if the
//entered number is greater than 5 print entered number is greater than 5
//e.g
//Input -Enter a number - 4
//Output - four
import java.io.*;
class Spelling0to5{
	public static void main(String [] args)throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number 0 to 5 : ");
		int num=Integer.parseInt(br.readLine());
		if(num<0)
			System.out.println("please enter number in range ");
		else{
			switch(num){
				case 0:
					System.out.println("Spelling is zero");
					break;
				case 1:
					System.out.println("Spelling is one");
					break;
				case 2: 
					System.out.println("Spelling is two");
					break;
				case 3:
					System.out.println("Spelling is three");
					break;
				case 4:
					System.out.println("Spelling is four");
					break;
				case 5:
					System.out.println("Spelling is five");
					break;
				default:
					System.out.println("Your entered num is greater than 5");
					break;
			}
		}
	}
}
