/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class gestion_Persona {

    private static Conexion conn;
    PreparedStatement ps;
    ResultSet rs;
    
    public gestion_Persona() {
        conn = new Conexion();
    }

    public void registrar(Personas p) throws SQLException {
        System.out.print(p.getNumDoc());
        PreparedStatement stm = conn.getConexion().prepareStatement("INSERT INTO persona(PerTipoDocumento, PerNumDocumento, PerNombres, PerApellidos, PerEdad, PerSexo, PerTelefono, PerCorreoElectronico, PerDireccion, PerContraseña, PerRol) VALUES(?,?,?,?,?,?,?,?,?,?,?)");
        stm.setString(1, p.getTipodoc());
        stm.setFloat(2, p.getNumDoc());
        stm.setString(3, p.getNombres());
        stm.setString(4, p.getApellidos());
        stm.setInt(5, p.getEdad());
        stm.setString(6, p.getSexo());
        stm.setInt(7, p.getTelefono());
        stm.setString(8, p.getCorreo());
        stm.setString(9, p.getDireccion());
        stm.setString(10, p.getContraseña());
        stm.setString(11, p.getRol());
        
         stm.executeUpdate();
    }
    public Object[][] getTabla(String colName[],String sql, String persona){
    int registros = 0;
    String sentencia= "select count(*) as total from" +persona;
    
    try{
        
    ps=conn.getConexion().prepareStatement(sentencia);
    rs=ps.executeQuery();
    rs.next();
    registros=rs.getInt("persona");
    rs.close();
  
    }   catch (SQLException ex) {
           System.out.println(ex);
        }
    Object data[][] = new String[registros][colName.length];
    String col[] = new String[colName.length];
    try{
        
    ps=conn.getConexion().prepareStatement(sql);
    rs=ps.executeQuery();
    int i=0;
    
   while( rs.next()){
       for(int j=0 ;j<= colName.length -1; j++){
           col[j] =rs.getString(colName[j]);
           data [i][j] =col[j];
       }
       i++;
   }
   
    rs.close();
  
    }   catch (SQLException ex) {
           System.out.println(ex);
        }
        return data;
    
    
    
}


    // Variables declaration - do not modify                     
    private javax.swing.JTable TJCon;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDocConsul;
    // End of variables declaration                   
}

    
    
    
    

