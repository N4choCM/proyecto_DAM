/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author nacho
 */
public class Employee extends Person{
    
    private double salary;
    private String access;
    private String login;
    private String password;
    private String status;

    public Employee() {
    }

    public Employee(double salary, String access, String login, String password, String status) {
        this.salary = salary;
        this.access = access;
        this.login = login;
        this.password = password;
        this.status = status;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Employee{" + "salary=" + salary + ", access=" + access + 
                ", login=" + login + ", password=" + password + ", status=" + 
                status + '}';
    }
    
    
    
}
