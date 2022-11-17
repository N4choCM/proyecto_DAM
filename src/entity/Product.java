/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 * Model of the products to be stored in the DB. The attributes have the exact
 * same name as in the DB table called 'product' - that is why camelCase is not
 * used. It also has an empty constructor and another one with all the 
 * parameters. Additionally, the getters and setter for each attribute are found,
 * as well as the toString() method.
 * @author Juan Ignacio Campos Martí
 */
public class Product {
    
    private int id_product;
    private String name;
    private String description;
    private double price;
    private String unit_measure;

    public Product() {
    }

    public Product(int id_product, String name, String description, double price, String unit_measure) {
        this.id_product = id_product;
        this.name = name;
        this.description = description;
        this.price = price;
        this.unit_measure = unit_measure;
    }

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUnit_measure() {
        return unit_measure;
    }

    public void setUnit_measure(String unit_measure) {
        this.unit_measure = unit_measure;
    }

    @Override
    public String toString() {
        return "Product{" + "id_product=" + id_product + ", name=" + name + 
                ", description=" + description + ", price=" + price + 
                ", unit_measure=" + unit_measure + '}';
    }
    
    
    
}
