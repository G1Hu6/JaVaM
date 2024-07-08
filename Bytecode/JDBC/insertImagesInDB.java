import java.sql.*;
import java.io.*;
import javax.swing.JFileChooser;

class InsertImages{

	public static void main(String[] args)throws SQLException, ClassNotFoundException, FileNotFoundException, IOException{
	
		Class.forName("org.mariadb.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/java_jdbc", "root", "Maria@1234");

		String querry = "insert into images(imgValue) values(?)";

		PreparedStatement pstmt = con.prepareStatement(querry);

		FileInputStream fis = new FileInputStream("nature.jpeg");
		pstmt.setBinaryStream(1,fis, fis.available());

		pstmt.executeUpdate();

		JFileChooser jfc = new JFileChooser();
		jfc.showOpenDialog(null);

		System.out.println("image is inserted in Database...");

		con.close();


	}
}
