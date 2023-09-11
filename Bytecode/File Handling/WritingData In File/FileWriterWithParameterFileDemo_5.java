import java.io.*;

class FileWriterDemo_3{
        public static void main(String[] args)throws IOException{

                File f = new File("Incubator.txt");
                FileWriter fw = new FileWriter(f, true);	//data is appended.

                fw.write("King\n");
                fw.write("Virat\n");
                fw.write("RunMachine\n");

                fw.close();
        }
}
