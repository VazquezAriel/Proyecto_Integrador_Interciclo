/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorParqueadero;
import ec.edu.ups.modelo.Parqueadero;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ariel
 */
public class VentanaParqueaderos extends javax.swing.JFrame {

    ControladorParqueadero controladorParqueadero;
    
    public VentanaParqueaderos(ControladorParqueadero controladorParqueadero) {
        initComponents();
        
        this.controladorParqueadero = controladorParqueadero;
    }
    
    public void restaurar() {
        jTextFieldBusqueda.setText("");
        jTextFieldID.setText("");
        jTextFieldNombre.setText("");
        jTextFieldDireccion.setText("");
        jTextFieldCostoPorHora.setText("");
        jTextFieldNumeroEstacionamientos.setText("");
        habilitarEdicion(false);
        cargarDatos(controladorParqueadero.getListado());
    }
    
    public void habilitarEdicion(boolean condicion) {
        jTextFieldNombre.setEnabled(condicion);
        jTextFieldDireccion.setEnabled(condicion);
        jTextFieldCostoPorHora.setEnabled(condicion);
        jTextFieldNumeroEstacionamientos.setEnabled(condicion);
        jButtonGuardar.setEnabled(condicion);
        jButtonEliminar.setEnabled(condicion);
    }
    
    public boolean datosLlenos() {
        return !(jTextFieldNombre.getText().isEmpty() || jTextFieldDireccion.getText().isEmpty() || jTextFieldCostoPorHora.getText().isEmpty()
                || jTextFieldNumeroEstacionamientos.getText().isEmpty());
    }
    
    public Parqueadero getParqueaderoSeleccionado() {
        return  controladorParqueadero.buscar(new Parqueadero((int) jTableParqueaderos.getValueAt(jTableParqueaderos.getSelectedRow(), 0)));
    }
    
    public void cargarDatos(List<Parqueadero> listado) {
        DefaultTableModel modelo = (DefaultTableModel) jTableParqueaderos.getModel();
        modelo.setRowCount(0);
        
        for (Parqueadero p : listado) {
            Object[] rowData = {p.getId(), p.getNombre(), p.getDireccion(), p.getCostoPorHora(), p.getTotalEspacios()};
            modelo.addRow(rowData);
        }
        jTableParqueaderos.setModel(modelo);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelParqueaderos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableParqueaderos = new javax.swing.JTable();
        jTextFieldBusqueda = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jButtonMostrarTodo = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jLabelNombreBusqueda = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelDireccion = new javax.swing.JLabel();
        jTextFieldDireccion = new javax.swing.JTextField();
        jLabelCostoPorHora = new javax.swing.JLabel();
        jTextFieldCostoPorHora = new javax.swing.JTextField();
        jLabelNumeroEstacionamientos = new javax.swing.JLabel();
        jTextFieldNumeroEstacionamientos = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jLabelNombre1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelNombre2 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();

        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(136, 173, 176));

