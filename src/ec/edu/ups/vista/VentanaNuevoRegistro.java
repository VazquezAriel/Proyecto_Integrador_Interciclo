/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorParqueadero;
import ec.edu.ups.controlador.ControladorVehiculo;
import ec.edu.ups.modelo.Estacionamiento;
import ec.edu.ups.modelo.RegistroEstacionamiento;
import ec.edu.ups.modelo.Vehiculo;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ariel
 */
public class VentanaNuevoRegistro extends javax.swing.JFrame {

    private ControladorParqueadero controladorParqueadero;
    private ControladorVehiculo controladorVehiculo;
    private VentanaNuevoVehiculo ventanaNuevoVehiculo;
    private VentanaRegistros ventanaRegistros;

    public VentanaNuevoRegistro(ControladorParqueadero controladorParqueadero, ControladorVehiculo controladorVehiculo, VentanaNuevoVehiculo ventanaNuevoVehiculo) {
        initComponents();

        this.controladorParqueadero = controladorParqueadero;
        this.controladorVehiculo = controladorVehiculo;
        this.ventanaNuevoVehiculo = ventanaNuevoVehiculo;
    }

    public JTextField getjTextFieldColor() {
        return jTextFieldColor;
    }

    public JTextField getjTextFieldID() {
        return jTextFieldID;
    }

    public JTextField getjTextFieldPlaca() {
        return jTextFieldPlaca;
    }

    public JTextField getjTextFieldTipo() {
        return jTextFieldTipo;
    }

    public void restaurar(String estacionamiento) {
        LocalDateTime fechaActual = LocalDateTime.now();
        jTextFieldColor.setText("");
        jTextFieldEstacionamiento.setText(estacionamiento);
        jTextFieldHoraIngreso.setText(fechaActual.format(DateTimeFormatter.ISO_DATE) + " / " + fechaActual.format(DateTimeFormatter.ISO_TIME));
        jTextFieldID.setText("");
        jTextFieldPlaca.setText("");
        jTextFieldTipo.setText("");
    }

    public void setVentanaRegistros(VentanaRegistros ventanaRegistros) {
        this.ventanaRegistros = ventanaRegistros;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelNuevoParqueadero = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelNombre4 = new javax.swing.JLabel();
        jLabelCostoPorDia = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();
        jLabelFinDelContrato1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTextFieldColor = new javax.swing.JTextField();
        jLabelColor = new javax.swing.JLabel();
        jLabelPLaca = new javax.swing.JLabel();
        jTextFieldPlaca = new javax.swing.JTextField();
        jLabelID = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jLabelTipo = new javax.swing.JLabel();
        jTextFieldTipo = new javax.swing.JTextField();
        jTextFieldHoraIngreso = new javax.swing.JTextField();
        jTextFieldEstacionamiento = new javax.swing.JTextField();
        jButtonSalir = new javax.swing.JButton();

        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(136, 173, 176));

