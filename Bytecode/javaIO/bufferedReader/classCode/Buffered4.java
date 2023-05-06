import java.io.*;
class Kingbuffered{
	public static void main(String[]pp)throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
               
	       //BufferedReader br=new BufferedReader(System.in);
               //error: incompatible types: InputStream cannot be converted to Reader
               //BufferedReader br=new BufferedReader(System.in);
                                                           ^

		System.out.println("Enter Name:");
		String name=br.readLine();
		System.out.println("Enter Age:");
		//int age=br.readLine(); 
		//error:incompatible types: String cannot be converted to int
		int age=Integer.parseInt(br.readLine());
		System.out.println("Name="+name);
		System.out.println("Age="+age);	
	}
}
