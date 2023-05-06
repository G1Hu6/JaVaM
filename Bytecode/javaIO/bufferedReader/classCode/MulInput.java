import java.io.*;
import java.util.*;
class StrTokenDemo{
	public static void main(String[] j)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Match,MOM Name,Score");
		String Info=br.readLine();
		System.out.println(Info);
		
		
		StringTokenizer tk=new StringTokenizer(Info," ");
		String token1=tk.nextToken();
		String token2=tk.nextToken();
		String token3=tk.nextToken();

		System.out.println(token1);
		System.out.println(token2);
		System.out.println(token3);

	}
}
