import java.io.*;
/*
 if above line is not given:
 Buffered1.java:4: error: cannot find symbol
		InputStreamReader isr=new InputStreamReader(System.in);
		^
  symbol:   class InputStreamReader
  location: class BufferedDemo
Buffered1.java:4: error: cannot find symbol
		InputStreamReader isr=new InputStreamReader(System.in);
		                          ^
  symbol:   class InputStreamReader
  location: class BufferedDemo

 */
class BufferedDemo{
	public static void main(String p[]){
		//Input Stream Reader can connect Single charactor to keybord
		InputStreamReader isr=new InputStreamReader(System.in);
		System.out.println("Enter charactor:");
		//char ch=isr.read();
		// error: incompatible types: possible lossy conversion from int to cha
		char ch=(char)isr.read();//Explict Typecasting.
		//error: unreported exception IOException; must be caught or declared to be thrown
	}
}
