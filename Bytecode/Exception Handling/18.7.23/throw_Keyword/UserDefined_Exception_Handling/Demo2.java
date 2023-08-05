
import java.util.*;
class DataOverflowException extends RuntimeException{
	DataOverflowException(String msg){
		super(msg);	//Constructor Chaining
	}
}
class DataUnderflowException extends RuntimeException{
        DataUnderflowException(String msg){
		super(msg);	//Constructor Chaining
        }
}

class UserDemo2{
        public static void main(String[] args){
             	int arr[]=new int[5];
            
	    	Scanner sc=new Scanner(System.in);
                System.out.println("Enter Integer value :");
                System.out.println("Note : 0 < element < 100 ");

                for(int i=0;i<arr.length;i++){
                        int data=sc.nextInt();
                        if(data<0){
                                throw new DataUnderflowException("Bhava data 0 peksha lahan aahe !!");
                        }
                        if(data>100){
                                throw new DataOverflowException("Bhava data 100 peksha mota aahe !!");
                        }
                        arr[i]=data;
                }

            
                for(int i=0;i<arr.length;i++){
                        System.out.println(arr[i]+" ");
                }
        }
}

/*
uperv@superv-VMware-Virtual-Platform:~/JavaClass/Bytecode/Exception Handling/18.7.23/throw_Keyword/UserDefined_Exception_Handling$ javac Demo2.java
superv@superv-VMware-Virtual-Platform:~/JavaClass/Bytecode/Exception Handling/18.7.23/throw_Keyword/UserDefined_Exception_Handling$ java UserDemo2
Enter Integer value :
Note : 0 < element < 100 
5
-0
0.0
Exception in thread "main" java.util.InputMismatchException
	at java.util.Scanner.throwFor(Scanner.java:864)
	at java.util.Scanner.next(Scanner.java:1485)
	at java.util.Scanner.nextInt(Scanner.java:2117)
	at java.util.Scanner.nextInt(Scanner.java:2076)
	at UserDemo2.main(Demo2.java:23)
 */
