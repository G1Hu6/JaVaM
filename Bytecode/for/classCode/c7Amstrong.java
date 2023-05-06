import java.util.*;
class imstrong{
	public static void main(String pp[]){
	Scanner p=new Scanner(System.in);
	int n=p.nextInt();
	int sum=0;
	int store=n;
	for(;n!=0;i++){
		int a=n%10;
		sum=sum+(a*a*a);
		n=n/10;
	}
	if(sum==store){
		System.out.println(store+" is a Armstrong Number");
	}
	else{
		System.out.println("Not");
	}
	}
}
