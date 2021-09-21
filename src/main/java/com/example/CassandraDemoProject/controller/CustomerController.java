package com.example.CassandraDemoProject.controller;

import com.example.CassandraDemoProject.model.Customer;
import com.example.CassandraDemoProject.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/getCustomers")
    public Flux<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }


    @GetMapping("/getCustomerByAge/{age}")
    public Flux<Customer> getCustomerByAge(@PathVariable int age) {
        return customerRepository.findByageLessThan(age);

    }

    @PostMapping("/save/customer")
    public Mono<Customer> saveNewCustomer(@RequestBody Customer customer){
        return customerRepository.save(customer);





    }
}
