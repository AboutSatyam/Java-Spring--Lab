package jdbc;

import java.sql.*;

public class CompleteJDBC {

	public static void main(String[] args) {

		// =========================================================
		// 1. LOAD AND REGISTER JDBC DRIVER
		// =========================================================

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			System.out.println("Driver Loaded Successfully!");

		} catch (ClassNotFoundException e) {

			System.out.println("Driver Not Found!");
			e.printStackTrace();

			return;
		}

		// =========================================================
		// 2. DATABASE DETAILS
		// =========================================================

		String url = "jdbc:mysql://localhost:3306/jdbc";

		String user = "root";

		String password = "1234";

		// =========================================================
		// 3. ESTABLISH CONNECTION
		// =========================================================

		try (Connection connect = DriverManager.getConnection(url, user, password)) {

			System.out.println("Database Connected Successfully!");

			// =====================================================
			// 4. CONNECTION INFORMATION
			// =====================================================

			System.out.println("Database: " + connect.getCatalog());

			System.out.println("Auto Commit: " + connect.getAutoCommit());

			// =====================================================
			// 5. DATABASE METADATA
			// =====================================================

			DatabaseMetaData databaseMetaData = connect.getMetaData();

			System.out.println("Database Name: " + databaseMetaData.getDatabaseProductName());

			System.out.println("Database Version: " + databaseMetaData.getDatabaseProductVersion());

			System.out.println("Driver Name: " + databaseMetaData.getDriverName());

			// =====================================================
			// 6. CREATE STATEMENT
			// =====================================================

			try (Statement statement = connect.createStatement()) {

				// =================================================
				// IF → SELECT
				// ELSE → INSERT + UPDATE + DELETE
				// =================================================

				int choice = 1;

				if (choice == 1) {

					// =============================================
					// 7. SELECT QUERY
					// =============================================

					String selectSql = "SELECT * FROM studentInfo";

					ResultSet result = statement.executeQuery(selectSql);

					// =============================================
					// 8. RESULTSETMETADATA
					// =============================================

					ResultSetMetaData metaData = result.getMetaData();

					int columnCount = metaData.getColumnCount();

					System.out.println("\n--- Column Names ---");

					for (int i = 1; i <= columnCount; i++) {

						System.out.print(metaData.getColumnName(i) + "\t");
					}

					System.out.println();

					// =============================================
					// 9. RESULTSET
					// =============================================

					System.out.println("\n--- Student Data ---");

					while (result.next()) {

						System.out.println(result.getInt("id") + "\t" + result.getString("sname") + "\t"
								+ result.getInt("sage") + "\t" + result.getString("scity"));
					}

					result.close();

				} else {

					// =============================================
					// 10. INSERT QUERY
					// =============================================

					int nextId = getNextId(connect);

					String insertSql = "INSERT INTO studentInfo " + "(id, sname, sage, scity) " + "VALUES (" + nextId
							+ ", 'Amit', 20, 'Mumbai')";

					int insertRows = statement.executeUpdate(insertSql);

					if (insertRows > 0) {

						System.out.println("Data Inserted Successfully!");
					}

					// =============================================
					// 11. UPDATE QUERY
					// =============================================

					String updateSql = "UPDATE studentInfo " + "SET sage = 21 " + "WHERE id = " + nextId;

					int updateRows = statement.executeUpdate(updateSql);

					if (updateRows > 0) {

						System.out.println("Data Updated Successfully!");
					}

					// =============================================
					// 12. DELETE QUERY
					// =============================================

					String deleteSql = "DELETE FROM studentInfo " + "WHERE id = " + nextId;

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

						while (rs.next()) {

							System.out.println(rs.getInt("id") + "\t" + rs.getString("sname"));
						}
					}
				}

				// =================================================
				// 14. PREPAREDSTATEMENT - SELECT
				// =================================================

				String preparedSql = "SELECT * FROM studentInfo " + "WHERE id = ?";

				try (PreparedStatement ps = connect.prepareStatement(preparedSql)) {

					ps.setInt(1, 1);

					ResultSet result = ps.executeQuery();

					while (result.next()) {

						System.out.println(result.getInt("id") + "\t" + result.getString("sname") + "\t"
								+ result.getInt("sage") + "\t" + result.getString("scity"));
					}

					result.close();
				}

				// =================================================
				// 15. PREPAREDSTATEMENT - INSERT
				// =================================================

				int preparedId = getNextId(connect);

				String preparedInsert = "INSERT INTO studentInfo " + "(id, sname, sage, scity) "
						+ "VALUES (?, ?, ?, ?)";

				try (PreparedStatement ps = connect.prepareStatement(preparedInsert)) {

					ps.setInt(1, preparedId);
					ps.setString(2, "Rahul");
					ps.setInt(3, 22);
					ps.setString(4, "Pune");

					int rows = ps.executeUpdate();

					System.out.println("PreparedStatement Insert Rows: " + rows);
				}

				// =================================================
				// 16. TRANSACTION MANAGEMENT
				// =================================================

				try {

					connect.setAutoCommit(false);

					String update1 = "UPDATE studentInfo " + "SET sage = 25 " + "WHERE id = " + preparedId;

					String update2 = "UPDATE studentInfo " + "SET scity = 'Mumbai' " + "WHERE id = " + preparedId;

					try (Statement transactionStatement = connect.createStatement()) {

						transactionStatement.executeUpdate(update1);

						transactionStatement.executeUpdate(update2);
					}

					connect.commit();

					System.out.println("Transaction Committed!");

				} catch (SQLException e) {

					connect.rollback();

					System.out.println("Transaction Rolled Back!");

				} finally {

					connect.setAutoCommit(true);
				}

				// =================================================
				// 17. BATCH PROCESSING
				// =================================================

				int batchId1 = getNextId(connect);

				int batchId2 = batchId1 + 1;

				String batchSql = "INSERT INTO studentInfo " + "(id, sname, sage, scity) " + "VALUES (?, ?, ?, ?)";

				try (PreparedStatement ps = connect.prepareStatement(batchSql)) {

					ps.setInt(1, batchId1);
					ps.setString(2, "Raj");
					ps.setInt(3, 21);
					ps.setString(4, "Delhi");

					ps.addBatch();

					ps.setInt(1, batchId2);
					ps.setString(2, "Vijay");
					ps.setInt(3, 23);
					ps.setString(4, "Pune");

					ps.addBatch();

					int[] result = ps.executeBatch();

					System.out.println("Batch Executed: " + result.length);
				}

				// 18. Generated Keys

				int generatedId = getNextId(connect);

				String generatedSql = "INSERT INTO studentInfo " + "(id, sname, sage, scity) " + "VALUES (?, ?, ?, ?)";

				try (PreparedStatement ps = connect.prepareStatement(generatedSql)) {

					ps.setInt(1, generatedId);
					ps.setString(2, "Karan");
					ps.setInt(3, 24);
					ps.setString(4, "Mumbai");

					int rows = ps.executeUpdate();

					if (rows > 0) {

						System.out.println("Data Inserted Successfully!");

						System.out.println("Generated ID: " + generatedId);
					}
				}
				// =================================================
				// 19. SCROLLABLE RESULTSET
				// =================================================

				try (Statement scrollStatement = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
						ResultSet.CONCUR_READ_ONLY);

						ResultSet rs = scrollStatement.executeQuery("SELECT * FROM studentInfo")) {

					rs.last();

					System.out.println("Last Student: " + rs.getString("sname"));

					rs.first();

					System.out.println("First Student: " + rs.getString("sname"));
				}

