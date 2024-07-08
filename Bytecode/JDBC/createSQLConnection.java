import java.sql.*;

class CreateSQLConnection{

	public static void main(String[] args){
	
	    try{
		// loading Driver in memory
		Class.forName("org.mariadb.jdbc.Driver");

		String url = "jdbc:mariadb://127.0.0.1:3306/java_jdbc";
		String user = "root";
		String passward = "Maria@1234";
		Connection con = DriverManager.getConnection(url, user, passward);

		if(con.isClosed()){
		
			System.out.println("Connection is Closed");
		}else{
		
			System.out.println("Connected to SQL-Database");
		}
	    }catch(Exception e){
	    	e.printStackTrace();
	    }
	}
}
