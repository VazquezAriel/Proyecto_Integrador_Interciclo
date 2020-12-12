/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorAdmin;
import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.controlador.ControladorParqueadero;
import ec.edu.ups.controlador.ControladorUsuario;
import ec.edu.ups.controlador.ControladorVehiculo;
import ec.edu.ups.modelo.Parqueadero;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 *
 * @author ariel
 */
public class VentanaPrincipal extends javax.swing.JFrame {


    
    //Ventanas
    private VentanaInicioSecion ventanaInicioSecion;
    private VentanaNuevoCliente ventanaNuevoCliente;
    private VentanaNuevoContrato ventanaNuevoContrato;
    private VentanaNuevoParqueadero ventanaNuevoParqueadero;
    private VentanaNuevoUsuario ventanaNuevoUsuario;
    private VentanaNuevoVehiculo ventanaNuevoVehiculo;
    private VentanaClientes ventanaClientes;
    private VentanaVehiculos ventanaVehiculos;
    private VentanaParqueaderos ventanaParqueaderos;
    private VentanaCambiarParqueadero ventanaCambiarParqueadero;
    private VentanaUsuarios ventanaUsuarios;
    private VentanaAdministrador ventanaAdministrador;
    private VentanaUsuario ventanaUsuario;
    
    //Controladores
    ControladorCliente controladorCliente;
    ControladorVehiculo controladorVehiculo;
    ControladorUsuario controladorUsuario;
    ControladorAdmin controladorAdmin;
    ControladorParqueadero controladorParqueadero;
    
    public VentanaPrincipal(VentanaInicioSecion ventanaInicioSecion, ControladorAdmin controladorAdmin, ControladorUsuario controladorUsuario, ControladorParqueadero controladorParqueadero, ControladorCliente controladorCliente, ControladorVehiculo controladorVehiculo) {
        initComponents();
        
        this.controladorParqueadero = controladorParqueadero;
        this.controladorAdmin = controladorAdmin;
        this.controladorUsuario = controladorUsuario;
        this.controladorCliente = controladorCliente;
        this.controladorVehiculo = controladorVehiculo;
        
        this.ventanaInicioSecion = ventanaInicioSecion;
        this.ventanaNuevoCliente = new VentanaNuevoCliente(controladorCliente);
        this.ventanaNuevoContrato = new VentanaNuevoContrato(controladorParqueadero);
        this.ventanaNuevoParqueadero = new VentanaNuevoParqueadero(controladorParqueadero);
        this.ventanaNuevoUsuario = new VentanaNuevoUsuario(controladorUsuario, controladorParqueadero);
        this.ventanaNuevoVehiculo = new VentanaNuevoVehiculo(controladorVehiculo);
        this.ventanaClientes = new VentanaClientes(controladorCliente);
        this.ventanaVehiculos = new VentanaVehiculos(controladorVehiculo);
        this.ventanaParqueaderos = new VentanaParqueaderos(controladorParqueadero);
        this.ventanaCambiarParqueadero = new VentanaCambiarParqueadero(controladorParqueadero, this);
        this.ventanaUsuarios = new VentanaUsuarios(controladorParqueadero, controladorUsuario);
        this.ventanaAdministrador = new VentanaAdministrador(controladorAdmin);
        this.ventanaUsuario = new VentanaUsuario(controladorUsuario);
        
    }

    public JMenu getjMenuParqueaderos() {
        return jMenuParqueaderos;
    }
    
    public JMenu getjMenuUsuarios() {
        return jMenuUsuarios;
    }

    public JMenuItem getjMenuItemFacturas() {
        return jMenuItemFacturas;
    }

    public JMenuItem getjMenuItemRegistros() {
        return jMenuItemRegistros;
    }

    public JMenuItem getjMenuItemAdministrador() {
        return jMenuItemAdministrador;
    }

