package com.example.CassandraDemoProject.controller;

import com.example.CassandraDemoProject.model.Customer;
import com.example.CassandraDemoProject.repository.CustomerRepository;
import com.example.CassandraDemoProject.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Controller
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerService customerService;


   @GetMapping("/")
   public String homePage() {
       return "home";

   }

    @GetMapping("/getCustomers")
    public Flux<Customer> getAllCustomer() {
        return customerRepository.findAll();

    }


    @GetMapping("/getCustomerByAge/{age}")
    public Flux<Customer> getCustomerByAge(@PathVariable int age) {
        return customerRepository.findByageLessThan(age);

    }

    @GetMapping("/saveCustomer")
    public String saveNewCustomer(Model model) {
       model.addAttribute("customer", new Customer());
       return "index";

    }

    @PostMapping("/saveCustomer")
    public String saveNewCustomer(@ModelAttribute("customer") Customer customer) throws Exception {

       if(customer==null) {
           throw new Exception("Details cannot be null");
       }
       this.customerRepository.save(customer).subscribe();
       return "redirect:/";

    }
}
