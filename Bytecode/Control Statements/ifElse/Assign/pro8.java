import java.util.*;
class Days{
	public static void main(String ars[]){
		Scanner d=new Scanner(System.in);
		int m=d.nextInt();
		if(m==1)
			System.out.println("Monday");
		else if(m==2)
			System.out.println("Tuesday");
		else if(m==3)
                        System.out.println("Wednesday");
		else if(m==4)
                        System.out.println("Thursday");
		else if(m==5)
                        System.out.println("Friday");
		else if(m==6)
                        System.out.println("Saturday");
		else if(m==7)
               	        System.out.println("Sunday");
		else
			System.out.println("Invalid !!!");
		
	}
}
