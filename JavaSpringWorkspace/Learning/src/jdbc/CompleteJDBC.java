package jdbc;

import java.sql.*;

public class JDBC1 {

	public static void main(String[] args) {

		// =========================================================
		// 1. Load and Register Driver
		// =========================================================

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded Successfully!");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return;
		}

		// =========================================================
		// 2. Database Details
		// =========================================================

		String url = "jdbc:mysql://localhost:3306/jdbc";
		String user = "root";
		String password = "1234";

		// =========================================================
		// 3. Establish Connection
		// =========================================================

		try (Connection connect = DriverManager.getConnection(url, user, password)) {

			System.out.println("Database Connected Successfully!");

			// =====================================================
			// 4. Connection Information
			// =====================================================

			System.out.println("Database: " + connect.getCatalog());

			System.out.println("Auto Commit: " + connect.getAutoCommit());

			// =====================================================
			// 5. DatabaseMetaData
			// =====================================================

			DatabaseMetaData databaseMetaData = connect.getMetaData();

			System.out.println("Database Name: " + databaseMetaData.getDatabaseProductName());

			System.out.println("Database Version: " + databaseMetaData.getDatabaseProductVersion());

			System.out.println("Driver Name: " + databaseMetaData.getDriverName());

			// =====================================================
			// 6. Create Statement
			// =====================================================

			try (Statement statement = connect.createStatement()) {

				// =================================================
				// IF → SELECT
				// ELSE → INSERT + UPDATE + DELETE
				// =================================================

				int choice = 1;

				if (choice == 1) {

					// =============================================
					// 7. SELECT
					// =============================================

					String selectSql = "SELECT * FROM studentInfo";

					ResultSet result = statement.executeQuery(selectSql);

					// =============================================
					// 8. ResultSetMetaData
					// =============================================

					ResultSetMetaData metaData = result.getMetaData();

					int columnCount = metaData.getColumnCount();

					System.out.println("\n--- Column Names ---");

					for (int i = 1; i <= columnCount; i++) {

						System.out.print(metaData.getColumnName(i) + "\t");
					}

					System.out.println();

					// =============================================
					// 9. ResultSet
					// =============================================

					System.out.println("\n--- Student Data ---");

					while (result.next()) {

						System.out.println(result.getInt("id") + "\t" + result.getString("sname") + "\t"
								+ result.getInt("sage") + "\t" + result.getString("scity"));
					}

					result.close();

				} else {

					// =============================================
					// 10. INSERT using Statement
					// =============================================

					String insertSql = "INSERT INTO studentInfo" + "(id, sname, sage, scity)" + " VALUES"
							+ "(4, 'Amit', 20, 'Mumbai')";

					int insertRows = statement.executeUpdate(insertSql);

					if (insertRows > 0) {

						System.out.println("Data Inserted Successfully!");
					}

					// =============================================
					// 11. UPDATE
					// =============================================

					String updateSql = "UPDATE studentInfo " + "SET sage = 21 " + "WHERE id = 4";

					int updateRows = statement.executeUpdate(updateSql);

					if (updateRows > 0) {

						System.out.println("Data Updated Successfully!");
					}

					// =============================================
					// 12. DELETE
					// =============================================

					String deleteSql = "DELETE FROM studentInfo " + "WHERE id = 4";

					int deleteRows = statement.executeUpdate(deleteSql);

					if (deleteRows > 0) {

						System.out.println("Data Deleted Successfully!");
					}
				}

				// =================================================
				// 13. execute()
				// =================================================

				String sql = "SELECT * FROM studentInfo";

				boolean hasResult = statement.execute(sql);

				if (hasResult) {

					try (ResultSet rs = statement.getResultSet()) {

						System.out.println("\nexecute() Result:");

						while (rs.next()) {

							System.out.println(rs.getInt("id") + "\t" + rs.getString("sname"));
						}
					}
				}
			}

			// =====================================================
			// 14. PreparedStatement
			// =====================================================

			String preparedSql = "SELECT * FROM studentInfo WHERE id = ?";

			try (PreparedStatement ps = connect.prepareStatement(preparedSql)) {

				// Set value for ?
				ps.setInt(1, 1);

				ResultSet result = ps.executeQuery();

				System.out.println("\n--- PreparedStatement ---");

				while (result.next()) {

					System.out.println(result.getInt("id") + "\t" + result.getString("sname") + "\t"
							+ result.getInt("sage") + "\t" + result.getString("scity"));
				}

				result.close();
			}

			// =====================================================
			// 15. PreparedStatement INSERT
			// =====================================================

			String preparedInsert = "INSERT INTO studentInfo" + "(id, sname, sage, scity)" + " VALUES (?, ?, ?, ?)";

			try (PreparedStatement ps = connect.prepareStatement(preparedInsert)) {

				ps.setInt(1, 5);
				ps.setString(2, "Rahul");
				ps.setInt(3, 22);
				ps.setString(4, "Pune");

				int rows = ps.executeUpdate();

				System.out.println("PreparedStatement Insert Rows: " + rows);
			}

			// =====================================================
			// 16. Transaction Management
			// =====================================================

			try {

				// Disable Auto Commit
				connect.setAutoCommit(false);

				String update1 = "UPDATE studentInfo " + "SET sage = 25 " + "WHERE id = 5";

				String update2 = "UPDATE studentInfo " + "SET scity = 'Mumbai' " + "WHERE id = 5";

				try (Statement transactionStatement = connect.createStatement()) {

					transactionStatement.executeUpdate(update1);
					transactionStatement.executeUpdate(update2);
				}

				// Save transaction
				connect.commit();

				System.out.println("Transaction Committed!");

			} catch (SQLException e) {

				// Undo transaction
				connect.rollback();

				System.out.println("Transaction Rolled Back!");

			} finally {

				// Enable Auto Commit
				connect.setAutoCommit(true);
			}

			// =====================================================
			// 17. Batch Processing
			// =====================================================

			String batchSql = "INSERT INTO studentInfo" + "(id, sname, sage, scity)" + " VALUES (?, ?, ?, ?)";

			try (PreparedStatement ps = connect.prepareStatement(batchSql)) {

				ps.setInt(1, 6);
				ps.setString(2, "Raj");
				ps.setInt(3, 21);
				ps.setString(4, "Delhi");

				ps.addBatch();

				ps.setInt(1, 7);
				ps.setString(2, "Vijay");
				ps.setInt(3, 23);
				ps.setString(4, "Pune");

				ps.addBatch();

				int[] result = ps.executeBatch();

				System.out.println("Batch Executed: " + result.length);
			}

			// =====================================================
			// 18. Generated Keys
			// =====================================================

			/*
			 * This requires id to be AUTO_INCREMENT.
			 *
			 * Example:
			 *
			 * INSERT INTO studentInfo (sname, sage, scity) VALUES (?, ?, ?)
			 */

			String generatedSql = "INSERT INTO studentInfo" + "(sname, sage, scity)" + " VALUES (?, ?, ?)";

			try (PreparedStatement ps = connect.prepareStatement(generatedSql, Statement.RETURN_GENERATED_KEYS)) {

				ps.setString(1, "Karan");
				ps.setInt(2, 24);
				ps.setString(3, "Mumbai");

				ps.executeUpdate();

				try (ResultSet keys = ps.getGeneratedKeys()) {

					if (keys.next()) {

						System.out.println("Generated ID: " + keys.getInt(1));
					}
				}
			}

			// =====================================================
			// 19. Scrollable ResultSet
			// =====================================================

			try (Statement scrollStatement = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);

					ResultSet rs = scrollStatement.executeQuery("SELECT * FROM studentInfo")) {

				rs.last();

				System.out.println("Last Student: " + rs.getString("sname"));

				rs.first();

				System.out.println("First Student: " + rs.getString("sname"));
			}

