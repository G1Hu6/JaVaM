import java.util.*;
class Triplet{
	public static void main(String[] ap){
		Scanner v=new Scanner(System.in);
		int a=v.nextInt();
		int b=v.nextInt();
		int c=v.nextInt();
		int hypo;
		if((a>b || a==b) && (a>c || a==c)){
			if(a*a==b*b+c*c){
				System.out.println("Pythagorian Triplet");
			}
			else{
				System.out.println("Not Triplet");
			}
		}
		else if((b>c || b==c)&&(b>a || b==a)){
			if(b*b==a*a+c*c){
                                System.out.println("Pythagorian Triplet");
                        }
                        else{
                                System.out.println("Not Triplet");
                        }
		}
		else{
			if(c*c==b*b+a*a){
                                System.out.println("Pythagorian Triplet");
                        }
                        else{
                                System.out.println("Not Triplet");
                        }

		}                                                                                                                                                 
	}
}