    public JMenuItem getjMenuItemUsuarioSimple() {
        return jMenuItemUsuarioSimple;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menuBar = new javax.swing.JMenuBar();
        jMenuVehiculos = new javax.swing.JMenu();
        jMenuParqueaderos = new javax.swing.JMenu();
        jMenuItemNuevoParqueadero = new javax.swing.JMenuItem();
        jMenuItemEditarParqueadero = new javax.swing.JMenuItem();
        jMenuItemCambiarParqueadero = new javax.swing.JMenuItem();
        jMenuUsuarios = new javax.swing.JMenu();
        jMenuItemNuevoUsuario = new javax.swing.JMenuItem();
        jMenuItemEditarUsuarios = new javax.swing.JMenuItem();
        jMenuContratos = new javax.swing.JMenu();
        jMenuItemNuevoContrato = new javax.swing.JMenuItem();
        jMenuItemEditarContratos = new javax.swing.JMenuItem();
        jMenuClientes = new javax.swing.JMenu();
        jMenuItemNuevoCliente = new javax.swing.JMenuItem();
        jMenuItemEditarClientes = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemNuevoVehiculo = new javax.swing.JMenuItem();
        jMenuItemEditarVehiculos = new javax.swing.JMenuItem();
        jMenuItemRegistros = new javax.swing.JMenuItem();
        jMenuItemFacturas = new javax.swing.JMenuItem();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenuMCuenta = new javax.swing.JMenu();
        jMenuEditarCuenta = new javax.swing.JMenu();
        jMenuItemAdministrador = new javax.swing.JMenuItem();
        jMenuItemUsuarioSimple = new javax.swing.JMenuItem();
        jMenuAjustes = new javax.swing.JMenu();
        jMenuColor = new javax.swing.JMenu();
        jMenuItemRestaurar = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemEspañol = new javax.swing.JMenuItem();
        jMenuItemIngles = new javax.swing.JMenuItem();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 817, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 497, Short.MAX_VALUE)
        );

        menuBar.setBackground(new java.awt.Color(136, 173, 176));

        jMenuVehiculos.setBackground(new java.awt.Color(136, 173, 176));
        jMenuVehiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/administracion (2).png"))); // NOI18N
        jMenuVehiculos.setMnemonic('f');
        jMenuVehiculos.setText("Administrar      ");
        jMenuVehiculos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jMenuParqueaderos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estacionamiento.png"))); // NOI18N
        jMenuParqueaderos.setText("Parqueaderos");
        jMenuParqueaderos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenuItemNuevoParqueadero.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemNuevoParqueadero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.png"))); // NOI18N
        jMenuItemNuevoParqueadero.setText("Nuevo Parqueadero");
        jMenuItemNuevoParqueadero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNuevoParqueaderoActionPerformed(evt);
            }
        });
        jMenuParqueaderos.add(jMenuItemNuevoParqueadero);

        jMenuItemEditarParqueadero.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemEditarParqueadero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lapiz.png"))); // NOI18N
        jMenuItemEditarParqueadero.setText("Editar Parqueaderos");
        jMenuItemEditarParqueadero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEditarParqueaderoActionPerformed(evt);
            }
        });
        jMenuParqueaderos.add(jMenuItemEditarParqueadero);

        jMenuItemCambiarParqueadero.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemCambiarParqueadero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/intercambiar.png"))); // NOI18N
        jMenuItemCambiarParqueadero.setText("Cambiar Parqueadero");
        jMenuItemCambiarParqueadero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCambiarParqueaderoActionPerformed(evt);
            }
        });
        jMenuParqueaderos.add(jMenuItemCambiarParqueadero);

        jMenuVehiculos.add(jMenuParqueaderos);

        jMenuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/persona-de-negocios.png"))); // NOI18N
        jMenuUsuarios.setText("Usuarios");
        jMenuUsuarios.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenuItemNuevoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.png"))); // NOI18N
        jMenuItemNuevoUsuario.setText("Nuevo Usuario");
        jMenuItemNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNuevoUsuarioActionPerformed(evt);
            }
        });
        jMenuUsuarios.add(jMenuItemNuevoUsuario);

        jMenuItemEditarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lapiz.png"))); // NOI18N
        jMenuItemEditarUsuarios.setText("Editar Usuarios");
        jMenuItemEditarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEditarUsuariosActionPerformed(evt);
            }
        });
        jMenuUsuarios.add(jMenuItemEditarUsuarios);

        jMenuVehiculos.add(jMenuUsuarios);

        jMenuContratos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/contrato.png"))); // NOI18N
        jMenuContratos.setText("Contratos");
        jMenuContratos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenuItemNuevoContrato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.png"))); // NOI18N
        jMenuItemNuevoContrato.setText("Nuevo Contrato");
        jMenuItemNuevoContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNuevoContratoActionPerformed(evt);
            }
        });
        jMenuContratos.add(jMenuItemNuevoContrato);

        jMenuItemEditarContratos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lapiz.png"))); // NOI18N
        jMenuItemEditarContratos.setText("Editar Contratos");
        jMenuItemEditarContratos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEditarContratosActionPerformed(evt);
            }
        });
        jMenuContratos.add(jMenuItemEditarContratos);

        jMenuVehiculos.add(jMenuContratos);

        jMenuClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cliente.png"))); // NOI18N
        jMenuClientes.setText("Clientes");
        jMenuClientes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenuItemNuevoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.png"))); // NOI18N
        jMenuItemNuevoCliente.setText("Nuevo Cliente");
        jMenuItemNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNuevoClienteActionPerformed(evt);
            }
        });
        jMenuClientes.add(jMenuItemNuevoCliente);

        jMenuItemEditarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lapiz.png"))); // NOI18N
        jMenuItemEditarClientes.setText("Editar Clientes");
        jMenuItemEditarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEditarClientesActionPerformed(evt);
            }
        });
        jMenuClientes.add(jMenuItemEditarClientes);

        jMenuVehiculos.add(jMenuClientes);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/coche.png"))); // NOI18N
        jMenu3.setText("Vehiculos");
        jMenu3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenuItemNuevoVehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.png"))); // NOI18N
        jMenuItemNuevoVehiculo.setText("Nuevo Vehiculo");
        jMenuItemNuevoVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNuevoVehiculoActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemNuevoVehiculo);

        jMenuItemEditarVehiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lapiz.png"))); // NOI18N
        jMenuItemEditarVehiculos.setText("Editar Vehiculos");
        jMenuItemEditarVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEditarVehiculosActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemEditarVehiculos);

        jMenuVehiculos.add(jMenu3);

        jMenuItemRegistros.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemRegistros.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItemRegistros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/verificar.png"))); // NOI18N
        jMenuItemRegistros.setMnemonic('a');
        jMenuItemRegistros.setText("Registros");
        jMenuVehiculos.add(jMenuItemRegistros);

        jMenuItemFacturas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemFacturas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItemFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/factura.png"))); // NOI18N
        jMenuItemFacturas.setText("Facturas");
        jMenuVehiculos.add(jMenuItemFacturas);

        jMenuItemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemSalir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItemSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salida.png"))); // NOI18N
        jMenuItemSalir.setMnemonic('x');
        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenuVehiculos.add(jMenuItemSalir);

        menuBar.add(jMenuVehiculos);

        jMenuMCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario (2).png"))); // NOI18N
        jMenuMCuenta.setText("Mi Cuenta      ");
        jMenuMCuenta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jMenuEditarCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/computacion-en-la-nube.png"))); // NOI18N
        jMenuEditarCuenta.setText("Editar Datos");
        jMenuEditarCuenta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenuItemAdministrador.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/persona-de-negocios.png"))); // NOI18N
        jMenuItemAdministrador.setText("Administrador");
        jMenuItemAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAdministradorActionPerformed(evt);
            }
        });
        jMenuEditarCuenta.add(jMenuItemAdministrador);

        jMenuItemUsuarioSimple.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemUsuarioSimple.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cliente.png"))); // NOI18N
        jMenuItemUsuarioSimple.setText("Usuario Simple");
        jMenuItemUsuarioSimple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUsuarioSimpleActionPerformed(evt);
            }
        });
        jMenuEditarCuenta.add(jMenuItemUsuarioSimple);

        jMenuMCuenta.add(jMenuEditarCuenta);

        menuBar.add(jMenuMCuenta);

        jMenuAjustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuraciones.png"))); // NOI18N
        jMenuAjustes.setMnemonic('h');
        jMenuAjustes.setText("Ajustes      ");
        jMenuAjustes.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jMenuColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/circulo-de-color.png"))); // NOI18N
        jMenuColor.setText("Color");
        jMenuColor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenuItemRestaurar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemRestaurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reciclar.png"))); // NOI18N
        jMenuItemRestaurar.setText("Restaurar");
        jMenuColor.add(jMenuItemRestaurar);

        jMenuAjustes.add(jMenuColor);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/traduccion.png"))); // NOI18N
        jMenu1.setText("Idioma");
        jMenu1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenuItemEspañol.setText("Español");
        jMenu1.add(jMenuItemEspañol);

        jMenuItemIngles.setText("Ingles");
        jMenu1.add(jMenuItemIngles);

        jMenuAjustes.add(jMenu1);

        menuBar.add(jMenuAjustes);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        this.setVisible(false);
        ventanaInicioSecion.setVisible(true);
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jMenuItemEditarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEditarClientesActionPerformed
        ventanaClientes.setVisible(true);
        ventanaClientes.restaurar();
    }//GEN-LAST:event_jMenuItemEditarClientesActionPerformed

    private void jMenuItemEditarVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEditarVehiculosActionPerformed
        ventanaVehiculos.setVisible(true);
        ventanaVehiculos.restaurar();
    }//GEN-LAST:event_jMenuItemEditarVehiculosActionPerformed

    private void jMenuItemNuevoVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNuevoVehiculoActionPerformed
        ventanaNuevoVehiculo.setVisible(true);
    }//GEN-LAST:event_jMenuItemNuevoVehiculoActionPerformed

    private void jMenuItemNuevoParqueaderoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNuevoParqueaderoActionPerformed
        ventanaNuevoParqueadero.setVisible(true);
    }//GEN-LAST:event_jMenuItemNuevoParqueaderoActionPerformed

    private void jMenuItemNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNuevoUsuarioActionPerformed
        ventanaNuevoUsuario.setVisible(true);
        ventanaNuevoUsuario.restaurar();
    }//GEN-LAST:event_jMenuItemNuevoUsuarioActionPerformed

    private void jMenuItemNuevoContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNuevoContratoActionPerformed
        ventanaNuevoContrato.setVisible(true);
    }//GEN-LAST:event_jMenuItemNuevoContratoActionPerformed

    private void jMenuItemNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNuevoClienteActionPerformed
        ventanaNuevoCliente.setVisible(true);
    }//GEN-LAST:event_jMenuItemNuevoClienteActionPerformed

    private void jMenuItemEditarParqueaderoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEditarParqueaderoActionPerformed
        ventanaParqueaderos.setVisible(true);
        ventanaParqueaderos.restaurar();
    }//GEN-LAST:event_jMenuItemEditarParqueaderoActionPerformed

    private void jMenuItemCambiarParqueaderoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCambiarParqueaderoActionPerformed
        ventanaCambiarParqueadero.setVisible(true);
        ventanaCambiarParqueadero.restaurar();
    }//GEN-LAST:event_jMenuItemCambiarParqueaderoActionPerformed

    private void jMenuItemEditarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEditarUsuariosActionPerformed
        ventanaUsuarios.setVisible(true);
        ventanaUsuarios.restaurar();
    }//GEN-LAST:event_jMenuItemEditarUsuariosActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ventanaInicioSecion.setVisible(true);
        controladorParqueadero.actualizar(controladorParqueadero.getParqueaderoActual());
    }//GEN-LAST:event_formWindowClosing

    private void jMenuItemAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAdministradorActionPerformed
        ventanaAdministrador.setVisible(true);
        ventanaAdministrador.restaurar();
    }//GEN-LAST:event_jMenuItemAdministradorActionPerformed

    private void jMenuItemUsuarioSimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUsuarioSimpleActionPerformed
        ventanaUsuario.setVisible(true);
        ventanaUsuario.restaurar();
    }//GEN-LAST:event_jMenuItemUsuarioSimpleActionPerformed

    private void jMenuItemEditarContratosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEditarContratosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemEditarContratosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenuAjustes;
    private javax.swing.JMenu jMenuClientes;
    private javax.swing.JMenu jMenuColor;
    private javax.swing.JMenu jMenuContratos;
    private javax.swing.JMenu jMenuEditarCuenta;
    private javax.swing.JMenuItem jMenuItemAdministrador;
    private javax.swing.JMenuItem jMenuItemCambiarParqueadero;
    private javax.swing.JMenuItem jMenuItemEditarClientes;
    private javax.swing.JMenuItem jMenuItemEditarContratos;
    private javax.swing.JMenuItem jMenuItemEditarParqueadero;
    private javax.swing.JMenuItem jMenuItemEditarUsuarios;
    private javax.swing.JMenuItem jMenuItemEditarVehiculos;
    private javax.swing.JMenuItem jMenuItemEspañol;
    private javax.swing.JMenuItem jMenuItemFacturas;
    private javax.swing.JMenuItem jMenuItemIngles;
    private javax.swing.JMenuItem jMenuItemNuevoCliente;
    private javax.swing.JMenuItem jMenuItemNuevoContrato;
    private javax.swing.JMenuItem jMenuItemNuevoParqueadero;
    private javax.swing.JMenuItem jMenuItemNuevoUsuario;
    private javax.swing.JMenuItem jMenuItemNuevoVehiculo;
    private javax.swing.JMenuItem jMenuItemRegistros;
    private javax.swing.JMenuItem jMenuItemRestaurar;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenuItem jMenuItemUsuarioSimple;
    private javax.swing.JMenu jMenuMCuenta;
    private javax.swing.JMenu jMenuParqueaderos;
    private javax.swing.JMenu jMenuUsuarios;
    private javax.swing.JMenu jMenuVehiculos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
