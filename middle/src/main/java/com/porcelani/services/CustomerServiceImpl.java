package com.porcelani.services;

import com.porcelani.models.Customer;
import com.porcelani.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerServiceImpl {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    public List<Customer> getCustomerByName(String customerName) {
        return customerRepository.findByLastName(customerName);
    }
}
