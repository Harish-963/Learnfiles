import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.Scanner;

public class JdbcProgram9 {
// IN this program we are going to check meta data of the fetched data
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
		

		
		//4. execute query .
		ResultSet rs=statement.executeQuery("select * from account");
		
		//5. get the meta data set 
		ResultSetMetaData rsmd = rs.getMetaData();
		
		//6. get columns count 
		int count = rsmd.getColumnCount();
		
		//7. iterate over the rsmd and get the column name, column data type and etc..
		for (int i = 1; i <= count; i++) {
			System.out.println(rsmd.getColumnName(i) + " "+ rsmd.getColumnTypeName(i) + " "+ rsmd.getColumnType(i));
		}
		
		// close connection
		connection.close();

		System.out.println("Done");
	}

}
