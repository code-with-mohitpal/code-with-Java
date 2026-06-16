import java.sql.*;

public class JDBCConnection {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "password");

            System.out.println("Connected Successfully");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
