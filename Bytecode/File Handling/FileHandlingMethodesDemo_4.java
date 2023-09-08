// Instances of the File class are immutable; that is, once created, the abstract pathname represented by a File object will never change

import java.io.*;

class FileMethodesDemo_4{
	public static void main(String[] args)throws IOException{
		File fobj = new File("FileMethods_4", "incubator.txt");

		// 1. public boolean createNewFile() throws java.io.IOException;
		fobj.createNewFile();

		// 2.public java.lang.String getParent();
		System.out.println(fobj.getParent());	//null

		// 3.public java.lang.String getName();
		System.out.println(fobj.getName());	//incubator.txt

		// 4.public java.io.File getParentFile();
		System.out.println(fobj.getParentFile());    //FileMethods_4

		// 5. public java.lang.String getPath();
		System.out.println(fobj.getPath());	// It doesnot give Absulute Path.

		// 6.public boolean isAbsolute();
		System.out.println(fobj.isAbsolute());

		// 7.public java.lang.String getAbsolutePath();
		System.out.println(fobj.getAbsolutePath());

		// 8.public java.io.File getAbsoluteFile();
		System.out.println(fobj.getAbsoluteFile());

		// 9.public java.lang.String getCanonicalPath() throws java.io.IOException;
		System.out.println(fobj.getCanonicalPath());

		// 10.public boolean canRead();
		System.out.println(fobj.canRead());
		// 11.public boolean canWrite();
		System.out.println(fobj.canWrite());
		// 12.public boolean exists();
		System.out.println(fobj.exists());
		// 13.public boolean isDirectory();
		System.out.println(fobj.isDirectory());
		// 14.public boolean isFile();
		System.out.println(fobj.isFile());
		// 15.public boolean isHidden();
		System.out.println(fobj.isHidden());

		// 16.public long lastModified();
		System.out.println(fobj.lastModified());
		//A long value representing the time the file was last modified, measured in milliseconds since the epoch (00:00:00 GMT, January 1, 1970), or 0L if the file does not exist or if an I/O error occurs. The value may be negative indicating the number of milliseconds before the epoch


		// 17.public boolean delete();
		//System.out.println(fobj.delete());

		String str[] = fobj.list();
		System.out.println(str);
	}
}
