package com.example.CassandraDemoProject.service;

import com.example.CassandraDemoProject.model.Customer;
import com.example.CassandraDemoProject.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;


@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;




}
