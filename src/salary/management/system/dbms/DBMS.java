
package salary.management.system.dbms;

import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.*;

public class DBMS {
    Connection conn=null;
    public static Connection db()
    {
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
       
        Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/salary management system dbms ?serverTimezone=UTC","root","");
       // JOptionPane.showMessageDialog(null,"Connection Success");
        return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
  