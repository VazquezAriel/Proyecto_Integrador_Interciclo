/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.modelo.Cliente;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ariel
 */
public class VentanaClientes extends javax.swing.JFrame {

    private ControladorCliente controladorCliente;
    
    public VentanaClientes(ControladorCliente controladorCliente) {
        initComponents();
        
        this.controladorCliente = controladorCliente;
    }
    
    public void restaurar() {
        jTextFieldBusqueda.setText("");
        jTextFieldID.setText("");
        jTextFieldNombre.setText("");
        jTextFieldApellido.setText("");
        jTextFieldCedula.setText("");
        jTextFieldDireccion.setText("");
        jTextFieldTelefono.setText("");
        jTextFieldEmail.setText("");
        jComboBoxBusqueda.setSelectedIndex(0);
        habilitarEdicion(false);
        cargarDatos(controladorCliente.getListado());
    }
    
    public void habilitarEdicion(boolean condicion) {
        jTextFieldNombre.setEnabled(condicion);
        jTextFieldApellido.setEnabled(condicion);
        jTextFieldCedula.setEnabled(condicion);
        jTextFieldDireccion.setEnabled(condicion);
        jTextFieldTelefono.setEnabled(condicion);
        jTextFieldEmail.setEnabled(condicion);
        jButtonGuardar.setEnabled(condicion);
        jButtonEliminar.setEnabled(condicion);
    }
    
    public boolean datosLlenos() {
        return !(jTextFieldNombre.getText().isEmpty() || jTextFieldApellido.getText().isEmpty() || jTextFieldDireccion.getText().isEmpty() || jTextFieldTelefono.getText().isEmpty()
                || jTextFieldEmail.getText().isEmpty() || jTextFieldCedula.getText().isEmpty());
    }
    
    public Cliente getClienteSeleccionado() {
        return  controladorCliente.buscar(new Cliente((int) jTableClientes.getValueAt(jTableClientes.getSelectedRow(), 0)));
    }
    
