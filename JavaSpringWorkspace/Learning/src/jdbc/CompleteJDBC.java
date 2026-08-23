package jdbc;

import java.sql.*;

public class CompleteJDBC {

	public static void main(String[] args) {

		// =========================================================
		// 1. LOAD AND REGISTER JDBC DRIVER
		// =========================================================
		/*
		 * JDBC Driver: - Connects Java application with the database. - Class.forName()
		 * loads and registers the MySQL Driver.
		 *
		 * MySQL Driver: com.mysql.cj.jdbc.Driver
		 */

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
		/*
		 * URL: - Contains database type, server, port and database name.
		 *
		 * jdbc:mysql://localhost:3306/jdbc
		 *
		 * localhost = database server 3306 = MySQL default port jdbc = database name
		 */

		String url = "jdbc:mysql://localhost:3306/jdbc";

		String user = "root";

		String password = "1234";

		// =========================================================
		// 3. ESTABLISH CONNECTION
		// =========================================================
		/*
		 * Connection: - Represents connection between Java application and database.
		 *
		 * DriverManager.getConnection() - Creates the database connection.
		 */

		try (Connection connect = DriverManager.getConnection(url, user, password)) {

			System.out.println("Database Connected Successfully!");

			// =====================================================
			// 4. CONNECTION INFORMATION
			// =====================================================
			/*
			 * getCatalog() - Returns current database name.
			 *
			 * getAutoCommit() - Returns true if every SQL statement is automatically
			 * committed.
			 */

			System.out.println("Database: " + connect.getCatalog());

			System.out.println("Auto Commit: " + connect.getAutoCommit());

			// =====================================================
			// 5. DATABASE METADATA
			// =====================================================
			/*
			 * DatabaseMetaData: - Provides information about the database.
			 *
			 * Examples: - Database name - Database version - JDBC driver name - Driver
			 * version
			 */

			DatabaseMetaData databaseMetaData = connect.getMetaData();

			System.out.println("Database Name: " + databaseMetaData.getDatabaseProductName());

			System.out.println("Database Version: " + databaseMetaData.getDatabaseProductVersion());

			System.out.println("Driver Name: " + databaseMetaData.getDriverName());

			// =====================================================
			// 6. CREATE STATEMENT
			// =====================================================
			/*
			 * Statement: - Used to execute SQL queries.
			 *
			 * createStatement() - Creates a Statement object.
			 *
			 * Mainly used for: - Static SQL queries
			 */

			try (Statement statement = connect.createStatement()) {

				// =================================================
				// IF → SELECT
				// ELSE → INSERT + UPDATE + DELETE
				// =================================================
				/*
				 * if-else: - Used here to select which operation to execute.
				 *
				 * choice = 1 → SELECT choice != 1 → INSERT, UPDATE, DELETE
				 */

				int choice = 1;

				if (choice == 1) {

					// =============================================
					// 7. SELECT QUERY
					// =============================================
					/*
					 * SELECT: - Used to retrieve data from database.
					 *
					 * executeQuery(): - Used for SELECT queries. - Returns ResultSet.
					 */

					String selectSql = "SELECT * FROM studentInfo";

					ResultSet result = statement.executeQuery(selectSql);

					// =============================================
					// 8. RESULTSETMETADATA
					// =============================================
					/*
					 * ResultSetMetaData: - Provides information about columns returned by SELECT
					 * query.
					 *
					 * getColumnCount() - Returns number of columns.
					 *
					 * getColumnName() - Returns column name.
					 */

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
					/*
					 * ResultSet: - Stores data returned by SELECT query.
					 *
					 * next(): - Moves cursor to next row.
					 *
					 * getInt(): - Reads integer value.
					 *
					 * getString(): - Reads String value.
					 */

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
					/*
					 * INSERT: - Adds new record to database.
					 *
					 * executeUpdate(): - Used for INSERT, UPDATE and DELETE. - Returns number of
					 * affected rows.
					 */

					String insertSql = "INSERT INTO studentInfo" + "(id, sname, sage, scity)" + " VALUES"
							+ "(4, 'Amit', 20, 'Mumbai')";

					int insertRows = statement.executeUpdate(insertSql);

					if (insertRows > 0) {

						System.out.println("Data Inserted Successfully!");
					}

					// =============================================
					// 11. UPDATE QUERY
					// =============================================
					/*
					 * UPDATE: - Modifies existing records.
					 *
					 * SET: - Specifies new value.
					 *
					 * WHERE: - Specifies which record should be updated.
					 */

					String updateSql = "UPDATE studentInfo " + "SET sage = 21 " + "WHERE id = 4";

					int updateRows = statement.executeUpdate(updateSql);

					if (updateRows > 0) {

						System.out.println("Data Updated Successfully!");
					}

					// =============================================
					// 12. DELETE QUERY
					// =============================================
					/*
					 * DELETE: - Removes records from database.
					 *
					 * Always use WHERE carefully.
					 */

					String deleteSql = "DELETE FROM studentInfo " + "WHERE id = 4";

					int deleteRows = statement.executeUpdate(deleteSql);

					if (deleteRows > 0) {

						System.out.println("Data Deleted Successfully!");
					}
				}

				// =================================================
				// 13. execute()
				// =================================================
				/*
				 * execute(): - Can execute different types of SQL statements.
				 *
				 * Returns: true → ResultSet is returned false → update count or no ResultSet
				 */

				String sql = "SELECT * FROM studentInfo";

				boolean hasResult = statement.execute(sql);

				if (hasResult) {

					try (ResultSet rs = statement.getResultSet()) {

						while (rs.next()) {

							System.out.println(rs.getInt("id") + "\t" + rs.getString("sname"));
						}
					}
				}
			}

			// =====================================================
			// 14. PREPAREDSTATEMENT
			// =====================================================
			/*
			 * PreparedStatement: - Used for parameterized SQL queries. - Uses ? as
			 * placeholder. - More secure than normal Statement. - Helps prevent SQL
			 * Injection. - Can be reused with different values.
			 */

			String preparedSql = "SELECT * FROM studentInfo WHERE id = ?";

			try (PreparedStatement ps = connect.prepareStatement(preparedSql)) {

				// Set value for ?
				/*
				 * setInt(1, 1)
				 *
				 * First 1 = parameter number Second 1 = value
				 */

				ps.setInt(1, 1);

				ResultSet result = ps.executeQuery();

				while (result.next()) {

					System.out.println(result.getInt("id") + "\t" + result.getString("sname") + "\t"
							+ result.getInt("sage") + "\t" + result.getString("scity"));
				}

				result.close();
			}

			// =====================================================
			// 15. PREPAREDSTATEMENT INSERT
			// =====================================================
			/*
			 * PreparedStatement can also be used for INSERT, UPDATE and DELETE.
			 */

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
			// 16. TRANSACTION MANAGEMENT
			// =====================================================
			/*
			 * Transaction: - A group of SQL operations treated as one unit.
			 *
			 * Example: UPDATE 1 UPDATE 2
			 *
			 * Both should succeed together.
			 *
			 * commit() - Permanently saves changes.
			 *
			 * rollback() - Cancels changes.
			 */

			try {

				// Disable automatic commit
				connect.setAutoCommit(false);

				String update1 = "UPDATE studentInfo " + "SET sage = 25 " + "WHERE id = 5";

				String update2 = "UPDATE studentInfo " + "SET scity = 'Mumbai' " + "WHERE id = 5";

				try (Statement transactionStatement = connect.createStatement()) {

					transactionStatement.executeUpdate(update1);

					transactionStatement.executeUpdate(update2);
				}

				// Save both operations
				connect.commit();

				System.out.println("Transaction Committed!");

			} catch (SQLException e) {

				// Undo transaction
				connect.rollback();

				System.out.println("Transaction Rolled Back!");

			} finally {

				// Enable Auto Commit again
				connect.setAutoCommit(true);
			}

			// =====================================================
			// 17. BATCH PROCESSING
			// =====================================================
			/*
			 * Batch Processing: - Executes multiple SQL operations together.
			 *
			 * addBatch() - Adds query to batch.
			 *
			 * executeBatch() - Executes all queries in batch.
			 *
			 * Useful when inserting/updating many records.
			 */

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
			// 18. GENERATED KEYS
			// =====================================================
			/*
			 * Generated Keys: - Used when database automatically generates ID.
			 *
			 * Usually used with AUTO_INCREMENT.
			 *
			 * RETURN_GENERATED_KEYS - Tells JDBC to return generated ID.
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
			// 19. SCROLLABLE RESULTSET
			// =====================================================
			/*
			 * Normal ResultSet: - Usually moves only forward.
			 *
			 * Scrollable ResultSet: - Can move forward and backward.
			 *
			 * last() - Moves cursor to last row.
			 *
			 * first() - Moves cursor to first row.
			 */

			try (Statement scrollStatement = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);

					ResultSet rs = scrollStatement.executeQuery("SELECT * FROM studentInfo")) {

				rs.last();

				System.out.println("Last Student: " + rs.getString("sname"));

				rs.first();

				System.out.println("First Student: " + rs.getString("sname"));
			}

			// =====================================================
			// 20. CALLABLESTATEMENT
			// =====================================================
			/*
			 * CallableStatement: - Used to call Stored Procedures.
			 *
			 * Stored Procedure: - SQL code stored inside the database.
			 *
			 * Syntax: {call procedureName(?)}
			 */

			/*
			 * Create this procedure in MySQL first:
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
			// 21. TRANSACTION ISOLATION
			// =====================================================
			/*
			 * Transaction Isolation: - Controls how one transaction can see changes made by
			 * another transaction.
			 *
			 * JDBC provides constants such as:
			 *
			 * TRANSACTION_READ_UNCOMMITTED TRANSACTION_READ_COMMITTED
			 * TRANSACTION_REPEATABLE_READ TRANSACTION_SERIALIZABLE
			 */

			System.out.println("Transaction Isolation: " + connect.getTransactionIsolation());

			// =====================================================
			// 22. TRY-WITH-RESOURCES
			// =====================================================
			/*
			 * try-with-resources: - Automatically closes JDBC resources.
			 *
			 * Example:
			 *
			 * try (Connection connect = ...) {
			 *
			 * }
			 *
			 * Connection is automatically closed.
			 *
			 * Same can be used for: - Connection - Statement - PreparedStatement -
			 * ResultSet
			 */

			System.out.println("Connection will be closed automatically.");

		} catch (SQLException e) {

			// =====================================================
			// 23. EXCEPTION HANDLING
			// =====================================================
			/*
			 * SQLException: - Handles database-related errors.
			 *
			 * Examples: - Wrong SQL query - Wrong username/password - Database not
			 * available - Duplicate key - Connection error
			 */

			System.out.println("Database Error!");

			e.printStackTrace();
		}
	}
}