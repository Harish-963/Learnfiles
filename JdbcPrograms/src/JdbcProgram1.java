import java.sql.*;

public class JdbcProgram1 {
// IN this program we are going tp check the basic database connectivity steps
	public static void main(String[] args) throws SQLException {

		// NOTE : Loading class `com.mysql.jdbc.Driver'. This is deprecated. The new
		// driver class is `com.mysql.cj.jdbc.Driver'. The driver is automatically
		// registered via the SPI and manual loading of the driver class is generally
		// unnecessary.

		// 1. register the driver..
		Driver driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);

		// 2. Creating the Connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice", "root",
				"Harish");

		// 3. create statement
		Statement statement = connection.createStatement();

		// 4.execute query
		
		  statement.executeUpdate(
		  "Update students set first_name = 'Soni' where id = 7");
		 
		
		//now using executeQuery() method

		// close connection
		connection.close();

		System.out.println("Done");
	}

}
