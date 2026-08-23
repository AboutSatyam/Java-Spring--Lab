package jdbc;

import java.sql.*;

public class JDBC1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // 1. Load and Register the Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. Establish the Connection
        String url = "jdbc:mysql://localhost:3306/jdbclearning";
        String user = "root";
        String password = "root123";

        Connection connect = DriverManager.getConnection(url, user, password);

        // 3. Create Statement
        Statement statement = connect.createStatement();

        // 4. Execute Query
        // statement.executeQuery("SELECT * FROM students");

        // 5. Process the Result
        // ResultSet result = statement.executeQuery("SELECT * FROM students");

        // 6. Close the Resources
        statement.close();
        connect.close();
    }
}