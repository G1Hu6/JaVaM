/*Program 7: Write a program which take’s number from user’s if number is even
print that number in reverse order or if number is odd print that number in
reverse order by difference two?
Input:6
output:6 5 4 3 2 1
Input:7
output:7 5 3 1.
 */
import java.io.*;
class Pro7{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number =");
		int n=Integer.parseInt(br.readLine());
		if(n%2==0){
			while(n!=0){
				System.out.print(n +" ");
				n=n-1;
			}
		}
		else{
			while(n!=-1){
                                System.out.print(n +" ");
                                n=n-2;
                        }
		}
	}
}
