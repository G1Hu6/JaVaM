import java.io.*;

class FileFolderDemo{
	public static void main(String[] args){
		int totalCount =  0;
		int fileCount = 0;
		File fobj = new File("/home/supervk/JavaClass/Bytecode/File Handling");
		System.out.println(fobj.exists());

		String[] files= fobj.list();
		for(String str : files){
			File f = new File(str);
			if(f.isFile()){
				fileCount++;
			}
			
			totalCount++;

			System.out.println(str);
		}
		System.out.println("Total File & Folders count = " + totalCount);
		System.out.println("Files count = " + fileCount);
	}
}
