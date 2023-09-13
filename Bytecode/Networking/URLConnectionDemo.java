import java.util.*;
import java.io.*;
import java.net.*;

class URLConnectionDemo{
	public static void main(String[] args)throws IOException{
		URL obj = new URL("https://www.core2web.in");
		URLConnection conn = obj.openConnection();

		System.out.println("Last Date of Modified = "+new Date(conn.getLastModified()));

	}
}
