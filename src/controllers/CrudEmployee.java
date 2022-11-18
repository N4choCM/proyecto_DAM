/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import entity.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Class that establishes the CRUD methods to Create, Retrieve, Update and
 * Delete Employees in the table 'employee' of the DB bookings_db.
 *
 * @author Juan Ignacio Campos Martí
 */
public class CrudEmployee {

    private DbConnection mysql = new DbConnection();
    private Connection connection = mysql.connect();
    private String sSql = "";
    private String sSql2 = "";
    public int totalRegistries;

    /**
     * Method that finds Employees in the DB. It will be later linked
     * to the listener of the 'Buscar producto' button (btnSearch).
     *
     * @param search The data entered by the user to be found in the DB.
     * @return An instance of javax.swing.table.DefaultTableModel with all the
     * rows found.
     */
    public DefaultTableModel findEmployee(String search) {
        DefaultTableModel model;

        String[] headers = {"ID", "Nombre", "Apellidos", "DNI", "Dirección",
            "Tel.", "Email", "Salario", "Acceso", "Login", "Contraseña", 
            "Estado"};

        String[] registries = new String[12];

        totalRegistries = 0;
        model = new DefaultTableModel(null, headers);

        sSql = "SELECT p.id_person, p.name, p.last_names, p.national_id, "
                + "p.address, p.phone, p.email, e.salary, e.access, e.login,"
                + " e.password, e.status FROM  person p INNER JOIN employee e "
                + "ON p.id_person = e.id_person WHERE national_id LIKE '%" 
                + search + "%' ORDER BY id_person desc";

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
                registries[7] = resultSet.getString("salary");
                registries[8] = resultSet.getString("access");
                registries[9] = resultSet.getString("login");
                registries[10] = resultSet.getString("password");
                registries[11] = resultSet.getString("status");

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
     * Method that enters a new Employee in the DB. It will be later linked to
     * the listener of the 'Nuevo' button (btnNew).
     *
     * @param employee The data of the new Employee to be stored in the DB.
     * @return True if the new Employee was stored successfully or false if it
     * was not.
     */
    public boolean create(Employee employee) {

        sSql = "INSERT INTO person (name, last_names, national_id, address, phone, email)"
                + " values (?, ?, ?, ?, ?, ?)";
        sSql2 = "INSERT INTO employee (id_person, salary, access, login, password, status)"
                + " values ((SELECT id_person FROM person ORDER BY id_person"
                + " desc LIMIT 1), ?, ?, ?, ?, ?)";

        try {
            PreparedStatement preparedStatement
                    = connection.prepareStatement(sSql);
            PreparedStatement preparedStatement2
                    = connection.prepareStatement(sSql2);

            preparedStatement.setString(1, employee.getName());
            preparedStatement.setString(2, employee.getLast_names());
            preparedStatement.setString(3, employee.getNational_id());
            preparedStatement.setString(4, employee.getAddress());
            preparedStatement.setString(5, employee.getPhone());
            preparedStatement.setString(6, employee.getEmail());

            preparedStatement2.setDouble(1, employee.getSalary());
            preparedStatement2.setString(2, employee.getAccess());
            preparedStatement2.setString(3, employee.getLogin());
            preparedStatement2.setString(4, employee.getPassword());
            preparedStatement2.setString(5, employee.getStatus());

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
     * Method that updates an Employee in the DB. It will be later linked to the
     * listener of the 'Editar' button (btnUpdate).
     *
     * @param employee The data of the Employee to be updated in the DB.
     * @return True if the Employee was updated successfully or false if it was
     * not.
     */
    public boolean update(Employee employee) {

        sSql = "UPDATE person SET name=?, last_names=?, national_id=?, address=?,"
                + " phone=?, email=? WHERE id_person=?";
        
        sSql2 = "UPDATE employee SET salary=?, access=?, login=?, password=?,"
                + " status=? WHERE id_person=?";

        try {
            PreparedStatement preparedStatement
                    = connection.prepareStatement(sSql);
            PreparedStatement preparedStatement2
                    = connection.prepareStatement(sSql2);

            preparedStatement.setString(1, employee.getName());
            preparedStatement.setString(2, employee.getLast_names());
            preparedStatement.setString(3, employee.getNational_id());
            preparedStatement.setString(4, employee.getAddress());
            preparedStatement.setString(5, employee.getPhone());
            preparedStatement.setString(6, employee.getEmail());
            preparedStatement.setInt(7, employee.getId_person());

            preparedStatement2.setDouble(1, employee.getSalary());
            preparedStatement2.setString(2, employee.getAccess());
            preparedStatement2.setString(3, employee.getLogin());
            preparedStatement2.setString(4, employee.getPassword());
            preparedStatement2.setString(5, employee.getStatus());
            preparedStatement2.setInt(6, employee.getId_person());

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
     * Method that deletes an Employee in the DB. It will be later linked to the
     * listener of the 'Eliminar' button (btnDelete).
     *
     * @param employee The data of the Employee to be deleted in the DB.
     * @return True if the Employee was deleted successfully or false if it was
     * not.
     */
    public boolean delete(Employee employee) {

        sSql = "DELETE FROM employee WHERE id_person=?";
        sSql2 = "DELETE FROM person WHERE id_person=?";

        try {
            PreparedStatement preparedStatement
                    = connection.prepareStatement(sSql);
            PreparedStatement preparedStatement2
                    = connection.prepareStatement(sSql2);

            preparedStatement.setInt(1, employee.getId_person());

            preparedStatement2.setInt(1, employee.getId_person());

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
