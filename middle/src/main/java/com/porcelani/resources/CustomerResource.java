package com.porcelani.resources;

import com.porcelani.models.Customer;
import com.porcelani.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.datastax.driver.core.utils.UUIDs.random;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class CustomerResource {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    CassandraOperations operations;

    @RequestMapping(value = "/")
    public List<Customer> cassandra() {
        List<Customer> all = customerRepository.findAll();
        return all;
    }

    @RequestMapping(method = POST, value = "/")
    public Customer createCustomer(@RequestBody Customer customerDTO) {
        Customer customer = new Customer(random().getMostSignificantBits(), customerDTO.getFirstName(), customerDTO.getLastName());
        return customerRepository.save(customer);
    }

}