			// =====================================================
			// 20. CallableStatement
			// =====================================================

			/*
			 * First create this procedure in MySQL:
			 *
			 * DELIMITER //
			 *
			 * CREATE PROCEDURE getStudent(IN studentId INT) BEGIN SELECT * FROM studentInfo
			 * WHERE id = studentId; END //
			 *
			 * DELIMITER ;
			 */

			try {

				String procedure = "{call getStudent(?)}";

				try (CallableStatement cs = connect.prepareCall(procedure)) {

					cs.setInt(1, 1);

					try (ResultSet rs = cs.executeQuery()) {

						System.out.println("\n--- CallableStatement ---");

						while (rs.next()) {

							System.out.println(rs.getInt("id") + "\t" + rs.getString("sname") + "\t" + rs.getInt("sage")
									+ "\t" + rs.getString("scity"));
						}
					}
				}

			} catch (SQLException e) {

				System.out.println("Stored procedure not available.");
			}

			// =====================================================
			// 21. Connection Properties
			// =====================================================

			System.out.println("\nTransaction Isolation: " + connect.getTransactionIsolation());

			System.out.println("Auto Commit: " + connect.getAutoCommit());

			// =====================================================
			// 22. Connection automatically closed
			// =====================================================

			System.out.println("\nConnection Closed Automatically!");

		} catch (SQLException e) {

			System.out.println("Database Error!");

			e.printStackTrace();
		}
	}
}