//throw is used in both pre and user defined Exception
//According to protocoll it is used in user defined Exception.

import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();

		try{
			if(x==0){
				throw new ArithmeticException("Devide by Zero.");
			}
			System.out.println(10/x);
		}catch(ArithmeticException obj){
			System.out.println(obj);
			System.out.println(obj.getMessage());
			System.out.println(obj.toString());
		}
	}
}
