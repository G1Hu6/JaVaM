import java.sql.*;

class SelectValues{

	public static void main(String[] args)throws SQLException, ClassNotFoundException{
	
		Connection con = DatabaseConnector.createConnection();

		String querry = "select * from employee";

		Statement stmt = con.createStatement();

		ResultSet rs = stmt.executeQuery(querry);
		//getting data...
		
		while(rs.next()){
		
			int id = rs.getInt("empId");
			String name = rs.getString("empName");
			String comp = rs.getString(3);

			System.out.println(id + " : " + name + " : " + comp);
		} 
	}
}
