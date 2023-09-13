import java.net.*;
import java.io.*;
import java.util.*;

class Client{
	public static void main(String[] args)throws IOException{
		Socket s = new Socket("localhost",8000);

		InputStream is = s.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String str;
		Scanner sc = new Scanner(System.in);

		OutputStream os = s.getOutputStream();
                PrintStream ps = new PrintStream(os);

		/*System.out.println("Enter message :");
                String msg = sc.next();
                ps.println(msg);*/

		while((str=br.readLine()) != null){
			System.out.println("Server : " + str);
			System.out.println("Enter message :");
                	String msg = sc.nextLine();
               		ps.println(msg);
		}
		/*
		System.out.println("Enter message :");
		String msg = sc.next();
		ps.println(msg);*/

		br.close();
		s.close();
		os.close();
		ps.close();

	}
}
