/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.sql.Date;

/**
 * Model of the bookings to be stored in the DB. The attributes have the exact
 * same name as in the DB table called 'booking' - that is why camelCase is not
 * used. It also has an empty constructor and another one with all the 
 * parameters. Additionally, the getters and setter for each attribute are found,
 * as well as the toString() method.
 * @author Juan Ignacio Campos Martí
 */
public class Booking {
    private int id_booking;
    private int id_room;
    private int id_customer;
    private int id_employee;
    private String type;
    private Date booking_date;
    private Date checkin_date;
    private Date checkout_date;
    private double price;
    private String status;

    public Booking() {
    }

    public Booking(int id_booking, int id_room, int id_customer, int id_employee, 
            String type, Date booking_date, Date checkin_date, Date checkout_date, 
            double price, String status) {
        this.id_booking = id_booking;
        this.id_room = id_room;
        this.id_customer = id_customer;
        this.id_employee = id_employee;
        this.type = type;
        this.booking_date = booking_date;
        this.checkin_date = checkin_date;
        this.checkout_date = checkout_date;
        this.price = price;
        this.status = status;
    }

    public int getId_booking() {
        return id_booking;
    }

    public void setId_booking(int id_booking) {
        this.id_booking = id_booking;
    }

    public int getId_room() {
        return id_room;
    }

    public void setId_room(int id_room) {
        this.id_room = id_room;
    }

    public int getId_customer() {
        return id_customer;
    }

    public void setId_customer(int id_customer) {
        this.id_customer = id_customer;
    }

    public int getId_employee() {
        return id_employee;
    }

    public void setId_employee(int id_employee) {
        this.id_employee = id_employee;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getBooking_date() {
        return booking_date;
    }

    public void setBooking_date(Date booking_date) {
        this.booking_date = booking_date;
    }

    public Date getCheckin_date() {
        return checkin_date;
    }

    public void setCheckin_date(Date checkin_date) {
        this.checkin_date = checkin_date;
    }

    public Date getCheckout_date() {
        return checkout_date;
    }

    public void setCheckout_date(Date checkout_date) {
        this.checkout_date = checkout_date;
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
        return "Booking{" + "id_booking=" + id_booking + ", id_room=" + id_room 
                + ", id_customer=" + id_customer + ", id_employee=" 
                + id_employee + ", type=" + type + ", booking_date=" 
                + booking_date + ", checkin_date=" + checkin_date 
                + ", checkout_date=" + checkout_date + ", price=" + price 
                + ", status=" + status + '}';
    }
    
    
    
}
