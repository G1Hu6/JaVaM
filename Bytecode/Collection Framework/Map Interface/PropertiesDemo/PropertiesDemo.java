import java.io.*;
import java.util.*;

class PropertiesDemo{
	public static void main(String[] args)throws IOException{
		Properties obj = new Properties();

		FileInputStream fobj = new FileInputStream("friends.properties");
		obj.load(fobj);

		String name = obj.getProperty("Shashi");
		System.out.println(name);
		obj.setProperty("Master","God");

		FileOutputStream outObj = new FileOutputStream("friends.properties");
		obj.store(outObj,"Uploded by shashi");

	}
}
