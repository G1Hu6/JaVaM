/*
 (1) Load the Driver in memory :
 	1. Class.forName("com.mysql.jdbc.Driver");

	or

	2. DriverManager.registerDriver(new com.mysql.jdbc.Driver());

 (2) Create a connection :
	Connection conObj = DriverManager.getConnection("url", "username", "passward");
	url = "jdbc:mariadb://127.0.0.1:3306/myDatabase"
	username = "root"
	passward = "Maria@12"

 (3) Create query, Statement, PreparedStatement, CallableStatement

 	eg. String que = "select * from table";
	    Statement stmt = con.createStatement();
	    ResultSet set = stmt.execute();
	    			 executeQuery(que);
				 executeUpdate();

 (4) Process the Data :
 	while(set.next()){
	
		//String name = set.getString("column_name");
		//String name = set.getString("row_number");

		int id = set.getInt("student_id");
		String name = set.getString("student_name");
		System.out.println(id);
		System.out.println(name);
	}

 (5) Close the connection :
 	con.close();


"org.mariadb.jdbc.Driver"
 */
