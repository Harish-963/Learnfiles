import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.Scanner;

public class JdbcProgram10 {
// IN this program we are going to check the transaction management.
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
		Connection connection = null;
		try {
			// 1. register the driver..
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. Creating the Connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice", "root", "Harish");

			// 3. create statement
			Statement statement = connection.createStatement();
			connection.setAutoCommit(false);
			// 4. update statement
			statement.executeUpdate("update account set balc = balc-5000 where accno = 1");
			statement.executeUpdate("update account set balc = balc+5000 where accno = 3");
			connection.commit();
		} catch (Exception e) {
			e.printStackTrace();
			connection.rollback();
		} finally {

			// close connection
			connection.close();

			System.out.println("Done");
		}
	}

}
