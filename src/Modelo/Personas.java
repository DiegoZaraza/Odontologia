// clase encargada de manejar la informacion de una persona.
package Modelo;

public class Personas {
    // Cuando trabajas con este tipo de clases las variables se definen como private porque
    //no son de accesi desde cualquier parte del aplicativo, para acceder a ellas lo haces por los get a set
     private String tipodoc;
    private float NumDoc;
    private String nombres;
    private String apellidos;
    // public  Date fechanac;
    private int edad;
    private String sexo;
    private int Telefono;
    private String Direccion;
    private String Contraseña;
    private String Rol;
    private String correo;

//public Personas(){
    //      }
//constructor
    public Personas() {

    }
// metodo get que retorna el valor del atributo

    public String getTipodoc() {
        return tipodoc;
    }

    public void setTipodoc(String tipodoc) {
        this.tipodoc = tipodoc;
    }

    public float getNumDoc() {
        return NumDoc;
    }

    public void setNumDoc(float txtNumDoc) {
        this.NumDoc = NumDoc;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    // public Date getFechanac() {
    // return fechanac;
    //public void setFechanac(Date fechanac) {
    // this.fechanac = fechanac;
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
