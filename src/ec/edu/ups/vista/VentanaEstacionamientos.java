/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorParqueadero;
import ec.edu.ups.modelo.Estacionamiento;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author ariel
 */
public class VentanaEstacionamientos extends javax.swing.JFrame {

    private ControladorParqueadero controladorParqueadero;
    private final Color colorRentado = new Color(124, 158, 224);
    private final Color colorDisponible = new Color(124, 224, 142);
    private final Color colorOcupadoAutos = new Color(224, 133, 124);
    private final Color colorOcupadoMotos = new Color(246, 172, 45);

    public VentanaEstacionamientos(ControladorParqueadero controladorParqueadero) {
        initComponents();

        this.controladorParqueadero = controladorParqueadero;
    }

    public void restaurar() {
        jTextNombre.setText("");
        jTextEstado.setText("");
        jTextVehiculo.setText("");
        jTextFCantidadParqueos.setText("");
        jTextFieldGanancias.setText("");
        jButtonEliminar.setEnabled(false);
        llenar(controladorParqueadero.getParqueaderoActual().getEstacionamientos());
    }

    public void llenar(List<Estacionamiento> estacionamientos) {
        jPanelEstacionamientos.removeAll();
        for (Estacionamiento estacionamiento : estacionamientos) {

            JButton boton = new JButton(estacionamiento.getNombre());

            if (estacionamiento.getEstado().equals("Disponible")) {
                boton.setBackground(colorDisponible);
            } else if (estacionamiento.getEstado().equals("Ocupado") && estacionamiento.getVehiculo().getTipo().equals("Vehiculo")) {
                boton.setBackground(colorOcupadoAutos);
                boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/coche (1).png")));
            } else if (estacionamiento.getEstado().equals("Ocupado") && estacionamiento.getVehiculo().getTipo().equals("Motocicleta")) {
                boton.setBackground(colorOcupadoMotos);
                boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/moto.png")));
            } else if (estacionamiento.getEstado().equals("Rentado")) {
                boton.setBackground(colorRentado);
                boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/coche.png")));
            }

            ActionListener accion = (ActionEvent e) -> {
                Estacionamiento estacionamiento1 = controladorParqueadero.getParqueaderoActual().buscarEstacionamiento(boton.getText());
                jTextNombre.setText(estacionamiento1.getNombre());
                jTextEstado.setText(estacionamiento1.getEstado());
                if (estacionamiento1.getVehiculo() != null) {
                    jTextVehiculo.setText(estacionamiento1.getVehiculo().getPlaca());
                } else {
                    jTextVehiculo.setText("");
                }
                jTextFCantidadParqueos.setText(String.valueOf(estacionamiento1.getCantidadParqueos()));
                jTextFieldGanancias.setText(String.valueOf(estacionamiento1.getDineroGenerado()));
                jButtonEliminar.setEnabled(true);

            };
            boton.addActionListener(accion);
            jPanelEstacionamientos.add(boton);
            jPanelEstacionamientos.updateUI();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanelEstacionamientos = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextEstado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextVehiculo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFCantidadParqueos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldGanancias = new javax.swing.JTextField();
        jButtonAgregar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        jPanelEstacionamientos.setBackground(new java.awt.Color(0, 153, 153));
        jPanelEstacionamientos.setLayout(new java.awt.GridLayout(0, 7));
        jScrollPane1.setViewportView(jPanelEstacionamientos);

        jPanel2.setBackground(new java.awt.Color(136, 173, 176));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Estado:");

        jTextEstado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextEstado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextEstado.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Vehiculo Estacionado:");

        jTextVehiculo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextVehiculo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextVehiculo.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Ganancias Generadas:");

        jTextFCantidadParqueos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFCantidadParqueos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFCantidadParqueos.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Cantidad de Parqueos:");

        jTextFieldGanancias.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldGanancias.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldGanancias.setEnabled(false);

        jButtonAgregar.setBackground(new java.awt.Color(102, 255, 102));
        jButtonAgregar.setText("Agregar Estacionamiento");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        jButtonEliminar.setBackground(new java.awt.Color(255, 102, 102));
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Estacionamiento Seleccionado:");

        jTextNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextNombre.setEnabled(false);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/garaje (2).png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAgregar)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 18, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFCantidadParqueos, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldGanancias, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(21, 21, 21))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel6)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFCantidadParqueos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldGanancias, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        
        if (controladorParqueadero.getParqueaderoActual().eliminarEstacionamiento(controladorParqueadero.getParqueaderoActual().buscarEstacionamiento(jTextNombre.getText()))) {
            JOptionPane.showMessageDialog(this, "Estacionamiento eliminado con exito");
            restaurar();
        } else {
            JOptionPane.showMessageDialog(this, "No puedes eliminar Este estacionamiento ya que esta siendo ocupado");
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        controladorParqueadero.getParqueaderoActual().agregarEstacionamiento();
        restaurar();
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelEstacionamientos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextEstado;
    private javax.swing.JTextField jTextFCantidadParqueos;
    private javax.swing.JTextField jTextFieldGanancias;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextVehiculo;
    // End of variables declaration//GEN-END:variables
}
