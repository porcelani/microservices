package com.porcelani.repositories;

import com.porcelani.models.Password;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PasswordRepository extends CrudRepository<Password, String> {

	@Query("Select * from password")
	public List<Password> findAll();

}
