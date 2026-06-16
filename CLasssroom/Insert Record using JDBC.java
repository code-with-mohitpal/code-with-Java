import java.sql.*;

public class InsertData {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "password");

            String query =
                    "INSERT INTO student(id,name) VALUES(1,'Mohit')";

            Statement st = con.createStatement();
            st.executeUpdate(query);

            System.out.println("Record Inserted");
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
