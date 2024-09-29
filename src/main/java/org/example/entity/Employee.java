package org.example.entity;

public class Employee {
    private String email;
    private String name;

    public Employee(){
    }

    public Employee(String email, String name){
        this.email = email;
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public String getName(){
        return name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setName(String name){
        this.name = name;
    }
}
