package asociacion;


import java.sql.*;
import javax.swing.JOptionPane;
        
/**
 *
 * @author Owner
 */
public class Conexion{
   
   Connection con=null;
   public Connection conectar(){
       try {
           //cargar nuestro driver
          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=socios","asociacion","123456");
           System.out.println("conexion establecida");
           JOptionPane.showMessageDialog(null, "conexion establecida");
       } catch (ClassNotFoundException | SQLException e) {
           System.out.println("error de conexion");
           JOptionPane.showMessageDialog(null, "error de conexion "+e);
       }
       return con;
   }

    public Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


