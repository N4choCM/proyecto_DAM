/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import entity.Booking;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Class that establishes the CRUD methods to Create, Retrieve, Update and
 * Delete Bookings in the table 'booking' of the DB bookings_db.
 *
 * @author Juan Ignacio Campos Martí
 */
public class CrudBooking {

    private DbConnection mysql = new DbConnection();
    private Connection connection = mysql.connect();
    private String sSql = "";
    public int totalRegistries;

    /**
     * Method that finds Bookings by their name field. It will be later linked
     * to the listener of the 'Buscar reserva' button (btnSearch).
     *
     * @param search The data entered by the user to be found in the DB.
     * @return An instance of javax.swing.table.DefaultTableModel with all the
     * rows found.
     */
    public DefaultTableModel findBooking(String search) {
        DefaultTableModel model;

        String[] headers = {"ID", "ID_Apartamento", "Número", "ID_Cliente",
            "Cliente", "ID_Trabajador", "Trabajador", "Tipo_reserva", "Fecha_reserva",
            "Fecha_Ingreso", "Fecha Salida", "Costo", "Estado"};

        String[] registries = new String[13];

        totalRegistries = 0;
        model = new DefaultTableModel(null, headers);

        sSql = "SELECT b.id_booking, b.id_room, r.room_number, b.id_customer,"
                + " (SELECT name FROM person WHERE id_person = b.id_customer)"
                + "  AS customer_name, (SELECT last_names FROM person "
                + "WHERE id_person = b.id_customer) AS customer_last_names, "
                + "b.id_employee, (SELECT name FROM person "
                + "WHERE id_person = b.id_employee) AS employee_name, "
                + "(SELECT last_names FROM person "
                + "WHERE id_person = b.id_employee) AS employee_last_names, "
                + "b.type, b.booking_date, b.checkin_date, b.checkout_date, "
                + "b.price, b.status FROM booking b INNER JOIN room r  "
                + "ON b.id_room = r.id_room WHERE b.booking_date LIKE '%"
                + search + "%' ORDER BY id_booking";

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sSql);

            while (resultSet.next()) {
                registries[0] = resultSet.getString("id_booking");
                registries[1] = resultSet.getString("id_room");
                registries[2] = resultSet.getString("room_number");
                registries[3] = resultSet.getString("id_customer");
                registries[4] = resultSet.getString("customer_name") + " "
                        + resultSet.getString("customer_last_names");
                registries[5] = resultSet.getString("id_employee");
                registries[6] = resultSet.getString("employee_name") + " "
                        + resultSet.getString("employee_last_names");
                registries[7] = resultSet.getString("type");
                registries[8] = resultSet.getString("booking_date");
                registries[9] = resultSet.getString("checkin_date");
                registries[10] = resultSet.getString("checkout_date");
                registries[11] = resultSet.getString("price");
                registries[12] = resultSet.getString("status");

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
     * Method that enters a new Booking in the DB. It will be later linked to
     * the listener of the 'Nuevo' button (btnNew).
     *
     * @param booking The data of the new Booking to be stored in the DB.
     * @return True if the new Booking was stored successfully or false if it
     * was not.
     */
    public boolean create(Booking booking) {

        sSql = "INSERT INTO booking (id_room, id_customer, id_employee, type,"
                + " booking_date, checkin_date, checkout_date, price, status)"
                + " values (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement preparedStatement
                    = connection.prepareStatement(sSql);

            preparedStatement.setInt(1, booking.getId_room());
            preparedStatement.setInt(2, booking.getId_customer());
            preparedStatement.setInt(3, booking.getId_employee());
            preparedStatement.setString(4, booking.getType());
            preparedStatement.setDate(5, booking.getBooking_date());
            preparedStatement.setDate(6, booking.getCheckin_date());
            preparedStatement.setDate(7, booking.getCheckout_date());
            preparedStatement.setDouble(8, booking.getPrice());
            preparedStatement.setString(9, booking.getStatus());

            int i = preparedStatement.executeUpdate();

            if (i != 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    /**
     * Method that updates a Booking in the DB. It will be later linked to the
     * listener of the 'Editar' button (btnUpdate).
     *
     * @param booking The data of the Booking to be updated in the DB.
     * @return True if the Booking was updated successfully or false if it was
     * not.
     */
    public boolean update(Booking booking) {

        sSql = "UPDATE booking SET id_room=?, id_customer=?, id_employee=?,"
                + " type=?, booking_date=?, checkin_date=?, checkout_date=?,"
                + " price=?, status=? WHERE id_booking=?";

        try {
            PreparedStatement preparedStatement
                    = connection.prepareStatement(sSql);

            preparedStatement.setInt(1, booking.getId_room());
            preparedStatement.setInt(2, booking.getId_customer());
            preparedStatement.setInt(3, booking.getId_employee());
            preparedStatement.setString(4, booking.getType());
            preparedStatement.setDate(5, booking.getBooking_date());
            preparedStatement.setDate(6, booking.getCheckin_date());
            preparedStatement.setDate(7, booking.getCheckout_date());
            preparedStatement.setDouble(8, booking.getPrice());
            preparedStatement.setString(9, booking.getStatus());
            preparedStatement.setInt(10, booking.getId_booking());

            int i = preparedStatement.executeUpdate();

            if (i != 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    
    public boolean pay(Booking booking) {

        sSql = "UPDATE booking SET status='Pagado' WHERE id_booking=?";

        try {
            PreparedStatement preparedStatement
                    = connection.prepareStatement(sSql);
            
            preparedStatement.setInt(1, booking.getId_booking());

            int i = preparedStatement.executeUpdate();

            if (i != 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    /**
     * Method that deletes a Booking in the DB. It will be later linked to the
     * listener of the 'Eliminar' button (btnDelete).
     *
     * @param booking The data of the Booking to be deleted in the DB.
     * @return True if the Booking was deleted successfully or false if it was
     * not.
     */
    public boolean delete(Booking booking) {

        sSql = "DELETE FROM booking WHERE id_booking=?";

        try {
            PreparedStatement preparedStatement
                    = connection.prepareStatement(sSql);

            preparedStatement.setInt(1, booking.getId_booking());

            int i = preparedStatement.executeUpdate();

            if (i != 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

}
