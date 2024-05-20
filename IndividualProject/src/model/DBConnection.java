package Model;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author student.lab1
 */
public class DBConnection {

    static Connection conn;
    static Statement stat = null;

    public static Statement getStatementConnection() {
        try {
//Establish the connection
            String url = "jdbc:mysql://localhost:3306/studentd1";
            conn = DriverManager.getConnection(url, "root", "");
//Create the connection
            stat = conn.createStatement();
            System.out.println("Successfully Connected with the DB");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stat;
    }
    //Close the connection

    public static void closeCon() throws SQLException {
        conn.close();
    }

    public static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
