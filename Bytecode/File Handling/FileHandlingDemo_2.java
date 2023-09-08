/*
import java.io.*;

class FileDemo_2{
	public static void main(String[] args){
		File fobj = new File("FileHandling");
		fobj.mkdir();	// folder is created in same directory.


		File fobj2 = new File("FileHandling" ,"code1");	// If we not give extenction in second parameter then it create folder
								// It is dependent on which method is called on object.
		fobj2.mkdir();
	}
}
--------------------------------------------------------------------------------
*/





/*
import java.io.*;

class FileDemo_2{
        public static void main(String[] args){
                File fobj = new File("FileHandling");
                fobj.mkdir();   // folder is created in same directory.


                File fobj2 = new File("FileHandling" ,"code1"); // If we not give extenction in second parameter then it create folder
                                                                // It is dependent on which method is called on object.
                fobj2.mkdir();

                File fobj3 = new File("King" ,"code1");
                fobj3.createNewFile();  //throws IOException.

		//For creating file first parameter is considered as Folder it it not present then JVM will throw Error.

        }
}

//error: unreported exception IOException; must be caught or declared to be thrown
*/

import java.io.*;

class FileDemo_2{
        public static void main(String[] args)throws IOException{
            
                //File fobj3 = new File("King" ,"code1");
                //fobj3.createNewFile();  //throws IOException.

                //For creating file first parameter is considered as Folder it it not present then JVM will throw Exception.
		/*Exception in thread "main" java.io.IOException: No such file or directory
			at java.base/java.io.UnixFileSystem.createFileExclusively0(Native Method)
			at java.base/java.io.UnixFileSystem.createFileExclusively(UnixFileSystem.java:356)
			at java.base/java.io.File.createNewFile(File.java:1043)
			at FileDemo_2.main(FileHandlingDemo_2.java:47)
		*/
		File fobj3 = new File("FileHandling" ,"code1");
                fobj3.createNewFile(); 

        }
}

