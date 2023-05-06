import java.util.*;
class Some{
	public static void main(String args[]){
	Scanner p=new Scanner(System.in);
	int n=p.nextInt();
	int sum=0;
		while(n!=0){
			int a=n%10;
			sum+=a;//sum=sum+a;
			n=n/10;
		}
		System.out.println("Sum of Digits= "+sum);
	}
}
