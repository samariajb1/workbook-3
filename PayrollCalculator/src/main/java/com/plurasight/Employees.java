package com.plurasight;

public class Employees {
    private int employeeId;
    private String employeeName;
    private double hours;
    private double payRate;

    public Employees(int employeeId, String employeeName, double hours, double payRate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.hours = hours;
        this.payRate = payRate;
    }

    public int getId() {
        return employeeId;
    }

    public void setId(int id) {
        this.employeeId = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getGrossPay() {
        return payRate * hours;
    }
}