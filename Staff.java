package models;

import java.lang.Double;


public abstract class Staff extends Person {

    private double salary;
    private String phone;


    protected Staff(String firstName ,String lastName,String phone,double salary){
        super(firstName, lastName);
        setSalary(salary);
        setPhone(phone);
    }

    public String getPhone() {
        return phone;
    }
    public double getSalary() {
        return salary;
    }
    protected void setSalary(double salary) { this.salary = validSalary(salary); }
    protected void setPhone(String phone) { this.phone = validPhone(phone); }


    private static String validPhone(String phone) {

        if (phone == null) {
            throw new IllegalArgumentException("Phone number cannot be null");
        }
    
        String trimmed = phone.trim();
    
        if (trimmed.isEmpty()) {
            throw new IllegalArgumentException("Phone number cannot be empty");
        }
    
        if (!trimmed.matches("[0-9]{10}")) {
            throw new IllegalArgumentException("Phone number needs to contains valid numbers and be exactly 10 numbers ");
        }
    
        return trimmed;
    }
    private static double validSalary(double salary) {

        if(Double.isNaN(salary)){

            throw new IllegalArgumentException("Only accepting numbers");
        }

        if (salary <=0){
            
            throw new IllegalArgumentException("Salary cant be 0 or below");
        }

        return salary;
        
        
    }

    
}