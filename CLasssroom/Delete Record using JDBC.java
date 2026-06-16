import java.sql.*;

public class DeleteData {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "password");

            String query =
                    "DELETE FROM student WHERE id=1";

            Statement st = con.createStatement();
            st.executeUpdate(query);

            System.out.println("Record Deleted");
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
