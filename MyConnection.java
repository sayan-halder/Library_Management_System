import java.sql.*;
import javax.swing.JOptionPane;
public class MyConnection {
    public Connection connectme()
    {
       try
       {
                                    //CONNECTION THROUGH ORACLE
           //Class.forName("oracle.jdbc.driver.OracleDriver");
           //return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","sayan","sayan");
           
                                    //CONNECTION THROUGH MS-ACCESS
           Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
           return DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\Lenovo\\Documents\\NetBeans Projects\\Library Managemment System\\LMS.accdb");
       }
       catch(ClassNotFoundException | SQLException e)
       {
            JOptionPane.showMessageDialog(null,e);
       }
       return null;
    }
}