/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.controlador.ControladorParqueadero;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Contrato;
import ec.edu.ups.modelo.Estacionamiento;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ariel
 */
public class VentanaNuevoContrato extends javax.swing.JFrame {

    private ControladorParqueadero controladorParqueadero;
    private ControladorCliente controladorCliente;
    private VentanaNuevoCliente ventanaNuevoCliente;

    public VentanaNuevoContrato(ControladorParqueadero controladorParqueadero, ControladorCliente controladorCliente, VentanaNuevoCliente ventanaNuevoCliente) {
        initComponents();

        this.controladorParqueadero = controladorParqueadero;
        this.controladorCliente = controladorCliente;
        this.ventanaNuevoCliente = ventanaNuevoCliente;
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

    public void restaurar() {
        jTextFieldNombreCliente.setText("");
        jTextFieldApellidoCliente.setText("");
        jTextFieldID.setText("");
        jTextFieldCedula.setText("");
        jTextFieldDiasContrato.setText("");
        jTextFieldCostoDia.setText("");
        jTextFieldFinContrato.setText("");
        jTextFieldDescuento.setText("0.0");
        jTextFieldValorTotal.setText("");
        jButtonGuardar.setEnabled(false);
        llenarComboBox(controladorParqueadero.getParqueaderoActual().getEstacionamientosDisponibles());
        jDateInicioContrato.setCalendar(Calendar.getInstance());
    }

    public void llenarComboBox(List<Estacionamiento> estacionamientos) {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(estacionamientos.toArray());
        jComboBoxEstacionamientos.setModel(modelo);
    }

    public boolean datosLlenos() {
        return !(jTextFieldNombreCliente.getText().isEmpty() || jTextFieldID.getText().isEmpty() || jTextFieldCedula.getText().isEmpty() || jTextFieldDiasContrato.getText().isEmpty()
                || jTextFieldCostoDia.getText().isEmpty() || jTextFieldDescuento.getText().isEmpty());
    }

    public LocalDate getFechaSeleccionada() {
        Calendar fechaSeleccionada = jDateInicioContrato.getCalendar();
        return LocalDate.of(fechaSeleccionada.get(Calendar.YEAR), fechaSeleccionada.get(Calendar.MONTH) + 1, fechaSeleccionada.get(Calendar.DAY_OF_MONTH));
    }

    public LocalDate calcularFechaFinContrato() {
        return getFechaSeleccionada().plusDays(Integer.valueOf(jTextFieldDiasContrato.getText()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelNuevoParqueadero = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelDiasDeContrato = new javax.swing.JLabel();
        jLabelValorAPagar = new javax.swing.JLabel();
        jTextFieldDiasContrato = new javax.swing.JTextField();
        jTextFieldValorTotal = new javax.swing.JTextField();
        jLabelNombre4 = new javax.swing.JLabel();
        jLabelFinDelContrato = new javax.swing.JLabel();
        jTextFieldFinContrato = new javax.swing.JTextField();
        jLabelCostoPorDia = new javax.swing.JLabel();
        jTextFieldCostoDia = new javax.swing.JTextField();
        jLabelDescuento = new javax.swing.JLabel();
        jTextFieldDescuento = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        jLabelNombre8 = new javax.swing.JLabel();
        jButtonCalcular = new javax.swing.JButton();
        jLabelNombre9 = new javax.swing.JLabel();
        jLabelFinDelContrato1 = new javax.swing.JLabel();
        jDateInicioContrato = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jTextFieldNombreCliente = new javax.swing.JTextField();
        jLabelNombreCliente = new javax.swing.JLabel();
        jLabelCedula = new javax.swing.JLabel();
        jTextFieldCedula = new javax.swing.JTextField();
        jLabelID = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jLabelApellidoCliente = new javax.swing.JLabel();
        jTextFieldApellidoCliente = new javax.swing.JTextField();
        jLabelAsignarEstacionamiento = new javax.swing.JLabel();
        jComboBoxEstacionamientos = new javax.swing.JComboBox<>();

        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(136, 173, 176));

        jLabelNuevoParqueadero.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNuevoParqueadero.setFont(new java.awt.Font("Candara", 2, 24)); // NOI18N
        jLabelNuevoParqueadero.setText("Nuevo Contrato");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aparcamiento.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNuevoParqueadero)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabelNuevoParqueadero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabelDiasDeContrato.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelDiasDeContrato.setText("Dias de Contrato:");

        jLabelValorAPagar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelValorAPagar.setText("Valor Total a pagar:");

        jTextFieldDiasContrato.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldDiasContrato.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldDiasContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDiasContratoActionPerformed(evt);
            }
        });
        jTextFieldDiasContrato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDiasContratoKeyTyped(evt);
            }
        });

        jTextFieldValorTotal.setEditable(false);
        jTextFieldValorTotal.setBackground(new java.awt.Color(136, 173, 176));
        jTextFieldValorTotal.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldValorTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabelNombre4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabelFinDelContrato.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelFinDelContrato.setText("Fin del Contrato:");

        jTextFieldFinContrato.setEditable(false);
        jTextFieldFinContrato.setBackground(new java.awt.Color(136, 173, 176));
        jTextFieldFinContrato.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldFinContrato.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabelCostoPorDia.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelCostoPorDia.setText("Costo por dia:");

        jTextFieldCostoDia.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldCostoDia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCostoDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCostoDiaActionPerformed(evt);
            }
        });
        jTextFieldCostoDia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCostoDiaKeyTyped(evt);
            }
        });

        jLabelDescuento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelDescuento.setText("Descuento");

        jTextFieldDescuento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldDescuento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDescuentoActionPerformed(evt);
            }
        });
        jTextFieldDescuento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDescuentoKeyTyped(evt);
            }
        });

        jButtonGuardar.setBackground(new java.awt.Color(102, 255, 102));
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jLabelNombre8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelNombre8.setText("%");

        jButtonCalcular.setBackground(new java.awt.Color(255, 153, 0));
        jButtonCalcular.setText("Calcular Costo");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });

        jLabelNombre9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelNombre9.setText("$");

        jLabelFinDelContrato1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelFinDelContrato1.setText("Inicio del Contrato:");

        jDateInicioContrato.setDateFormatString("yyyy-MM-dd");
        jDateInicioContrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateInicioContratoMouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "   Cliente   ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 0, 18))); // NOI18N

        jTextFieldNombreCliente.setEditable(false);
        jTextFieldNombreCliente.setBackground(new java.awt.Color(136, 173, 176));
        jTextFieldNombreCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldNombreCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabelNombreCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelNombreCliente.setText("Nombre:");

        jLabelCedula.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelCedula.setText("Cedula:");

        jTextFieldCedula.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldCedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCedulaActionPerformed(evt);
            }
        });

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

        jLabelApellidoCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelApellidoCliente.setText("Apellido:");

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
                        .addComponent(jLabelID)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonBuscar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabelCedula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldCedula))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelNombreCliente)
                            .addComponent(jLabelApellidoCliente, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jTextFieldApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCedula)
                    .addComponent(jTextFieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombreCliente)
                    .addComponent(jTextFieldNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelApellidoCliente)
                    .addComponent(jTextFieldApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelID)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabelAsignarEstacionamiento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelAsignarEstacionamiento.setText("Asignar Estacionamiento:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabelNombre4)
                                .addGap(125, 125, 125))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelFinDelContrato)
                                            .addComponent(jLabelCostoPorDia)
                                            .addComponent(jLabelDiasDeContrato)
                                            .addComponent(jLabelFinDelContrato1))
                                        .addGap(31, 31, 31)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldDiasContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDateInicioContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldCostoDia, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldFinContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabelAsignarEstacionamiento)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBoxEstacionamientos, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)))
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelDescuento)
                            .addComponent(jLabelValorAPagar))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextFieldDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelNombre8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextFieldValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelNombre9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)))
                        .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateInicioContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelFinDelContrato1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDiasDeContrato)
                            .addComponent(jTextFieldDiasContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCostoDia, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCostoPorDia))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldFinContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelFinDelContrato))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelNombre4)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAsignarEstacionamiento)
                            .addComponent(jComboBoxEstacionamientos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelDescuento)
                                    .addComponent(jTextFieldDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelNombre8)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelNombre9)
                                .addComponent(jLabelValorAPagar)))
                        .addGap(37, 37, 37))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(36, Short.MAX_VALUE))))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        String cedula = jTextFieldCedula.getText();

        if (!cedula.isEmpty()) {
            Cliente clienteEncontrado = controladorCliente.obtenerCliente(cedula);
            if (clienteEncontrado == null) {
                if (JOptionPane.showConfirmDialog(this, "No existen datos con ese cliente decea registrar uno nuevo con esa Cedula", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    ventanaNuevoCliente.setVentanaNuevoContrato(this);
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

    private void jTextFieldCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCedulaActionPerformed
        jButtonGuardar.setEnabled(false);
    }//GEN-LAST:event_jTextFieldCedulaActionPerformed

    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed

        if (datosLlenos()) {
            jButtonGuardar.setEnabled(true);
            int diasContrato = Integer.parseInt(jTextFieldDiasContrato.getText());
            double costoDia = Double.parseDouble(jTextFieldCostoDia.getText());
            double descuento = Double.parseDouble(jTextFieldDescuento.getText());
            double valorAPagar = (diasContrato * costoDia) * ((100 - descuento) / 100);

            jTextFieldFinContrato.setText(calcularFechaFinContrato().toString());
            jTextFieldValorTotal.setText(String.format("%.3f", valorAPagar));

        } else {
            JOptionPane.showMessageDialog(this, "Porfavor rellene todos los datos");
        }
    }//GEN-LAST:event_jButtonCalcularActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed

        Estacionamiento estacionamientoEscogido = (Estacionamiento) jComboBoxEstacionamientos.getSelectedItem();

        int diasContrato = Integer.parseInt(jTextFieldDiasContrato.getText());
        double costoDia = Double.parseDouble(jTextFieldCostoDia.getText());
        double descuento = Double.parseDouble(jTextFieldDescuento.getText());
        double valorAPagar = Double.parseDouble(jTextFieldValorTotal.getText());

        if (descuento != 100) {
            descuento = (valorAPagar / (1 - (descuento / 100))) - valorAPagar;
        } else {
            descuento = valorAPagar;
        }

        estacionamientoEscogido.aumentarCantidadParqueos();
        estacionamientoEscogido.setEstado("Rentado");

        Contrato contratoNuevo = new Contrato(controladorParqueadero.getParqueaderoActual().getContratos().generarId(), controladorCliente.buscar(new Cliente(Integer.valueOf(jTextFieldID.getText()))),
                diasContrato, descuento, Double.parseDouble(jTextFieldValorTotal.getText()), getFechaSeleccionada(), calcularFechaFinContrato(), estacionamientoEscogido);

        controladorParqueadero.getParqueaderoActual().getContratos().crear(contratoNuevo);
        controladorParqueadero.getParqueaderoActual().actualizarEstacionamiento(estacionamientoEscogido);

        JOptionPane.showMessageDialog(this, "Contrato Registrado con exito");
        this.setVisible(false);
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jTextFieldDescuentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDescuentoKeyTyped
        char caracterIngresado = evt.getKeyChar();
        if (!Character.isDigit(caracterIngresado) && caracterIngresado != '.') {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldDescuentoKeyTyped

    private void jTextFieldDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescuentoActionPerformed
        jButtonGuardar.setEnabled(false);
    }//GEN-LAST:event_jTextFieldDescuentoActionPerformed

    private void jTextFieldCostoDiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCostoDiaKeyTyped
        char caracterIngresado = evt.getKeyChar();
        if (!Character.isDigit(caracterIngresado) && caracterIngresado != '.') {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldCostoDiaKeyTyped

    private void jTextFieldCostoDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCostoDiaActionPerformed
        jButtonGuardar.setEnabled(false);
    }//GEN-LAST:event_jTextFieldCostoDiaActionPerformed

    private void jTextFieldDiasContratoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDiasContratoKeyTyped
        char caracterIngresado = evt.getKeyChar();
        if (!Character.isDigit(caracterIngresado)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldDiasContratoKeyTyped

    private void jTextFieldDiasContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDiasContratoActionPerformed
        jButtonGuardar.setEnabled(false);
    }//GEN-LAST:event_jTextFieldDiasContratoActionPerformed

    private void jDateInicioContratoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateInicioContratoMouseClicked
        jButtonGuardar.setEnabled(false);
    }//GEN-LAST:event_jDateInicioContratoMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JComboBox<String> jComboBoxEstacionamientos;
    private com.toedter.calendar.JDateChooser jDateInicioContrato;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelApellidoCliente;
    private javax.swing.JLabel jLabelAsignarEstacionamiento;
    private javax.swing.JLabel jLabelCedula;
    private javax.swing.JLabel jLabelCostoPorDia;
    private javax.swing.JLabel jLabelDescuento;
    private javax.swing.JLabel jLabelDiasDeContrato;
    private javax.swing.JLabel jLabelFinDelContrato;
    private javax.swing.JLabel jLabelFinDelContrato1;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelNombre4;
    private javax.swing.JLabel jLabelNombre8;
    private javax.swing.JLabel jLabelNombre9;
    private javax.swing.JLabel jLabelNombreCliente;
    private javax.swing.JLabel jLabelNuevoParqueadero;
    private javax.swing.JLabel jLabelValorAPagar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextFieldApellidoCliente;
    private javax.swing.JTextField jTextFieldCedula;
    private javax.swing.JTextField jTextFieldCostoDia;
    private javax.swing.JTextField jTextFieldDescuento;
    private javax.swing.JTextField jTextFieldDiasContrato;
    private javax.swing.JTextField jTextFieldFinContrato;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNombreCliente;
    private javax.swing.JTextField jTextFieldValorTotal;
    // End of variables declaration//GEN-END:variables
}
