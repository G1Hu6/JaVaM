import java.io.*;
import java.util.*;
class Rdemo{
	public static void main(String[] p)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Name,Div,Rollno,Pointer");
		String info=br.readLine();
		StringTokenizer tk=new StringTokenizer(info,"$");
		
		String to1=tk.nextToken();
		String to2=tk.nextToken();
		String to3=tk.nextToken();
		String to4=tk.nextToken();		
		
		System.out.println(to1);
		System.out.println(to2);
		System.out.println(to3);
		System.out.println(to4);

		String name=to1;
		char ch=to2.charAt(0);
		int no=Integer.parseInt(to3);
		float point=Float.parseFloat(to4);
			
		System.out.println(name);
                System.out.println(ch);
                System.out.println(no);
                System.out.println(point);

	}
}
