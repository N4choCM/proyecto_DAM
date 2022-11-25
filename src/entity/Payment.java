/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.sql.Date;

/**
 *
 * @author nacho
 */
public class Payment {
    private int id_payment;
    private int id_booking;
    private String invoice_number;
    private Double vat;
    private double total_payment;
    private Date issue_date;
    private Date payment_date;

    public Payment() {
    }

    public Payment(int id_payment, int id_booking, String invoice_number, Double vat, double total_payment, Date issue_date, Date payment_date) {
        this.id_payment = id_payment;
        this.id_booking = id_booking;
        this.invoice_number = invoice_number;
        this.vat = vat;
        this.total_payment = total_payment;
        this.issue_date = issue_date;
        this.payment_date = payment_date;
    }

    public int getId_payment() {
        return id_payment;
    }

    public void setId_payment(int id_payment) {
        this.id_payment = id_payment;
    }

    public int getId_booking() {
        return id_booking;
    }

    public void setId_booking(int id_booking) {
        this.id_booking = id_booking;
    }

    public String getInvoice_number() {
        return invoice_number;
    }

    public void setInvoice_number(String invoice_number) {
        this.invoice_number = invoice_number;
    }

    public Double getVat() {
        return vat;
    }

    public void setVat(Double vat) {
        this.vat = vat;
    }

    public double getTotal_payment() {
        return total_payment;
    }

    public void setTotal_payment(double total_payment) {
        this.total_payment = total_payment;
    }

    public Date getIssue_date() {
        return issue_date;
    }

    public void setIssue_date(Date issue_date) {
        this.issue_date = issue_date;
    }

    public Date getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(Date payment_date) {
        this.payment_date = payment_date;
    }

    @Override
    public String toString() {
        return "Payment{" + "id_payment=" + id_payment + ", id_booking=" + 
                id_booking + ", invoice_number=" + invoice_number + ", vat=" + 
                vat + ", total_payment=" + total_payment + ", issue_date=" + 
                issue_date + ", payment_date=" + payment_date + '}';
    }
    
    
}
