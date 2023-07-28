import java.sql.*;

public class JdbcProgram2 {
// IN this program we are going to check the statements and executeQuery and excuteUpdate methods and resultset for getting data from data base
	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		// NOTE : Loading class `com.mysql.jdbc.Driver'. This is deprecated. The new
		// driver class is `com.mysql.cj.jdbc.Driver'. The driver is automatically
		// registered via the SPI and manual loading of the driver class is generally
		// unnecessary.

		// 1. register the driver..
		Class.forName("com.mysql.cj.jdbc.Driver");

		// 2. Creating the Connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice", "root",
				"Harish");

		// 3. create statement
		Statement statement = connection.createStatement();

		// 4.execute query
		// now using executeQuery() method
		ResultSet resultset = statement.executeQuery("Select * from students where id = 3");

		while (resultset.next()) {
			System.out.println("Id: " + resultset.getInt("id") + ", First Name: " + resultset.getString("first_name")
					+ ", Last Name: " + resultset.getString("last_name") + ", Class: " + resultset.getInt("class"));

		}
		// close connection
		connection.close();

		System.out.println("Done");
	}

}
