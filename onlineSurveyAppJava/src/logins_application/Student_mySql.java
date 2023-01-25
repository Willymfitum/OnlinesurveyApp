/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logins_application;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author Mr Eugene
 */
public class Student_mySql {

        public static Connection connectmysql(){
            try{
                String username = "root";
                String password = "";
                String sqlconn = "jdbc:mysql://localhost:3306/students";
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection(sqlconn, username,password);
                return conn;
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
            return null;
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Connection established");
        // TODO code application logic here
    }
    
}
