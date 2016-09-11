
package dba;

import escuelaperros.Localidad;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;


public class Mysql {
    
    //private static String db = "EAN-CS-EscuelaPerros";
    private static String db = "EAN_CS_EscuelaPerros";
    private static String user = "Hache";
    //private static String pass = "Luminoso@2908";
    private static String pass = "Luminoso";
    private static String url = "jdbc:mysql://ean-cs-escuelaperros.cse6hdsdfxz2.us-west-2.rds.amazonaws.com:3306/"+db;
    public static Connection Conn;
    
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Conn = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en conexion: " + e.getMessage());
        }
        return Conn;
    }
    
}
