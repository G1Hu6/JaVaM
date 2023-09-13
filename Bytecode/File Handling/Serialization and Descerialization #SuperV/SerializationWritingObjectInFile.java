import java.io.*;

//Here class which object is writed in file must be implements Serializable because of objects must be stored in serial manner.

//throws NotSerializableException Runtime
 
class Player{
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
		//FileOutputStream fos = new FileOutputStream("King.txt");
		
		//public java.io.ObjectOutputStream(java.io.OutputStream) throws java.io.IOException;
		ObjectOutputStream oos = new ObjectOutputStream(os);

		oos.writeObject(p1);
		oos.writeObject(p2);

		oos.close();
		os.close();
	}
}

/*
 Exception in thread "main" java.io.NotSerializableException: Player
	at java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1184)
	at java.io.ObjectOutputStream.writeObject(ObjectOutputStream.java:348)
	at FileSerializationDemo.main(SerializationWritingObjectInFile.java:25)

 */
