import java.sql.*;
import javax.swing.JFileChooser;
import java.io.*;

class InsertLargeImages{

	public static void main(String[] args){
	
		try{
		
			Connection con = DatabaseConnector.createConnection();

			String querry = "insert into images(imgValue) values(?)";
			
			PreparedStatement pstmt = con.prepareStatement(querry);

			// Selecting file path using java.swing library
			JFileChooser jfc = new JFileChooser();
			jfc.showOpenDialog(null);

			File fobj = jfc.getSelectedFile();
			
			FileInputStream fis = new FileInputStream(fobj);

			pstmt.setBinaryStream(1, fis, fis.available());
			pstmt.executeUpdate();

			System.out.println("Large images is inserted successfully in Database...");

			con.close();

		}catch(Exception e){
		
			e.printStackTrace();
		}
	}
}
