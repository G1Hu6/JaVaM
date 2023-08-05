//Print Perfect number

import java.util.*;
class Perfect{
	public static void main(String args[]){
	Scanner p=new Scanner(System.in);
	int n=p.nextInt();
	int a=1;
	for(int i=1;i<=n;i++){
		if(n%i==0 && i!=n){
			a=a*i;
		}
	}
	if(a==n){
		System.out.println(n+" is a Perfect number");
	}
	else{
		System.out.println(n+" is Not Perfect number");
	}	
	}
}