        jLabelParqueaderos.setBackground(new java.awt.Color(255, 255, 255));
        jLabelParqueaderos.setFont(new java.awt.Font("Candara", 2, 24)); // NOI18N
        jLabelParqueaderos.setText("Parqueaderos Disponibles");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cliente.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jTableParqueaderos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Direccion", "Costo por hora", "Estacionamientos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableParqueaderos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableParqueaderosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableParqueaderos);
        if (jTableParqueaderos.getColumnModel().getColumnCount() > 0) {
            jTableParqueaderos.getColumnModel().getColumn(0).setMinWidth(50);
            jTableParqueaderos.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTableParqueaderos.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        jTextFieldBusqueda.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldBusqueda.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButtonBuscar.setBackground(new java.awt.Color(255, 255, 102));
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jButtonMostrarTodo.setBackground(new java.awt.Color(51, 153, 255));
        jButtonMostrarTodo.setText("Mostrar Todo");
        jButtonMostrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarTodoActionPerformed(evt);
            }
        });

        jButtonSalir.setBackground(new java.awt.Color(255, 102, 102));
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jLabelNombreBusqueda.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelNombreBusqueda.setText("Nombre:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabelNombreBusqueda)
                                    .addGap(10, 10, 10)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelParqueaderos)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jTextFieldBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonSalir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonMostrarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(82, 82, 82))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelParqueaderos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombreBusqueda)
                    .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMostrarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabelNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelNombre.setText("Nombre:");

        jTextFieldNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabelDireccion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelDireccion.setText("Direccion:");

        jTextFieldDireccion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldDireccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabelCostoPorHora.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelCostoPorHora.setText("Costo por hora:");

        jTextFieldCostoPorHora.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldCostoPorHora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCostoPorHora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCostoPorHoraKeyTyped(evt);
            }
        });

        jLabelNumeroEstacionamientos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelNumeroEstacionamientos.setText("Numero de Estacionamientos:");

        jTextFieldNumeroEstacionamientos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldNumeroEstacionamientos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNumeroEstacionamientos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNumeroEstacionamientosKeyTyped(evt);
            }
        });

        jButtonGuardar.setBackground(new java.awt.Color(102, 255, 102));
        jButtonGuardar.setText("Guardar Cambios");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonEliminar.setBackground(new java.awt.Color(255, 102, 102));
        jButtonEliminar.setText("Eliminar Parqueadero");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jLabelNombre1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelNombre1.setText("$");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aparcamiento.png"))); // NOI18N

        jLabelNombre2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelNombre2.setText("ID:");

        jTextFieldID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldID.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelNumeroEstacionamientos)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldNumeroEstacionamientos, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCostoPorHora)
                                    .addComponent(jLabelDireccion)
                                    .addComponent(jLabelNombre)
                                    .addComponent(jLabelNombre2)
                                    .addComponent(jButtonEliminar))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(40, 40, 40)
                                            .addComponent(jButtonGuardar))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jTextFieldDireccion)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(jTextFieldCostoPorHora, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jLabelNombre1)))
                                            .addGap(10, 10, 10)))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextFieldID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.Alignment.LEADING))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNombre2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDireccion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCostoPorHora)
                    .addComponent(jTextFieldCostoPorHora, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombre1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNumeroEstacionamientos, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldNumeroEstacionamientos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTableParqueaderosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableParqueaderosMouseClicked
        Parqueadero parqueaderoSeleccionado = getParqueaderoSeleccionado();
        jTextFieldID.setText(String.valueOf(parqueaderoSeleccionado.getId()));
        jTextFieldNombre.setText(parqueaderoSeleccionado.getNombre());
        jTextFieldDireccion.setText(parqueaderoSeleccionado.getDireccion());
        jTextFieldCostoPorHora.setText(String.valueOf(parqueaderoSeleccionado.getCostoPorHora()));
        jTextFieldNumeroEstacionamientos.setText(String.valueOf(parqueaderoSeleccionado.getTotalEspacios()));
        habilitarEdicion(true);
    }//GEN-LAST:event_jTableParqueaderosMouseClicked

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        if (!jTextFieldBusqueda.getText().isEmpty()) {
            cargarDatos(controladorParqueadero.buscarPorNombre(jTextFieldBusqueda.getText()));
        } else {
            JOptionPane.showMessageDialog(this, "Porfavor ingrese el nombre del parqueadero que decea buscar");
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonMostrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarTodoActionPerformed
        cargarDatos(controladorParqueadero.getListado());
        restaurar();
    }//GEN-LAST:event_jButtonMostrarTodoActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jTextFieldCostoPorHoraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCostoPorHoraKeyTyped
        char caracterIngresado = evt.getKeyChar();
        if (!Character.isDigit(caracterIngresado) && caracterIngresado != '.') {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldCostoPorHoraKeyTyped

    private void jTextFieldNumeroEstacionamientosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNumeroEstacionamientosKeyTyped
        char caracterIngresado = evt.getKeyChar();
        if (!Character.isDigit(caracterIngresado)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldNumeroEstacionamientosKeyTyped

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        if (datosLlenos()) {
            controladorParqueadero.actualizar(new Parqueadero(Integer.parseInt(jTextFieldID.getText()), jTextFieldNombre.getText(), jTextFieldDireccion.getText(), Double.parseDouble(jTextFieldCostoPorHora.getText()), Integer.parseInt(jTextFieldNumeroEstacionamientos.getText())));
            
            JOptionPane.showMessageDialog(this, "Parqueadero Acualizado con exito");
            restaurar();
        } else {
            JOptionPane.showMessageDialog(this, "Porfavor rellene todos los campos");
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Esta seguro que decea eliminar el cliente seleccionado", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
            controladorParqueadero.eliminar(getParqueaderoSeleccionado()); 
            restaurar();
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonMostrarTodo;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCostoPorHora;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNombre1;
    private javax.swing.JLabel jLabelNombre2;
    private javax.swing.JLabel jLabelNombreBusqueda;
    private javax.swing.JLabel jLabelNumeroEstacionamientos;
    private javax.swing.JLabel jLabelParqueaderos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableParqueaderos;
    private javax.swing.JTextField jTextFieldBusqueda;
    private javax.swing.JTextField jTextFieldCostoPorHora;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldNumeroEstacionamientos;
    // End of variables declaration//GEN-END:variables
}
