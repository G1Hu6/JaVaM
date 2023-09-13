import java.net.*;

class URLDemo{
	public static void main(String[] args)throws MalformedURLException{
		URL url = new URL("https://www.core2web.com:80/home.html");

		System.out.println(url.getPort());	// -1 Default
		System.out.println(url.getProtocol());
		System.out.println(url.getFile());
	}
}
