/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author mario
 */
public class DBconexion {
  public Connection getConnection()
  { 
   Connection conexion=null;
   try {
      Class.forName("com.mysql.jdbc.Driver");
      conexion = DriverManager.getConnection("jdbc:mysql://localhost/rmibase?autoReconnect=true&useSSL=false","root","");
   } catch (SQLException ex) {
      ex.printStackTrace();
     
   } catch (ClassNotFoundException ex) {
      ex.printStackTrace();
   }
   return conexion;
 }
}
