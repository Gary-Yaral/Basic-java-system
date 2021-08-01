
package System;

import com.mysql.jdbc.Connection;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Server {
    private static Connection newConnection; 
    private static final String URL = "jdbc:mysql://localhost:3306/System";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    ResultSet result;

    public Server(){
        
        newConnection = null; 

        try{
            Class.forName(DRIVER);
            newConnection = (Connection) DriverManager.getConnection(URL,USERNAME,PASSWORD);     
        }
        catch(ClassNotFoundException | SQLException | HeadlessException e){
            System.out.println(e);
        }
        
    }
    
    public void insertData(String [] data) throws SQLException{
        Statement stmt = newConnection.createStatement();
        String stringData = data[0]+"','"+data[1]+"','"+data[2]+"','"+data[3]+"','"+data[4];
        String query = "INSERT INTO techs(tech_id, tech_name,tech_lastname, tech_address, tech_cellphone) values('"+stringData+"')";
        stmt.executeUpdate(query);
    }
    
    public void getData(JTable dataTable) throws SQLException{

        Statement stmt = newConnection.createStatement();
        String query = "SELECT*FROM techs";
        result = stmt.executeQuery(query);
        DefaultTableModel table;
        Object[] techs = new Object[5];
        table= (DefaultTableModel)dataTable.getModel();
        while(result.next()){
            techs[0]= result.getString("tech_id");
            techs[1]= result.getString("tech_name");
            techs[2]= result.getString("tech_lastname");
            techs[3]= result.getString("tech_address");
            techs[4]= result.getString("tech_cellphone");
            table.addRow(techs);
        }
        
        dataTable.setModel(table);
    }
    
}
