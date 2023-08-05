import java.util.*;
class Prime{
	public static void main(String p[]){
	Scanner c=new Scanner(System.in);
	int n=c.nextInt();
	int count=0;
	for(int i=1;i<=n;i++){
		if(n%i==0){
			count++;
		}
	}
	if(count==2){
		System.out.println("Prime");
	}
	else{
		System.out.println("Not a Prime");
	}
	}
}
