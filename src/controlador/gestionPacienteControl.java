package controlador;

//importacion de paquetes para la clase 
import Modelo.Conexion;
import Modelo.Personas;
import Modelo.gestion_Persona;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import controlador.gestionPacienteControl;
import java.security.acl.Acl;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vista.JFrameFormulario_Registro_Persona;
//se extiende de la clase oyente para que sepa cual accion genera el cliente y envio de los valores
// de las cajas de texto a la BD

public class gestionPacienteControl implements ActionListener{
//creacion de las variables de instancia para las clases que ya hemos creado 

    JFrameFormulario_Registro_Persona personaVista;
   // Personas personamodelo;
    gestion_Persona gestionpersonaModelo;
    //gestionPacienteControl gespaciCnttl;
    
    public gestionPacienteControl(){
        
    }

    //constructor e la clase que recibe el modelo y la vista 
    public gestionPacienteControl(JFrameFormulario_Registro_Persona personaVista) {
        

        //igualar los valores  de las variables mediante this
        this.personaVista = personaVista;
        //this.personamodelo = personamodelo;
       // this.gespaciCnttl = gespaciCnttl;
        this.gestionpersonaModelo = new Modelo.gestion_Persona();
        this.personaVista.btnregistrar.addActionListener(this);
    }
     
        
        
       
            @Override
            public void actionPerformed(ActionEvent ae) {

                //encapsula la respuesta para el evento del boton seleccionado 
                if (personaVista.btnregistrar == ae.getSource()) {
                  }
                
                        
                            }
            }

        

   

    