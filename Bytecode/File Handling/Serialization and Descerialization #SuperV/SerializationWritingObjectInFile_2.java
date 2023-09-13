import java.io.*;
class Player implements Serializable{
        int jerNo = 0;
        String pName;

        Player(String pName, int jerNo){
                this.pName = pName;
                this.jerNo = jerNo;
        }
}

class FileSerializationDemo{
        public static void main(String[] args)throws IOException{

                Player p1 = new Player("Kl Rahul",110);
                Player p2 = new Player("KingVirat",122);

                OutputStream os = new FileOutputStream("King.txt");
          
                ObjectOutputStream oos = new ObjectOutputStream(os);

                oos.writeObject(p1);
                oos.writeObject(p2);

                oos.close();
                os.close();
        }
}
