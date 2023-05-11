import java.util.*;
class Factor{
	public static void main(String pp[]){
	Scanner o=new Scanner(System.in);
	int N=o.nextInt();
	int p=0;
		for(int i=1;i<=N;i++){
			if(N%i==0){
				p++;
				System.out.println(i);
			}
		}
	System.out.println("Count= "+p);	
	}
}
