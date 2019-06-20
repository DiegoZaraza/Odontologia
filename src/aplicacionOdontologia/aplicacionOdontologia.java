package aplicacionOdontologia;

import Modelo.Conexion;
import vista.consupac;
import vista.framePrincipal_1;

public class aplicacionOdontologia {
    consupac v = new consupac();
    
    public static void main(String[] args) {
        
        framePrincipal_1 principal = new framePrincipal_1();
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