import java.io.*;

class FileDesDemo{
	public static void main(String[] args)throws IOException{
		//File f = new File("Incubator.txt");
		//System.out.println(f.getFD());
		//error: cannot find symbol
		

		FileOutputStream fos = new FileOutputStream("Incubator.txt");

		System.out.println(fos.getFD()); //java.io.FileDescriptor@6bc7c054

	}
}
