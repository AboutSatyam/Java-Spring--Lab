package jdbc;

import java.sql.*;
import java.util.Scanner;

public class JdbcUserInput {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// 1. Load and Register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// 2. Establish Connection
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String user = "root";
		String password = "1234";

		Connection connect = DriverManager.getConnection(url, user, password);

		// 3. Take Input from User
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter ID: ");
		int id = sc.nextInt();

		sc.nextLine();

		System.out.print("Enter Name: ");
		String sname = sc.nextLine();

		System.out.print("Enter Age: ");
		int sage = sc.nextInt();

		sc.nextLine();

		System.out.print("Enter City: ");
		String scity = sc.nextLine();

		// 4. Create PreparedStatement
		String sql = "INSERT INTO studentInfo" + "(id, sname, sage, scity)" + " VALUES (?, ?, ?, ?)";

		PreparedStatement ps = connect.prepareStatement(sql);

		// 5. Set User Values
		ps.setInt(1, id);
		ps.setString(2, sname);
		ps.setInt(3, sage);
		ps.setString(4, scity);

		// 6. Execute INSERT
		int rows = ps.executeUpdate();

		// 7. Check Result
		if (rows > 0) {
			System.out.println("Data Inserted Successfully!");
		}

		// 8. Close Resources
		ps.close();
		connect.close();
		sc.close();

		System.out.println("Connection Closed!");
	}
}