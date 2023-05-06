import java.io.*;
class BufferedDemo1{
	public static void main(String[] o)throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		System.out.println("Enter charactor:");
		char ch=(char)isr.read();
		System.out.println("Charactor="+ch);
	}
}
