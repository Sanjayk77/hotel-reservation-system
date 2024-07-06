
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aer
 */
public class NewClass {
public static void main(String[] args)
{
    String url="jdbc:mysql://localhost:3306/hotelmanagementsystem";
        String dname="root";
        String pass="";
       
         PreparedStatement preparedStatement1;
     Connection c;
        try{
            PreparedStatement preparedStatement;
     Class.forName("com.mysql.cj.jdbc.Driver");
     c=(Connection) DriverManager.getConnection(url,dname,pass);
      preparedStatement1=c.prepareStatement("INSERT INTO `users` (`Name`, `Age`, `Email`, `password`) VALUES (?,?,?,?);");
         {
             System.out.println("hlo");
             preparedStatement1.setString(1,"name1");
             System.out.println("hl");
             preparedStatement1.setString(2,"1");
             preparedStatement1.setString(3,"email1");
             preparedStatement1.setString(4,"f");
             int rowsAffected=preparedStatement1.executeUpdate();
             String msg="account creared successfully";
             
             preparedStatement1.close();
             c.close();
}}
        catch(ClassNotFoundException | SQLException e)
        {
        System.out.println(e.getMessage());
        }
}}