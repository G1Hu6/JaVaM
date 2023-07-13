import java.io.*;
class IODemo{
	public static void main(String[] args)/*throws IOException*/{
		System.out.println("Start main");

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=null;
		try{
			str=br.readLine();
		}
		catch(IOException e){
			System.out.println(e);
		}
		System.out.println(str);

		System.out.println("End main");
	}
}
/*
 Compiletime Exception:
	error: unreporter exception IOException; must be caught or decleared to be thrown.
	
 */
