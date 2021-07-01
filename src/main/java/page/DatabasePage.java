package page;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabasePage {

	public static String getData(String columnName) throws Throwable {

		Class.forName("com.mysql.cj.jdbc.Driver");

		String sqlUrl = "jdbc:mysql://localhost:3306/jan2021";
		String sqlUsername = "root";
		String sqlPassword = "1Jendj9y$";
		String query = "select * from users";

		//Creating a connection to your database
		Connection con = DriverManager.getConnection(sqlUrl, sqlUsername, sqlPassword);

		//Empowering the connection variable to execute queries
		Statement statement = con.createStatement();
		
		//Executing queries
		ResultSet rs = statement.executeQuery(query);
		
		
		while(rs.next()) {
			
			rs.getString(columnName);
			return rs.getString(columnName);
			
		
		}
		
		return null;
	}

}
