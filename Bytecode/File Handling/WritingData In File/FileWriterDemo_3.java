import java.io.*;

import java.io.*;

class FileWriterDemo_3{
        public static void main(String[] args)throws IOException{
                FileWriter fw = new FileWriter("Incubator.txt", true);

                fw.write("Flutter\n");
                fw.write("SpringBoot\n");
                fw.write("Java\n");
                // print data in Same Line.

                fw.close();
	}
}

// data is updended here because of true flag.

