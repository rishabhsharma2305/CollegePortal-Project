/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegeportal;

/**
 *
 * @author hp
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class databaseConnection {
    public static Connection connectDatabase(){
        
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","1234567");
        if(conn!=null)
            return conn;
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
        return null;
    }
    
}
