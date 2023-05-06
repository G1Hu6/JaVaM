import java.util.*;
class Max{
	public static void main(String[] m1){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();

		if(a>b){
			if(a==c){
                                if(b>a)
                                        System.out.println("a="+a+"=c"+" and b="+b+" is greater");
                                else if(a>b)
                                        System.out.println("b="+b+" and a=c="+c+" is greater");
                        }

			else if(a>c){
				System.out.println(a+" is greater between"+a+","+b+","+c);
			}
			else if(c>a){
				System.out.println(c+" is greater between"+a+","+b+","+c);
			}
		}
		else if(b>a){
			if(b==c){
				if(a>c)
					System.out.println("b="+b+"=c"+" and a="+a+" is greater");
				else if(c>a)
					System.out.println("a="+a+" and b=c="+b+" is greater");
			}
			else if(b>c){
				System.out.println(b+" is greater between"+a+","+b+","+c);
			}
			else if(c>b){
				System.out.println(c+" is greater between"+a+","+b+","+c);
			}
		}
		else if(a==b){
                                if(c>a)
                                        System.out.println("a="+a+"=b"+" and c="+c+" is greater");
                                else if(a>b)
                                        System.out.println("c="+c+" and a=b="+b+" is greater");
                        }
		else if(a==b && b==c){

			System.out.println("a=b=c="+b);
			}
		
	}
}
