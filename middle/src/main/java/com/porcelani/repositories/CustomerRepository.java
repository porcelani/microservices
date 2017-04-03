package com.porcelani.repositories;

import com.porcelani.models.Customer;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, String> {

	@Query("Select * from customer where firstname=?0")
	public Customer findByFirstName(String firstName);

	@Query("Select * from customer where lastname=?0")
	public List<Customer> findByLastName(String lastName);

	@Query("Select * from customer")
	public List<Customer> findAll();


}
