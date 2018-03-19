package com.huntington.moolah.rest.repositories;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.huntington.moolah.rest.model.Customer;

@RepositoryRestResource(collectionResourceRel = "customers", path = "customers")
public interface CustomerRepository extends CrudRepository<Customer, UUID>
{
	List<Customer> findByLastName(String lastname);
	Optional<Customer> findByTin(String tin);
	//List<Customer> findByJoinDate(@Temporal(TemporalType.DATE) Date date);
}
