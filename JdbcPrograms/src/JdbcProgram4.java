import java.sql.*;
import java.util.Scanner;

public class JdbcProgram4 {
// IN this program we are going to check the callable statement for adding player using the stored procedures.
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

		// 3. create statement using callable statements
		CallableStatement callablestatement = connection.prepareCall("{call add_player(?,?,?)}");
		
		boolean want_to_run = true;
		
		try (Scanner sc = new Scanner(System.in)) {
			while (want_to_run) {

				// get values from user keyboard
				System.out.println("Enter player's first_name: ");
				String fname = sc.next();

				System.out.println("Enter player's Last_name: ");
				String lname = sc.next();

				System.out.println("Enter player's class: ");
				int classes = sc.nextInt();

				// set values of callable statements
				callablestatement.setString(1, fname);
				callablestatement.setString(2, lname);
				callablestatement.setInt(3, classes);
								
				callablestatement.execute();
				System.out.println("Record added successfully");
				System.out.println("Do you want to add another record?\t --> if \'Yes\' Enter 1 \t --> else 0 : ");
				if (sc.nextInt() == 0) {
					want_to_run = false;
				}

			}
		}
		

		// close connection
		connection.close();

		System.out.println("Done");
	}

}
