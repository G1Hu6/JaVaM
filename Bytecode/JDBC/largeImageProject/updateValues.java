import java.sql.*;
import java.io.*;

class UpdateValues{

	public static void main(String[] args)throws SQLException, ClassNotFoundException, IOException{
	
		Connection con = DatabaseConnector.createConnection();

		String querry = "update employee set empName = ? , companyName = ? where empId = ?";

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter new Name to update :");
		String name = br.readLine();

		System.out.println("Enter new Company name to update :");
		String comp = br.readLine();

		System.out.println("Enter Id :");
		int id = Integer.parseInt(br.readLine());

		PreparedStatement pstmt = con.prepareStatement(querry);
		pstmt.setInt(3, id);
		pstmt.setString(1, name);
		pstmt.setString(2, comp);
		pstmt.executeUpdate();

		System.out.println("Values are updated to Database...");

		con.close();
	}
}
