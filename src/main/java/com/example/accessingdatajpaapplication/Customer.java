package com.example.accessingdatajpaapplication;


import jakarta.persistence.*;
import java.lang.*;


@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    private String firstName;
    private String lastName;

    protected Customer(){}
    public Customer(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public String ToString(){
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s']",
                Id, firstName, lastName);
    }

    public Long getId(){
        return Id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;

    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }
}
