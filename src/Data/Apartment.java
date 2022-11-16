/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author nacho
 */
public class Apartment {
    private int id_room;
    private String room_number;
    private String floor;
    private String description;
    private String features;
    private double price;
    private String status;
    private String room_type;

    public Apartment() {
    }

    public Apartment(int id_room, String room_number, String floor, String description, String features, double price, String status, String room_type) {
        this.id_room = id_room;
        this.room_number = room_number;
        this.floor = floor;
        this.description = description;
        this.features = features;
        this.price = price;
        this.status = status;
        this.room_type = room_type;
    }

    public int getId_room() {
        return id_room;
    }

    public void setId_room(int id_room) {
        this.id_room = id_room;
    }

    public String getRoom_number() {
        return room_number;
    }

    public void setRoom_number(String room_number) {
        this.room_number = room_number;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
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

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    @Override
    public String toString() {
        return "Apartment{" + "id_room=" + id_room + ", room_number=" + 
                room_number + ", floor=" + floor + ", description=" + 
                description + ", features=" + features + ", price=" + price + 
                ", status=" + status + ", room_type=" + room_type + '}';
    }
    
    
}
