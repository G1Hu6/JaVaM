import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		try{
			int data=sc.nextInt();
		}catch(NumberFormatException obj){		//Here Exception is handled by DEH.
			System.out.println("Exception---");
		}
	}
}
/*uperv@superv-VMware-Virtual-Platform:~/JavaClass/Bytecode/Exception Handling/18.7.23/throw_Keyword$ java Demo 
ee
Exception in thread "main" java.util.InputMismatchException
	at java.util.Scanner.throwFor(Scanner.java:864)
	at java.util.Scanner.next(Scanner.java:1485)
	at java.util.Scanner.nextInt(Scanner.java:2117)
	at java.util.Scanner.nextInt(Scanner.java:2076)
	at Demo.main(pre-defined_ExpHandling.java:6)

 */
