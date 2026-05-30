import java.sql.*;

public class TransactionDemo {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "password");

            con.setAutoCommit(false);

            Statement st = con.createStatement();

            st.executeUpdate(
                    "INSERT INTO student VALUES(3,'Amit')");

            st.executeUpdate(
                    "INSERT INTO student VALUES(4,'Ravi')");

            con.commit();

            System.out.println("Transaction Successful");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
