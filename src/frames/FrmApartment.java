/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;

import entity.Apartment;
import controllers.CrudApartment;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Class where the frontend side of the Apartments manager is developed, as well
 * as the listeners for all the components.
 * @author Juan Ignacio Campos Martí
 */
public class FrmApartment extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmRoom
     */
    public FrmApartment() {
        initComponents();
        findByFloor("");
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

    }

    /**
     * Procedure that disables all the components of the frame so that the user
     * cannot write anything.
     */
    void disableComponents() {
        txtIdRoom.setVisible(false);
        cbFloor.setEnabled(false);
        txtRoomNumber.setEnabled(false);
        txtDescription.setEnabled(false);
        txtFeatures.setEnabled(false);
        txtPrice.setEnabled(false);
        cbStatus.setEnabled(false);
        cbRoomType.setEnabled(false);

        btnSave.setEnabled(false);
        btnCancel.setEnabled(false);
        btnDelete.setEnabled(false);
        txtIdRoom.setText("");
        txtPrice.setText("");
        txtFeatures.setText("");
        txtDescription.setText("");
    }

    /**
     * Procedure that enables all the components of the frame so that the user
     * can write anything.
     */
    void enableComponents() {
        txtIdRoom.setVisible(false);
        cbFloor.setEnabled(true);
        txtRoomNumber.setEnabled(true);
        txtDescription.setEnabled(true);
        txtFeatures.setEnabled(true);
        txtPrice.setEnabled(true);
        cbStatus.setEnabled(true);
        cbRoomType.setEnabled(true);

        btnSave.setEnabled(true);
        btnCancel.setEnabled(true);
        btnDelete.setEnabled(true);
        txtIdRoom.setText("");
        txtPrice.setText("");
        txtFeatures.setText("");
        txtDescription.setText("");
    }

    /**
     * Procedure that finds Apartments by their floor field. It also shows the
     * total number of Apartments registered in the DB.
     * @param search The floor data to be found in the DB entries.
     */
    void findByFloor(String search) {

        try {
            DefaultTableModel model;
            CrudApartment crudApartment = new CrudApartment();
            model = crudApartment.findByFloor(search);

            table.setModel(model);
            hideColumns();
            lblTotalRegistries.setText(
                    "Total registros: "
                    + Integer.toString(crudApartment.totalRegistries)
            );
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtIdRoom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtRoomNumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbFloor = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtFeatures = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbStatus = new javax.swing.JComboBox<>();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cbRoomType = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnOut = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        lblTotalRegistries = new javax.swing.JLabel();

        setBackground(new java.awt.Color(34, 40, 49));
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Apartamentos");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(57, 62, 70));
        jLabel1.setText("Apartamentos");

        jPanel1.setBackground(new java.awt.Color(0, 173, 181));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de apartamentos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(238, 238, 238))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(238, 238, 238));

        txtIdRoom.setBackground(new java.awt.Color(238, 238, 238));
        txtIdRoom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtIdRoom.setForeground(new java.awt.Color(34, 40, 49));
        txtIdRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdRoomActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(238, 238, 238));
        jLabel2.setText("Número:");

        txtRoomNumber.setBackground(new java.awt.Color(238, 238, 238));
        txtRoomNumber.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtRoomNumber.setForeground(new java.awt.Color(34, 40, 49));
        txtRoomNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoomNumberActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 238, 238));
        jLabel3.setText("Planta:");

        cbFloor.setBackground(new java.awt.Color(238, 238, 238));
        cbFloor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbFloor.setForeground(new java.awt.Color(34, 40, 49));
        cbFloor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbFloor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFloorActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(238, 238, 238));
        jLabel4.setText("Descripción: ");

        txtDescription.setBackground(new java.awt.Color(238, 238, 238));
        txtDescription.setColumns(20);
        txtDescription.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDescription.setForeground(new java.awt.Color(34, 40, 49));
        txtDescription.setRows(5);
        jScrollPane1.setViewportView(txtDescription);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(238, 238, 238));
        jLabel5.setText("Características:");

        txtFeatures.setBackground(new java.awt.Color(238, 238, 238));
        txtFeatures.setColumns(20);
        txtFeatures.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtFeatures.setForeground(new java.awt.Color(34, 40, 49));
        txtFeatures.setRows(5);
        jScrollPane2.setViewportView(txtFeatures);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(238, 238, 238));
        jLabel6.setText("Precio por noche:");

        txtPrice.setBackground(new java.awt.Color(238, 238, 238));
        txtPrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPrice.setForeground(new java.awt.Color(34, 40, 49));
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(238, 238, 238));
        jLabel7.setText("Estado:");

        cbStatus.setBackground(new java.awt.Color(238, 238, 238));
        cbStatus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbStatus.setForeground(new java.awt.Color(34, 40, 49));
        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible", "No disponible" }));
        cbStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbStatusActionPerformed(evt);
            }
        });

        btnNew.setBackground(new java.awt.Color(57, 62, 70));
        btnNew.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnNew.setForeground(new java.awt.Color(238, 238, 238));
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/hogar.png"))); // NOI18N
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
        jLabel8.setText("Tipo de apartamento:");

        cbRoomType.setBackground(new java.awt.Color(238, 238, 238));
        cbRoomType.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbRoomType.setForeground(new java.awt.Color(34, 40, 49));
        cbRoomType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estudio", "Habitación compartida", "Apartamento entero", "Apartamento de lujo" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNew)
                        .addGap(28, 28, 28)
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtIdRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbRoomType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbFloor, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtRoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtIdRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbFloor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew)
                    .addComponent(btnSave)
                    .addComponent(btnCancel))
                .addGap(16, 16, 16))
        );

        jPanel2.setBackground(new java.awt.Color(0, 173, 181));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado de apartamentos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(238, 238, 238))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(238, 238, 238));
        jLabel9.setText("Buscar por planta:");

        txtSearch.setBackground(new java.awt.Color(238, 238, 238));
        txtSearch.setForeground(new java.awt.Color(57, 62, 70));

        btnSearch.setBackground(new java.awt.Color(57, 62, 70));
        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(238, 238, 238));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/buscar (1).png"))); // NOI18N
        btnSearch.setText("Buscar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

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
        });
        jScrollPane3.setViewportView(table);

        lblTotalRegistries.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTotalRegistries.setForeground(new java.awt.Color(238, 238, 238));
        lblTotalRegistries.setText("Registros:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblTotalRegistries)
                        .addGap(64, 64, 64))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtSearch)
                            .addGap(18, 18, 18)
                            .addComponent(btnSearch)
                            .addGap(18, 18, 18)
                            .addComponent(btnDelete)
                            .addGap(18, 18, 18)
                            .addComponent(btnOut))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(btnDelete)
                    .addComponent(btnOut))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotalRegistries)
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
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdRoomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdRoomActionPerformed

    /**
     * Procedure that allows the user to automatically go to the next field 
     * once the 'Enter' key is pressed.
     * @param evt An instance of java.awt.event.ActionEvent
     */
    private void txtRoomNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoomNumberActionPerformed
        txtRoomNumber.transferFocus();
    }//GEN-LAST:event_txtRoomNumberActionPerformed

    /**
     * Procedure that allows the user to automatically go to the next field 
     * once the 'Enter' key is pressed.
     * @param evt An instance of java.awt.event.ActionEvent
     */
    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        txtPrice.transferFocus();
    }//GEN-LAST:event_txtPriceActionPerformed
    
    /**
     * Procedure that calls enableComponents(), sets the text of the btnSave 
     * button as 'Guardar' and changes the value of the action attribute
     * to 'guardar'.
     * @param evt A click in the btnNew.
     */
    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        enableComponents();
        btnSave.setText("Guardar");
        action = "guardar";
    }//GEN-LAST:event_btnNewActionPerformed

    /**
     * Procedure that saves a new Apartment in the DB or updates an existing one
     * once the btnSave button is clicked depending on whether the value of the
     * action attribute is 'guardar' or 'editar'. It also validates all the 
     * fields in the form so that the user must enter something in every single 
     * field. Once the Apartment is successfully saved or updated, the
     * disableComponents() procedure is called.
     * @param evt A click in the btnSave.
     */
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (txtRoomNumber.getText().length() == 0) {
            JOptionPane.showConfirmDialog(
                    rootPane,
                    "Por favor, introduzca el número del apartamento."
            );
            txtRoomNumber.requestFocus();
            return;
        }
        if (txtDescription.getText().length() == 0) {
            JOptionPane.showConfirmDialog(
                    rootPane,
                    "Por favor, introduzca la descripción "
                            + "del apartamento."
            );
            txtDescription.requestFocus();
            return;
        }
        if (txtFeatures.getText().length() == 0) {
            JOptionPane.showConfirmDialog(
                    rootPane,
                    "Por favor, introduzca las características "
                            + "del apartamento."
            );
            txtFeatures.requestFocus();
            return;
        }
        if (txtPrice.getText().length() == 0) {
            JOptionPane.showConfirmDialog(
                    rootPane,
                    "Por favor, introduzca el precio por noche "
                            + "del apartamento."
            );
            txtPrice.requestFocus();
            return;
        }

        Apartment apartment = new Apartment();
        CrudApartment crudApartment = new CrudApartment();

        apartment.setRoom_number(txtRoomNumber.getText());
        int selectedItem = cbFloor.getSelectedIndex();
        apartment.setFloor((String) cbFloor.getItemAt(selectedItem));
        apartment.setDescription(txtDescription.getText());
        apartment.setFeatures(txtFeatures.getText());
        apartment.setPrice(Double.parseDouble(txtPrice.getText()));
        selectedItem = cbStatus.getSelectedIndex();
        apartment.setStatus((String) cbStatus.getItemAt(selectedItem));
        selectedItem = cbRoomType.getSelectedIndex();
        apartment.setRoom_type((String) cbRoomType.getItemAt(selectedItem));

        if (action.equals("guardar")) {
            if (crudApartment.create(apartment)) {
                JOptionPane.showMessageDialog(
                        rootPane,
                        "Se registró el apartamento satisfactoriamente."
                );
                findByFloor("");
                disableComponents();

            }
        } else if (action.equals("editar")) {
            apartment.setId_room(Integer.parseInt(txtIdRoom.getText()));

            if (crudApartment.update(apartment)) {
                JOptionPane.showMessageDialog(
                        rootPane,
                        "Se actualizó el apartamento satisfactoriamente."
                );
                findByFloor("");
                disableComponents();

            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    /**
     * Procedure that deletes an Apartment in the DB once the btnDelete is 
     * clicked. Once the Apartment is successfully deleted, the 
     * disableComponents() procedure is called.
     * @param evt A click on btnDelete.
     */
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if (!txtIdRoom.getText().equals("")) {
            int confirmation = JOptionPane.showConfirmDialog(
                    rootPane,
                    "¿Está seguro de eliminar el apartamento?",
                    "Confirmar",
                    2
            );

            if (confirmation == 0) {
                CrudApartment crudApartment = new CrudApartment();
                Apartment apartment = new Apartment();

                apartment.setId_room(
                        Integer.parseInt(
                                txtIdRoom.getText()
                        ));
                crudApartment.delete(apartment);
                findByFloor("");
                disableComponents();
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    /**
     * Procedure that finds Apartments by their floor field once the 
     * btnSearch is pressed.
     * @param evt A click on btnSearch.
     */
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        findByFloor(txtSearch.getText());
    }//GEN-LAST:event_btnSearchActionPerformed

    /**
     * Procedure that allows the user to automatically go to the next field 
     * once the 'Enter' key is pressed.
     * @param evt An instance of java.awt.event.ActionEvent
     */
    private void cbFloorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFloorActionPerformed
        cbFloor.transferFocus();
    }//GEN-LAST:event_cbFloorActionPerformed

    /**
     * Procedure that allows the user to automatically go to the next field 
     * once the 'Enter' key is pressed.
     * @param evt An instance of java.awt.event.ActionEvent
     */
    private void cbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbStatusActionPerformed
        // TODO add your handling code here:
        cbStatus.transferFocus();
    }//GEN-LAST:event_cbStatusActionPerformed

    /**
     * Procedure that allows the user to update or delete an Apartment once the
     * registry of this Apartment is clicked with the mouse on the table.
     * @param evt A click on a row of the table.
     */
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        btnSave.setText("Editar");
        enableComponents();
        btnDelete.setEnabled(true);
        action = "editar";

        int row = table.rowAtPoint(evt.getPoint());

        txtIdRoom.setText(table.getValueAt(row, 0).toString());
        txtRoomNumber.setText(table.getValueAt(row, 1).toString());
        cbFloor.setSelectedItem(table.getValueAt(row, 2).toString());
        txtDescription.setText(table.getValueAt(row, 3).toString());
        txtFeatures.setText(table.getValueAt(row, 4).toString());
        txtPrice.setText(table.getValueAt(row, 5).toString());
        cbStatus.setSelectedItem(table.getValueAt(row, 6).toString());
        cbRoomType.setSelectedItem(table.getValueAt(row, 7).toString());
    }//GEN-LAST:event_tableMouseClicked

    /**
     * Procedure that allows the user to get out of this frame once the 'Salir'
     * button (btnOut) is clicked.
     * @param evt A click on btnOut.
     */
    private void btnOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOutActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnOutActionPerformed

    /**
     * Procedure that allows the user to get out of this frame once the 'Cancelar'
     * button (btnCancel) is clicked.
     * @param evt A click on btnCancel.
     */
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(FrmApartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmApartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmApartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmApartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmApartment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnOut;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cbFloor;
    private javax.swing.JComboBox<String> cbRoomType;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblTotalRegistries;
    private javax.swing.JTable table;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextArea txtFeatures;
    private javax.swing.JTextField txtIdRoom;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtRoomNumber;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}