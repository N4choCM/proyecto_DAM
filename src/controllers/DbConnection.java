/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * Class that establishes the connection with a DB called bookings_db. This DB
 * was previously created using MySql. It has an empty constructor and a method
 * called connect().
 * @author Juan Ignacio Campos Martí
 */
public class DbConnection {
    public String db = "bookings_db";
    public String url = "jdbc:mysql://127.0.0.1/" + db;
    public String user = "root";
    public String password = "";

    public DbConnection() {
    }
    
    /**
     * Method that establishes the connection to the DB using the MySql driver
     * and the URL, User and Password attributes given above.
     * @return an instance of java.sql.Connection filled with the required
     * data to establish a connection to our DB called bookings_db
     */
    public Connection connect(){
        Connection connection = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    this.url,
                   this.user,
                this.password
            );
        } catch (ClassNotFoundException | SQLException e){
            JOptionPane.showConfirmDialog(null, e);
        }
        return connection;
    }
}
