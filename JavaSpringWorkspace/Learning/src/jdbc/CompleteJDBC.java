package jdbc;

import java.sql.*;

public class CompleteJDBC {

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

		// 4. Execute INSERT Query

		String insertSql = "INSERT INTO studentInfo(id, sname, sage, scity) " + "VALUES(4, 'Amit', 20, 'Mumbai')";

		int insertRows = statement.executeUpdate(insertSql);

		if (insertRows > 0) {
			System.out.println("Data Inserted Successfully!");
		}

		// 5. Execute SELECT Query

		String selectSql = "SELECT * FROM studentInfo";

		ResultSet result = statement.executeQuery(selectSql);

		// 6. Get Column Names

		ResultSetMetaData metaData = result.getMetaData();

		int columnCount = metaData.getColumnCount();

		for (int i = 1; i <= columnCount; i++) {

			System.out.print(metaData.getColumnName(i) + "\t");

		}

		System.out.println();

		// 7. Process Multiple Results

		while (result.next()) {

			System.out.println(result.getInt("id") + "\t" + result.getString("sname") + "\t" + result.getInt("sage")
					+ "\t" + result.getString("scity"));
		}

		result.close();

		// 8. Execute UPDATE Query

		String updateSql = "UPDATE studentInfo SET sage = 21 WHERE id = 4";

		int updateRows = statement.executeUpdate(updateSql);

		if (updateRows > 0) {
			System.out.println("Data Updated Successfully!");
		}

		// 9. Execute DELETE Query

		String deleteSql = "DELETE FROM studentInfo WHERE id = 4";

		int deleteRows = statement.executeUpdate(deleteSql);

		if (deleteRows > 0) {
			System.out.println("Data Deleted Successfully!");
		}

		// 10. PreparedStatement

		String preparedSql = "SELECT * FROM studentInfo WHERE id = ?";

		PreparedStatement ps = connect.prepareStatement(preparedSql);

		ps.setInt(1, 1);

		ResultSet preparedResult = ps.executeQuery();

		while (preparedResult.next()) {

			System.out.println(preparedResult.getInt("id") + "\t" + preparedResult.getString("sname") + "\t"
					+ preparedResult.getInt("sage") + "\t" + preparedResult.getString("scity"));
		}

		preparedResult.close();
		ps.close();

		// 11. DatabaseMetaData

		DatabaseMetaData databaseMetaData = connect.getMetaData();

		System.out.println("Database: " + databaseMetaData.getDatabaseProductName());

		System.out.println("Version: " + databaseMetaData.getDatabaseProductVersion());

		// 12. Close the Resources

		statement.close();

		connect.close();

		System.out.println("Connection Closed!");

	}

}