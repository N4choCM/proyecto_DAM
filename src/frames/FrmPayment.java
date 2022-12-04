/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;

import controllers.CrudApartment;
import controllers.CrudBooking;
import controllers.CrudConsumption;
import controllers.CrudPayment;
import entity.Apartment;
import entity.Booking;
import entity.Payment;
import java.util.Calendar;
import java.sql.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Class where the frontend side of the Payments manager is developed, as well
 * as the listeners for all the components.
 *
 * @author Juan Ignacio Campos Martí
 */
public class FrmPayment extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmPayment
     */
    public FrmPayment() {
        initComponents();
        findPayment(id_booking);
        disableComponents();
        txtIdBooking.setText(id_booking);
        txtCustomer.setText(customer);
        txtApartment.setText(apartment);
        txtIdApartment.setText(id_apartment);
        txtBookingPrice.setText(Double.toString(booking_price));

        CrudConsumption crudConsumption = new CrudConsumption();
        crudConsumption.findConsumption(id_booking);
        txtTotalPrice.setText(Double.toString(
                booking_price + crudConsumption.totalConsumption
        ));

    }

    private String action = "guardar";
    public static String id_booking;
    public static String customer;
    public static String id_apartment;
    public static String apartment;
    public static Double booking_price;

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

    }

    void hideConsumptionCColumns() {
        tableConsumptions.getColumnModel().getColumn(0).setMaxWidth(0);
        tableConsumptions.getColumnModel().getColumn(0).setMinWidth(0);
        tableConsumptions.getColumnModel().getColumn(0)
                .setPreferredWidth(0);
        tableConsumptions.getColumnModel().getColumn(1).setMaxWidth(0);
        tableConsumptions.getColumnModel().getColumn(1).setMinWidth(0);
        tableConsumptions.getColumnModel().getColumn(1)
                .setPreferredWidth(0);
        tableConsumptions.getColumnModel().getColumn(2).setMaxWidth(0);
        tableConsumptions.getColumnModel().getColumn(2).setMinWidth(0);
        tableConsumptions.getColumnModel().getColumn(2)
                .setPreferredWidth(0);

    }

    /**
     * Procedure that disables all the components of the frame so that the user
     * cannot write anything.
     */
    void disableComponents() {
        txtIdPayment.setVisible(false);
        txtIdBooking.setEnabled(false);
        txtCustomer.setEnabled(false);
        txtInvoiceNumber.setEnabled(false);
        txtVat.setEnabled(false);
        txtTotalPrice.setEnabled(false);
        txtBookingPrice.setEnabled(false);
        dcIssueDate.setEnabled(false);
        dcPaymentDate.setEnabled(false);

        txtIdApartment.setEnabled(false);
        txtApartment.setEnabled(false);

        btnSave.setEnabled(false);
        btnCancel.setEnabled(false);
        btnDelete.setEnabled(false);
        txtIdPayment.setText("");
        txtInvoiceNumber.setText("");
        txtVat.setText("");
        txtTotalPrice.setText("");
    }

    /**
     * Procedure that enables all the components of the frame so that the user
     * can write anything.
     */
    void enableComponents() {
        txtIdPayment.setVisible(false);
        txtIdBooking.setEnabled(true);
        txtCustomer.setEnabled(true);
        txtInvoiceNumber.setEnabled(true);
        txtVat.setEnabled(true);
        txtTotalPrice.setEnabled(true);
        txtBookingPrice.setEnabled(true);
        dcIssueDate.setEnabled(true);
        dcPaymentDate.setEnabled(true);

        txtIdApartment.setEnabled(true);
        txtApartment.setEnabled(true);

        btnSave.setEnabled(true);
        btnCancel.setEnabled(true);
        btnDelete.setEnabled(true);
        txtIdPayment.setText("");
        txtInvoiceNumber.setText("");
        txtVat.setText("");
        //txtTotalPrice.setText("");
    }

    /**
     * Procedure that finds Payments. It also shows the
     * total number of Payments registered in the DB.
     *
     * @param search The Payment name data to be found in the DB entries.
     */
    void findPayment(String search) {

        try {
            DefaultTableModel model;
            CrudPayment crudPayment = new CrudPayment();
            model = crudPayment.findPayment(search);

            table.setModel(model);
            hideColumns();
            lblTotalRegistries.setText(
                    "Total pagos: "
                    + Integer.toString(crudPayment.totalRegistries)
            );

            //MOSTRAR DATOS DE CONSUMOS
            CrudConsumption crudConsumption = new CrudConsumption();
            model = crudConsumption.findConsumption(search);
            tableConsumptions.setModel(model);
            hideConsumptionCColumns();

            lblTotalRegistries.setText("Total consumos: "
                    + crudConsumption.totalRegistries);
            lblTotalConsumption.setText("Consumo total: "
                    + crudConsumption.totalConsumption + "€");

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
        jScrollPane3 = new javax.swing.JScrollPane();
        tableConsumptions = new javax.swing.JTable();
        lblTotalRegistries = new javax.swing.JLabel();
        lblTotalConsumption = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtIdPayment = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtIdBooking = new javax.swing.JTextField();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtCustomer = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtBookingPrice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtIdApartment = new javax.swing.JTextField();
        txtApartment = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtInvoiceNumber = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtVat = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTotalPrice = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        dcIssueDate = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        dcPaymentDate = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        btnOut = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        lblTotalRegistries1 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(57, 62, 70));
        jLabel1.setText("Pagos");

        jPanel2.setBackground(new java.awt.Color(0, 173, 181));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado de consumos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(238, 238, 238))); // NOI18N

        tableConsumptions.setBackground(new java.awt.Color(57, 62, 70));
        tableConsumptions.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tableConsumptions.setForeground(new java.awt.Color(238, 238, 238));
        tableConsumptions.setModel(new javax.swing.table.DefaultTableModel(
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
        tableConsumptions.setSelectionBackground(new java.awt.Color(57, 62, 70));
        tableConsumptions.setSelectionForeground(new java.awt.Color(238, 238, 238));
        tableConsumptions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableConsumptionsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableConsumptions);

        lblTotalRegistries.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTotalRegistries.setForeground(new java.awt.Color(238, 238, 238));
        lblTotalRegistries.setText("Registros:");

        lblTotalConsumption.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTotalConsumption.setForeground(new java.awt.Color(238, 238, 238));
        lblTotalConsumption.setText("Total: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(474, 474, 474)
                        .addComponent(lblTotalConsumption)
                        .addGap(107, 107, 107)
                        .addComponent(lblTotalRegistries))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalRegistries)
                    .addComponent(lblTotalConsumption))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 173, 181));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de pagos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(238, 238, 238))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(238, 238, 238));

        txtIdPayment.setBackground(new java.awt.Color(238, 238, 238));
        txtIdPayment.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtIdPayment.setForeground(new java.awt.Color(34, 40, 49));
        txtIdPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPaymentActionPerformed(evt);
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

        btnNew.setBackground(new java.awt.Color(57, 62, 70));
        btnNew.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnNew.setForeground(new java.awt.Color(238, 238, 238));
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/bolsa-de-dinero (2).png"))); // NOI18N
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

        txtCustomer.setBackground(new java.awt.Color(238, 238, 238));
        txtCustomer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCustomer.setForeground(new java.awt.Color(34, 40, 49));
        txtCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 238, 238));
        jLabel3.setText("Total reserva:");

        txtBookingPrice.setBackground(new java.awt.Color(238, 238, 238));
        txtBookingPrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtBookingPrice.setForeground(new java.awt.Color(34, 40, 49));
        txtBookingPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBookingPriceActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(238, 238, 238));
        jLabel5.setText("Apartamento:");

        txtIdApartment.setBackground(new java.awt.Color(238, 238, 238));
        txtIdApartment.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtIdApartment.setForeground(new java.awt.Color(34, 40, 49));
        txtIdApartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdApartmentActionPerformed(evt);
            }
        });

        txtApartment.setBackground(new java.awt.Color(238, 238, 238));
        txtApartment.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtApartment.setForeground(new java.awt.Color(34, 40, 49));
        txtApartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApartmentActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(238, 238, 238));
        jLabel7.setText("N.º Factura:");

        txtInvoiceNumber.setBackground(new java.awt.Color(238, 238, 238));
        txtInvoiceNumber.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtInvoiceNumber.setForeground(new java.awt.Color(34, 40, 49));
        txtInvoiceNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInvoiceNumberActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(238, 238, 238));
        jLabel10.setText("IVA:");

        txtVat.setBackground(new java.awt.Color(238, 238, 238));
        txtVat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtVat.setForeground(new java.awt.Color(34, 40, 49));
        txtVat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVatActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(238, 238, 238));
        jLabel11.setText("Total pago:");

        txtTotalPrice.setBackground(new java.awt.Color(238, 238, 238));
        txtTotalPrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTotalPrice.setForeground(new java.awt.Color(34, 40, 49));
        txtTotalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalPriceActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(238, 238, 238));
        jLabel12.setText("Fecha emisión:");

        dcIssueDate.setBackground(new java.awt.Color(238, 238, 238));
        dcIssueDate.setForeground(new java.awt.Color(34, 40, 49));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(238, 238, 238));
        jLabel13.setText("Fecha pago:");

        dcPaymentDate.setBackground(new java.awt.Color(238, 238, 238));
        dcPaymentDate.setForeground(new java.awt.Color(34, 40, 49));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtIdApartment, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApartment, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtIdPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnNew)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSave)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnCancel))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(53, 53, 53)
                                    .addComponent(txtIdBooking)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel11)
                                                    .addComponent(jLabel10)
                                                    .addComponent(jLabel7))
                                                .addGap(34, 34, 34))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addGap(18, 18, 18)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel13)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel5))
                                            .addGap(23, 23, 23)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(dcPaymentDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                        .addComponent(dcIssueDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtTotalPrice, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtVat, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtInvoiceNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtBookingPrice))
                                    .addGap(0, 0, Short.MAX_VALUE))))))
                .addGap(0, 32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(txtIdPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdBooking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdApartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBookingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtInvoiceNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtVat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(dcIssueDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(dcPaymentDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew)
                    .addComponent(btnSave)
                    .addComponent(btnCancel))
                .addGap(61, 61, 61))
        );

        jPanel3.setBackground(new java.awt.Color(0, 173, 181));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado de pagos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(238, 238, 238))); // NOI18N

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
        jScrollPane4.setViewportView(table);

        lblTotalRegistries1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTotalRegistries1.setForeground(new java.awt.Color(238, 238, 238));
        lblTotalRegistries1.setText("Registros:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(btnDelete)
                                .addGap(18, 18, 18)
                                .addComponent(btnOut))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lblTotalRegistries1)
                        .addGap(76, 76, 76))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnOut))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotalRegistries1)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableConsumptionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableConsumptionsMouseClicked
        btnSave.setText("Editar");
        enableComponents();
        btnDelete.setEnabled(true);
        action = "editar";

        int row = tableConsumptions.rowAtPoint(evt.getPoint());

        txtIdPayment.setText(tableConsumptions.getValueAt(row, 0)
                .toString());
        txtIdBooking.setText(tableConsumptions.getValueAt(row, 1)
                .toString());
    }//GEN-LAST:event_tableConsumptionsMouseClicked

    private void txtIdPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdPaymentActionPerformed

    private void txtIdBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdBookingActionPerformed
        txtIdBooking.transferFocus();
    }//GEN-LAST:event_txtIdBookingActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        enableComponents();
        btnSave.setText("Guardar");
        action = "guardar";
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (txtVat.getText().length() == 0) {
            JOptionPane.showConfirmDialog(
                    rootPane,
                    "Por favor, introduzca el IVA."
            );
            txtVat.requestFocus();
            return;
        }
        if (txtTotalPrice.getText().length() == 0) {
            JOptionPane.showConfirmDialog(
                    rootPane,
                    "Por favor, introduzca el total del pago."
            );
            txtTotalPrice.requestFocus();
            return;
        }
        if (txtInvoiceNumber.getText().length() == 0) {
            JOptionPane.showConfirmDialog(
                    rootPane,
                    "Por favor, introduzca el número de la factura."
            );
            txtInvoiceNumber.requestFocus();
            return;
        }

        Payment payment = new Payment();
        CrudPayment crudPayment = new CrudPayment();

        payment.setId_booking(Integer.parseInt(txtIdBooking.getText()));
        payment.setInvoice_number(txtInvoiceNumber.getText());
        payment.setVat(Double.parseDouble(txtVat.getText()));
        payment.setTotal_payment(Double.parseDouble(txtTotalPrice.getText()));

        Calendar calendar;
        int d, m, y;

        calendar = dcPaymentDate.getCalendar();
        d = calendar.get(Calendar.DAY_OF_MONTH);
        m = calendar.get(Calendar.MONTH);
        y = calendar.get(Calendar.YEAR) - 1900;

        payment.setPayment_date(new Date(y, m, d));

        calendar = dcIssueDate.getCalendar();
        d = calendar.get(Calendar.DAY_OF_MONTH);
        m = calendar.get(Calendar.MONTH);
        y = calendar.get(Calendar.YEAR) - 1900;

        payment.setIssue_date(new Date(y, m, d));

        if (action.equals("guardar")) {
            if (crudPayment.create(payment)) {
                JOptionPane.showMessageDialog(
                        rootPane,
                        "Se registró el pago de " + txtTotalPrice.getText() + "€ del cliente "
                        + txtCustomer.getText() + " satisfactoriamente."
                );
                findPayment(id_booking);
                disableComponents();

                // MAKE APARTMENT FREE
                CrudApartment crudApartment = new CrudApartment();
                Apartment apartment = new Apartment();
                apartment.setId_room(Integer.parseInt(txtIdApartment.getText()));
                crudApartment.freeApartment(apartment);

                // CANCEL OR PAY BOOKING
                CrudBooking crudBooking = new CrudBooking();
                Booking booking = new Booking();
                booking.setId_booking(Integer.parseInt(txtIdBooking.getText()));
                crudBooking.pay(booking);

            }
        } else if (action.equals("editar")) {
            payment.setId_payment(Integer.parseInt(
                    txtIdPayment.getText()
            ));

            if (crudPayment.update(payment)) {
                JOptionPane.showMessageDialog(
                        rootPane,
                        "Se actualizó el pago del cliente " + txtCustomer.getText()
                        + " satisfactoriamente."
                );
                findPayment(id_booking);
                disableComponents();

            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerActionPerformed

    private void txtBookingPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBookingPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBookingPriceActionPerformed

    private void txtIdApartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdApartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdApartmentActionPerformed

    private void txtApartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApartmentActionPerformed

    private void txtInvoiceNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInvoiceNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInvoiceNumberActionPerformed

    private void txtVatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVatActionPerformed

    private void txtTotalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalPriceActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (!txtIdPayment.getText().equals("")) {
            int confirmation = JOptionPane.showConfirmDialog(
                    rootPane,
                    "¿Está seguro de eliminar el pago?",
                    "Confirmar",
                    2
            );

            if (confirmation == 0) {
                CrudPayment crudPayment = new CrudPayment();
                Payment payment = new Payment();

                payment.setId_payment(
                        Integer.parseInt(
                                txtIdPayment.getText()
                        ));
                crudPayment.delete(payment);
                findPayment("");
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

        txtIdPayment.setText(table.getValueAt(row, 0).toString());
        //txtIdBooking.setText(table.getValueAt(row, 1).toString());
        txtInvoiceNumber.setText(table.getValueAt(row, 2).toString());
        txtVat.setText(table.getValueAt(row, 3).toString());
        txtTotalPrice.setText(table.getValueAt(row, 4).toString());
        dcIssueDate.setDate(Date.valueOf(table.getValueAt(row, 5)
                .toString()));
        dcIssueDate.setDate(Date.valueOf(table.getValueAt(row, 6)
                .toString()));
    }//GEN-LAST:event_tableMouseClicked

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
            java.util.logging.Logger.getLogger(FrmPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPayment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnOut;
    private javax.swing.JButton btnSave;
    private com.toedter.calendar.JDateChooser dcIssueDate;
    private com.toedter.calendar.JDateChooser dcPaymentDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblTotalConsumption;
    private javax.swing.JLabel lblTotalRegistries;
    private javax.swing.JLabel lblTotalRegistries1;
    private javax.swing.JTable table;
    private javax.swing.JTable tableConsumptions;
    private javax.swing.JTextField txtApartment;
    private javax.swing.JTextField txtBookingPrice;
    private javax.swing.JTextField txtCustomer;
    private javax.swing.JTextField txtIdApartment;
    private javax.swing.JTextField txtIdBooking;
    private javax.swing.JTextField txtIdPayment;
    private javax.swing.JTextField txtInvoiceNumber;
    private javax.swing.JTextField txtTotalPrice;
    private javax.swing.JTextField txtVat;
    // End of variables declaration//GEN-END:variables
}
