/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Sachin Kumar
 */
public class ConnectionProvider {

/**
 *
 * @author Sachin Kumar
 */

    public static Connection getCon(){
        try {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ConnectionProvider.class.getName()).log(Level.SEVERE, null, ex);
            }
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gms","root","Kabcd02.");
           return con;
     
       }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }
}
