/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import entity.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Class that establishes the CRUD methods to Create, Retrieve, Update and
 * Delete Customers in the table 'customer' of the DB bookings_db.
 *
 * @author Juan Ignacio Campos Martí
 */
public class CrudCustomer {

    private DbConnection mysql = new DbConnection();
    private Connection connection = mysql.connect();
    private String sSql = "";
    private String sSql2 = "";
    public int totalRegistries;

    /**
     * Method that finds Customers in the DB. It will be later linked
     * to the listener of the 'Buscar cliente' button (btnSearch).
     *
     * @param search The data entered by the user to be found in the DB.
     * @return An instance of javax.swing.table.DefaultTableModel with all the
     * rows found.
     */
    public DefaultTableModel findCustomer(String search) {
        DefaultTableModel model;

        String[] headers = {"ID", "Nombre", "Apellidos", "DNI", "Dirección",
            "Tel.", "Email", "Código"};

        String[] registries = new String[8];

        totalRegistries = 0;
        model = new DefaultTableModel(null, headers);

        sSql = "SELECT p.id_person, p.name, p.last_names, p.national_id, "
                + "p.address, p.phone, p.email, c.id_customer FROM  person p "
                + "INNER JOIN customer c ON p.id_person = c.id_person WHERE "
                + "national_id LIKE '%" + search + "%' ORDER BY id_person desc";

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sSql);

            while (resultSet.next()) {
                registries[0] = resultSet.getString("id_person");
                registries[1] = resultSet.getString("name");
                registries[2] = resultSet.getString("last_names");
                registries[3] = resultSet.getString("national_id");
                registries[4] = resultSet.getString("address");
                registries[5] = resultSet.getString("phone");
                registries[6] = resultSet.getString("email");
                registries[7] = resultSet.getString("id_customer");

                totalRegistries++;
                model.addRow(registries);
            }
            return model;

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    /**
     * Method that enters a new Customer in the DB. It will be later linked to
     * the listener of the 'Nuevo' button (btnNew).
     *
     * @param customer The data of the new Customer to be stored in the DB.
     * @return True if the new Person was stored successfully or false if it
     * was not.
     */
    public boolean create(Customer customer) {

        sSql = "INSERT INTO person (name, last_names, national_id, address, phone, email)"
                + " values (?, ?, ?, ?, ?, ?)";
        sSql2 = "INSERT INTO customer (id_person, id_customer)"
                + " values ((SELECT id_person FROM person ORDER BY id_person"
                + " desc LIMIT 1), ?)";

        try {
            PreparedStatement preparedStatement
                    = connection.prepareStatement(sSql);
            PreparedStatement preparedStatement2
                    = connection.prepareStatement(sSql2);

            preparedStatement.setString(1, customer.getName());
            preparedStatement.setString(2, customer.getLast_names());
            preparedStatement.setString(3, customer.getNational_id());
            preparedStatement.setString(4, customer.getAddress());
            preparedStatement.setString(5, customer.getPhone());
            preparedStatement.setString(6, customer.getEmail());

            preparedStatement2.setString(1, customer.getId_customer());

            int i = preparedStatement.executeUpdate();

            if (i != 0) {
                int j = preparedStatement2.executeUpdate();

                if (j != 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    /**
     * Method that updates a Customer in the DB. It will be later linked to the
     * listener of the 'Editar' button (btnUpdate).
     *
     * @param customer The data of the Customer to be updated in the DB.
     * @return True if the Customer was updated successfully or false if it was
     * not.
     */
    public boolean update(Customer customer) {

        sSql = "UPDATE person SET name=?, last_names=?, national_id=?, address=?,"
                + " phone=?, email=? WHERE id_person=?";
        
        sSql2 = "UPDATE customer SET id_customer=? WHERE id_person=?";

        try {
            PreparedStatement preparedStatement
                    = connection.prepareStatement(sSql);
            PreparedStatement preparedStatement2
                    = connection.prepareStatement(sSql2);

            preparedStatement.setString(1, customer.getName());
            preparedStatement.setString(2, customer.getLast_names());
            preparedStatement.setString(3, customer.getNational_id());
            preparedStatement.setString(4, customer.getAddress());
            preparedStatement.setString(5, customer.getPhone());
            preparedStatement.setString(6, customer.getEmail());
            preparedStatement.setInt(7, customer.getId_person());

            preparedStatement2.setString(1, customer.getId_customer());
            preparedStatement2.setInt(2, customer.getId_person());

            int i = preparedStatement.executeUpdate();

            if (i != 0) {
                int j = preparedStatement2.executeUpdate();

                if (j != 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    /**
     * Method that deletes a Customer in the DB. It will be later linked to the
     * listener of the 'Eliminar' button (btnDelete).
     *
     * @param customer The data of the Customer to be deleted in the DB.
     * @return True if the Customer was deleted successfully or false if it was
     * not.
     */
    public boolean delete(Customer customer) {

        sSql = "DELETE FROM customer WHERE id_person=?";
        sSql2 = "DELETE FROM person WHERE id_person=?";

        try {
            PreparedStatement preparedStatement
                    = connection.prepareStatement(sSql);
            PreparedStatement preparedStatement2
                    = connection.prepareStatement(sSql2);

            preparedStatement.setInt(1, customer.getId_person());

            preparedStatement2.setInt(1, customer.getId_person());

            int i = preparedStatement.executeUpdate();

            if (i != 0) {
                int j = preparedStatement2.executeUpdate();

                if (j != 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

}
