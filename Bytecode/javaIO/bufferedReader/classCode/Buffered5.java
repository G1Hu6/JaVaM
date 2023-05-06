//31 Mar 2023
//import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Ipl{
	public static void main(String [] pp)throws IOException{
		BufferedReader p=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Batsman Name:");
		String name1=p.readLine();

		System.out.println("Enter Bowler Nmae:");
		String name2=p.readLine();

		System.out.println(name1);
		System.out.println(name2);
	}
}
