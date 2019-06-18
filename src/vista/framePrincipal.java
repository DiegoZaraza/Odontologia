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
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuRegistro = new javax.swing.JMenu();
        jMenuItemRegistrarP = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        JmenuAsignaCita = new javax.swing.JMenuItem();
        jMenuModifiCita = new javax.swing.JMenuItem();
        jMenuCancelaCita = new javax.swing.JMenuItem();
        jMenuEditarAgenda = new javax.swing.JMenuItem();
        ItemCon = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        Jhisto = new javax.swing.JMenuItem();

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

        jButton1.setText("Imprimir Factura");

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

        jMenuEditarAgenda.setText("Editar Agenda");
        jMenuEditarAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEditarAgendaActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuEditarAgenda);

        ItemCon.setText("Consultar Paciente");
        ItemCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemConActionPerformed(evt);
            }
        });
        jMenu2.add(ItemCon);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Modulo Odontologos");

        Jhisto.setText("Historias Medicas");
        Jhisto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JhistoActionPerformed(evt);
            }
        });
        jMenu1.add(Jhisto);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(236, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
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

    private void jMenuEditarAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEditarAgendaActionPerformed
        llamarEditarAgenda();
        // new JInternalEditar().setVisible(true);

    }//GEN-LAST:event_jMenuEditarAgendaActionPerformed

    private void jMenuCancelaCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCancelaCitaActionPerformed
        llamarEliminarCita();
        new JframeEliminarCita().setVisible(true);


    }//GEN-LAST:event_jMenuCancelaCitaActionPerformed

    private void ItemConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemConActionPerformed
        consult();
        new VenConsultarPer().setVisible(true);
    }//GEN-LAST:event_ItemConActionPerformed

    private void JhistoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JhistoActionPerformed
        llamarHistoria();
    }//GEN-LAST:event_JhistoActionPerformed
    /* Create and display the form */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenuItem ItemCon;
    private javax.swing.JMenuItem Jhisto;
    private javax.swing.JMenuItem JmenuAsignaCita;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
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
    private javax.swing.JMenuItem jMenuEditarAgenda;
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
        new VenConsultarPer().setVisible(true);
    }

    public void llamarHistoria() {
        VenHistoria pro = new VenHistoria();
        pro.setVisible(true);
        jPanel1.add(pro);
    }
}
