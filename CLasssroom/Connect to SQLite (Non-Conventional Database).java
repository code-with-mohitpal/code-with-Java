import java.sql.*;

public class SQLiteConnection {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:sqlite:student.db");

            System.out.println(
                    "Connected to SQLite Database");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
