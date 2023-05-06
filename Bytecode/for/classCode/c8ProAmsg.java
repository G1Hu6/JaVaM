import java.util.*;
class Pro{
	public static void main(String pp[]){
	//Scanner p=new Scanner(System.in);
	//int N=p.nextInt();
	int N=153;
	int s1=N;
	int s2=N;
	int sum=0;
	int count=0;
	while(N!=0){
		count++;
		N=N/10;
	}
	for(int j=0;s1!=0;j++){
		int a=s1%10;
		int mul=1;
		for(int i=0;i<=count;i++){
			mul=mul*a;
		}
		sum=sum+mul;
	}
	System.out.println(sum);
	if(sum==s2){
		System.out.println(s2+" is Amstrong Number.");
	}
	else{
		System.out.println("Not Amstrong Number.");
	}
	}
}
