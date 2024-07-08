import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;

class InsertValues{

	public static void main(String[] args)throws java.sql.SQLException, ClassNotFoundException{
	
		Class.forName("org.mariadb.jdbc.Driver");

		String url = "jdbc:mariadb://localhost:3306/java_jdbc";
		String user = "root";
		String pass = "Maria@1234";

		Connection con = DriverManager.getConnection(url, user, pass);

		String querry = "insert into employee(empName, companyName) values(?, ?)";

		PreparedStatement pstmt = con.prepareStatement(querry);

		pstmt.setString(1, "Suraj");
		pstmt.setString(2, "Microsoft");

		pstmt.executeUpdate();	// here not set querry String as Parameter
		
		System.out.println("values inserted into Table");

		con.close();
	}
}
