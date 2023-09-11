import java.io.*;

import java.io.*;

class FileWriterDemo_2{
        public static void main(String[] args)throws IOException{
                FileWriter fw = new FileWriter("Incubator.txt");

                fw.write("Flutter\n");
		fw.write("SpringBoot\n");
		fw.write("Java\n");
		// print data in Same Line.

                fw.close();

		/*
		fw.write("all Out");	

		Exception in thread "main" java.io.IOException: Stream closed
	at sun.nio.cs.StreamEncoder.ensureOpen(StreamEncoder.java:45)
	at sun.nio.cs.StreamEncoder.write(StreamEncoder.java:118)
	at sun.nio.cs.StreamEncoder.write(StreamEncoder.java:135)
	at java.io.OutputStreamWriter.write(OutputStreamWriter.java:220)
	at java.io.Writer.write(Writer.java:157)
	at FileWriterDemo_2.main(FileWriterDemo_2.java:16)

		*/
        }
}


/*
 If we again compile and run this code then data can be rewrited in text file.
 (can not appended)

 by default boolean parameter is false in this case.
 */
