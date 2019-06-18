package Modelo;

import java.util.Date;

/**
 *
 * @author Leidy J
 */
public class Cita {

    private float NumDoc;
    private String Nombres;
    private String apellidos;
    private int Telefono;
    private String correo;
    private String Especilalidad;
//    private DateTime hora;
    private Date fecha;

    public float getNumDoc() {
        return NumDoc;
    }

    public void setNumDoc(float NumDoc) {
        this.NumDoc = NumDoc;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEspecilalidad() {
        return Especilalidad;
    }

    public void setEspecilalidad(String Especilalidad) {
        this.Especilalidad = Especilalidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