				// =================================================
				// 20. CALLABLESTATEMENT
				// =================================================

				try {

					String procedure = "{call getStudent(?)}";

					try (CallableStatement cs = connect.prepareCall(procedure)) {

						cs.setInt(1, 1);

						try (ResultSet rs = cs.executeQuery()) {

							while (rs.next()) {

								System.out.println(rs.getInt("id") + "\t" + rs.getString("sname") + "\t"
										+ rs.getInt("sage") + "\t" + rs.getString("scity"));
							}

						}
					}

				} catch (SQLException e) {

					System.out.println("Stored procedure not available.");
				}

				// =================================================
				// 21. TRANSACTION ISOLATION
				// =================================================

				System.out.println("Transaction Isolation: " + connect.getTransactionIsolation());

				// =================================================
				// 22. TRY-WITH-RESOURCES
				// =================================================

				System.out.println("Resources will be closed automatically.");
			}

		} catch (SQLException e) {

			System.out.println("Database Error!");

			e.printStackTrace();
		}
	}

	// =============================================================
	// GET NEXT AVAILABLE ID
	// =============================================================

	private static int getNextId(Connection connect) throws SQLException {

		String sql = "SELECT COALESCE(MAX(id), 0) + 1 " + "FROM studentInfo";

		try (Statement statement = connect.createStatement();

				ResultSet result = statement.executeQuery(sql)) {

			result.next();

			return result.getInt(1);
		}
	}
}