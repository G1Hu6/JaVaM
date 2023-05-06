import java.util.*;
class Num{
	public static void main(String [] ppp){
	Scanner p=new Scanner(System.in);
	int N=p.nextInt();
	for(int i=0;i<=N;i++){
		if(i%2==0){
			continue;
		}
		else{
			System.out.println(i);
		}
	}
	}
}
