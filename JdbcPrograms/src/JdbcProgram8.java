import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.Scanner;

public class JdbcProgram8 {
// IN this program we are going to check the batch updates
	/**
	 * @param args
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 * @throws FileNotFoundException
	 */
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

		// 3. create statement
		Statement statement = connection.createStatement();
		
		//4. add batch  
		statement.addBatch("insert into account values(1,'sai','ram',25000)");
		statement.addBatch("insert into account values(2,'sam','raju',65000)");
		statement.addBatch("insert into account values(3,'charan','jara',35000)");
		statement.addBatch("insert into account values(4,'harish','suman',200000)");
		
		//5. execute batch.
		int[] result = statement.executeBatch();
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
		
		// close connection
		connection.close();

		System.out.println("Done");
	}

}
