/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.controlador.ControladorParqueadero;
import ec.edu.ups.controlador.ControladorVehiculo;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Estacionamiento;
import ec.edu.ups.modelo.RegistroEstacionamiento;
import ec.edu.ups.modelo.Vehiculo;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ariel
 */
public class VentanaRegistroSalida extends javax.swing.JFrame {

    private ControladorParqueadero controladorParqueadero;
    private VentanaNuevoCliente ventanaNuevoCliente;
    private ControladorCliente controladorCliente;
    private VentanaRegistros ventanaRegistros;
    private RegistroEstacionamiento registroEstacionamiento;
    private ControladorVehiculo controladorVehiculo;
    private Vehiculo vehiculo;

    public VentanaRegistroSalida(ControladorParqueadero controladorParqueadero, VentanaNuevoCliente ventanaNuevoCliente, ControladorCliente controladorCliente, ControladorVehiculo controladorVehiculo) {
        initComponents();

        this.controladorParqueadero = controladorParqueadero;
        this.ventanaNuevoCliente = ventanaNuevoCliente;
        this.controladorCliente = controladorCliente;
        this.controladorVehiculo = controladorVehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public JTextField getjTextFieldID() {
        return jTextFieldID;
    }

    public JTextField getjTextFieldNombreCliente() {
        return jTextFieldNombreCliente;
    }

    public JTextField getjTextFieldApellidoCliente() {
        return jTextFieldApellidoCliente;
    }

    public void setVentanaRegistros(VentanaRegistros ventanaRegistros) {
        this.ventanaRegistros = ventanaRegistros;
    }

    public void setRegistroEstacionamiento(RegistroEstacionamiento registroEstacionamiento) {
        this.registroEstacionamiento = registroEstacionamiento;
    }

    public void restaurar(RegistroEstacionamiento registro) {
        LocalTime horaSalida = LocalTime.now();
        
        jTextFieldNombreCliente.setText("");
        jTextFieldApellidoCliente.setText("");
        jTextFieldID.setText("");
        jTextFieldIDescuento.setText("0.0");
        jTextFieldHoraIngreso.setText(registro.getHoraEntrada().format(DateTimeFormatter.ISO_LOCAL_TIME));
        jTextFieldEstacionamiento.setText(registro.getEstacionamiento().getNombre());
        jTextFieldCedula.setText("");
        jTextFieldHoraSalida.setText(horaSalida.format(DateTimeFormatter.ISO_LOCAL_TIME));
        jTextFieldTiempoTranscurrido.setText(calcularTiempoTranscurrido(registro.getHoraEntrada(), horaSalida));
        jButtonGuardar.setEnabled(false);
    }
    
    public String calcularTiempoTranscurrido(LocalTime horaEntrada, LocalTime horaSalida) {
        double totalHorasEntrada = horaEntrada.getHour();
        
        double totalMinutosEntrada = horaEntrada.getMinute();
        totalMinutosEntrada = totalMinutosEntrada/60;
        
        double totalSegundosEntrada = horaEntrada.getSecond();
        totalSegundosEntrada= totalSegundosEntrada/3600;
        
        totalHorasEntrada = totalHorasEntrada + totalMinutosEntrada + totalSegundosEntrada;
        
        
        double totalHorasSalida = horaSalida.getHour();
        
        double totalMinutosSalida = horaSalida.getMinute();
        totalMinutosSalida = totalMinutosSalida/60;
        
        double totalSegundosSalida = horaSalida.getSecond();
        totalSegundosSalida= totalSegundosSalida/3600;
        
        totalHorasSalida = totalHorasSalida + totalMinutosSalida + totalSegundosSalida;
        
        double tiempoTranscurridoEnhoras = totalHorasSalida - totalHorasEntrada;
        
        return String.valueOf(String.format("%.3f", tiempoTranscurridoEnhoras));
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
        jTextFieldNombreCliente = new javax.swing.JTextField();
        jLabelColor = new javax.swing.JLabel();
        jLabelPLaca = new javax.swing.JLabel();
        jTextFieldCedula = new javax.swing.JTextField();
        jLabelID = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jLabelTipo = new javax.swing.JLabel();
        jTextFieldApellidoCliente = new javax.swing.JTextField();
        jTextFieldHoraIngreso = new javax.swing.JTextField();
        jTextFieldEstacionamiento = new javax.swing.JTextField();
        jButtonSalir = new javax.swing.JButton();
        jLabelFinDelContrato2 = new javax.swing.JLabel();
        jTextFieldHoraSalida = new javax.swing.JTextField();
        jLabelFinDelContrato3 = new javax.swing.JLabel();
        jTextFieldTiempoTranscurrido = new javax.swing.JTextField();
        jLabelDescuento = new javax.swing.JLabel();
        jTextFieldIDescuento = new javax.swing.JTextField();
        jLabelDescuento1 = new javax.swing.JLabel();
        jTextFieldTotal = new javax.swing.JTextField();
        jButtonCalcular = new javax.swing.JButton();

        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(136, 173, 176));

        jLabelNuevoParqueadero.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNuevoParqueadero.setFont(new java.awt.Font("Candara", 2, 24)); // NOI18N
        jLabelNuevoParqueadero.setText("Salida de Vehiculos");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelNuevoParqueadero)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        jLabelFinDelContrato1.setText("Fecha y Hora de ingreso:");

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "   Cliente    ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 0, 18))); // NOI18N

