package DataBaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		//Connect to SQL server
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Connect to data base table
		Connection connection = DriverManager.getConnection("jdbc:mysql://root@localhost/selenium_users");
		
		//create a statement for the sending SQL statement
		Statement statement=connection.createStatement();
		
	ResultSet result =	statement.executeQuery("Select * From table_name");
	
	while (result.next()) {
		System.out.println(result.getString(1) + result.getString(2) );
		
	}
	

		
		
		
		
	}

}
