package com.example.accessingdatajpaapplication;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }


    public String AddCustomer(String firstName, String lastName){
        repository.save(new Customer(firstName,lastName));
        return " Saved";

    }

    public Iterable<Customer> findAll(){

        return repository.findAll();
    }

    public String Delete(long id){
        Customer customer=repository.findById(id);
        repository.delete(customer);
        return "Deleted";
    }

    public String changeName(long id,String firstName, String lastName){
        Customer customer=repository.findById(id);
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        return "name changed";
    }

}
