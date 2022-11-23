/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import entity.Consumption;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Class that establishes the CRUD methods to Create, Retrieve, Update and 
 * Delete Consumptions in the table 'consumption' of the DB bookings_db.
 * @author Juan Ignacio Campos Martí
 */
public class CrudConsumption {
    
    private DbConnection mysql = new DbConnection();
    private Connection connection = mysql.connect();
    private String sSql = "";
    public int totalRegistries;
    public double totalConsumption;
    
    /**
     * Method that finds Consumptions by their id.
     * It will be later linked to the listener of the 'Buscar consumption'
     * button (btnSearch).
     * @param search The data entered by the user to be found in the DB.
     * @return  An instance of javax.swing.table.DefaultTableModel with all
     * the rows found.
     */
    public DefaultTableModel findConsumption(String search){
        DefaultTableModel model;
        
        String[] headers = {"ID", "ID_RESERVA", "ID_PRODUCTO", "Producto", 
            "Cantidad", "PVP", "Estado"};
        
        String[] registries = new String [7];
        
        totalRegistries = 0;
        totalConsumption = 0.0;
        model = new DefaultTableModel(null, headers);
        
        sSql = "SELECT c.id_consumption, c.id_booking, c.id_product, p.name, "
                + "c.amount, c.price, c.status FROM consumption c INNER JOIN "
                + "product p ON c.id_product = p.id_product WHERE c.id_booking = "
                + "'%" + search + "%' ORDER BY c.id_consumption DESC";
        
        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sSql);
            
            while(resultSet.next()){
                registries[0] = resultSet.getString("id_consumption");
                registries[1] = resultSet.getString("id_booking");
                registries[2] = resultSet.getString("id_product");
                registries[3] = resultSet.getString("name");
                registries[4] = resultSet.getString("amount");
                registries[5] = resultSet.getString("price");
                registries[6] = resultSet.getString("status");
                
                totalRegistries++;
                totalConsumption = totalConsumption + 
                        (resultSet.getDouble("amount") * 
                        resultSet.getDouble("price"));
                model.addRow(registries);
            }
            return model;
            
            
        }catch (SQLException e){
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
    /**
     * Method that enters a new Consumption in the DB.
     * It will be later linked to the listener of the 'Nuevo' button (btnNew).
     * @param consumption The data of the new Consumption to be stored in the DB.
     * @return True if the new Consumption was stored successfully or false if 
     * it was not.
     */
    public boolean create (Consumption consumption){
        
        sSql = "INSERT INTO consumption (id_booking, id_product, amount, price, status)"
                + " values (?, ?, ?, ?, ?)";
        
        try{
            PreparedStatement preparedStatement = 
                    connection.prepareStatement(sSql);
            
            preparedStatement.setInt(1, consumption.getId_booking());
            preparedStatement.setInt(2, consumption.getId_product());
            preparedStatement.setDouble(3, consumption.getAmount());
            preparedStatement.setDouble(4, consumption.getPrice());
            preparedStatement.setString(5, consumption.getStatus());
            
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
     * Method that updates a Consumption in the DB.
     * It will be later linked to the listener of the 'Editar' button 
     * (btnUpdate).
     * @param consumption The data of the Consumption to be updated in the DB.
     * @return True if the Consumption was updated successfully or false if 
     * it was not.
     */
    public boolean update (Consumption consumption){
        
        sSql = "UPDATE consumption SET id_booking=?, id_product=?, amount=?,"
                + " price=?, status=? WHERE id_consumption=?";
        
        try{
            PreparedStatement preparedStatement = 
                    connection.prepareStatement(sSql);
            
            preparedStatement.setInt(1, consumption.getId_booking());
            preparedStatement.setInt(2, consumption.getId_product());
            preparedStatement.setDouble(3, consumption.getAmount());
            preparedStatement.setDouble(4, consumption.getPrice());
            preparedStatement.setString(5, consumption.getStatus());
            preparedStatement.setInt(6, consumption.getId_consumption());

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
     * Method that deletes a Consumption in the DB.
     * It will be later linked to the listener of the 'Eliminar' button 
     * (btnDelete).
     * @param consumption The data of the Consumption to be deleted in the DB.
     * @return True if the Consumption was deleted successfully or false if 
     * it was not.
     */
    public boolean delete (Consumption consumption){
        
        sSql = "DELETE FROM consumption WHERE id_consumption=?";
        
        try{
            PreparedStatement preparedStatement = 
                    connection.prepareStatement(sSql);
            
            preparedStatement.setInt(1, consumption.getId_consumption());
            
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
