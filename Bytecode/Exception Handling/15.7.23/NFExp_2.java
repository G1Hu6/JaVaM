import java.io.*;
class Demo{
        public static void main(String[] args)throws IOException,NumberFormatException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                String str=br.readLine();                
                System.out.println(str);

                int data=Integer.parseInt(br.readLine());       
                System.out.println(data);
        }
}
/*
 * superv@superv-VMware-Virtual-Platform:~/JavaClass/Bytecode/Exception Handling/15.7.23$ java Demo
Pranav
Pranav
King
Exception in thread "main" java.lang.NumberFormatException: For input string: "King"
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.lang.Integer.parseInt(Integer.java:580)
	at java.lang.Integer.parseInt(Integer.java:615)
	at Demo.main(NFExp_2.java:9)

 */
