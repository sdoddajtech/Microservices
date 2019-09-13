package com.saidodda.microservices.repos;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.security.access.prepost.PreAuthorize;

import com.saidodda.microservices.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

	//Customer findByAll();
	//@Override
	//@PreAuthorize("hasRole('ROLE_ADMIN')")
	//void delete(Long id);
	
}
