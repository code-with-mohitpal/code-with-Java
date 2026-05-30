import java.sql.*;

public class PreparedStmtDemo {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "password");

            String query =
                    "INSERT INTO student VALUES (?,?)";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setInt(1, 2);
            ps.setString(2, "Rahul");

            ps.executeUpdate();

            System.out.println("Inserted Successfully");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
