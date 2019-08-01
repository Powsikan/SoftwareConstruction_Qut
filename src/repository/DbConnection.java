package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    String username="root";
    String password="";
    Connection con;
    Connection getConnection() throws SQLException {
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/track",username,password);
        return con;
    }
}
