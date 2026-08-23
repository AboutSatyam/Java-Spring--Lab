package jdbc;

import java.sql.*;

public class JDBC1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// 1. Load and Register the Driver

		Class.forName("com.mysql.cj.jdbc.Driver");

		// 2. Establish the Connection

		String url = "jdbc:mysql://localhost:3306/jdbc";

		String user = "root";

		String password = "1234";

		Connection connect = DriverManager.getConnection(url, user, password);

		// 3. Create Statement

		Statement statement = connect.createStatement();

		// 4. Execute Query

		String sql = "INSERT INTO studentinfo(id, sname, sage, scity) VALUES(1, 'Rohan', 17, 'Bengaluru')";

		int rowAffected = statement.executeUpdate(sql);

		// 5. Process the Result

		if (rowAffected == 0) {

			System.out.println("Unable to insert the data");

		} else {

			System.out.println("Data Inserted Successfully!");

		}

		// 6. Close the Resources

		statement.close();

		connect.close();

	}

}