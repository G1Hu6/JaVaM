import java.io.*;
class BufferedDemo1{
	public static void main(String[] o)throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		System.out.println("Enter charactor:");
		int ch=isr.read();
		System.out.println(ch);

		isr.close();//close the connection with keyboard

		System.out.println("Enter charactor:");
		int ch1=isr.read();// for \n so it can't take input at this line.
                System.out.println(ch1); 

		System.out.println("Enter charactor:");
                int ch2=isr.read();// Try input at this line but we already close the connection of keyboard
				   // so it gives error of IOException
				   // Here JVM can losses the connection so Error come at runTime
                System.out.println(ch2);
               
	}
}
