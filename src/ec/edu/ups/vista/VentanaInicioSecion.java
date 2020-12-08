/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorAdministrador;
import ec.edu.ups.controlador.ControladorUsuario;
import javax.swing.JOptionPane;

/**
 *
 * @author ariel
 */
public class VentanaInicioSecion extends javax.swing.JFrame {

    //Ventana
    VentanaNuevoAdministrador ventanaNuevoAdministrador;
    VentanaPrincipal ventanaPrincipal;

    //Controladores
    ControladorAdministrador controladorAdministrador;
    ControladorUsuario controladorUsuario;

    public VentanaInicioSecion() {
        initComponents();

        controladorAdministrador = new ControladorAdministrador();
        controladorUsuario = new ControladorUsuario();
        ventanaNuevoAdministrador = new VentanaNuevoAdministrador(controladorAdministrador);
        ventanaPrincipal = new VentanaPrincipal(this);
    }

    public void restaurar() {
        jTextFieldUsuario.setText("");
        jPassword.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelIniciarSecion = new javax.swing.JLabel();
        jLabelNombreDeUsuario = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabelContraseña = new javax.swing.JLabel();
        jButtonSalir = new javax.swing.JButton();
        jButtonIngresar = new javax.swing.JButton();
        jLabelTipoDeUsuario = new javax.swing.JLabel();
        jComboBoxTipoUsuario = new javax.swing.JComboBox<>();
        jPassword = new javax.swing.JPasswordField();
        jLabelParqueaderos = new javax.swing.JLabel();
        jLabelSistemaDe = new javax.swing.JLabel();
        jLabelImagen = new javax.swing.JLabel();
        jButtonNuevoAdmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(136, 173, 176));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabelIniciarSecion.setFont(new java.awt.Font("Candara", 3, 24)); // NOI18N
        jLabelIniciarSecion.setText("Iniciar Sesion:");

        jLabelNombreDeUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelNombreDeUsuario.setText("Nombre de Usuario:");

        jTextFieldUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabelContraseña.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelContraseña.setText("Contraseña:");

        jButtonSalir.setBackground(new java.awt.Color(255, 102, 102));
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jButtonIngresar.setBackground(new java.awt.Color(102, 255, 102));
        jButtonIngresar.setText("Ingresar");
        jButtonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresarActionPerformed(evt);
            }
        });

        jLabelTipoDeUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelTipoDeUsuario.setText("Tipo de Usuario:");

        jComboBoxTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Usuario Simple" }));
        jComboBoxTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoUsuarioActionPerformed(evt);
            }
        });

        jPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelIniciarSecion)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelNombreDeUsuario)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                            .addComponent(jButtonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabelContraseña)
                        .addComponent(jTextFieldUsuario)
                        .addComponent(jLabelTipoDeUsuario)
                        .addComponent(jComboBoxTipoUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabelIniciarSecion)
                .addGap(41, 41, 41)
                .addComponent(jLabelTipoDeUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabelNombreDeUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelContraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        jLabelParqueaderos.setBackground(new java.awt.Color(255, 255, 255));
        jLabelParqueaderos.setFont(new java.awt.Font("Candara", 2, 24)); // NOI18N
        jLabelParqueaderos.setText("Parqueaderos");

        jLabelSistemaDe.setBackground(new java.awt.Color(255, 255, 255));
        jLabelSistemaDe.setFont(new java.awt.Font("Candara", 2, 24)); // NOI18N
        jLabelSistemaDe.setText("Sistema de ");

        jLabelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/garaje (2).png"))); // NOI18N

        jButtonNuevoAdmin.setBackground(new java.awt.Color(0, 153, 204));
        jButtonNuevoAdmin.setText("Nuevo Administrador");
        jButtonNuevoAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabelSistemaDe))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabelImagen))
                                    .addComponent(jLabelParqueaderos))))
                        .addGap(0, 29, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonNuevoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabelSistemaDe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelParqueaderos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jButtonNuevoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNuevoAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoAdminActionPerformed
        ventanaNuevoAdministrador.restaurar();
        ventanaNuevoAdministrador.setVisible(true);
    }//GEN-LAST:event_jButtonNuevoAdminActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresarActionPerformed

        var tipoUsuario = jComboBoxTipoUsuario.getSelectedItem().toString();

        if (tipoUsuario.equals("Administrador")) {
            if (controladorAdministrador.validarAdministrador(jTextFieldUsuario.getText(), new String(jPassword.getPassword()))) {
                JOptionPane.showMessageDialog(this, "Bienvenido de nuevo " + controladorAdministrador.getAdministradorLogeado());
                ventanaPrincipal.setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Usuario o Contraseña incorrectos. Porfavor vuelva a intentarlo");
            }
            
        } else if (tipoUsuario.equals("Usuario Simple")) {
            if (controladorUsuario.validarUsuario(jTextFieldUsuario.getText(), new String(jPassword.getPassword()))) {
                JOptionPane.showMessageDialog(this, "Bienvenido de nuevo " + controladorUsuario.getUsuarioLogeado());
            } else {
                JOptionPane.showMessageDialog(this, "Usuario o Contraseña incorrectos. Porfavor vuelva a intentarlo");
            }
        }
        
        restaurar();
    }//GEN-LAST:event_jButtonIngresarActionPerformed

    private void jComboBoxTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoUsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaInicioSecion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInicioSecion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInicioSecion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInicioSecion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicioSecion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIngresar;
    private javax.swing.JButton jButtonNuevoAdmin;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JComboBox<String> jComboBoxTipoUsuario;
    private javax.swing.JLabel jLabelContraseña;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JLabel jLabelIniciarSecion;
    private javax.swing.JLabel jLabelNombreDeUsuario;
    private javax.swing.JLabel jLabelParqueaderos;
    private javax.swing.JLabel jLabelSistemaDe;
    private javax.swing.JLabel jLabelTipoDeUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
