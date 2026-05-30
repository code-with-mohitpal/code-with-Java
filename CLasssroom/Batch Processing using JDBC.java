import java.sql.*;

public class BatchDemo {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "password");

            Statement st = con.createStatement();

            st.addBatch(
                    "INSERT INTO student VALUES(5,'Raj')");
            st.addBatch(
                    "INSERT INTO student VALUES(6,'Vikas')");

            st.executeBatch();

            System.out.println("Batch Executed");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
