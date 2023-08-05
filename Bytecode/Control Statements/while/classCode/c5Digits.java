import java.util.*;
class Digit{
	public static void main(String args[]){
	Scanner c=new Scanner(System.in);
	int N=c.nextInt();
		while(N!=0){
			int a=N%10;
			System.out.println(a);
			N=N/10;
		}
	}
}
