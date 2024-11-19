import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseManager {
    public static void main(String[] args) {
        String driver = "com.mysql.cj.jdbc.Driver";  // Correct driver
        String url = "jdbc:mysql://localhost:3307/world";  // Ensure correct port and database
        String user = "root";
        String password = "root";
        Connection con = null;
        Statement stmt = null;
       // String sqlddl = "CREATE TABLE student (sname VARCHAR(30), branch VARCHAR(30))";  // Correct SQL syntax
        /*
        String sqlinsert = "insert into student values('amit' , 'AIDS')";
        String sqlinsert1 = "insert into student values('anu' , 'AIDS')";
        String sqlinsert2 = "insert into student values('kiran' , 'AIDS')";
        */
        ResultSet rs = null;
        String sqldq1 = "select * from student";

        try {
            // Load the JDBC driver
            Class.forName(driver);

            // Establish the connection
            con = DriverManager.getConnection(url, user, password);

            // Create a statement object
            stmt = con.createStatement();

            // Execute the SQL DDL
           // stmt.execute(sqlddl);
           /*
            stmt.executeUpdate(sqlinsert);
            stmt.executeUpdate(sqlinsert1);
            stmt.executeUpdate(sqlinsert2);
             */
            rs = stmt.executeQuery(sqldq1);
            
            while(rs.next())
            {
            	String sname = rs.getString("sname");
            	String branch = rs.getString("branch");
            	System.out.println("sname :" + sname+" AND  Branch :" + branch);
            }
            
            System.out.println("Table created successfully!");
        } catch (ClassNotFoundException ex) {
            System.out.println("JDBC Driver not found: " + ex.getMessage());
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
