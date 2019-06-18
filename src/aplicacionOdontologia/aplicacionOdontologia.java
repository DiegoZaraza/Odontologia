package aplicacionOdontologia;

import Modelo.Conexion;
import vista.VenConsultarPer;
import vista.framePrincipal;

public class aplicacionOdontologia {
    VenConsultarPer v = new VenConsultarPer();
    
    public static void main(String[] args) {
        
        framePrincipal principal = new framePrincipal();
        principal.setVisible(true);
        Conexion con = new Conexion();
        con.getConexion();
        if (con.getConexion()!= null) {
            System.err.println("conexion corecta");
        } else {
            System.err.println("conecxion incorrecta");
        }
        
    }
}