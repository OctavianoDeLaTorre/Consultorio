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
public class Paciente extends javax.swing.JFrame {

    /**
     * Creates new form Empleado
     */
    public Paciente() {
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
        jPanelInformacion = new javax.swing.JPanel();
        jLabelIDPaciente = new javax.swing.JLabel();
        jLabelTelPaciente = new javax.swing.JLabel();
        jLabelDireccionPaciente = new javax.swing.JLabel();
        jLabelNombrePaciente = new javax.swing.JLabel();
        jLabelPAPaciente = new javax.swing.JLabel();
        jLabelPaciente = new javax.swing.JLabel();
        jLabelSPPaciente = new javax.swing.JLabel();
        jTextFieldIDPaciente = new javax.swing.JTextField();
        jTextFieldNombrePaciente = new javax.swing.JTextField();
        jTextFieldPAPaciente = new javax.swing.JTextField();
        jTextFieldSAPaciente = new javax.swing.JTextField();
        jTextFieldEdadPaciente = new javax.swing.JTextField();
        jTextFieldTelPaciente = new javax.swing.JTextField();
        jPanelBotones = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanelListaPaciente = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanelFormulario = new javax.swing.JPanel();
        jCheckBoxNuevo = new javax.swing.JCheckBox();
        jCheckBoxEliminar = new javax.swing.JCheckBox();
        jCheckBoxBuscar = new javax.swing.JCheckBox();
        jCheckBoxModificar = new javax.swing.JCheckBox();
        jButtonBorrar = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jLabelDiente = new javax.swing.JLabel();
        jLabelSexoPaciente = new javax.swing.JLabel();
        jLabelEdadPaciente = new javax.swing.JLabel();
        jTextFieldDireccionPaciente = new javax.swing.JTextField();
        jComboBoxSexoPaciente = new javax.swing.JComboBox<>();
        jLabelEstadoPaciente = new javax.swing.JLabel();
        jComboBoxEstadoPaciente = new javax.swing.JComboBox<>();
        jLabelFondo = new javax.swing.JLabel();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelInformacion.setBackground(new java.awt.Color(255, 255, 255));
        jPanelInformacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información Paciente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        jLabelIDPaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelIDPaciente.setText("ID Paciente:");

        jLabelTelPaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelTelPaciente.setText("Teléfono");

        jLabelDireccionPaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelDireccionPaciente.setText("Dirección:");

        jLabelNombrePaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelNombrePaciente.setText("Nombre:");

        jLabelPAPaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelPAPaciente.setText("Primer apellido:");

        jLabelPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/User.png"))); // NOI18N

        jLabelSPPaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelSPPaciente.setText("Segundo apellido:");

        jTextFieldIDPaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jTextFieldNombrePaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jTextFieldPAPaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jTextFieldSAPaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jTextFieldEdadPaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jTextFieldTelPaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jPanelBotones.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBotones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Nuevo.png"))); // NOI18N
        jPanelBotones.add(jButton1);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar.png"))); // NOI18N
        jPanelBotones.add(jButton2);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Consultar.png"))); // NOI18N
        jPanelBotones.add(jButton4);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Modificar.png"))); // NOI18N
        jPanelBotones.add(jButton3);

        jPanelListaPaciente.setBackground(new java.awt.Color(255, 255, 255));
        jPanelListaPaciente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)), "Pacientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

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

        javax.swing.GroupLayout jPanelListaPacienteLayout = new javax.swing.GroupLayout(jPanelListaPaciente);
        jPanelListaPaciente.setLayout(jPanelListaPacienteLayout);
        jPanelListaPacienteLayout.setHorizontalGroup(
            jPanelListaPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListaPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanelListaPacienteLayout.setVerticalGroup(
            jPanelListaPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListaPacienteLayout.createSequentialGroup()
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

        jLabelDiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cepillo.png"))); // NOI18N

        javax.swing.GroupLayout jPanelFormularioLayout = new javax.swing.GroupLayout(jPanelFormulario);
        jPanelFormulario.setLayout(jPanelFormularioLayout);
        jPanelFormularioLayout.setHorizontalGroup(
            jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFormularioLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabelDiente))
                    .addGroup(jPanelFormularioLayout.createSequentialGroup()
                        .addComponent(jButtonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBoxNuevo)
                    .addComponent(jCheckBoxEliminar)
                    .addComponent(jCheckBoxBuscar)
                    .addComponent(jCheckBoxModificar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelDiente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVolver))
                .addContainerGap())
        );

        jLabelSexoPaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelSexoPaciente.setText("Sexo:");

        jLabelEdadPaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelEdadPaciente.setText("Edad:");

        jTextFieldDireccionPaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jComboBoxSexoPaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBoxSexoPaciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Masculino", "Femenino" }));

        jLabelEstadoPaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelEstadoPaciente.setText("Estado civil:");

        jComboBoxEstadoPaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBoxEstadoPaciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Soltero (a)", "Casado (a)", "Divorsiado (a)" }));

        javax.swing.GroupLayout jPanelInformacionLayout = new javax.swing.GroupLayout(jPanelInformacion);
        jPanelInformacion.setLayout(jPanelInformacionLayout);
        jPanelInformacionLayout.setHorizontalGroup(
            jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInformacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInformacionLayout.createSequentialGroup()
                        .addComponent(jLabelPaciente)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInformacionLayout.createSequentialGroup()
                                .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelIDPaciente)
                                    .addComponent(jLabelNombrePaciente))
                                .addGap(44, 44, 44)
                                .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldNombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldIDPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInformacionLayout.createSequentialGroup()
                                .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDireccionPaciente)
                                    .addComponent(jLabelTelPaciente))
                                .addGap(55, 55, 55)
                                .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldTelPaciente)
                                    .addComponent(jTextFieldDireccionPaciente)))
                            .addGroup(jPanelInformacionLayout.createSequentialGroup()
                                .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInformacionLayout.createSequentialGroup()
                                            .addComponent(jLabelSPPaciente)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                        .addGroup(jPanelInformacionLayout.createSequentialGroup()
                                            .addComponent(jLabelSexoPaciente)
                                            .addGap(80, 80, 80)))
                                    .addGroup(jPanelInformacionLayout.createSequentialGroup()
                                        .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelPAPaciente)
                                            .addComponent(jLabelEdadPaciente)
                                            .addComponent(jLabelEstadoPaciente))
                                        .addGap(23, 23, 23)))
                                .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxEstadoPaciente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldPAPaciente)
                                    .addComponent(jTextFieldSAPaciente)
                                    .addComponent(jComboBoxSexoPaciente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldEdadPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(38, 38, 38)
                        .addComponent(jPanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelListaPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(180, 180, 180))
        );
        jPanelInformacionLayout.setVerticalGroup(
            jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInformacionLayout.createSequentialGroup()
                .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInformacionLayout.createSequentialGroup()
                            .addGap(97, 97, 97)
                            .addComponent(jLabelPaciente)
                            .addGap(108, 108, 108))
                        .addGroup(jPanelInformacionLayout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanelFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(15, 15, 15)))
                    .addGroup(jPanelInformacionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldIDPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelIDPaciente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNombrePaciente)
                            .addComponent(jTextFieldNombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPAPaciente)
                            .addComponent(jTextFieldPAPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelSPPaciente)
                            .addComponent(jTextFieldSAPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxSexoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSexoPaciente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldEdadPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEdadPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxEstadoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEstadoPaciente))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDireccionPaciente)
                            .addComponent(jTextFieldDireccionPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldTelPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTelPaciente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanelListaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );

        getContentPane().add(jPanelInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 720, 490));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoS.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxNuevoActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        // TODO add your handling code here:
        Principal p= new Principal();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonVolverActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JCheckBox jCheckBoxBuscar;
    private javax.swing.JCheckBox jCheckBoxEliminar;
    private javax.swing.JCheckBox jCheckBoxModificar;
    private javax.swing.JCheckBox jCheckBoxNuevo;
    private javax.swing.JComboBox<String> jComboBoxEstadoPaciente;
    private javax.swing.JComboBox<String> jComboBoxSexoPaciente;
    private javax.swing.JLabel jLabelDiente;
    private javax.swing.JLabel jLabelDireccionPaciente;
    private javax.swing.JLabel jLabelEdadPaciente;
    private javax.swing.JLabel jLabelEstadoPaciente;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelIDPaciente;
    private javax.swing.JLabel jLabelNombrePaciente;
    private javax.swing.JLabel jLabelPAPaciente;
    private javax.swing.JLabel jLabelPaciente;
    private javax.swing.JLabel jLabelSPPaciente;
    private javax.swing.JLabel jLabelSexoPaciente;
    private javax.swing.JLabel jLabelTelPaciente;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelFormulario;
    private javax.swing.JPanel jPanelInformacion;
    private javax.swing.JPanel jPanelListaPaciente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextFieldDireccionPaciente;
    private javax.swing.JTextField jTextFieldEdadPaciente;
    private javax.swing.JTextField jTextFieldIDPaciente;
    private javax.swing.JTextField jTextFieldNombrePaciente;
    private javax.swing.JTextField jTextFieldPAPaciente;
    private javax.swing.JTextField jTextFieldSAPaciente;
    private javax.swing.JTextField jTextFieldTelPaciente;
    // End of variables declaration//GEN-END:variables
}
