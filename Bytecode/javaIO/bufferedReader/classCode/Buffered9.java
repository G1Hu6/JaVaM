import java.io.*;
class Demobuf{
	public static void main(String[] p)throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		String str1=br.readLine();
		System.out.println(str1);

		br.close();

		int str2=isr.read();
		System.out.println(str2);
	}
}
