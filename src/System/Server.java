
package System;

import com.mysql.jdbc.Connection;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Server {
    public static Connection getConecction(){
        String URL = "jdbc:mysql://localhost:3306/System";
        String USERNAME = "root";
        String PASSWORD = "";
        String DRIVER = "com.mysql.jdbc.Driver";
        Connection newConnection = null; 
     
        try{
            Class.forName(DRIVER);
            newConnection = (Connection) DriverManager.getConnection(URL,USERNAME,PASSWORD);
            JOptionPane.showMessageDialog(null, "Conexión exitosa");
        }
        catch(ClassNotFoundException | SQLException | HeadlessException e){
            System.out.println(e);
        }
        
        return newConnection;
        
    }
}