        jTextFieldNombreCliente.setEditable(false);
        jTextFieldNombreCliente.setBackground(new java.awt.Color(136, 173, 176));
        jTextFieldNombreCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldNombreCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabelColor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelColor.setText("Nombre");

        jLabelPLaca.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelPLaca.setText("Cedula");

        jTextFieldCedula.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldCedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);

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
        jLabelTipo.setText("Apellido");

        jTextFieldApellidoCliente.setEditable(false);
        jTextFieldApellidoCliente.setBackground(new java.awt.Color(136, 173, 176));
        jTextFieldApellidoCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldApellidoCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

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
                        .addComponent(jTextFieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(jTextFieldNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPLaca)
                    .addComponent(jTextFieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelColor)
                    .addComponent(jTextFieldNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipo)
                    .addComponent(jTextFieldApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        jLabelFinDelContrato2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelFinDelContrato2.setText("Fecha y Hora de Salida:");

        jTextFieldHoraSalida.setEditable(false);
        jTextFieldHoraSalida.setBackground(new java.awt.Color(136, 173, 176));
        jTextFieldHoraSalida.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldHoraSalida.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabelFinDelContrato3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelFinDelContrato3.setText("Tiempo transcurrido en Horas:");

        jTextFieldTiempoTranscurrido.setEditable(false);
        jTextFieldTiempoTranscurrido.setBackground(new java.awt.Color(136, 173, 176));
        jTextFieldTiempoTranscurrido.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldTiempoTranscurrido.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabelDescuento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelDescuento.setText("Descuento:");

        jTextFieldIDescuento.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldIDescuento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldIDescuento.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabelDescuento1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelDescuento1.setText("Total:");

        jTextFieldTotal.setEditable(false);
        jTextFieldTotal.setBackground(new java.awt.Color(136, 173, 176));
        jTextFieldTotal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButtonCalcular.setBackground(new java.awt.Color(255, 204, 51));
        jButtonCalcular.setText("Calcular");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldHoraIngreso)
                            .addComponent(jTextFieldHoraSalida)
                            .addComponent(jTextFieldTiempoTranscurrido)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNombre4)
                                    .addComponent(jLabelFinDelContrato1)
                                    .addComponent(jLabelCostoPorDia)
                                    .addComponent(jLabelFinDelContrato2)
                                    .addComponent(jLabelFinDelContrato3)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextFieldEstacionamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 80, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabelDescuento1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabelDescuento)
                                    .addGap(27, 27, 27)
                                    .addComponent(jTextFieldIDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDescuento)
                            .addComponent(jTextFieldIDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabelFinDelContrato1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldHoraIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCostoPorDia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldEstacionamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelFinDelContrato2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jLabelNombre4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelFinDelContrato3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTiempoTranscurrido, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDescuento1)
                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        if (!jTextFieldID.getText().isEmpty()) {
            registroEstacionamiento.setCostoTotal(Double.valueOf(jTextFieldTotal.getText()));
            registroEstacionamiento.setEstado("Finalizado");
            registroEstacionamiento.setHoraSalida(LocalTime.now());
            controladorParqueadero.getParqueaderoActual().getRegistros().actualizar(registroEstacionamiento);
            Estacionamiento estacionamiento = controladorParqueadero.getParqueaderoActual().buscarEstacionamiento(jTextFieldEstacionamiento.getText());
            estacionamiento.aumentarDineroGenerado(Double.valueOf(jTextFieldTotal.getText()));
            estacionamiento.setEstado("Disponible");
            estacionamiento.setVehiculo(null);
            controladorParqueadero.getParqueaderoActual().actualizarEstacionamiento(estacionamiento);
            vehiculo.setParqueado(false);
            controladorVehiculo.actualizar(vehiculo);
            ventanaRegistros.restaurar();
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Porfavor ingre un Cliente");
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        String cedula = jTextFieldCedula.getText();

        if (!cedula.isEmpty()) {
            Cliente clienteEncontrado = controladorCliente.obtenerCliente(cedula);
            if (clienteEncontrado == null) {
                if (JOptionPane.showConfirmDialog(this, "No existen datos con ese cliente decea registrar uno nuevo con esa Cedula", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    ventanaNuevoCliente.setVentanaRegistroSalida(this);
                    ventanaNuevoCliente.getjTextFieldCedula().setText(cedula);
                    ventanaNuevoCliente.setVisible(true);
                }

            } else {
                jTextFieldNombreCliente.setText(clienteEncontrado.getNombre());
                jTextFieldApellidoCliente.setText(clienteEncontrado.getApellido());
                jTextFieldID.setText(String.valueOf(clienteEncontrado.getId()));
            }

        } else {
            JOptionPane.showMessageDialog(this, "Porfavor ingrese la cedula del cliente");
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed
        jButtonGuardar.setEnabled(true);
        if (!jTextFieldIDescuento.getText().isEmpty()) {
            double valorTotal = Double.parseDouble(jTextFieldTiempoTranscurrido.getText()) * controladorParqueadero.getParqueaderoActual().getCostoPorHora();
            jTextFieldTotal.setText(String.format("%.3f", valorTotal));
        } else {
            JOptionPane.showMessageDialog(this, "Porfavor ingrese el descuesto");
        }
    }//GEN-LAST:event_jButtonCalcularActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelColor;
    private javax.swing.JLabel jLabelCostoPorDia;
    private javax.swing.JLabel jLabelDescuento;
    private javax.swing.JLabel jLabelDescuento1;
    private javax.swing.JLabel jLabelFinDelContrato1;
    private javax.swing.JLabel jLabelFinDelContrato2;
    private javax.swing.JLabel jLabelFinDelContrato3;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelNombre4;
    private javax.swing.JLabel jLabelNuevoParqueadero;
    private javax.swing.JLabel jLabelPLaca;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextFieldApellidoCliente;
    private javax.swing.JTextField jTextFieldCedula;
    private javax.swing.JTextField jTextFieldEstacionamiento;
    private javax.swing.JTextField jTextFieldHoraIngreso;
    private javax.swing.JTextField jTextFieldHoraSalida;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldIDescuento;
    private javax.swing.JTextField jTextFieldNombreCliente;
    private javax.swing.JTextField jTextFieldTiempoTranscurrido;
    private javax.swing.JTextField jTextFieldTotal;
    // End of variables declaration//GEN-END:variables
}
