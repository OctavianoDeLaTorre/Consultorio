/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author aremy
 */
public class Ventas extends javax.swing.JFrame {

    /**
     * Creates new form Empleado
     */
    public Ventas() {
        initComponents();
        //Pantalla centrada de la interface
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanelInformacion = new javax.swing.JPanel();
        jLabelIDVenta = new javax.swing.JLabel();
        jLabelTotalVenta = new javax.swing.JLabel();
        jLabelHoraVenta = new javax.swing.JLabel();
        jLabelFechaVenta = new javax.swing.JLabel();
        jLabelClienteVenta = new javax.swing.JLabel();
        jTextFieldIDVenta = new javax.swing.JTextField();
        jTextFieldHoraVenta = new javax.swing.JTextField();
        jTextFieldFechaVenta = new javax.swing.JTextField();
        jTextFieldProductoVenta = new javax.swing.JTextField();
        jTextFieldCantidadVenta = new javax.swing.JTextField();
        jTextFieldTotalVenta = new javax.swing.JTextField();
        jPanelBotones = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanelListaVenta = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanelFormulario = new javax.swing.JPanel();
        jCheckBoxNuevo = new javax.swing.JCheckBox();
        jCheckBoxEliminar = new javax.swing.JCheckBox();
        jCheckBoxBuscar = new javax.swing.JCheckBox();
        jCheckBoxModificar = new javax.swing.JCheckBox();
        jButtonBorrar = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jLabelProductoVenta = new javax.swing.JLabel();
        jLabelCantidadVenta = new javax.swing.JLabel();
        jTextFieldClienteVenta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();
        jButtonIniciarVenta = new javax.swing.JButton();
        jButtonConfirmarVenta = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelInformacion.setBackground(new java.awt.Color(255, 255, 255));
        jPanelInformacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información Venta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        jLabelIDVenta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelIDVenta.setText("ID Venta:");

        jLabelTotalVenta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelTotalVenta.setText("Total:");

        jLabelHoraVenta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelHoraVenta.setText("Hora:");

        jLabelFechaVenta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelFechaVenta.setText("Fecha:");

        jLabelClienteVenta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelClienteVenta.setText("RFC Cliente:");

        jTextFieldIDVenta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jTextFieldHoraVenta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jTextFieldFechaVenta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextFieldFechaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFechaVentaActionPerformed(evt);
            }
        });

        jTextFieldProductoVenta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jTextFieldCantidadVenta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jTextFieldTotalVenta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jPanelBotones.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBotones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mas.png"))); // NOI18N
        jPanelBotones.add(jButton1);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menos.png"))); // NOI18N
        jPanelBotones.add(jButton2);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Modificar (2).png"))); // NOI18N
        jPanelBotones.add(jButton4);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        jPanelBotones.add(jButton3);

        jPanelListaVenta.setBackground(new java.awt.Color(255, 255, 255));
        jPanelListaVenta.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)), "Ventas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        jTable3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Título 5", "Título 6", "Título 7", "Título 8", "Título 9"
            }
        ));
        jTable3.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jPanelListaVentaLayout = new javax.swing.GroupLayout(jPanelListaVenta);
        jPanelListaVenta.setLayout(jPanelListaVentaLayout);
        jPanelListaVentaLayout.setHorizontalGroup(
            jPanelListaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListaVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanelListaVentaLayout.setVerticalGroup(
            jPanelListaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListaVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanelFormulario.setBackground(new java.awt.Color(255, 255, 255));
        jPanelFormulario.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)), "Formularios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        jCheckBoxNuevo.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBoxNuevo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBoxNuevo.setText("   Nuevo");
        jCheckBoxNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Signo1.png"))); // NOI18N
        jCheckBoxNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxNuevoActionPerformed(evt);
            }
        });

        jCheckBoxEliminar.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBoxEliminar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBoxEliminar.setText("   Eliminar");
        jCheckBoxEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Signo2.png"))); // NOI18N

        jCheckBoxBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBoxBuscar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBoxBuscar.setText("Buscar");
        jCheckBoxBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Signo4.png"))); // NOI18N

        jCheckBoxModificar.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBoxModificar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBoxModificar.setText("   Modificar");
        jCheckBoxModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Signo3.png"))); // NOI18N

        jButtonBorrar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Borrar.png"))); // NOI18N

        jButtonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Volver.png"))); // NOI18N
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFormularioLayout = new javax.swing.GroupLayout(jPanelFormulario);
        jPanelFormulario.setLayout(jPanelFormularioLayout);
        jPanelFormularioLayout.setHorizontalGroup(
            jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormularioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFormularioLayout.createSequentialGroup()
                        .addComponent(jButtonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBoxNuevo)
                    .addComponent(jCheckBoxEliminar)
                    .addComponent(jCheckBoxBuscar)
                    .addComponent(jCheckBoxModificar)))
        );
        jPanelFormularioLayout.setVerticalGroup(
            jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormularioLayout.createSequentialGroup()
                .addComponent(jCheckBoxNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxEliminar)
                .addGap(6, 6, 6)
                .addComponent(jCheckBoxBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVolver))
                .addContainerGap())
        );

        jLabelProductoVenta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelProductoVenta.setText("Producto:");

        jLabelCantidadVenta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelCantidadVenta.setText("Cantidad:");

        jTextFieldClienteVenta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Relog.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cepillo.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Colgate.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Diente.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Diente.png"))); // NOI18N

        javax.swing.GroupLayout jPanelInformacionLayout = new javax.swing.GroupLayout(jPanelInformacion);
        jPanelInformacion.setLayout(jPanelInformacionLayout);
        jPanelInformacionLayout.setHorizontalGroup(
            jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInformacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelListaVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelInformacionLayout.createSequentialGroup()
                        .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelInformacionLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)))
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelInformacionLayout.createSequentialGroup()
                                .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelHoraVenta)
                                    .addComponent(jLabelProductoVenta)
                                    .addComponent(jLabelClienteVenta)
                                    .addComponent(jLabelTotalVenta)
                                    .addComponent(jLabelFechaVenta)
                                    .addComponent(jLabelCantidadVenta))
                                .addGap(19, 19, 19)
                                .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldTotalVenta)
                                        .addComponent(jTextFieldFechaVenta)
                                        .addComponent(jTextFieldProductoVenta)
                                        .addComponent(jTextFieldCantidadVenta)
                                        .addComponent(jTextFieldClienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextFieldHoraVenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelInformacionLayout.createSequentialGroup()
                                .addComponent(jLabelIDVenta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldIDVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGap(180, 180, 180))
        );
        jPanelInformacionLayout.setVerticalGroup(
            jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInformacionLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInformacionLayout.createSequentialGroup()
                        .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldIDVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelIDVenta))
                        .addGap(8, 8, 8)
                        .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelInformacionLayout.createSequentialGroup()
                                .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldHoraVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelHoraVenta))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelFechaVenta)
                                    .addComponent(jTextFieldFechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelClienteVenta)
                                    .addComponent(jTextFieldClienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelProductoVenta)
                                    .addComponent(jTextFieldProductoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelInformacionLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelInformacionLayout.createSequentialGroup()
                                .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldCantidadVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelCantidadVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelTotalVenta)))
                            .addComponent(jLabel5)))
                    .addGroup(jPanelInformacionLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelListaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );

        getContentPane().add(jPanelInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 720, 490));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoS.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 490));

        jButtonIniciarVenta.setText("Iniciar venta");
        jButtonIniciarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarVentaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIniciarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 40, -1, -1));

        jButtonConfirmarVenta.setText("Confirmar");
        getContentPane().add(jButtonConfirmarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, 90, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxNuevoActionPerformed

    private void jTextFieldFechaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFechaVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFechaVentaActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        // TODO add your handling code here:
        Principal p= new Principal();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonIniciarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonIniciarVentaActionPerformed

    /**
     * @param args the command line arguments
*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonConfirmarVenta;
    private javax.swing.JButton jButtonIniciarVenta;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JCheckBox jCheckBoxBuscar;
    private javax.swing.JCheckBox jCheckBoxEliminar;
    private javax.swing.JCheckBox jCheckBoxModificar;
    private javax.swing.JCheckBox jCheckBoxNuevo;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelCantidadVenta;
    private javax.swing.JLabel jLabelClienteVenta;
    private javax.swing.JLabel jLabelFechaVenta;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelHoraVenta;
    private javax.swing.JLabel jLabelIDVenta;
    private javax.swing.JLabel jLabelProductoVenta;
    private javax.swing.JLabel jLabelTotalVenta;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelFormulario;
    private javax.swing.JPanel jPanelInformacion;
    private javax.swing.JPanel jPanelListaVenta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextFieldCantidadVenta;
    private javax.swing.JTextField jTextFieldClienteVenta;
    private javax.swing.JTextField jTextFieldFechaVenta;
    private javax.swing.JTextField jTextFieldHoraVenta;
    private javax.swing.JTextField jTextFieldIDVenta;
    private javax.swing.JTextField jTextFieldProductoVenta;
    private javax.swing.JTextField jTextFieldTotalVenta;
    // End of variables declaration//GEN-END:variables
}