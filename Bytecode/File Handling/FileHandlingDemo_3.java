import java.io.*;

class FileHandlingDemo_3{
	public static void main(String[] args)throws IOException{
		File fobj1 = new File("FileHandling");
		fobj1.mkdir();

		File fobj2 = new File(fobj1, "code1.txt");
		fobj2.createNewFile();

		File fobj3 = new File(fobj1, "code1.txt");	// If file is already created then it will not thhrow Error.
                fobj3.createNewFile();
	}
}
