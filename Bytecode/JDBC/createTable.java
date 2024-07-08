import java.sql.*;

class CreateTable{

	public static void main(String[] args){
	
		try{
		
			Class.forName("org.mariadb.jdbc.Driver");

			String url = "jdbc:mariadb://localhost:3306/java_jdbc";
			String user = "root";
			String passward = "Maria@1234";
			Connection con = DriverManager.getConnection(url, user, passward);

			String querry = "create table employee( empId int(20) primary key auto_increment, empName varchar(200) not null, companyName varchar(500))";
			Statement stmt = con.createStatement();
			stmt.executeUpdate(querry);

			System.out.println("Table is successfully created in Database");

			con.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