    public void cargarDatos(List<Cliente> listado) {
        DefaultTableModel modelo = (DefaultTableModel) jTableClientes.getModel();
        modelo.setRowCount(0);
        
        for (Cliente c : listado) {
            Object[] rowData = {c.getId(), c.getNombre(), c.getApellido(), c.getCedula()};
            modelo.addRow(rowData);
        }
        jTableClientes.setModel(modelo);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jButtonGuardar = new javax.swing.JButton();
        jLabelCedula = new javax.swing.JLabel();
        jTextFieldCedula = new javax.swing.JTextField();
        jButtonEliminar = new javax.swing.JButton();
        jLabelNombre1 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabelNuevoParqueadero = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jTextFieldBusqueda = new javax.swing.JTextField();
        jComboBoxBusqueda = new javax.swing.JComboBox<>();
        jButtonBuscar = new javax.swing.JButton();
        jButtonMostrarTodo = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();

        setResizable(false);

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

        jButtonGuardar.setBackground(new java.awt.Color(102, 255, 102));
        jButtonGuardar.setText("Guardar Cambios");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jLabelCedula.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelCedula.setText("Cedula:");

        jTextFieldCedula.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldCedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButtonEliminar.setBackground(new java.awt.Color(255, 102, 102));
        jButtonEliminar.setText("Eliminar Cliente");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jLabelNombre1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelNombre1.setText("ID:");

        jTextFieldID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldID.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelNombre1)
                        .addGap(85, 85, 85)
                        .addComponent(jTextFieldID))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(jButtonGuardar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelEmail)
                        .addGap(64, 64, 64)
                        .addComponent(jTextFieldEmail))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelTelefono)
                        .addGap(42, 42, 42)
                        .addComponent(jTextFieldTelefono))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelDireccion)
                        .addGap(39, 39, 39)
                        .addComponent(jTextFieldDireccion))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelCedula)
                        .addGap(53, 53, 53)
                        .addComponent(jTextFieldCedula))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelApellido)
                        .addGap(41, 41, 41)
                        .addComponent(jTextFieldApellido))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelNombre)
                        .addGap(41, 41, 41)
                        .addComponent(jTextFieldNombre)))
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre1)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelApellido)
                    .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCedula)
                    .addComponent(jTextFieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDireccion)
                    .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        jPanel1.setBackground(new java.awt.Color(136, 173, 176));

        jLabelNuevoParqueadero.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNuevoParqueadero.setFont(new java.awt.Font("Candara", 2, 24)); // NOI18N
        jLabelNuevoParqueadero.setText("Clientes Registrados");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cliente.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido", "Cedula"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableClientes);
        if (jTableClientes.getColumnModel().getColumnCount() > 0) {
            jTableClientes.getColumnModel().getColumn(0).setMinWidth(50);
            jTableClientes.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTableClientes.getColumnModel().getColumn(0).setMaxWidth(50);
            jTableClientes.getColumnModel().getColumn(1).setResizable(false);
            jTableClientes.getColumnModel().getColumn(2).setResizable(false);
            jTableClientes.getColumnModel().getColumn(3).setResizable(false);
        }

        jTextFieldBusqueda.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldBusqueda.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jComboBoxBusqueda.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBoxBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buscar por", "Nombre", "Apellido", "Cedula" }));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(57, 57, 57)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jComboBoxBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(16, 16, 16)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextFieldBusqueda)
                                .addComponent(jLabelNuevoParqueadero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonSalir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonMostrarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelNuevoParqueadero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMostrarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        if (datosLlenos()) {
            controladorCliente.actualizar(new Cliente(jTextFieldCedula.getText(), Integer.valueOf(jTextFieldID.getText()) ,jTextFieldNombre.getText(), jTextFieldApellido.getText(), jTextFieldDireccion.getText(), jTextFieldTelefono.getText(), jTextFieldEmail.getText()));
            JOptionPane.showMessageDialog(this, "Cliente Actualizado con exito");
            restaurar();
        } else {
            JOptionPane.showMessageDialog(this, "Porfavor rellene todos los campos");
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        
        if (JOptionPane.showConfirmDialog(this, "Esta seguro que decea eliminar el cliente seleccionado", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
            controladorCliente.eliminar(getClienteSeleccionado()); 
            restaurar();
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jTableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClientesMouseClicked
        Cliente clienteSeleccionado = getClienteSeleccionado();
        jTextFieldID.setText(String.valueOf(clienteSeleccionado.getId()));
        jTextFieldNombre.setText(clienteSeleccionado.getNombre());
        jTextFieldApellido.setText(clienteSeleccionado.getApellido());
        jTextFieldCedula.setText(clienteSeleccionado.getCedula());
        jTextFieldDireccion.setText(clienteSeleccionado.getDireccion());
        jTextFieldTelefono.setText(clienteSeleccionado.getTelefono());
        jTextFieldEmail.setText(clienteSeleccionado.getEmail());
        habilitarEdicion(true);
    }//GEN-LAST:event_jTableClientesMouseClicked

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        String busqueda = jTextFieldBusqueda.getText();
        String parametroBusqueda = jComboBoxBusqueda.getSelectedItem().toString();
        if (!busqueda.isEmpty()) {
            
            switch (parametroBusqueda) {
                case "Nombre":
                    cargarDatos(controladorCliente.buscarPorNombre(busqueda));
                    break;
                case "Apellido":
                    cargarDatos(controladorCliente.buscarPorApellido(busqueda));
                    break;
                case "Cedula":
                    cargarDatos(controladorCliente.buscarPorCedula(busqueda));
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Porfavor seleccione un Parametro de Busqueda");
                    break;
            }
            
        } else {
            JOptionPane.showMessageDialog(this, "Porfavor ingrese su busqueda");
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonMostrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarTodoActionPerformed
        cargarDatos(controladorCliente.getListado());
        restaurar();
    }//GEN-LAST:event_jButtonMostrarTodoActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonMostrarTodo;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JComboBox<String> jComboBoxBusqueda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelCedula;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNombre1;
    private javax.swing.JLabel jLabelNuevoParqueadero;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldBusqueda;
    private javax.swing.JTextField jTextFieldCedula;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
