import java.net.*;
import java.io.*;
import java.util.*;

class ChatBotServer{
	public static void main(String[] args)throws IOException{
		ServerSocket ss = new ServerSocket(8000);
		Socket s = ss.accept();

		System.out.println("Connection established !!! Ready to Chat...");
		OutputStream os = s.getOutputStream();
		PrintStream ps = new PrintStream(os);
		
		Scanner sc = new Scanner(System.in);
	
		String str;
		InputStream is = s.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));

		System.out.println("Enter message :");
		String msg = sc.nextLine();
		ps.println(msg);
		
		while((str=br.readLine()) != null){	
			System.out.println("Client : " + str);
			if(str.equals("No")){
				break;
			}
			System.out.println("Enter message :");
			msg = sc.nextLine();
			ps.println(msg);
		}

		ps.close();
		ss.close();
		br.close();
	}
}
