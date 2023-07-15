// Sometimes IOException is occered as Runtime but it is CompileTime Exception.


/*
import java.io.*;
class Demo{
	public static void main(){
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
		String str=br.readLine();
		System.out.println(str);

		br.close();

		int data=Integer.parseInt(br.readLine());
		System.out.println(data);
	}
}
/*
superv@superv-VMware-Virtual-Platform:~/JavaClass/Bytecode/Exception Handling/15.7.23$ javac Unchecked_IOExp.java 
Unchecked_IOExp.java:6: error: unreported exception IOException; must be caught or declared to be thrown
		String str=br.readLine();
		                      ^
Unchecked_IOExp.java:9: error: unreported exception IOException; must be caught or declared to be thrown
		br.close();
		        ^
Unchecked_IOExp.java:11: error: unreported exception IOException; must be caught or declared to be thrown
		int data=Integer.parseInt(br.readLine());
		                                     ^
3 errors

*/

import java.io.*;
class Demo{
	public static void main(String[] args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
                String str=br.readLine();
                System.out.println(str);

                br.close();		//Runtime IOException

                int data=Integer.parseInt(br.readLine());
                System.out.println(data);
        }
}

/*

pranav       
pranav
Exception in thread "main" java.io.IOException: Stream closed
	at java.base/java.io.BufferedReader.ensureOpen(BufferedReader.java:122)
	at java.base/java.io.BufferedReader.implReadLine(BufferedReader.java:363)
	at java.base/java.io.BufferedReader.readLine(BufferedReader.java:348)
	at java.base/java.io.BufferedReader.readLine(BufferedReader.java:437)
	at Demo.main(Unchecked_IOExp.java:41)

 */
