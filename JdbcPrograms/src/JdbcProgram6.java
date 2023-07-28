import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.Scanner;

public class JdbcProgram6 {
// IN this program we are going to check the prepared statement for blob(image upload)
	public static void main(String[] args) throws SQLException, ClassNotFoundException, FileNotFoundException {

		// NOTE : Loading class `com.mysql.jdbc.Driver'. This is deprecated. The new
		// driver class is `com.mysql.cj.jdbc.Driver'. The driver is automatically
		// registered via the SPI and manual loading of the driver class is generally
		// unnecessary.

		// 1. register the driver..
		Class.forName("com.mysql.cj.jdbc.Driver");

		// 2. Creating the Connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice", "root",
				"Harish");

		// 3. create statement using prepared statements
		String query = "insert into bolbprac values(?,?,?)";
		PreparedStatement prepared_statement = connection.prepareStatement(query);
		
		//get the file 
		File file = new File("C:\\Users\\harsh\\Downloads\\profile.png");
		FileInputStream fis = new FileInputStream(file);

		// set values of prepared statements
		prepared_statement.setInt(1, 1);
		prepared_statement.setString(2, "Harish");
		prepared_statement.setBinaryStream(3, fis);

		// 4. execute the executeUpadate as we are doing non select..
		int updateCount = prepared_statement.executeUpdate();

		if(updateCount == 1)
		System.out.println("Record inserted successfully");
		else
			System.out.println("Record insert unsuccessful");
	
		// close connection
		connection.close();

		System.out.println("Done");
	}

}
