/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;

import controllers.CrudConsumption;
import entity.Consumption;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Class where the frontend side of the Consumptions manager is developed, as well
 * as the listeners for all the components.
 * @author Juan Ignacio Campos Martí
 */
public class FrmConsumption extends javax.swing.JInternalFrame {

    public static String id_booking;
    public static String customer;

    /**
     * Creates new form frmConsumption
     */
    public FrmConsumption() {
        initComponents();
        findConsumption(id_booking);
        txtCustomer.setText(customer);
        txtIdBooking.setText(id_booking);
        disableComponents();
    }

    private String action = "guardar";

    /**
     * Procedure that hides the ID column in the frame table.
     */
    void hideColumns() {
        table.getColumnModel().getColumn(0).setMaxWidth(0);
        table.getColumnModel().getColumn(0).setMinWidth(0);
        table.getColumnModel().getColumn(0)
                .setPreferredWidth(0);
        table.getColumnModel().getColumn(1).setMaxWidth(0);
        table.getColumnModel().getColumn(1).setMinWidth(0);
        table.getColumnModel().getColumn(1)
                .setPreferredWidth(0);
        table.getColumnModel().getColumn(2).setMaxWidth(0);
        table.getColumnModel().getColumn(2).setMinWidth(0);
        table.getColumnModel().getColumn(2)
                .setPreferredWidth(0);

    }

    /**
     * Procedure that disables all the components of the frame so that the user
     * cannot write anything.
     */
    void disableComponents() {
        txtIdConsumption.setVisible(false);
        txtIdBooking.setVisible(false);
        txtCustomer.setEnabled(false);
        txtProductId.setVisible(false);
        txtProduct.setEnabled(false);
        txtAmount.setEnabled(false);
        txtPvp.setEnabled(false);
        cbStatus.setEnabled(false);

        btnSave.setEnabled(false);
        btnCancel.setEnabled(false);
        btnDelete.setEnabled(false);
        
        txtIdConsumption.setText("");
        txtPvp.setText("");
        txtProductId.setText("");
        txtProduct.setText("");
        txtAmount.setText("");
    }

    /**
     * Procedure that enables all the components of the frame so that the user
     * can write anything.
     */
    void enableComponents() {
        txtIdConsumption.setVisible(false);
        txtIdBooking.setVisible(false);
        txtCustomer.setEnabled(true);
        txtProductId.setVisible(false);
        txtProduct.setEnabled(true);
        txtAmount.setEnabled(true);
        txtPvp.setEnabled(true);
        cbStatus.setEnabled(true);

        btnSave.setEnabled(true);
        btnCancel.setEnabled(true);
        btnDelete.setEnabled(true);
        
        txtIdConsumption.setText("");
        txtPvp.setText("");
        txtProductId.setText("");
        txtProduct.setText("");
        txtAmount.setText("");
    }

    /**
     * Procedure that finds Consumptions by their name field. It also shows the
     * total number of Consumptions registered in the DB and their total cost.
     *
     * @param search The consumption name data to be found in the DB entries.
     */
    void findConsumption(String search) {

        try {
            DefaultTableModel model;
            CrudConsumption crudConsumption = new CrudConsumption();
            model = crudConsumption.findConsumption(search);

            table.setModel(model);
            hideColumns();
            lblTotalRegistries.setText("Total registros: "
                    + Integer.toString(crudConsumption.totalRegistries)
            );
            lblTotalAmount.setText("Total: " + String
                    .format("%.2f", crudConsumption.totalConsumption)
                    + " €");
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtIdConsumption = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtIdBooking = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPvp = new javax.swing.JTextField();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cbStatus = new javax.swing.JComboBox<>();
        txtCustomer = new javax.swing.JTextField();
        txtProductId = new javax.swing.JTextField();
        txtProduct = new javax.swing.JTextField();
        btnSearchProduct = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        btnOut = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        lblTotalRegistries = new javax.swing.JLabel();
        lblTotalAmount = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consumos");

        jPanel2.setBackground(new java.awt.Color(0, 173, 181));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de consumos extra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(238, 238, 238))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(238, 238, 238));

