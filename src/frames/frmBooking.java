/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;

import entity.Apartment;
import controllers.CrudApartment;
import controllers.CrudBooking;
import entity.Booking;
import java.util.Calendar;
import java.sql.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Class where the frontend side of the Apartments manager is developed, as well
 * as the listeners for all the components.
 * @author Juan Ignacio Campos Martí
 */
public class frmBooking extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmRoom
     */
    public frmBooking() {
        initComponents();
        findBookings("");
        disableComponents();
    }
    
    private String action = "guardar";
    public static int idUser;

    /**
     * Procedure that hides the ID columns in the frame table.
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
        table.getColumnModel().getColumn(3).setMaxWidth(0);
        table.getColumnModel().getColumn(3).setMinWidth(0);
        table.getColumnModel().getColumn(3)
                .setPreferredWidth(0);
        table.getColumnModel().getColumn(5).setMaxWidth(0);
        table.getColumnModel().getColumn(5).setMinWidth(0);
        table.getColumnModel().getColumn(5)
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
            CrudBooking crudBooking = new CrudBooking();
            model = crudBooking.findBooking(search);

            table.setModel(model);
            hideColumns();
            lblTotalRegistries.setText("Total registros: "
                    + Integer.toString(crudBooking.totalRegistries)
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
        txtIdBooking = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtIdRoom = new javax.swing.JTextField();
        txtRoomNumber = new javax.swing.JTextField();
        btnSearchApartment = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtIdCustomer = new javax.swing.JTextField();
        txtCustomerName = new javax.swing.JTextField();
        btnSearchCustomer = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtIdEmployee = new javax.swing.JTextField();
        txtEmployeeName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbBookingType = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        dcBookingDate = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        dcCheckinDate = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        dcCheckoutDate = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        txtApartmentPrice = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cbStatus = new javax.swing.JComboBox<>();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnOut = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        lblTotalRegistries = new javax.swing.JLabel();
        btnConsumptions = new javax.swing.JButton();

        setBackground(new java.awt.Color(34, 40, 49));
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Apartamentos");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(57, 62, 70));
        jLabel1.setText("Reservas");

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

        txtRoomNumber.setBackground(new java.awt.Color(238, 238, 238));
        txtRoomNumber.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtRoomNumber.setForeground(new java.awt.Color(34, 40, 49));
        txtRoomNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoomNumberActionPerformed(evt);
            }
        });

        btnSearchApartment.setBackground(new java.awt.Color(57, 62, 70));
        btnSearchApartment.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSearchApartment.setForeground(new java.awt.Color(238, 238, 238));
        btnSearchApartment.setText(". . .");
        btnSearchApartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchApartmentActionPerformed(evt);
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

        btnSearchCustomer.setBackground(new java.awt.Color(57, 62, 70));
        btnSearchCustomer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSearchCustomer.setForeground(new java.awt.Color(238, 238, 238));
        btnSearchCustomer.setText(". . .");
        btnSearchCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchCustomerActionPerformed(evt);
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

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(238, 238, 238));
        jLabel8.setText("Tipo de reserva:");

        cbBookingType.setBackground(new java.awt.Color(238, 238, 238));
        cbBookingType.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbBookingType.setForeground(new java.awt.Color(34, 40, 49));
        cbBookingType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Con seguro de cancelación (+10 €/noche)", "Sin seguro de cancelación" }));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(238, 238, 238));
        jLabel10.setText("Fecha reserva:");

        dcBookingDate.setBackground(new java.awt.Color(238, 238, 238));
        dcBookingDate.setForeground(new java.awt.Color(34, 40, 49));

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

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(238, 238, 238));
        jLabel13.setText("Estado reserva:");

        cbStatus.setBackground(new java.awt.Color(238, 238, 238));
        cbStatus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbStatus.setForeground(new java.awt.Color(34, 40, 49));
        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reservado sin pagar", "Pagado", "Anulado" }));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnNew)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSave)
                                .addGap(45, 45, 45)
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
                                        .addComponent(txtEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cbBookingType, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dcBookingDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dcCheckinDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dcCheckoutDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApartmentPrice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbStatus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtIdRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtRoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSearchApartment, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(txtIdBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtIdBooking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
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
                .addGap(40, 40, 40))
        );

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

        btnConsumptions.setBackground(new java.awt.Color(57, 62, 70));
        btnConsumptions.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnConsumptions.setForeground(new java.awt.Color(238, 238, 238));
        btnConsumptions.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/bolsa-de-dinero.png"))); // NOI18N
        btnConsumptions.setText("Consumos");
        btnConsumptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsumptionsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnConsumptions)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTotalRegistries)
                        .addGap(82, 82, 82))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearch)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete)
                                .addGap(18, 18, 18)
                                .addComponent(btnOut))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(20, Short.MAX_VALUE))))
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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTotalRegistries)
                    .addComponent(btnConsumptions))
                .addContainerGap())
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
                        .addGap(18, 18, 18)
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
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdBookingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdBookingActionPerformed

   
    /**
     * Procedure that deletes an Apartment in the DB once the btnDelete is 
     * clicked. Once the Apartment is successfully deleted, the 
     * disableComponents() procedure is called.
     * @param evt A click on btnDelete.
     */
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if (!txtIdBooking.getText().equals("")) {
            int confirmation = JOptionPane.showConfirmDialog(
                    rootPane,
                    "¿Está seguro de eliminar la reserva?",
                    "Confirmar",
                    2
            );

            if (confirmation == 0) {
                CrudApartment crudApartment = new CrudApartment();
                Apartment apartment = new Apartment();

                apartment.setId_room(
                        Integer.parseInt(
                                txtIdBooking.getText()
                        ));
                crudApartment.delete(apartment);
                findBookings("");
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
        findBookings(txtSearch.getText());
    }//GEN-LAST:event_btnSearchActionPerformed

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

        txtIdBooking.setText(table.getValueAt(row, 0)
                .toString());
        txtIdRoom.setText(table.getValueAt(row, 1)
                .toString());
        txtRoomNumber.setText(table.getValueAt(row, 2)
                .toString());
        txtIdCustomer.setText(table.getValueAt(row, 3).toString());
        txtCustomerName.setText(table.getValueAt(row, 4).toString());
        txtIdEmployee.setText(table.getValueAt(row, 5).toString());
        txtEmployeeName.setText(table.getValueAt(row, 6).toString());        
        cbBookingType.setSelectedItem(table
                .getValueAt(row, 7).toString());
        dcBookingDate.setDate(Date.valueOf(table.getValueAt(row, 8).toString()));
        dcCheckinDate.setDate(Date.valueOf(table.getValueAt(row, 9).toString()));
        dcCheckoutDate.setDate(Date.valueOf(table.getValueAt(row, 10).toString()));
        txtApartmentPrice.setText(table.getValueAt(row, 11).toString());
        cbStatus.setSelectedItem(table
                .getValueAt(row, 12).toString());
    }//GEN-LAST:event_tableMouseClicked

    /**
     * Procedure that allows the user to get out of this frame once the 'Salir'
     * button (btnOut) is clicked.
     * @param evt A click on btnOut.
     */
    private void btnOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOutActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnOutActionPerformed

    private void btnConsumptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsumptionsActionPerformed
        int row = table.getSelectedRow();
        frmConsumption.id_booking = table.getValueAt(row, 0)
                .toString();
        frmConsumption.customer = table.getValueAt(row, 4)
                .toString();
        
        frmConsumption frmConsumption = new frmConsumption();
        frmHome.desktop.add(frmConsumption);
        frmConsumption.toFront();
        frmConsumption.setVisible(true);
    }//GEN-LAST:event_btnConsumptionsActionPerformed

    private void txtIdRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdRoomActionPerformed
        txtIdRoom.transferFocus();
    }//GEN-LAST:event_txtIdRoomActionPerformed

    private void txtRoomNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoomNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoomNumberActionPerformed

    private void btnSearchApartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchApartmentActionPerformed
        // TODO add your handling code here:
        frmApartmentView frmApartmentView = new frmApartmentView();
        frmApartmentView.toFront();
        frmApartmentView.setVisible(true);
    }//GEN-LAST:event_btnSearchApartmentActionPerformed

    private void txtIdCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdCustomerActionPerformed

    private void txtCustomerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerNameActionPerformed

    private void btnSearchCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchCustomerActionPerformed
        frmCustomerView frmCustomerView = new frmCustomerView();
        frmCustomerView.toFront();
        frmCustomerView.setVisible(true);
    }//GEN-LAST:event_btnSearchCustomerActionPerformed

    private void txtIdEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdEmployeeActionPerformed

    private void txtEmployeeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeNameActionPerformed

    private void txtApartmentPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApartmentPriceActionPerformed
        txtApartmentPrice.transferFocus();
    }//GEN-LAST:event_txtApartmentPriceActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        enableComponents();
        btnSave.setText("Guardar");
        action = "guardar";
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (txtIdRoom.getText().length() == 0) {
            JOptionPane.showConfirmDialog(
                rootPane,
                "Por favor, seleccione un apartamento."
            );
            txtIdRoom.requestFocus();
            return;
        }
        if (txtIdCustomer.getText().length() == 0) {
            JOptionPane.showConfirmDialog(
                rootPane,
                "Por favor, seleccione un cliente."
            );
            txtIdCustomer.requestFocus();
            return;
        }
        if (txtApartmentPrice.getText().length() == 0) {
            JOptionPane.showConfirmDialog(
                rootPane,
                "Por favor, introduzca el precio del apartamento."
            );
            txtApartmentPrice.requestFocus();
            return;
        }

        Booking booking = new Booking();
        CrudBooking crudBooking = new CrudBooking();

        booking.setId_room(Integer.parseInt(txtIdRoom.getText()));
        booking.setId_customer(Integer.parseInt(txtIdCustomer.getText()));
        booking.setId_employee(idUser);
        int selectedItem = cbBookingType.getSelectedIndex();
        booking.setType((String) cbBookingType
                .getItemAt(selectedItem));
        
        Calendar calendar;
        int d, m, y;
        calendar = dcBookingDate.getCalendar();
        d = calendar.get(Calendar.DAY_OF_MONTH);
        m = calendar.get(Calendar.MONTH);
        y = calendar.get(Calendar.YEAR) - 1900;
        booking.setBooking_date(new Date(y, m, d));
        
        calendar = dcCheckinDate.getCalendar();
        d = calendar.get(Calendar.DAY_OF_MONTH);
        m = calendar.get(Calendar.MONTH);
        y = calendar.get(Calendar.YEAR) - 1900;
        booking.setCheckin_date(new Date(y, m, d));
        
        calendar = dcCheckoutDate.getCalendar();
        d = calendar.get(Calendar.DAY_OF_MONTH);
        m = calendar.get(Calendar.MONTH);
        y = calendar.get(Calendar.YEAR) - 1900;
        booking.setCheckout_date(new Date(y, m, d));
        
        booking.setPrice(Double.parseDouble(txtApartmentPrice.getText()));
        
        selectedItem = cbStatus.getSelectedIndex();
        booking.setStatus((String) cbStatus
                .getItemAt(selectedItem));
        
        

        if (action.equals("guardar")) {
            if (crudBooking.create(booking)) {
                JOptionPane.showMessageDialog(
                    rootPane,
                    "Se registró la reserva satisfactoriamente."
                );
                findBookings("");
                disableComponents();

            }
        } else if (action.equals("editar")) {
            booking.setId_booking(Integer.parseInt(
                    txtIdBooking.getText()
            ));
            booking.setId_employee(Integer.parseInt(
                    txtIdEmployee.getText()
            ));

            if (crudBooking.update(booking)) {
                JOptionPane.showMessageDialog(
                    rootPane,
                    "Se actualizó la reserva satisfactoriamente."
                );
                findBookings("");
                disableComponents();

            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

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
    private javax.swing.JButton btnConsumptions;
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
    private javax.swing.JTable table;
    private javax.swing.JTextField txtApartmentPrice;
    public static javax.swing.JTextField txtCustomerName;
    public static javax.swing.JTextField txtEmployeeName;
    private javax.swing.JTextField txtIdBooking;
    public static javax.swing.JTextField txtIdCustomer;
    public static javax.swing.JTextField txtIdEmployee;
    public static javax.swing.JTextField txtIdRoom;
    public static javax.swing.JTextField txtRoomNumber;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
