import java.io.*;

class FileWriterDemo_1{
	public static void main(String[] args){
		FileWriter fw = new FileWriter("KingKohli.txt");
		// All the File Handling releated objects, which can create text file will throw an IOException Compile Time

		File f = new File("c2w.txt");
		// No Exception.

		fw.write("77th Hundred");
		
		fw.close();
	}
}

/*
FileWriterDemo_1.java:5: error: unreported exception IOException; must be caught or declared to be thrown
		FileWriter fw = new FileWriter("KingKohli.txt");
		                ^
FileWriterDemo_1.java:10: error: unreported exception IOException; must be caught or declared to be thrown
		fw.write("77th Hundred");
		        ^
FileWriterDemo_1.java:12: error: unreported exception IOException; must be caught or declared to be thrown
		fw.close();
		        ^
3 errors
 */
