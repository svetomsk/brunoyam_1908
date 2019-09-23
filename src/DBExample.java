import java.sql.*;

public class DBExample {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:Z:\\Общая преподавателей\\Милых Светозар\\db\\db.db");
        PreparedStatement statement = connection.prepareStatement("CREATE TABLE if not EXISTS clients (\n" +
                "  id integer PRIMARY KEY AUTOINCREMENT,\n" +
                "  name varchar NOT NULL,\n" +
                "  phone INT);");
        statement.execute();

        statement = connection.prepareStatement("INSERT INTO clients (name, phone) VALUES ('Ivan', 1234356);");
        statement.execute();

        statement = connection.prepareStatement("SELECT * FROM clients;");
        ResultSet cursor = statement.executeQuery();
        while(cursor.next()) {
            String name = cursor.getString("name");
            int phone = cursor.getInt("phone");
            System.out.println(name + " " + phone);
        }


        connection.close();
    }
}
