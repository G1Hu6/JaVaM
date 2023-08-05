/*
import java.io.*;
class Demo{
        public static void main(String[] args){
                try{
                        System.out.println(10/0);
                }catch(RuntimeException | IOException obj){
                        System.out.println("Exception");
                }
        }
}
/*
 * superv@superv-VMware-Virtual-Platform:~/JavaClass/Bytecode/Exception Handling/18.7.23$ javac multipleExp_InCatch_2.java
multipleExp_InCatch_2.java:6: error: exception IOException is never thrown in body of corresponding try statement
                }catch(RuntimeException | IOException obj){
                 ^
1 error

 */

class Demo{
        public static void main(String[] args){
                try{
                        Thread.sleep(1000);
                }catch(RuntimeException | InterruptedException obj){		// No Error
                        System.out.println("Exception");
                }
        }
}

