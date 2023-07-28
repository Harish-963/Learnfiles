import java.sql.*;
import java.util.Scanner;

public class JdbcProgram5 {
// IN this program we are going to check the callable statement for getting player details using the stored procedures.
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
		CallableStatement callablestatement = connection.prepareCall("{call find_player_details(?)}");

		boolean want_to_run = true;

		try (Scanner sc = new Scanner(System.in)) {
			while (want_to_run) {

				// get values from user keyboard
				System.out.println("Enter player's id: ");
				int id = sc.nextInt();

				// set the values
				callablestatement.setInt(1, id);

				// execute
				ResultSet resultset = callablestatement.executeQuery();

				while (resultset.next()) {
					System.out.println("Id: " + resultset.getInt("id") + ", First Name: "
							+ resultset.getString("first_name") + ", Last Name: " + resultset.getString("last_name")
							+ ", Class: " + resultset.getInt("class"));

				}
				System.out.println("Record Fetch successfully");
				System.out.println("Do you want to fetch another record?\t --> if \'Yes\' Enter 1 \t --> else 0 : ");
				
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
