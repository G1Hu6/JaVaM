//import java.util.*;
//import arithfun.*;

import java.util.Scanner;
import arithfun.Addition;

class Client{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers =");
		int a=sc.nextInt();
		int b=sc.nextInt();

		Addition obj=new Addition(a,b);
		System.out.println(obj.add());
	}
}
/*
 Addition(int,int) is not public in Addition; cannot be accessed from outside package
		Addition obj=new Addition(a,b);
 */
