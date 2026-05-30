import java.sql.*;

public class MetaDataDemo {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "password");

            DatabaseMetaData db =
                    con.getMetaData();

            System.out.println("Driver Name: "
                    + db.getDriverName());

            System.out.println("Database Product: "
                    + db.getDatabaseProductName());

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
