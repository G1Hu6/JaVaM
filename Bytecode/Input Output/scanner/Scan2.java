import java.util.*;
class ssss{
	public static void main(String []r){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter:");
		String str=sc.nextLine();
		System.out.println(str);

		StringTokenizer t=new StringTokenizer(str," ");
		System.out.println(t.countTokens());
		while(t.hasMoreTokens()){
			System.out.println(t.nextToken());
			//Object n=t.nextElement();
			//System.out.println(n);
		}
	
	}
}
