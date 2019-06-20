/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.gestion_Persona;

/**
 *
 * @author Leidy J
 */
public class ControlBuscar {

    gestion_Persona gesper;

    public ControlBuscar() {
        gesper = new gestion_Persona();
    }

    public Object[][] mostrarDatosPer() {

        String seleccion = "SELECT persona.IdPersona,persona.PerTipoDocumento, persona.PerNumDocumento, persona.PerNombres, persona.PerApellidos, persona.PerEdad, persona.PerSexo, persona.PerTelefono, persona.PerCorreoElectronico, persona.PerDireccion, persona.PerRol";
        String tabla = "personﬁa";
        String sentecia = seleccion + tabla;
        Object[][] datos = null;
        String[] columnas = {
            "persona.IdPERSONA",
            "persona.PerTipoDocumento",
            "persona.PerNumDocumento",
            "persona.PerNombres",
            "persona.PerApellidos",
            "persona.PerEdad",
            "persona.PerSexo",
            "persona.PerTelefono",
            "persona.PerCorreoElectronico",
            "persona.PerDireccion",
            "persona.PerRol"
        };
        datos = gesper.getTabla(columnas, sentecia, tabla);

        return datos;
    }

    public Object[][] buscar(String buscar) {

        String seleccion = "SELECT where like '%" + buscar + "%'";
        String tabla = "persona";
        String sentecia = seleccion + tabla;
        Object[][] datos = null;
        String[] columnas = {
            "persona.IdPERSONA",
            "persona.PerTipoDocumento",
            "persona.PerNumDocumento",
            "persona.PerNombres",
            "persona.PerApellidos",
            "persona.PerEdad",
            "persona.PerSexo",
            "persona.PerTelefono",
            "persona.PerCorreoElectronico",
            "persona.PerDireccion",
            "persona.PerRol"
        };
        datos = gesper.getTabla(columnas, sentecia, tabla);

        return datos;
    }
}
