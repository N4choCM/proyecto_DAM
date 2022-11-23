/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 * Model of the consumptions to be stored in the DB. The attributes have the exact
 * same name as in the DB table called 'consumption' - that is why camelCase is not
 * used. It also has an empty constructor and another one with all the 
 * parameters. Additionally, the getters and setter for each attribute are found,
 * as well as the toString() method.
 * @author Juan Ignacio Campos Martí
 */
public class Consumption {
    private int id_consumption;
    private int id_booking;
    private int id_product;
    private Double amount;
    private Double price;
    private String status;

    public Consumption() {
    }

    public Consumption(int id_consumption, int id_booking, int id_product, double amount, double price, String status) {
        this.id_consumption = id_consumption;
        this.id_booking = id_booking;
        this.id_product = id_product;
        this.amount = amount;
        this.price = price;
        this.status = status;
    }

    public int getId_consumption() {
        return id_consumption;
    }

    public void setId_consumption(int id_consumption) {
        this.id_consumption = id_consumption;
    }

    public int getId_booking() {
        return id_booking;
    }

    public void setId_booking(int id_booking) {
        this.id_booking = id_booking;
    }

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Consumption{" + "id_consumption=" + id_consumption + 
                ", id_booking=" + id_booking + ", id_product=" + id_product + 
                ", amount=" + amount + ", price=" + price + ", status=" + 
                status + '}';
    }
}
