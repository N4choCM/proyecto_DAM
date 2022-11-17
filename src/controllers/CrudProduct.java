/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Class that establishes the CRUD methods to Create, Retrieve, Update and 
 * Delete Products in the table 'product' of the DB bookings_db.
 * @author Juan Ignacio Campos Martí
 */
public class CrudProduct {
    
    private DbConnection mysql = new DbConnection();
    private Connection connection = mysql.connect();
    private String sSql = "";
    public int totalRegistries;
    
    /**
     * Method that finds Products by their name field.
     * It will be later linked to the listener of the 'Buscar producto'
     * button (btnSearch).
     * @param search The data entered by the user to be found in the DB.
     * @return  An instance of javax.swing.table.DefaultTableModel with all
     * the rows found.
     */
    public DefaultTableModel findByProductName(String search){
        DefaultTableModel model;
        
        String[] headers = {"ID", "Producto", "Descripción", "Precio", 
            "Unidad de medida"};
        
        String[] registries = new String [5];
        
        totalRegistries = 0;
        model = new DefaultTableModel(null, headers);
        
        sSql = "SELECT * FROM product WHERE name LIKE '%" + search + 
                "%' ORDER BY id_product";
        
        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sSql);
            
            while(resultSet.next()){
                registries[0] = resultSet.getString("id_product");
                registries[1] = resultSet.getString("name");
                registries[2] = resultSet.getString("description");
                registries[3] = resultSet.getString("price");
                registries[4] = resultSet.getString("unit_measure");
                
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
     * Method that enters a new Product in the DB.
     * It will be later linked to the listener of the 'Nuevo' button (btnNew).
     * @param product The data of the new Product to be stored in the DB.
     * @return True if the new Product was stored successfully or false if 
     * it was not.
     */
    public boolean create (Product product){
        
        sSql = "INSERT INTO product (name, description, price, unit_measure)"
                + " values (?, ?, ?, ?)";
        
        try{
            PreparedStatement preparedStatement = 
                    connection.prepareStatement(sSql);
            
            preparedStatement.setString(1, product.getName());
            preparedStatement.setString(2, product.getDescription());
            preparedStatement.setDouble(3, product.getPrice());
            preparedStatement.setString(4, product.getUnit_measure());
            
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
     * Method that updates a Product in the DB.
     * It will be later linked to the listener of the 'Editar' button 
     * (btnUpdate).
     * @param product The data of the Product to be updated in the DB.
     * @return True if the Product was updated successfully or false if 
     * it was not.
     */
    public boolean update (Product product){
        
        sSql = "UPDATE product SET name=?, description=?, price=?,"
                + " unit_measure=? WHERE id_product=?";
        
        try{
            PreparedStatement preparedStatement = 
                    connection.prepareStatement(sSql);
            
            preparedStatement.setString(1, product.getName());
            preparedStatement.setString(2, product.getDescription());
            preparedStatement.setDouble(3, product.getPrice());
            preparedStatement.setString(4, product.getUnit_measure());
            preparedStatement.setInt(5, product.getId_product());


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
     * Method that deletes a Product in the DB.
     * It will be later linked to the listener of the 'Eliminar' button 
     * (btnDelete).
     * @param product The data of the Product to be deleted in the DB.
     * @return True if the Product was deleted successfully or false if 
     * it was not.
     */
    public boolean delete (Product product){
        
        sSql = "DELETE FROM product WHERE id_product=?";
        
        try{
            PreparedStatement preparedStatement = 
                    connection.prepareStatement(sSql);
            
            preparedStatement.setInt(1, product.getId_product());
            
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
