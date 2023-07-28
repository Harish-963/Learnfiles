import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class JdbcProgram7 {
// IN this program we are going to check the prepared statement for Date inserting
	public static void main(String[] args) throws SQLException, ClassNotFoundException, FileNotFoundException, ParseException {

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
		String query = "insert into dateprac values(?,?,?)";
		PreparedStatement prepared_statement = connection.prepareStatement(query);
		
		
		boolean want_to_run = true;

		try (Scanner sc = new Scanner(System.in)) {
			while (want_to_run) {

				// get values from user keyboard
				System.out.println("Enter  id: ");
				int id = sc.nextInt();
				
				// get values from user keyboard
				System.out.println("Enter  name: ");
				String name = sc.next();

				System.out.println("Enter DOB dd-mm-yyyy: ");
				String date = sc.next();
				
				SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
				java.util.Date udate = sdf.parse(date);
				System.out.println(udate);
				long l = udate.getTime();
				java.sql.Date  sdate= new java.sql.Date(l);
				

		// set values of prepared statements
		prepared_statement.setInt(1, id);
		prepared_statement.setString(2, name);
		prepared_statement.setDate(3, sdate);

		// 4. execute the executeUpadate as we are doing non select..
		int updateCount = prepared_statement.executeUpdate();

		if(updateCount == 1)
		System.out.println("Record inserted successfully");
		else
			System.out.println("Record insert unsuccessful");
		
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
