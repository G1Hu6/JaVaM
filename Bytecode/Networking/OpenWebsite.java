import java.io.*;
import java.net.*;
import java.awt.*;


class OpenWebsite{
	public static void main(String[] args)throws IOException, URISyntaxException{
		//String uri = "https://www.core2web.com";
		URI obj = new URI("www.youtube.com");
		
		Desktop desk = (Desktop)new Object();
		try{
		desk = Desktop.getDesktop();
		
		}catch(Error e){
		
		}
		desk.browse(obj);
			
	}
}
