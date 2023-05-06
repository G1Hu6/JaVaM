import java.io.*;
class HomeSHome{
	public static void main(String[]p)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Socity name:");
		String sName=br.readLine();

		System.out.println("Enter Wing:");
		char Wg=(char)br.read();// F\n
		//br.skip(1);
		
		System.out.println("Enter No:");
		int No=Integer.parseInt(br.readLine());// it takes \n of Wi and givers runtime NumberFormatException error so we have to use skip() method to skip \n.
						       // Exception in thread "main" java.lang.NumberFormatException

		System.out.println(sName);
		System.out.println(Wg);
		System.out.println(No);
	}
}
