package vista;

import Modelo.Personas;

public class framePrincipal extends javax.swing.JFrame {

    public framePrincipal() {
        initComponents();

    }

    public void run() {
        new framePrincipal().setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuRegistro = new javax.swing.JMenu();
        jMenuItemRegistrarP = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        JmenuAsignaCita = new javax.swing.JMenuItem();
        jMenuModifiCita = new javax.swing.JMenuItem();
        jMenuCancelaCita = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        Jhisto = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("File");
        jMenuBar4.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar4.add(jMenu8);

        jMenu9.setText("File");
        jMenuBar5.add(jMenu9);

        jMenu10.setText("Edit");
        jMenuBar5.add(jMenu10);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 179, Short.MAX_VALUE)
        );

        jMenuRegistro.setText("Registro");
        jMenuRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRegistroActionPerformed(evt);
            }
        });

        jMenuItemRegistrarP.setText("Registrar Nueva Persona");
        jMenuItemRegistrarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegistrarPActionPerformed(evt);
            }
        });
        jMenuRegistro.add(jMenuItemRegistrarP);

        jMenuItem4.setText("Consultar persona");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenuRegistro.add(jMenuItem4);

        jMenuBar1.add(jMenuRegistro);

        jMenu2.setText("Citas");

        JmenuAsignaCita.setText("Asignar Cita");
        JmenuAsignaCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmenuAsignaCitaActionPerformed(evt);
            }
        });
        jMenu2.add(JmenuAsignaCita);

        jMenuModifiCita.setText("Modificar Cita");
        jMenuModifiCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuModifiCitaActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuModifiCita);

        jMenuCancelaCita.setText("Cancelar Cita");
        jMenuCancelaCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCancelaCitaActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuCancelaCita);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Modulo Odontologos");

        Jhisto.setText("Historias Medicas");
        Jhisto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JhistoActionPerformed(evt);
            }
        });
        jMenu1.add(Jhisto);

        jMenuItem1.setText("Agenda del dia ");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Carta dental");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Editar Agenda");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu11.setText("Facturacion");

        jMenuItem5.setText("Nueva Factura");
        jMenu11.add(jMenuItem5);

        jMenuItem6.setText("Consultar factura");
        jMenu11.add(jMenuItem6);

        jMenuBar1.add(jMenu11);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(165, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuModifiCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuModifiCitaActionPerformed
        llamarEditarAgenda();
        new JframeEditarAgenda().setVisible(true);
    }//GEN-LAST:event_jMenuModifiCitaActionPerformed


    private void jMenuRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRegistroActionPerformed

    }//GEN-LAST:event_jMenuRegistroActionPerformed

    private void jMenuItemRegistrarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegistrarPActionPerformed
        llamarFpersona();

    }//GEN-LAST:event_jMenuItemRegistrarPActionPerformed

    private void JmenuAsignaCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmenuAsignaCitaActionPerformed
        llamar1();
//new Ventana_Asignar_Cita().setVisible(true);
    }//GEN-LAST:event_JmenuAsignaCitaActionPerformed

    private void jMenuCancelaCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCancelaCitaActionPerformed
        llamarEliminarCita();
        new JframeEliminarCita().setVisible(true);


    }//GEN-LAST:event_jMenuCancelaCitaActionPerformed

    private void JhistoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JhistoActionPerformed
        llamarHistoria();
    }//GEN-LAST:event_JhistoActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed
    /* Create and display the form */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Jhisto;
    private javax.swing.JMenuItem JmenuAsignaCita;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JMenuItem jMenuCancelaCita;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItemRegistrarP;
    private javax.swing.JMenuItem jMenuModifiCita;
    private javax.swing.JMenu jMenuRegistro;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
public void llamarFpersona() {
        new JFrameFormulario_Registro_Persona().setVisible(true);

    }

    public void llamar1() {
        new Ventana_Asignar_Cita().setVisible(true);
    }

    public void llamarmodificarCita() {
    }

    public void llamarEliminarCita() {
        new JframeEliminarCita().setVisible(true);
    }

    public void llamarEditarAgenda() {
        new JframeEditarAgenda().setVisible(true);
    }

    public void consult() {
        new consupac().setVisible(true);
    }

    public void llamarHistoria() {
        VenHistoria pro = new VenHistoria();
        pro.setVisible(true);
        jPanel1.add(pro);
    }
    public void llamarconsulpac(){
        new consupac().setVisible(true);
    }
    
}
