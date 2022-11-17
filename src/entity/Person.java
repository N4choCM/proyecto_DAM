/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 * Model of the People to be stored in the DB. The attributes have the exact
 * same name as in the DB table called 'person' - that is why camelCase is not
 * used. It also has an empty constructor and another one with all the 
 * parameters. Additionally, the getters and setters for each attribute are found,
 * as well as the toString() method. This class will be the superclass for
 * Customer and Employee.
 * @see Customer.java, Employee.java
 * @author Juan Ignacio Campos Martí
 */
public class Person {
    
    private int id_person;
    private String name;
    private String last_names;
    private String national_id;
    private String address;
    private String phone;
    private String email;

    public Person() {
    }

    public Person(int id_person, String name, String last_names, String national_id, String address, String phone, String email) {
        this.id_person = id_person;
        this.name = name;
        this.last_names = last_names;
        this.national_id = national_id;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public int getId_person() {
        return id_person;
    }

    public void setId_person(int id_person) {
        this.id_person = id_person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_names() {
        return last_names;
    }

    public void setLast_names(String last_names) {
        this.last_names = last_names;
    }

    public String getNational_id() {
        return national_id;
    }

    public void setNational_id(String national_id) {
        this.national_id = national_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" + "id_person=" + id_person + ", name=" + name + ", last_names=" + last_names + ", national_id=" + national_id + ", address=" + address + ", phone=" + phone + ", email=" + email + '}';
    }
    
    
    
}
