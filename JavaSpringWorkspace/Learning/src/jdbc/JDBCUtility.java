package jdbc.utility;

import java.sql.*;

public class JDBCUtility {

	// =========================================================
	// DATABASE CONFIGURATION
	// =========================================================

	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

	private static final String URL = "jdbc:mysql://localhost:3306/jdbc";

	private static final String USER = "root";

	private static final String PASSWORD = "1234";

	// =========================================================
	// 1. LOAD AND REGISTER DRIVER
	// =========================================================

	/*
	 * Loads and registers JDBC Driver.
	 *
	 * Exception is passed to caller.
	 */

	public static void loadDriver() throws ClassNotFoundException {

		Class.forName(DRIVER);
	}

	// =========================================================
	// 2. ESTABLISH CONNECTION
	// =========================================================

	/*
	 * Creates database connection.
	 */

	public static Connection getConnection() throws SQLException {

		return DriverManager.getConnection(URL, USER, PASSWORD);
	}

	// =========================================================
	// 3. CREATE STATEMENT
	// =========================================================

	/*
	 * Creates a Statement object.
	 *
	 * Used mainly for static SQL queries.
	 */

	public static Statement createStatement(Connection connect) throws SQLException {

		return connect.createStatement();
	}

	// =========================================================
	// 4. CREATE PREPAREDSTATEMENT
	// =========================================================

	/*
	 * Creates PreparedStatement.
	 *
	 * Used for parameterized SQL:
	 *
	 * SELECT * FROM studentInfo WHERE id = ?
	 */

	public static PreparedStatement prepareStatement(Connection connect, String sql) throws SQLException {

		return connect.prepareStatement(sql);
	}

	// =========================================================
	// 5. CREATE CALLABLESTATEMENT
	// =========================================================

	/*
	 * Creates CallableStatement.
	 *
	 * Used to call Stored Procedures.
	 *
	 * Example:
	 *
	 * {call getStudent(?)}
	 */

	public static CallableStatement prepareCall(Connection connect, String sql) throws SQLException {

		return connect.prepareCall(sql);
	}

	// =========================================================
	// 6. CREATE PREPAREDSTATEMENT
	// WITH GENERATED KEYS
	// =========================================================

	/*
	 * Used when database generates an ID automatically.
	 *
	 * Usually used with AUTO_INCREMENT.
	 */

	public static PreparedStatement prepareStatementWithKeys(Connection connect, String sql) throws SQLException {

		return connect.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
	}

	// =========================================================
	// 7. CREATE SCROLLABLE STATEMENT
	// =========================================================

	/*
	 * Creates a Statement with scrollable ResultSet.
	 *
	 * Allows:
	 *
	 * first() last() previous() next()
	 */

	public static Statement createScrollableStatement(Connection connect) throws SQLException {

		return connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
	}

	// =========================================================
	// 8. CLOSE RESULTSET
	// =========================================================

	/*
	 * Closes ResultSet.
	 */

	public static void closeResultSet(ResultSet result) throws SQLException {

		if (result != null) {
			result.close();
		}
	}

	// =========================================================
	// 9. CLOSE STATEMENT
	// =========================================================

	/*
	 * Closes Statement.
	 */

	public static void closeStatement(Statement statement) throws SQLException {

		if (statement != null) {
			statement.close();
		}
	}

	// =========================================================
	// 10. CLOSE PREPAREDSTATEMENT
	// =========================================================

	/*
	 * Closes PreparedStatement.
	 */

	public static void closePreparedStatement(PreparedStatement ps) throws SQLException {

		if (ps != null) {
			ps.close();
		}
	}

	// =========================================================
	// 11. CLOSE CALLABLESTATEMENT
	// =========================================================

	/*
	 * Closes CallableStatement.
	 */

	public static void closeCallableStatement(CallableStatement cs) throws SQLException {

		if (cs != null) {
			cs.close();
		}
	}

	// =========================================================
	// 12. CLOSE CONNECTION
	// =========================================================

