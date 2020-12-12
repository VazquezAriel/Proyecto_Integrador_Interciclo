/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorUsuario;
import ec.edu.ups.modelo.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author ariel
 */
public class VentanaUsuario extends javax.swing.JFrame {

    private ControladorUsuario controladorUsuario;
    
    public VentanaUsuario(ControladorUsuario controladorUsuario) {
        initComponents();
        
        this.controladorUsuario = controladorUsuario;
    }
    
    public void restaurar() {
        jTextFieldNombre.setText("");
        jTextFieldApellido.setText("");
        jTextFieldDireccion.setText("");
        jTextFieldTelefono.setText("");
        jTextFieldEmail.setText("");
        jTextFieldUsuario.setText("");
        jTextFieldCotraseña.setText("");
        llenarDatos();
    }
    
    public boolean datosLlenos() {
        return !(jTextFieldNombre.getText().isEmpty() || jTextFieldApellido.getText().isEmpty() || jTextFieldDireccion.getText().isEmpty() || jTextFieldTelefono.getText().isEmpty()
                || jTextFieldEmail.getText().isEmpty() || jTextFieldUsuario.getText().isEmpty() || jTextFieldCotraseña.getText().isEmpty());
    }
    
    public void llenarDatos() {
        jLabelEditarUsuario.setText(controladorUsuario.getUsuarioLogeado().getNombre() + " " + controladorUsuario.getUsuarioLogeado().getApellido());
        jTextFieldNombre.setText(controladorUsuario.getUsuarioLogeado().getNombre());
        jTextFieldApellido.setText(controladorUsuario.getUsuarioLogeado().getApellido());
        jTextFieldDireccion.setText(controladorUsuario.getUsuarioLogeado().getDireccion());
        jTextFieldTelefono.setText(controladorUsuario.getUsuarioLogeado().getTelefono());
        jTextFieldEmail.setText(controladorUsuario.getUsuarioLogeado().getEmail());
        jTextFieldUsuario.setText(controladorUsuario.getUsuarioLogeado().getUsuario());
        jTextFieldCotraseña.setText(controladorUsuario.getUsuarioLogeado().getContraseña());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelEditarUsuario = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelApellido = new javax.swing.JLabel();
        jTextFieldApellido = new javax.swing.JTextField();
        jLabelDireccion = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jTextFieldDireccion = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelContraseña = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelUsuario = new javax.swing.JLabel();
        jButtonSalir = new javax.swing.JButton();
        jTextFieldCotraseña = new javax.swing.JTextField();
        jTextFieldUsuario = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();

        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(136, 173, 176));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/trabajador.png"))); // NOI18N

        jLabelEditarUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jLabelEditarUsuario.setFont(new java.awt.Font("Candara", 2, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabelEditarUsuario)
                .addContainerGap(373, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabelNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelNombre.setText("Nombres:");

        jTextFieldNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabelApellido.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelApellido.setText("Apellidos:");

        jTextFieldApellido.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabelDireccion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelDireccion.setText("Direccion:");

        jLabelTelefono.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelTelefono.setText("Telefono:");

        jTextFieldDireccion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldDireccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldTelefono.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabelEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelEmail.setText("Email:");

        jTextFieldEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabelContraseña.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelContraseña.setText("Contraseña:");

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 242, Short.MAX_VALUE)
        );

        jLabelUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelUsuario.setText("Usuario:");

        jButtonSalir.setBackground(new java.awt.Color(255, 102, 102));
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jTextFieldCotraseña.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldCotraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButtonGuardar.setBackground(new java.awt.Color(102, 255, 102));
        jButtonGuardar.setText("GuardarCambios");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNombre)
                    .addComponent(jLabelApellido)
                    .addComponent(jLabelDireccion)
                    .addComponent(jLabelTelefono)
                    .addComponent(jLabelEmail))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldNombre)
                    .addComponent(jTextFieldApellido)
                    .addComponent(jTextFieldDireccion)
                    .addComponent(jTextFieldEmail)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelContraseña)
                            .addComponent(jLabelUsuario))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCotraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonGuardar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNombre)
                            .addComponent(jLabelUsuario)
                            .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextFieldCotraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelContraseña))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelApellido)
                                .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDireccion)
                            .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        if (datosLlenos()) {
            Usuario usarioActualizado = new Usuario(jTextFieldUsuario.getText(),jTextFieldCotraseña.getText(), controladorUsuario.getUsuarioLogeado().getParqueadero(), controladorUsuario.getUsuarioLogeado().getId() ,jTextFieldNombre.getText(), jTextFieldApellido.getText(), jTextFieldDireccion.getText(), jTextFieldTelefono.getText(), jTextFieldEmail.getText());
            controladorUsuario.actualizar(usarioActualizado);
            controladorUsuario.setUsuarioLogueado(usarioActualizado);
            
            JOptionPane.showMessageDialog(this, "Datos Actualizados con exito");
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Porfavor rellene todos los campos");
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelContraseña;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelEditarUsuario;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldCotraseña;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
