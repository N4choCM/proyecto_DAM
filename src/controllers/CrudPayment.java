/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import entity.Payment;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Class that establishes the CRUD methods to Create, Retrieve, Update and 
 * Delete Payments in the table 'payment' of the DB bookings_db.
 * @author Juan Ignacio Campos Martí
 */
public class CrudPayment {
    
    private DbConnection mysql = new DbConnection();
    private Connection connection = mysql.connect();
    private String sSql = "";
    public int totalRegistries;
    
    /**
     * Method that finds Payments.
     * It will be later linked to the listener of the 'Pagos'
     * button (btnSearch).
     * @param search The data entered by the user to be found in the DB.
     * @return  An instance of javax.swing.table.DefaultTableModel with all
     * the rows found.
     */
    public DefaultTableModel findPayment(String search){
        DefaultTableModel model;
        
        String[] headers = {"ID", "Cód. reserva", "N.º Factura", "IVA", "Total", 
            "Fecha emisión", "Fecha pago"};
        
        String[] registries = new String [7];
        
        totalRegistries = 0;
        model = new DefaultTableModel(null, headers);
        
        sSql = "SELECT * FROM payment WHERE id_booking = " + search + 
                " ORDER BY id_payment desc";
        
        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sSql);
            
            while(resultSet.next()){
                registries[0] = resultSet.getString("id_payment");
                registries[1] = resultSet.getString("id_booking");
                registries[2] = resultSet.getString("invoice_number");
                registries[3] = resultSet.getString("vat");
                registries[4] = resultSet.getString("total_payment");
                registries[5] = resultSet.getString("issue_date");
                registries[6] = resultSet.getString("payment_date");
                
                totalRegistries++;
                model.addRow(registries);
            }
            return model;
            
            
        }catch (SQLException e){
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
    /**
     * Method that enters a new Payment in the DB.
     * It will be later linked to the listener of the 'Nuevo' button (btnNew).
     * @param payment The data of the new Payment to be stored in the DB.
     * @return True if the new Payment was stored successfully or false if 
     * it was not.
     */
    public boolean create (Payment payment){
        
        sSql = "INSERT INTO payment (id_booking, invoice_number, vat, total_payment,"
                + " issue_date, payment_date) values (?, ?, ?, ?, ?, ?)";
        
        try{
            PreparedStatement preparedStatement = 
                    connection.prepareStatement(sSql);
            
            preparedStatement.setInt(1, payment.getId_booking());
            preparedStatement.setString(2, payment.getInvoice_number());
            preparedStatement.setDouble(3, payment.getVat());
            preparedStatement.setDouble(4, payment.getTotal_payment());
            preparedStatement.setDate(5, payment.getIssue_date());
            preparedStatement.setDate(6, payment.getPayment_date());
            
            int i = preparedStatement.executeUpdate();
            
            if(i != 0) {
                return true;
            }else{
                return false;
            }
        }catch (SQLException e){
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    
    /**
     * Method that updates a Payment in the DB.
     * It will be later linked to the listener of the 'Editar' button 
     * (btnUpdate).
     * @param payment The data of the Payment to be updated in the DB.
     * @return True if the Payment was updated successfully or false if 
     * it was not.
     */
    public boolean update (Payment payment){
        
        sSql = "UPDATE payment SET id_booking=?, invoice_number=?, vat=?,"
                + " total_payment=?, issue_date=?, payment_date=? WHERE id_payment=?";
        
        try{
            PreparedStatement preparedStatement = 
                    connection.prepareStatement(sSql);
            
            preparedStatement.setInt(1, payment.getId_booking());
            preparedStatement.setString(2, payment.getInvoice_number());
            preparedStatement.setDouble(3, payment.getVat());
            preparedStatement.setDouble(4, payment.getTotal_payment());
            preparedStatement.setDate(5, payment.getIssue_date());
            preparedStatement.setDate(6, payment.getPayment_date());
            preparedStatement.setInt(7, payment.getId_payment());


            int i = preparedStatement.executeUpdate();
            
            if(i != 0) {
                return true;
            }else{
                return false;
            }
        }catch (SQLException e){
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
        
    /**
     * Method that deletes a Payment in the DB.
     * It will be later linked to the listener of the 'Eliminar' button 
     * (btnDelete).
     * @param payment The data of the Payment to be deleted in the DB.
     * @return True if the Payment was deleted successfully or false if 
     * it was not.
     */
    public boolean delete (Payment payment){
        
        sSql = "DELETE FROM payment WHERE id_payment=?";
        
        try{
            PreparedStatement preparedStatement = 
                    connection.prepareStatement(sSql);
            
            preparedStatement.setInt(1, payment.getId_payment());
            
            int i = preparedStatement.executeUpdate();
            
            if(i != 0) {
                return true;
            }else{
                return false;
            }
        }catch (SQLException e){
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    
    
}
