/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.Parqueadero;

/**
 *
 * @author ariel
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private Parqueadero parqueaderoActual;
    
    //Ventanas
    VentanaInicioSecion ventanaInicioSecion;
    
    public VentanaPrincipal(VentanaInicioSecion ventanaInicioSecion) {
        initComponents();
        
        this.ventanaInicioSecion = ventanaInicioSecion;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menuBar = new javax.swing.JMenuBar();
        jMenuAParqueadero = new javax.swing.JMenu();
        jMenuParqueaderos = new javax.swing.JMenu();
        jMenuUsuarios = new javax.swing.JMenu();
        jMenuContratos = new javax.swing.JMenu();
        jMenuClientes = new javax.swing.JMenu();
        jMenuItemRegistros = new javax.swing.JMenuItem();
        jMenuItemFacturas = new javax.swing.JMenuItem();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenuMCuenta = new javax.swing.JMenu();
        jMenuItemEditarDatos = new javax.swing.JMenuItem();
        jMenuItemEliminarCuenta = new javax.swing.JMenuItem();
        jMenuAjustes = new javax.swing.JMenu();
        jMenuColor = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 817, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );

        menuBar.setBackground(new java.awt.Color(136, 173, 176));

        jMenuAParqueadero.setBackground(new java.awt.Color(136, 173, 176));
        jMenuAParqueadero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/administracion (2).png"))); // NOI18N
        jMenuAParqueadero.setMnemonic('f');
        jMenuAParqueadero.setText("Administrar      ");
        jMenuAParqueadero.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jMenuParqueaderos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estacionamiento.png"))); // NOI18N
        jMenuParqueaderos.setText("Parqueaderos");
        jMenuParqueaderos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuAParqueadero.add(jMenuParqueaderos);

        jMenuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/persona-de-negocios.png"))); // NOI18N
        jMenuUsuarios.setText("Usuarios");
        jMenuUsuarios.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuAParqueadero.add(jMenuUsuarios);

        jMenuContratos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/contrato.png"))); // NOI18N
        jMenuContratos.setText("Contratos");
        jMenuContratos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuAParqueadero.add(jMenuContratos);

        jMenuClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cliente.png"))); // NOI18N
        jMenuClientes.setText("Clientes");
        jMenuClientes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuAParqueadero.add(jMenuClientes);

        jMenuItemRegistros.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemRegistros.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItemRegistros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/verificar.png"))); // NOI18N
        jMenuItemRegistros.setMnemonic('a');
        jMenuItemRegistros.setText("Registros");
        jMenuAParqueadero.add(jMenuItemRegistros);

        jMenuItemFacturas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemFacturas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItemFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/factura.png"))); // NOI18N
        jMenuItemFacturas.setText("Facturas");
        jMenuAParqueadero.add(jMenuItemFacturas);

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
        jMenuAParqueadero.add(jMenuItemSalir);

        menuBar.add(jMenuAParqueadero);

        jMenuMCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario (2).png"))); // NOI18N
        jMenuMCuenta.setText("Mi Cuenta      ");
        jMenuMCuenta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jMenuItemEditarDatos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItemEditarDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/computacion-en-la-nube.png"))); // NOI18N
        jMenuItemEditarDatos.setText("Editar Datos");
        jMenuMCuenta.add(jMenuItemEditarDatos);

        jMenuItemEliminarCuenta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItemEliminarCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dejar-de-seguir.png"))); // NOI18N
        jMenuItemEliminarCuenta.setText("Eliminar Cuenta");
        jMenuItemEliminarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEliminarCuentaActionPerformed(evt);
            }
        });
        jMenuMCuenta.add(jMenuItemEliminarCuenta);

        menuBar.add(jMenuMCuenta);

        jMenuAjustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuraciones.png"))); // NOI18N
        jMenuAjustes.setMnemonic('h');
        jMenuAjustes.setText("Ajustes      ");
        jMenuAjustes.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jMenuColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/circulo-de-color.png"))); // NOI18N
        jMenuColor.setText("Color");
        jMenuColor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuAjustes.add(jMenuColor);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/traduccion.png"))); // NOI18N
        jMenu1.setText("Idioma");
        jMenu1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuAjustes.add(jMenu1);

        menuBar.add(jMenuAjustes);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jMenuItemEliminarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEliminarCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemEliminarCuentaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenuAParqueadero;
    private javax.swing.JMenu jMenuAjustes;
    private javax.swing.JMenu jMenuClientes;
    private javax.swing.JMenu jMenuColor;
    private javax.swing.JMenu jMenuContratos;
    private javax.swing.JMenuItem jMenuItemEditarDatos;
    private javax.swing.JMenuItem jMenuItemEliminarCuenta;
    private javax.swing.JMenuItem jMenuItemFacturas;
    private javax.swing.JMenuItem jMenuItemRegistros;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenu jMenuMCuenta;
    private javax.swing.JMenu jMenuParqueaderos;
    private javax.swing.JMenu jMenuUsuarios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
