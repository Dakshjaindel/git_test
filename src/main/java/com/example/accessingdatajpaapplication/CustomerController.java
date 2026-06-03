package com.example.accessingdatajpaapplication;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService service;

    @PostMapping({"/set"})
    public @ResponseBody String addCustomer(@RequestParam String firstName,@RequestParam String lastName){
        return service.AddCustomer(firstName,lastName);
    }

    @DeleteMapping({"/set/delete"})
    public void delCustomer(@RequestParam long id){
        service.Delete(id);
    }

    @GetMapping({"/set"})
    public Iterable<Customer> findAll(){
        return service.findAll();
    }
    @PutMapping({"/set"})
    public String changeName(@RequestParam long id, @RequestParam String firstName,@RequestParam String lastName){
        return service.changeName(id, firstName,lastName);
    }




}
