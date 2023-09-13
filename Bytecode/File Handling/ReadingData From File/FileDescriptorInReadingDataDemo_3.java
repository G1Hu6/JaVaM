import java.io.*;

class FileDesDemo_3{
	public static void main(String[] args)throws IOException{
		//public java.io.FileReader(java.io.FileDescriptor);
		FileInputStream fis = new FileInputStream("Incubator.txt");	//FileNotFoundException

		FileDescriptor fd =  fis.getFD();

		FileReader fr = new FileReader(fd);
		int data = fr.read();	//return int

		while(data != -1){
			System.out.println((char)data);
			data = fr.read();
		}

		fr.close();
	}
}
