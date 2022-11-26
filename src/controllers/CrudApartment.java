/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import entity.Apartment;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Class that establishes the CRUD methods to Create, Retrieve, Update and 
 * Delete Apartments in the table 'room' of the DB bookings_db.
 * @author Juan Ignacio Campos Martí
 */
public class CrudApartment {
    private DbConnection mysql = new DbConnection();
    private Connection connection = mysql.connect();
    private String sSql = "";
    public int totalRegistries;
    
    /**
     * Method that finds Apartments by their floor field.
     * It will be later linked to the listener of the 'Buscar por planta'
     * button (btnSearch).
     * @param search The data entered by the user to be found in the DB.
     * @return  An instance of javax.swing.table.DefaultTableModel with all
     * the rows found.
     */
    public DefaultTableModel findByFloor(String search){
        DefaultTableModel model;
        
        String[] headers = {"ID", "Número", "Planta", "Descripción", 
            "Características", "Precio", "Estado", "Tipo apartamento"};
        
        String[] registries = new String [8];
        
        totalRegistries = 0;
        model = new DefaultTableModel(null, headers);
        
        sSql = "SELECT * FROM room WHERE floor LIKE '%" + search + 
                "%' ORDER BY id_room";
        
        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sSql);
            
            while(resultSet.next()){
                registries[0] = resultSet.getString("id_room");
                registries[1] = resultSet.getString("room_number");
                registries[2] = resultSet.getString("floor");
                registries[3] = resultSet.getString("description");
                registries[4] = resultSet.getString("features");
                registries[5] = resultSet.getString("price");
                registries[6] = resultSet.getString("status");
                registries[7] = resultSet.getString("room_type");
                
                totalRegistries++;
                model.addRow(registries);
            }
            return model;
            
            
        }catch (SQLException e){
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
    /** TODO
     * Method that finds Apartments by their floor field.
     * It will be later linked to the listener of the 'Buscar por planta'
     * button (btnSearch).
     * @param search The data entered by the user to be found in the DB.
     * @return  An instance of javax.swing.table.DefaultTableModel with all
     * the rows found.
     */
    public DefaultTableModel findInView(String search){
        DefaultTableModel model;
        
        String[] headers = {"ID", "Número", "Planta", "Descripción", 
            "Características", "Precio", "Estado", "Tipo apartamento"};
        
        String[] registries = new String [8];
        
        totalRegistries = 0;
        model = new DefaultTableModel(null, headers);
        
        sSql = "SELECT * FROM room WHERE floor LIKE '%" + search + 
                "%' AND status = 'Disponible' ORDER BY id_room";
        
        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sSql);
            
            while(resultSet.next()){
                registries[0] = resultSet.getString("id_room");
                registries[1] = resultSet.getString("room_number");
                registries[2] = resultSet.getString("floor");
                registries[3] = resultSet.getString("description");
                registries[4] = resultSet.getString("features");
                registries[5] = resultSet.getString("price");
                registries[6] = resultSet.getString("status");
                registries[7] = resultSet.getString("room_type");
                
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
     * Method that enters a new Apartment in the DB.
     * It will be later linked to the listener of the 'Nuevo' button (btnNew).
     * @param apartment The data of the new Apartment to be stored in the DB.
     * @return True if the new Apartment was stored successfully or false if 
     * it was not.
     */
    public boolean create (Apartment apartment){
        
        sSql = "INSERT INTO room (room_number, floor, description, features, " +
                "price, status, room_type) values (?, ?, ?, ?, ?, ?, ?)";
        
        try{
            PreparedStatement preparedStatement = 
                    connection.prepareStatement(sSql);
            
            preparedStatement.setString(1, apartment.getRoom_number());
            preparedStatement.setString(2, apartment.getFloor());
            preparedStatement.setString(3, apartment.getDescription());
            preparedStatement.setString(4, apartment.getFeatures());
            preparedStatement.setDouble(5, apartment.getPrice());
            preparedStatement.setString(6, apartment.getStatus());
            preparedStatement.setString(7, apartment.getRoom_type());
            
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
     * Method that updates an Apartment in the DB.
     * It will be later linked to the listener of the 'Editar' button 
     * (btnUpdate).
     * @param apartment The data of the Apartment to be updated in the DB.
     * @return True if the Apartment was updated successfully or false if 
     * it was not.
     */
    public boolean update (Apartment apartment){
        
        sSql = "UPDATE room SET room_number=?, floor=?, description=?,"
                + " features=?, price=?, status=?, room_type=? WHERE id_room=?";
        
        try{
            PreparedStatement preparedStatement = 
                    connection.prepareStatement(sSql);
            
            preparedStatement.setString(1, apartment.getRoom_number());
            preparedStatement.setString(2, apartment.getFloor());
            preparedStatement.setString(3, apartment.getDescription());
            preparedStatement.setString(4, apartment.getFeatures());
            preparedStatement.setDouble(5, apartment.getPrice());
            preparedStatement.setString(6, apartment.getStatus());
            preparedStatement.setString(7, apartment.getRoom_type());
            preparedStatement.setInt(8, apartment.getId_room());
            
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
    
    public boolean freeApartment (Apartment apartment){
        
        sSql = "UPDATE room SET status='Disponible' WHERE id_room = ?";
        
        try{
            PreparedStatement preparedStatement = 
                    connection.prepareStatement(sSql);
            
            preparedStatement.setInt(1, apartment.getId_room());
            
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
    
    public boolean bookApartment (Apartment apartment){
        
        sSql = "UPDATE room SET status='No disponible' WHERE id_room = ?";
        
        try{
            PreparedStatement preparedStatement = 
                    connection.prepareStatement(sSql);
            
            preparedStatement.setInt(1, apartment.getId_room());
            
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
     * Method that deletes an Apartment in the DB.
     * It will be later linked to the listener of the 'Eliminar' button 
     * (btnDelete).
     * @param apartment The data of the Apartment to be deleted in the DB.
     * @return True if the Apartment was deleted successfully or false if 
     * it was not.
     */
    public boolean delete (Apartment apartment){
        
        sSql = "DELETE FROM room WHERE id_room=?";
        
        try{
            PreparedStatement preparedStatement = 
                    connection.prepareStatement(sSql);
            
            preparedStatement.setInt(1, apartment.getId_room());
            
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
