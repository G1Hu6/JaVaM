import java.util.*;
class OpPrime{
	public static void main(String [] p){
		Scanner pc=new Scanner(System.in);	
		int N=pc.nextInt();
		int count=0;
		int i=1;
		for(i=1;i<=N;i++){
			if(N%i==0){
				count++;
			}
			/*
			if(count>2){
				break;//It break for loop
			}
			*/
		}
		System.out.println(i);
		if(count==2)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}
}
