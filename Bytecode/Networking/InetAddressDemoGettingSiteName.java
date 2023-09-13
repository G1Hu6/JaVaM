import java.io.*;
import java.net.*;

class InetAddressSiteName{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter URL name =");
		String site = br.readLine();

		InetAddress ip = InetAddress.getByName(site);
		System.out.println("IP Address = "+ ip );
	}
}
