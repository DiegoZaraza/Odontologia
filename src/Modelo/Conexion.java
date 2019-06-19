 //clase conexion del paquete recurso que contiene el codigo para la conecxion con la base de datos 
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Leidy J
 */
public class Conexion {

    static String bd = "odontologia";
    static String login = "root";
    static String password = "Leidy123*5";
    static String url = "jdbc:mysql://localhost:33060/" + bd;

    Connection connection = null;

    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, login, password);

            if (connection != null) {
                System.out.println("Conexión a base de datos " + bd + " OK\n");
            }
        } catch (SQLException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    Conexion(String localhost, String root, String odontologia, String leidy1235) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

    public Connection getConexion() {
        return connection;
    }

    public void desconectar() {
        connection = null;
    }

    Connection getconexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    PreparedStatement prepareStatement(String insert_into_usuarios_PerTipoDcumentoPerNu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
