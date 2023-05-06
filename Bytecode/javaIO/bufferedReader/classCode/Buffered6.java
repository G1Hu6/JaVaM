import java.io.*;
class PlayerInfo{
	public static void main(String []j)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Player Name:");
		String Pname=br.readLine();

		System.out.println("Enter the Jercy No:");
		//int jerNo=br.readLine();
		//error: incompatible types: String cannot be converted to int
		int jerNo=Integer.parseInt(br.readLine());

		System.out.println("Enter Average:");
		//float avg=br.readLine();
		//error: incompatible types: String cannot be converted to float
		float avg=Float.parseFloat(br.readLine());

		System.out.println(Pname);
		System.out.println(jerNo);
		System.out.println(avg);
	}
}
