/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;

import controllers.CrudProduct;
import entity.Product;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Class where the frontend side of the Bookings manager is developed, as well
 * as the listeners for all the components.
 * @author Juan Ignacio Campos Martí
 */
public class frmBooking extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmProduct
     */
    public frmBooking() {
        initComponents();
        findBookings("");
        disableComponents();
    }
    
    private String action = "guardar";

    /**
     * Procedure that hides the ID columns in the frame table.
     */
    void hideColumns() {
        tableBookings.getColumnModel().getColumn(0).setMaxWidth(0);
        tableBookings.getColumnModel().getColumn(0).setMinWidth(0);
        tableBookings.getColumnModel().getColumn(0)
                .setPreferredWidth(0);
                tableBookings.getColumnModel().getColumn(1).setMaxWidth(0);
        tableBookings.getColumnModel().getColumn(1).setMinWidth(0);
        tableBookings.getColumnModel().getColumn(1)
                .setPreferredWidth(0);
                tableBookings.getColumnModel().getColumn(3).setMaxWidth(0);
        tableBookings.getColumnModel().getColumn(3).setMinWidth(0);
        tableBookings.getColumnModel().getColumn(3)
                .setPreferredWidth(0);
                tableBookings.getColumnModel().getColumn(5).setMaxWidth(0);
        tableBookings.getColumnModel().getColumn(5).setMinWidth(0);
        tableBookings.getColumnModel().getColumn(5)
                .setPreferredWidth(0);

    }

    /**
     * Procedure that disables all the components of the frame so that the user
     * cannot write anything.
     */
    void disableComponents() {
        txtIdBooking.setVisible(false);
        txtIdRoom.setVisible(false);
        txtIdCustomer.setVisible(false);
        txtIdEmployee.setVisible(false);
        
        txtRoomNumber.setEnabled(false);
        txtCustomerName.setEnabled(false);
        txtEmployeeName.setEnabled(false);
        cbBookingType.setEnabled(false);

        dcBookingDate.setEnabled(false);
        dcCheckinDate.setEnabled(false);
        dcCheckoutDate.setEnabled(false);
        txtApartmentPrice.setEnabled(false);
        cbBookingType.setEnabled(false);
        
        btnSave.setEnabled(false);
        btnCancel.setEnabled(false);
        btnDelete.setEnabled(false);
        btnSearchCustomer.setEnabled(false);
        btnSearchApartment.setEnabled(false);
        
        txtIdBooking.setText("");
        txtIdCustomer.setText("");
        txtRoomNumber.setText("");
        txtCustomerName.setText("");
        txtApartmentPrice.setText("");
        txtIdRoom.setText("");
    }

    /**
     * Procedure that enables all the components of the frame so that the user
     * can write anything.
     */
    void enableComponents() {
        txtIdBooking.setVisible(false);
        txtIdRoom.setVisible(false);
        txtIdCustomer.setVisible(false);
        txtIdEmployee.setVisible(false);
        
        txtRoomNumber.setEnabled(false);
        txtCustomerName.setEnabled(false);
        txtEmployeeName.setEnabled(false);
        cbBookingType.setEnabled(true);

        dcBookingDate.setEnabled(true);
        dcCheckinDate.setEnabled(true);
        dcCheckoutDate.setEnabled(true);
        txtApartmentPrice.setEnabled(true);
        cbBookingType.setEnabled(true);
        
        btnSave.setEnabled(true);
        btnCancel.setEnabled(true);
        btnDelete.setEnabled(true);
        btnSearchCustomer.setEnabled(true);
        btnSearchApartment.setEnabled(true);
        
        txtIdBooking.setText("");
        txtIdCustomer.setText("");
        txtRoomNumber.setText("");
        txtCustomerName.setText("");
        txtApartmentPrice.setText("");
        txtIdRoom.setText("");
    }

    /**
     * Procedure that finds Bookings by their name field. It also shows the
     * total number of Bookings registered in the DB.
     * @param search The booking data to be found in the DB entries.
     */
    void findBookings(String search) {

        try {
            DefaultTableModel model;
            CrudProduct crudProduct = new CrudProduct();
            model = crudProduct.findByProductName(search);

            tableBookings.setModel(model);
            hideColumns();
            lblTotalRegistries.setText(
                    "Total registros: "
                    + Integer.toString(crudProduct.totalRegistries)
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
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnOut = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableBookings = new javax.swing.JTable();
        lblTotalRegistries = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtIdBooking = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtIdRoom = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtApartmentPrice = new javax.swing.JTextField();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cbBookingType = new javax.swing.JComboBox<>();
        txtRoomNumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtIdCustomer = new javax.swing.JTextField();
        txtCustomerName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtIdEmployee = new javax.swing.JTextField();
        txtEmployeeName = new javax.swing.JTextField();
        dcBookingDate = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        dcCheckinDate = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        dcCheckoutDate = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        cbStatus = new javax.swing.JComboBox<>();
        btnSearchApartment = new javax.swing.JButton();
        btnSearchCustomer = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Reservas");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(57, 62, 70));
        jLabel1.setText("Reservas");

        jPanel2.setBackground(new java.awt.Color(0, 173, 181));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado de reservas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(238, 238, 238))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(238, 238, 238));
        jLabel9.setText("Buscar:");

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

        tableBookings.setBackground(new java.awt.Color(57, 62, 70));
        tableBookings.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tableBookings.setForeground(new java.awt.Color(238, 238, 238));
        tableBookings.setModel(new javax.swing.table.DefaultTableModel(
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
        tableBookings.setSelectionBackground(new java.awt.Color(57, 62, 70));
        tableBookings.setSelectionForeground(new java.awt.Color(238, 238, 238));
        tableBookings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBookingsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableBookings);

        lblTotalRegistries.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTotalRegistries.setForeground(new java.awt.Color(238, 238, 238));
        lblTotalRegistries.setText("Registros:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSearch)
                        .addGap(31, 31, 31)
                        .addComponent(btnDelete)
                        .addGap(27, 27, 27)
                        .addComponent(btnOut))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTotalRegistries)
                .addGap(78, 78, 78))
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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotalRegistries)
                .addGap(21, 21, 21))
        );

        jPanel1.setBackground(new java.awt.Color(0, 173, 181));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de reservas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(238, 238, 238))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(238, 238, 238));

        txtIdBooking.setBackground(new java.awt.Color(238, 238, 238));
        txtIdBooking.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtIdBooking.setForeground(new java.awt.Color(34, 40, 49));
        txtIdBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdBookingActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(238, 238, 238));
        jLabel2.setText("Apartamento:");

        txtIdRoom.setBackground(new java.awt.Color(238, 238, 238));
        txtIdRoom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtIdRoom.setForeground(new java.awt.Color(34, 40, 49));
        txtIdRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdRoomActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(238, 238, 238));
        jLabel6.setText("Precio alojamiento:");

        txtApartmentPrice.setBackground(new java.awt.Color(238, 238, 238));
        txtApartmentPrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtApartmentPrice.setForeground(new java.awt.Color(34, 40, 49));
        txtApartmentPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApartmentPriceActionPerformed(evt);
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
        jLabel8.setText("Tipo de reserva:");

        cbBookingType.setBackground(new java.awt.Color(238, 238, 238));
        cbBookingType.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbBookingType.setForeground(new java.awt.Color(34, 40, 49));
        cbBookingType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Con seguro de cancelación (+10 €/noche)", "Sin seguro de cancelación" }));

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
        jLabel3.setText("Cliente:");

        txtIdCustomer.setBackground(new java.awt.Color(238, 238, 238));
        txtIdCustomer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtIdCustomer.setForeground(new java.awt.Color(34, 40, 49));
        txtIdCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdCustomerActionPerformed(evt);
            }
        });

        txtCustomerName.setBackground(new java.awt.Color(238, 238, 238));
        txtCustomerName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCustomerName.setForeground(new java.awt.Color(34, 40, 49));
        txtCustomerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerNameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(238, 238, 238));
        jLabel4.setText("Trabajador:");

        txtIdEmployee.setBackground(new java.awt.Color(238, 238, 238));
        txtIdEmployee.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtIdEmployee.setForeground(new java.awt.Color(34, 40, 49));
        txtIdEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdEmployeeActionPerformed(evt);
            }
        });

        txtEmployeeName.setBackground(new java.awt.Color(238, 238, 238));
        txtEmployeeName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtEmployeeName.setForeground(new java.awt.Color(34, 40, 49));
        txtEmployeeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeNameActionPerformed(evt);
            }
        });

        dcBookingDate.setBackground(new java.awt.Color(238, 238, 238));
        dcBookingDate.setForeground(new java.awt.Color(34, 40, 49));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(238, 238, 238));
        jLabel10.setText("Fecha reserva:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(238, 238, 238));
        jLabel11.setText("Fecha ingreso:");

        dcCheckinDate.setBackground(new java.awt.Color(238, 238, 238));
        dcCheckinDate.setForeground(new java.awt.Color(34, 40, 49));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(238, 238, 238));
        jLabel12.setText("Fecha salida:");

        dcCheckoutDate.setBackground(new java.awt.Color(238, 238, 238));
        dcCheckoutDate.setForeground(new java.awt.Color(34, 40, 49));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(238, 238, 238));
        jLabel13.setText("Estado reserva:");

        cbStatus.setBackground(new java.awt.Color(238, 238, 238));
        cbStatus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbStatus.setForeground(new java.awt.Color(34, 40, 49));
        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reservado sin pagar", "Pagado", "Anulado" }));

        btnSearchApartment.setBackground(new java.awt.Color(57, 62, 70));
        btnSearchApartment.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSearchApartment.setForeground(new java.awt.Color(238, 238, 238));
        btnSearchApartment.setText(". . .");

        btnSearchCustomer.setBackground(new java.awt.Color(57, 62, 70));
        btnSearchCustomer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSearchCustomer.setForeground(new java.awt.Color(238, 238, 238));
        btnSearchCustomer.setText(". . .");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtIdBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnNew)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSave)
                                .addGap(41, 41, 41)
                                .addComponent(btnCancel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtIdCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnSearchCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtIdEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtEmployeeName))
                                    .addComponent(cbBookingType, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dcBookingDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dcCheckinDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dcCheckoutDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtApartmentPrice, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbStatus, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(41, 41, 41)
                        .addComponent(txtIdRoom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearchApartment, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(txtIdBooking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel2)
                                                .addComponent(txtIdRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtRoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(btnSearchApartment, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel3)
                                                    .addComponent(txtIdCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(btnSearchCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(txtIdEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel8)
                                            .addComponent(cbBookingType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(12, 12, 12)
                                        .addComponent(dcBookingDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dcCheckinDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11))
                        .addGap(20, 20, 20)
                        .addComponent(jLabel12))
                    .addComponent(dcCheckoutDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtApartmentPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancel)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNew)
                        .addComponent(btnSave)))
                .addGap(61, 61, 61))
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
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
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
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Procedure that finds Bookings by their ID? field once the 
     * btnSearch is pressed.
     * @param evt A click on btnSearch.
     */
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        findBookings(txtSearch.getText());
    }//GEN-LAST:event_btnSearchActionPerformed

    /**
     * Procedure that deletes a Booking in the DB once the btnDelete is 
     * clicked. Once the Booking is successfully deleted, the 
     * disableComponents() procedure is called.
     * @param evt A click on btnDelete.
     */
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if (!txtIdBooking.getText().equals("")) {
            int confirmation = JOptionPane.showConfirmDialog(
                rootPane,
                "¿Está seguro de eliminar el producto?",
                "Confirmar",
                2
            );

            if (confirmation == 0) {
                CrudProduct crudProduct = new CrudProduct();
                Product product = new Product();

                product.setId_product(
                    Integer.parseInt(
                        txtIdBooking.getText()
                    ));
                    crudProduct.delete(product);
                    findBookings("");
                    disableComponents();
                }
            }
    }//GEN-LAST:event_btnDeleteActionPerformed

    /**
     * Procedure that allows the user to get out of this frame once the 'Salir'
     * button (btnOut) is clicked.
     * @param evt A click on btnOut.
     */
    private void btnOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOutActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnOutActionPerformed

    /**
     * Procedure that allows the user to update or delete a Booking once the
     * registry of this Booking is clicked with the mouse on the table.
     * @param evt A click on a row of the table.
     */
    private void tableBookingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBookingsMouseClicked
        btnSave.setText("Editar");
        enableComponents();
        btnDelete.setEnabled(true);
        action = "editar";

        int row = tableBookings.rowAtPoint(evt.getPoint());

        txtIdBooking.setText(tableBookings.getValueAt(row, 0)
                .toString());
        txtIdRoom.setText(tableBookings.getValueAt(row, 1)
                .toString());
        txtProductDescription.setText(tableBookings.getValueAt(row, 2)
                .toString());
        txtApartmentPrice.setText(tableBookings.getValueAt(row, 3).toString());
        cbBookingType.setSelectedItem(tableBookings
                .getValueAt(row, 4).toString());
    }//GEN-LAST:event_tableBookingsMouseClicked

    private void txtIdBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdBookingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdBookingActionPerformed

    /**
     * Procedure that allows the user to automatically go to the next field 
     * once the 'Enter' key is pressed.
     * @param evt An instance of java.awt.event.ActionEvent
     */
    private void txtIdRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdRoomActionPerformed
        txtIdRoom.transferFocus();
    }//GEN-LAST:event_txtIdRoomActionPerformed

    /**
     * Procedure that allows the user to automatically go to the next field 
     * once the 'Enter' key is pressed.
     * @param evt An instance of java.awt.event.ActionEvent
     */
    private void txtApartmentPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApartmentPriceActionPerformed
        txtApartmentPrice.transferFocus();
    }//GEN-LAST:event_txtApartmentPriceActionPerformed

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
     * Procedure that saves a new Booking in the DB or updates an existing one
     * once the btnSave button is clicked depending on whether the value of the
     * action attribute is 'guardar' or 'editar'. It also validates all the 
     * fields in the form so that the user must enter something in every single 
     * field. Once the Booking is successfully saved or updated, the
     * disableComponents() procedure is called.
     * @param evt A click in the btnSave.
     */
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (txtIdRoom.getText().length() == 0) {
            JOptionPane.showConfirmDialog(
                rootPane,
                "Por favor, introduzca el nombre del producto."
            );
            txtIdRoom.requestFocus();
            return;
        }
        if (txtProductDescription.getText().length() == 0) {
            JOptionPane.showConfirmDialog(
                rootPane,
                "Por favor, introduzca la descripción "
                + "del producto."
            );
            txtProductDescription.requestFocus();
            return;
        }
        if (txtApartmentPrice.getText().length() == 0) {
            JOptionPane.showConfirmDialog(
                rootPane,
                "Por favor, introduzca el PVP del producto."
            );
            txtApartmentPrice.requestFocus();
            return;
        }

        Product product = new Product();
        CrudProduct crudProduct = new CrudProduct();

        product.setName(txtIdRoom.getText());
        product.setDescription(txtProductDescription.getText());
        product.setPrice(Double.parseDouble(txtApartmentPrice.getText()));
        int selectedItem = cbBookingType.getSelectedIndex();
        product.setUnit_measure((String) cbBookingType
                .getItemAt(selectedItem));

        if (action.equals("guardar")) {
            if (crudProduct.create(product)) {
                JOptionPane.showMessageDialog(
                    rootPane,
                    "Se registró el producto satisfactoriamente."
                );
                findBookings("");
                disableComponents();

            }
        } else if (action.equals("editar")) {
            product.setId_product(Integer.parseInt(
                    txtIdBooking.getText()
            ));

            if (crudProduct.update(product)) {
                JOptionPane.showMessageDialog(
                    rootPane,
                    "Se actualizó el producto satisfactoriamente."
                );
                findBookings("");
                disableComponents();

            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    /**
     * Procedure that allows the user to get out of this frame once the 'Cancelar'
     * button (btnCancel) is clicked.
     * @param evt A click on btnCancel.
     */
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtRoomNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoomNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoomNumberActionPerformed

    private void txtIdCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdCustomerActionPerformed

    private void txtCustomerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerNameActionPerformed

    private void txtIdEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdEmployeeActionPerformed

    private void txtEmployeeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeNameActionPerformed

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
            java.util.logging.Logger.getLogger(frmBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmBooking().setVisible(true);
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
    private javax.swing.JButton btnSearchApartment;
    private javax.swing.JButton btnSearchCustomer;
    private javax.swing.JComboBox<String> cbBookingType;
    private javax.swing.JComboBox<String> cbStatus;
    private com.toedter.calendar.JDateChooser dcBookingDate;
    private com.toedter.calendar.JDateChooser dcCheckinDate;
    private com.toedter.calendar.JDateChooser dcCheckoutDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblTotalRegistries;
    private javax.swing.JTable tableBookings;
    private javax.swing.JTextField txtApartmentPrice;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtEmployeeName;
    private javax.swing.JTextField txtIdBooking;
    private javax.swing.JTextField txtIdCustomer;
    private javax.swing.JTextField txtIdEmployee;
    private javax.swing.JTextField txtIdRoom;
    private javax.swing.JTextField txtRoomNumber;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