        txtIdConsumption.setBackground(new java.awt.Color(238, 238, 238));
        txtIdConsumption.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtIdConsumption.setForeground(new java.awt.Color(34, 40, 49));
        txtIdConsumption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdConsumptionActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(238, 238, 238));
        jLabel2.setText("Reserva:");

        txtIdBooking.setBackground(new java.awt.Color(238, 238, 238));
        txtIdBooking.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtIdBooking.setForeground(new java.awt.Color(34, 40, 49));
        txtIdBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdBookingActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(238, 238, 238));
        jLabel4.setText("Producto:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(238, 238, 238));
        jLabel6.setText("PVP:");

        txtPvp.setBackground(new java.awt.Color(238, 238, 238));
        txtPvp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPvp.setForeground(new java.awt.Color(34, 40, 49));
        txtPvp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPvpActionPerformed(evt);
            }
        });

        btnNew.setBackground(new java.awt.Color(57, 62, 70));
        btnNew.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnNew.setForeground(new java.awt.Color(238, 238, 238));
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/lista-de-verificacion.png"))); // NOI18N
        btnNew.setText("Nuevo");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(57, 62, 70));
        btnSave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSave.setForeground(new java.awt.Color(238, 238, 238));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/salvar (1).png"))); // NOI18N
        btnSave.setText("Guardar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(57, 62, 70));
        btnCancel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(238, 238, 238));
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/cruz (1).png"))); // NOI18N
        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(238, 238, 238));
        jLabel8.setText("Estado:");

        cbStatus.setBackground(new java.awt.Color(238, 238, 238));
        cbStatus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbStatus.setForeground(new java.awt.Color(34, 40, 49));
        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aceptado", "Cancelado" }));

        txtCustomer.setBackground(new java.awt.Color(238, 238, 238));
        txtCustomer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCustomer.setForeground(new java.awt.Color(34, 40, 49));
        txtCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerActionPerformed(evt);
            }
        });

        txtProductId.setBackground(new java.awt.Color(238, 238, 238));
        txtProductId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtProductId.setForeground(new java.awt.Color(34, 40, 49));
        txtProductId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductIdActionPerformed(evt);
            }
        });

        txtProduct.setBackground(new java.awt.Color(238, 238, 238));
        txtProduct.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtProduct.setForeground(new java.awt.Color(34, 40, 49));
        txtProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductActionPerformed(evt);
            }
        });

        btnSearchProduct.setBackground(new java.awt.Color(57, 62, 70));
        btnSearchProduct.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSearchProduct.setForeground(new java.awt.Color(238, 238, 238));
        btnSearchProduct.setText(". . .");
        btnSearchProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchProductActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(238, 238, 238));
        jLabel5.setText("Cantidad:");

        txtAmount.setBackground(new java.awt.Color(238, 238, 238));
        txtAmount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAmount.setForeground(new java.awt.Color(34, 40, 49));
        txtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(btnNew)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                            .addComponent(btnSave)
                            .addGap(26, 26, 26)
                            .addComponent(btnCancel))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtIdConsumption, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(txtIdBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtProduct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(txtProductId, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(167, 167, 167)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnSearchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtPvp, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(0, 32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(txtIdConsumption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdBooking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtProductId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPvp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew)
                    .addComponent(btnSave)
                    .addComponent(btnCancel))
                .addGap(61, 61, 61))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(57, 62, 70));
        jLabel1.setText("Consumo");

        jPanel3.setBackground(new java.awt.Color(0, 173, 181));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado de consumos extra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(238, 238, 238))); // NOI18N

        btnDelete.setBackground(new java.awt.Color(57, 62, 70));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(238, 238, 238));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/basura.png"))); // NOI18N
        btnDelete.setText("Eliminar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnOut.setBackground(new java.awt.Color(57, 62, 70));
        btnOut.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnOut.setForeground(new java.awt.Color(238, 238, 238));
        btnOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/cerrar-sesion (3).png"))); // NOI18N
        btnOut.setText("Salir");
        btnOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOutActionPerformed(evt);
            }
        });

        table.setBackground(new java.awt.Color(57, 62, 70));
        table.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        table.setForeground(new java.awt.Color(238, 238, 238));
        table.setModel(new javax.swing.table.DefaultTableModel(
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
        table.setSelectionBackground(new java.awt.Color(57, 62, 70));
        table.setSelectionForeground(new java.awt.Color(238, 238, 238));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(table);

        lblTotalRegistries.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTotalRegistries.setForeground(new java.awt.Color(238, 238, 238));
        lblTotalRegistries.setText("Registros:");

        lblTotalAmount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTotalAmount.setForeground(new java.awt.Color(238, 238, 238));
        lblTotalAmount.setText("Total:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblTotalAmount)
                        .addGap(151, 151, 151)
                        .addComponent(lblTotalRegistries)
                        .addGap(89, 89, 89))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(btnDelete)
                                .addGap(18, 18, 18)
                                .addComponent(btnOut))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(28, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnOut))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalRegistries)
                    .addComponent(lblTotalAmount))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdConsumptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdConsumptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdConsumptionActionPerformed

    private void txtIdBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdBookingActionPerformed
        txtIdBooking.transferFocus();
    }//GEN-LAST:event_txtIdBookingActionPerformed

    private void txtPvpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPvpActionPerformed
        txtPvp.transferFocus();
    }//GEN-LAST:event_txtPvpActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        enableComponents();
        btnSave.setText("Guardar");
        action = "guardar";
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (txtProductId.getText().length() == 0) {
            JOptionPane.showConfirmDialog(
                    rootPane,
                    "Por favor, introduzca un producto."
            );
            btnSearchProduct.requestFocus();
            return;
        }
        if (txtAmount.getText().length() == 0) {
            JOptionPane.showConfirmDialog(
                    rootPane,
                    "Por favor, introduzca una cantidad."
            );
            txtAmount.requestFocus();
            return;
        }
        if (txtPvp.getText().length() == 0) {
            JOptionPane.showConfirmDialog(
                    rootPane,
                    "Por favor, introduzca el PVP del producto."
            );
            txtPvp.requestFocus();
            return;
        }

        Consumption consumption = new Consumption();
        CrudConsumption crudConsumption = new CrudConsumption();

        consumption.setId_booking(Integer.parseInt(txtIdBooking.getText()));
        consumption.setId_product(Integer.parseInt(txtProductId.getText()));
        consumption.setAmount(Double.parseDouble(txtAmount.getText()));
        consumption.setPrice(Double.parseDouble(txtPvp.getText()));
        int selectedItem = cbStatus.getSelectedIndex();
        consumption.setStatus((String) cbStatus
                .getItemAt(selectedItem));

        if (action.equals("guardar")) {
            if (crudConsumption.create(consumption)) {
                JOptionPane.showMessageDialog(
                        rootPane,
                        "Se registró el consumo " + txtProduct.getText() + " del "
                                + "cliente " + txtCustomer.getText() 
                                + " satisfactoriamente."
                );
                findConsumption(id_booking);
                disableComponents();

            }
        } else if (action.equals("editar")) {
            consumption.setId_consumption(Integer.parseInt(
                    txtProductId.getText()
            ));

            if (crudConsumption.update(consumption)) {
                JOptionPane.showMessageDialog(
                        rootPane,
                        "Se actualizó el consumo del cliente" + 
                                txtCustomer.getText() + " satisfactoriamente."
                );
                findConsumption(id_booking);
                disableComponents();

            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if (!txtIdConsumption.getText().equals("")) {
            int confirmation = JOptionPane.showConfirmDialog(
                    rootPane,
                    "¿Está seguro de eliminar el consumo?",
                    "Confirmar",
                    2
            );

            if (confirmation == 0) {
                CrudConsumption crudConsumption = new CrudConsumption();
                Consumption consumption = new Consumption();

                consumption.setId_consumption(
                        Integer.parseInt(
                                txtIdConsumption.getText()
                        ));
                crudConsumption.delete(consumption);
                findConsumption(id_booking);
                disableComponents();
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOutActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnOutActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        btnSave.setText("Editar");
        enableComponents();
        btnDelete.setEnabled(true);
        action = "editar";

        int row = table.rowAtPoint(evt.getPoint());

        txtIdConsumption.setText(table.getValueAt(row, 0)
                .toString());
        txtIdBooking.setText(table.getValueAt(row, 1)
                .toString());
        txtProductId.setText(table.getValueAt(row, 2)
                .toString());
        txtProduct.setText(table.getValueAt(row, 3).toString());
        txtAmount.setText(table.getValueAt(row, 4).toString());
        txtPvp.setText(table.getValueAt(row, 5).toString());
        cbStatus.setSelectedItem(table
                .getValueAt(row, 6).toString());
    }//GEN-LAST:event_tableMouseClicked

    private void txtCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerActionPerformed

    private void txtProductIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductIdActionPerformed

    private void txtProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductActionPerformed

    private void btnSearchProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchProductActionPerformed
        FrmProductsView frmProductsView = new FrmProductsView();
        frmProductsView.toFront();
        frmProductsView.setVisible(true);
    }//GEN-LAST:event_btnSearchProductActionPerformed

    private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmountActionPerformed

    private void tableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tableMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmConsumption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmConsumption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmConsumption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmConsumption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmConsumption().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnOut;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearchProduct;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblTotalAmount;
    private javax.swing.JLabel lblTotalRegistries;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtCustomer;
    private javax.swing.JTextField txtIdBooking;
    private javax.swing.JTextField txtIdConsumption;
    public static javax.swing.JTextField txtProduct;
    public static javax.swing.JTextField txtProductId;
    public static javax.swing.JTextField txtPvp;
    // End of variables declaration//GEN-END:variables
}