import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCExample {
    public static void main(String[] args) {

        // Database URL
        String url = "jdbc:mysql://localhost:3306/studentdb";

        // Database username and password
        String user = "root";
        String password = "root";

        try {
            // Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            Connection con = DriverManager.getConnection(url, user, password);

            System.out.println("Database Connected Successfully!");

            // Create Statement
            Statement st = con.createStatement();

            // Insert Query
            String query = "INSERT INTO students VALUES (1, 'Ashutosh')";

            // Execute Query
            st.executeUpdate(query);

            System.out.println("Data Inserted Successfully!");

            // Close Connection
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
