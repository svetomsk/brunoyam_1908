package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:Z:\\Общая преподавателей\\Милых Светозар\\brunoyam_1908__1\\test.db");
    }
}
