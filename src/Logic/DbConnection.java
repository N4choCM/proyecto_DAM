/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author nacho
 */
public class DbConnection {
    public String db = "bookings_db";
    public String url = "jdbc:mysql://127.0.0.1/" + db;
    public String user = "root";
    public String password = "";

    public DbConnection() {
    }
    
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
