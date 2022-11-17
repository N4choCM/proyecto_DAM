/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 * Model of the Customers to be stored in the DB. The attributes have the exact
 * same name as in the DB table called 'customer' - that is why camelCase is not
 * used. It also has an empty constructor and another one with all the 
 * parameters. Additionally, the getters and setters for each attribute are found,
 * as well as the toString() method. This class is one of the subclasses of Person.
 * @see Person.java
 * @author Juan Ignacio Campos Martí
 */
public class Customer extends Person{
    private int id_customer;

    public Customer() {
    }

    public Customer(int id_customer) {
        this.id_customer = id_customer;
    }

    public int getId_customer() {
        return id_customer;
    }

    public void setId_customer(int id_customer) {
        this.id_customer = id_customer;
    }

    @Override
    public String toString() {
        return "Customer{" + "id_customer=" + id_customer + '}';
    }
    
    
}
