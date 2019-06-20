/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.Cita;
import Modelo.Conexion;
import Modelo.Personas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import vista.Ventana_Asignar_Cita;

/**
 *
 * @author Leidy J
 */
public class GestioCitas {
    
    private static Conexion conn;
    Ventana_Asignar_Cita venCit;
    GestioCitas gesCitas;
    
    public GestioCitas(vista.Ventana_Asignar_Cita venCit) {
        conn = new Conexion();
        this.gesCitas = gesCitas;
        this.venCit = venCit;
        //this.venCit.btnagendar.addActionListener();

    }
    
    public Personas traerPaciente(float documento) throws SQLException {
        
        Personas p = new Personas();
        Statement st = conn.getConexion().createStatement();
        
        ResultSet x = st.executeQuery("select idPersona,PerTipoDocumento , PerNumDocumento, PerNombres, PerApellidos,PerEdad,PerSexo, PerTelefono, PerCorreoElectronico,PerDireccion,PerContraseña,PerRol from persona where PerNumDocumento = " + documento + ";");
        
        while (x.next()) {
            p.setTipodoc(x.getString(1));
            p.setNumDoc(x.getFloat(2));
            p.setNombres(x.getString(3));
            p.setApellidos(x.getString(4));
            p.setEdad(x.getInt(5));
            p.setSexo(x.getString(6));
            p.setTelefono(x.getInt(7));
            p.setCorreo(x.getString(8));
            p.setDireccion(x.getString(9));
            p.setContraseña(x.getString(10));
            p.setRol(x.getString(11));
        }
        return p;
    }
    
    public void registrarcita(Cita c) throws SQLException {
        
        System.out.print(c.getNumDoc());
        PreparedStatement stm = conn.getConexion().prepareStatement("INSERT INTO cita( CitaDocPaciente, CitNomPaciente, CitApePaciente,CitaFecha,CitHora)");
        
        stm.setFloat(2, c.getNumDoc());
        stm.setString(2, c.getNombres());
        stm.setString(3, c.getApellidos());
        stm.setInt(4, c.getTelefono());
        stm.setString(5, c.getCorreo());
        stm.setString(6, c.getEspecilalidad());
        stm.setInt(4, c.getTelefono());
        stm.setString(5, c.getCorreo());
        stm.setString(6, c.getEspecilalidad());
        //stm.setDate(7, c.getFecha());

        stm.executeUpdate();
    }
    
}
