import java.util.*;
class Fact{
	public static void main(String pp[]){
	Scanner o=new Scanner(System.in);
	int N=o.nextInt();
	int p=1;
		for(int i=2;i<=N;i++){
			p=p*i;
		}
	System.out.println(p);	
	}
}
