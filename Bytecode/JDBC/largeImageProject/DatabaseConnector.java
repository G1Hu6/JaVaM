import java.sql.*;

public class DatabaseConnector{
	
	private static Connection con;

	public static Connection createConnection()throws ClassNotFoundException, SQLException{
	
		if(con == null){
		
			Class.forName("org.mariadb.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/java_jdbc", "root", "Maria@1234");
		}
		return con;
	}
}
