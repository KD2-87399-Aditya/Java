package com.sunbeam;


public class Employee {
    
    private String firstName;
    private String lastName;
    private double monthlySalary;

    
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        setMonthlySalary(monthlySalary); 
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }


    public void setMonthlySalary(double monthlySalary) {

        this.monthlySalary = (monthlySalary > 0) ? monthlySalary : 0.0;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }


    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    
    public double giveRaise(double percentage) {
        if (percentage > 0) {
            monthlySalary += monthlySalary * (percentage / 100);
        }
        return monthlySalary;
        
    }
    public void displayDetails() {
    System.out.println("First Name: " + getFirstName());
    System.out.println("Last Name: " + getLastName());
    System.out.println("Yearly Salary: " + getYearlySalary());
    System.out.println("Salary with Bonus: ");
    System.out.println(giveRaise(10));
}
}