        jLabelNuevoParqueadero.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNuevoParqueadero.setFont(new java.awt.Font("Candara", 2, 24)); // NOI18N
        jLabelNuevoParqueadero.setText("Nuevo Registro");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelNuevoParqueadero)
                .addContainerGap(187, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNuevoParqueadero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabelNombre4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabelCostoPorDia.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelCostoPorDia.setText("Estacionamiento Asignado:");

        jButtonGuardar.setBackground(new java.awt.Color(102, 255, 102));
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jLabelFinDelContrato1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelFinDelContrato1.setText("Hora de ingreso:");

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "   Vehiculo      ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 0, 18))); // NOI18N

        jTextFieldColor.setEditable(false);
        jTextFieldColor.setBackground(new java.awt.Color(136, 173, 176));
        jTextFieldColor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldColor.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabelColor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelColor.setText("Color");

        jLabelPLaca.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelPLaca.setText("Placa");

        jTextFieldPlaca.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldPlaca.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabelID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelID.setText("ID:");

        jTextFieldID.setEditable(false);
        jTextFieldID.setBackground(new java.awt.Color(136, 173, 176));
        jTextFieldID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldID.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButtonBuscar.setBackground(new java.awt.Color(0, 153, 204));
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jLabelTipo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelTipo.setText("Tipo");

        jTextFieldTipo.setEditable(false);
        jTextFieldTipo.setBackground(new java.awt.Color(136, 173, 176));
        jTextFieldTipo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldTipo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabelPLaca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelColor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelID)
                                .addComponent(jLabelTipo)))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonBuscar))
                            .addComponent(jTextFieldColor, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPLaca)
                    .addComponent(jTextFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelColor)
                    .addComponent(jTextFieldColor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipo)
                    .addComponent(jTextFieldTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelID)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTextFieldHoraIngreso.setEditable(false);
        jTextFieldHoraIngreso.setBackground(new java.awt.Color(136, 173, 176));
        jTextFieldHoraIngreso.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldHoraIngreso.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldEstacionamiento.setEditable(false);
        jTextFieldEstacionamiento.setBackground(new java.awt.Color(136, 173, 176));
        jTextFieldEstacionamiento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldEstacionamiento.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButtonSalir.setBackground(new java.awt.Color(255, 102, 102));
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldHoraIngreso)
                    .addComponent(jTextFieldEstacionamiento)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombre4)
                            .addComponent(jLabelFinDelContrato1)
                            .addComponent(jLabelCostoPorDia))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabelFinDelContrato1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldHoraIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabelCostoPorDia)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldEstacionamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabelNombre4)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        if (!jTextFieldID.getText().isEmpty()) {
            Vehiculo vehiculo = controladorVehiculo.buscar(new Vehiculo(Integer.valueOf(jTextFieldID.getText())));
            vehiculo.setParqueado(true);
            Estacionamiento estacionamiento = controladorParqueadero.getParqueaderoActual().buscarEstacionamiento(jTextFieldEstacionamiento.getText());
            
            estacionamiento.aumentarCantidadParqueos();
            estacionamiento.setEstado("Ocupado");
            estacionamiento.setVehiculo(vehiculo);
            
            RegistroEstacionamiento registro = new RegistroEstacionamiento(controladorParqueadero.getParqueaderoActual().getRegistros().generarId(), LocalTime.now(), vehiculo, estacionamiento);
        
            controladorParqueadero.getParqueaderoActual().getRegistros().crear(registro);
            controladorParqueadero.getParqueaderoActual().actualizarEstacionamiento(estacionamiento);
            controladorVehiculo.actualizar(vehiculo);
            ventanaRegistros.restaurar();
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Porfavor ingre un Vehiculo");
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        String placa = jTextFieldPlaca.getText();

        if (!placa.isEmpty()) {
            Vehiculo vehiculoEncontrado = controladorVehiculo.obtenerCliente(placa);

            if (vehiculoEncontrado == null) {
                
                if (JOptionPane.showConfirmDialog(this, "No existen datos con esa placa decea registrar un nuevo Vehiculo con esa Placa", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    ventanaNuevoVehiculo.setVentanaNuevoRegistro(this);
                    ventanaNuevoVehiculo.getjTextFieldPlaca().setText(placa);
                    ventanaNuevoVehiculo.setVisible(true);
                }

            } else if (vehiculoEncontrado.isParqueado()){
                
                JOptionPane.showMessageDialog(this, "este vehiculo ya se encuentra parqueado");
                
            } else {
                jTextFieldColor.setText(vehiculoEncontrado.getColor());
                jTextFieldTipo.setText(vehiculoEncontrado.getTipo());
                jTextFieldID.setText(String.valueOf(vehiculoEncontrado.getId()));
            }

        } else {
            JOptionPane.showMessageDialog(this, "Porfavor ingrese la placa del vehiculo");
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelColor;
    private javax.swing.JLabel jLabelCostoPorDia;
    private javax.swing.JLabel jLabelFinDelContrato1;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelNombre4;
    private javax.swing.JLabel jLabelNuevoParqueadero;
    private javax.swing.JLabel jLabelPLaca;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextFieldColor;
    private javax.swing.JTextField jTextFieldEstacionamiento;
    private javax.swing.JTextField jTextFieldHoraIngreso;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldPlaca;
    private javax.swing.JTextField jTextFieldTipo;
    // End of variables declaration//GEN-END:variables
}
