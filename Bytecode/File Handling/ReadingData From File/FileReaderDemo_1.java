import java.io.*;

class FileReaderDemo{
	public static void main(String[] args)throws IOException{
		FileReader fr = new FileReader("Incubator.txt");	// If file is not present then it does not create it.
		// throws FileNotFoundException if file not present
		// IOException is parent of FileNotFoundException so it is handled by default.
		
		//Empty file has -1 charactor
		int data = fr.read();
		while(data != -1){
			System.out.print((char)data);
			data = fr.read();
		}

		fr.close();
	}
}
