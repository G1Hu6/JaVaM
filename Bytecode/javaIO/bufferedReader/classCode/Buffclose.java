import java.io.*;
class Adv{
	public static void main(String[] l)throws IOException{
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Anything:");
		//String a1=br1.readLine();
		char ch1=(char)br1.read();

		br1.close();

		System.out.println("Enter Anything:");
                //String a1=br1.readLine();
                char ch2=(char)br1.read();// \n of ch1

		System.out.println("atta kar bgu Enter:"); //Error Stream is Closed
		String a2=br1.readLine();
	}
}