	/*
	 * Closes database Connection.
	 */

	public static void closeConnection(Connection connect) throws SQLException {

		if (connect != null) {
			connect.close();
		}
	}

	// =========================================================
	// 13. COMMIT TRANSACTION
	// =========================================================

	/*
	 * Permanently saves transaction changes.
	 */

	public static void commit(Connection connect) throws SQLException {

		connect.commit();
	}

	// =========================================================
	// 14. ROLLBACK TRANSACTION
	// =========================================================

	/*
	 * Cancels transaction changes.
	 */

	public static void rollback(Connection connect) throws SQLException {

		connect.rollback();
	}

	// =========================================================
	// 15. SET AUTO COMMIT
	// =========================================================

	/*
	 * true: Each SQL statement is automatically committed.
	 *
	 * false: Multiple SQL statements can be treated as one transaction.
	 */

	public static void setAutoCommit(Connection connect, boolean autoCommit) throws SQLException {

		connect.setAutoCommit(autoCommit);
	}

	// =========================================================
	// 16. GET AUTO COMMIT
	// =========================================================

	/*
	 * Returns current Auto Commit status.
	 */

	public static boolean getAutoCommit(Connection connect) throws SQLException {

		return connect.getAutoCommit();
	}

	// =========================================================
	// 17. GET DATABASE METADATA
	// =========================================================

	/*
	 * Returns information about database.
	 */

	public static DatabaseMetaData getDatabaseMetaData(Connection connect) throws SQLException {

		return connect.getMetaData();
	}

	// =========================================================
	// 18. GET RESULTSET METADATA
	// =========================================================

	/*
	 * Returns information about ResultSet columns.
	 */

	public static ResultSetMetaData getResultSetMetaData(ResultSet result) throws SQLException {

		return result.getMetaData();
	}

	// =========================================================
	// 19. GET GENERATED KEYS
	// =========================================================

	/*
	 * Returns automatically generated database keys.
	 *
	 * Example: AUTO_INCREMENT ID
	 */

	public static ResultSet getGeneratedKeys(PreparedStatement ps) throws SQLException {

		return ps.getGeneratedKeys();
	}

	// =========================================================
	// 20. GET TRANSACTION ISOLATION
	// =========================================================

	/*
	 * Returns current transaction isolation level.
	 */

	public static int getTransactionIsolation(Connection connect) throws SQLException {

		return connect.getTransactionIsolation();
	}

	// =========================================================
	// 21. SET TRANSACTION ISOLATION
	// =========================================================

	/*
	 * Sets transaction isolation level.
	 *
	 * Example:
	 *
	 * Connection.TRANSACTION_READ_COMMITTED
	 */

	public static void setTransactionIsolation(Connection connect, int level) throws SQLException {

		connect.setTransactionIsolation(level);
	}

	// =========================================================
	// 22. ADD BATCH
	// =========================================================

	/*
	 * Adds SQL command to batch.
	 *
	 * Used for executing multiple operations together.
	 */

	public static void addBatch(Statement statement, String sql) throws SQLException {

		statement.addBatch(sql);
	}

	// =========================================================
	// 23. EXECUTE BATCH
	// =========================================================

	/*
	 * Executes all commands added to batch.
	 *
	 * Returns number of affected results.
	 */

	public static int[] executeBatch(Statement statement) throws SQLException {

		return statement.executeBatch();
	}

	// =========================================================
	// 24. PRINT DATABASE INFORMATION
	// =========================================================

	/*
	 * Prints database and JDBC driver information.
	 */

	public static void printDatabaseInfo(Connection connect) throws SQLException {

		DatabaseMetaData metaData = connect.getMetaData();

		System.out.println("Database Name: " + metaData.getDatabaseProductName());

		System.out.println("Database Version: " + metaData.getDatabaseProductVersion());

		System.out.println("Driver Name: " + metaData.getDriverName());

		System.out.println("Driver Version: " + metaData.getDriverVersion());
	}
}