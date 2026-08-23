package jdbc;

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
	 * Loads and registers the JDBC Driver.
	 *
	 * Call this once when the application starts.
	 */

	public static void loadDriver() {

		try {

			Class.forName(DRIVER);

			System.out.println("JDBC Driver Loaded Successfully!");

		} catch (ClassNotFoundException e) {

			System.out.println("JDBC Driver Not Found!");

			e.printStackTrace();
		}
	}

	// =========================================================
	// 2. ESTABLISH CONNECTION
	// =========================================================
	/*
	 * Creates and returns a database Connection.
	 *
	 * Instead of writing:
	 *
	 * DriverManager.getConnection(...)
	 *
	 * in every class, we can simply use:
	 *
	 * JDBCUtility.getConnection();
	 */

	public static Connection getConnection() throws SQLException {

		return DriverManager.getConnection(URL, USER, PASSWORD);
	}

	// =========================================================
	// 3. CLOSE RESULTSET
	// =========================================================
	/*
	 * Closes ResultSet safely.
	 *
	 * ResultSet is generally used for SELECT queries.
	 */

	public static void closeResultSet(ResultSet result) {

		if (result != null) {

			try {

				result.close();

			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}

	// =========================================================
	// 4. CLOSE STATEMENT
	// =========================================================
	/*
	 * Closes Statement safely.
	 */

	public static void closeStatement(Statement statement) {

		if (statement != null) {

			try {

				statement.close();

			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}

	// =========================================================
	// 5. CLOSE PREPAREDSTATEMENT
	// =========================================================
	/*
	 * PreparedStatement extends Statement.
	 *
	 * So it can technically be closed using closeStatement(), but having a separate
	 * method makes the utility easier to understand.
	 */

	public static void closePreparedStatement(PreparedStatement ps) {

		if (ps != null) {

			try {

				ps.close();

			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}

	// =========================================================
	// 6. CLOSE CALLABLESTATEMENT
	// =========================================================
	/*
	 * Closes CallableStatement safely.
	 */

	public static void closeCallableStatement(CallableStatement cs) {

		if (cs != null) {

			try {

				cs.close();

			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}

	// =========================================================
	// 7. CLOSE CONNECTION
	// =========================================================
	/*
	 * Closes database connection safely.
	 */

	public static void closeConnection(Connection connect) {

		if (connect != null) {

			try {

				connect.close();

			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}

	// =========================================================
	// 8. COMMIT TRANSACTION
	// =========================================================
	/*
	 * Permanently saves all changes made during the current transaction.
	 */

	public static void commit(Connection connect) {

		if (connect != null) {

			try {

				connect.commit();

			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}

	// =========================================================
	// 9. ROLLBACK TRANSACTION
	// =========================================================
	/*
	 * Cancels all changes made during the current transaction.
	 */

	public static void rollback(Connection connect) {

		if (connect != null) {

			try {

				connect.rollback();

			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}

	// =========================================================
	// 10. SET AUTO COMMIT
	// =========================================================
	/*
	 * Auto Commit:
	 *
	 * true: Each SQL statement is automatically committed.
	 *
	 * false: Multiple SQL statements can be treated as one transaction.
	 */

	public static void setAutoCommit(Connection connect, boolean autoCommit) {

		if (connect != null) {

			try {

				connect.setAutoCommit(autoCommit);

			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}

	// =========================================================
	// 11. GET DATABASE METADATA
	// =========================================================
	/*
	 * Returns information about the database.
	 */

	public static DatabaseMetaData getDatabaseMetaData(Connection connect) {

		if (connect != null) {

			try {

				return connect.getMetaData();

			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

		return null;
	}

	// =========================================================
	// 12. PRINT DATABASE INFORMATION
	// =========================================================
	/*
	 * Prints useful database information.
	 */

	public static void printDatabaseInfo(Connection connect) {

		try {

			DatabaseMetaData metaData = connect.getMetaData();

			System.out.println("Database Name: " + metaData.getDatabaseProductName());

			System.out.println("Database Version: " + metaData.getDatabaseProductVersion());

			System.out.println("Driver Name: " + metaData.getDriverName());

			System.out.println("Driver Version: " + metaData.getDriverVersion());

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}