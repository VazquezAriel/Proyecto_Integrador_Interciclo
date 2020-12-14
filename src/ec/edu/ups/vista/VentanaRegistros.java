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
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;

/**
 *
 * @author ariel
 */
public class VentanaRegistros extends javax.swing.JFrame {

    private final Color colorRentado = new Color(124, 158, 224);
    private final Color colorDisponible = new Color(124, 224, 142);
    private final Color colorOcupadoAutos = new Color(224, 133, 124);
    private final Color colorOcupadoMotos = new Color(246, 172, 45);

    private ControladorParqueadero controladorParqueadero;
    private VentanaNuevoRegistro ventanaNuevoRegistro;
    private VentanaRegistroSalida ventanaRegistroSalida;
    private ControladorVehiculo controladorVehiculo;

    public VentanaRegistros(ControladorParqueadero controladorParqueadero, VentanaNuevoRegistro ventanaNuevoRegistro, VentanaRegistroSalida ventanaRegistroSalida, ControladorVehiculo controladorVehiculo) {
        initComponents();

        this.ventanaNuevoRegistro = ventanaNuevoRegistro;
        this.controladorParqueadero = controladorParqueadero;
        this.ventanaRegistroSalida = ventanaRegistroSalida;
        this.controladorVehiculo = controladorVehiculo;
    }

    public void restaurar() {
        jTextNombre.setText("");
        jTextEstado.setText("");
        jTextVehiculo.setText("");
        jLabelCarros.setText(String.valueOf(controladorParqueadero.getParqueaderoActual().numeroDeVehiculosEstacionados()));
        jLabelMotos.setText(String.valueOf(controladorParqueadero.getParqueaderoActual().numeroDeMotocicletasEstacionadas()));
        jButtonRegistrarSalida.setEnabled(false);
        jButtonRegistrarEntrada.setEnabled(false);
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
                if (estacionamiento1.getEstado().equals("Disponible")) {
                    jButtonRegistrarEntrada.setEnabled(true);
                    jButtonRegistrarSalida.setEnabled(false);
                } else if (estacionamiento1.getEstado().equals("Ocupado")) {
                    jButtonRegistrarSalida.setEnabled(true);
                    jButtonRegistrarEntrada.setEnabled(false);
                } else if (estacionamiento1.getEstado().equals("Rentado")) {
                    jButtonRegistrarSalida.setEnabled(false);
                    jButtonRegistrarEntrada.setEnabled(false);
                }
                if (estacionamiento1.getVehiculo() != null) {
                    jTextVehiculo.setText(estacionamiento1.getVehiculo().getPlaca());
                } else {
                    jTextVehiculo.setText("");
                }

            };
            boton.addActionListener(accion);
            jPanelEstacionamientos.add(boton);
            jPanelEstacionamientos.updateUI();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelEstacionamientos = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextVehiculo = new javax.swing.JTextField();
        jButtonRegistrarEntrada = new javax.swing.JButton();
        jButtonRegistrarSalida = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextEstado = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabelCarros = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelMotos = new javax.swing.JLabel();

        jPanelEstacionamientos.setBackground(new java.awt.Color(0, 153, 153));
        jPanelEstacionamientos.setLayout(new java.awt.GridLayout(0, 7));

        jPanel2.setBackground(new java.awt.Color(136, 173, 176));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Vehiculo Estacionado:");

        jTextVehiculo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextVehiculo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextVehiculo.setEnabled(false);

        jButtonRegistrarEntrada.setBackground(new java.awt.Color(102, 255, 102));
        jButtonRegistrarEntrada.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonRegistrarEntrada.setText("Registrar Entrada");
        jButtonRegistrarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarEntradaActionPerformed(evt);
            }
        });

        jButtonRegistrarSalida.setBackground(new java.awt.Color(255, 102, 102));
        jButtonRegistrarSalida.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonRegistrarSalida.setText("Registrar Salida");
        jButtonRegistrarSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarSalidaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Estacionamiento Seleccionado:");

        jTextNombre.setEditable(false);
        jTextNombre.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jTextNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("Estado:");

        jTextEstado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextEstado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextEstado.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(135, 135, 135)
                        .addComponent(jTextEstado))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTextVehiculo))
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonRegistrarEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonRegistrarSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jButtonRegistrarEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonRegistrarSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(136, 173, 176));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carros.png"))); // NOI18N
        jLabel6.setText("jLabel6");

        jLabelCarros.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelCarros.setText("0");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/moto (1).png"))); // NOI18N
        jLabel7.setText("jLabel7");

        jLabelMotos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelMotos.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelCarros)
                .addGap(153, 153, 153)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelMotos)
                .addContainerGap(169, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCarros)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabelMotos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelEstacionamientos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelEstacionamientos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarEntradaActionPerformed
        ventanaNuevoRegistro.setVisible(true);
        ventanaNuevoRegistro.restaurar(jTextNombre.getText());
        ventanaNuevoRegistro.setVentanaRegistros(this);
    }//GEN-LAST:event_jButtonRegistrarEntradaActionPerformed

    private void jButtonRegistrarSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarSalidaActionPerformed
        ventanaRegistroSalida.setVisible(true);
        RegistroEstacionamiento registroEstacionamiento = controladorParqueadero.getParqueaderoActual().getRegistros().obtenerRegistroEscogido(jTextVehiculo.getText());
        ventanaRegistroSalida.setRegistroEstacionamiento(registroEstacionamiento);
        ventanaRegistroSalida.restaurar(registroEstacionamiento);
        ventanaRegistroSalida.setVehiculo(controladorVehiculo.obtenerCliente(jTextVehiculo.getText()));
        ventanaRegistroSalida.setVentanaRegistros(this);
    }//GEN-LAST:event_jButtonRegistrarSalidaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegistrarEntrada;
    private javax.swing.JButton jButtonRegistrarSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelCarros;
    private javax.swing.JLabel jLabelMotos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelEstacionamientos;
    private javax.swing.JTextField jTextEstado;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextVehiculo;
    // End of variables declaration//GEN-END:variables
}
