package com.huntington.moolah.rest.repositories;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Component;

import com.huntington.moolah.rest.model.Address;
import com.huntington.moolah.rest.model.Customer;

@Component
public class CustomerInitializer
{
	//public CustomerInitializer(CustomerRepository repository, MongoOperations operations) throws Exception
	@Autowired
	public CustomerInitializer(CustomerRepository repository) throws Exception
	{
		System.out.println("FUCK - Initializer running");
		if (repository.count() != 0) 
		{
			System.out.println("FUCK - Initializer count > 0");
			return;
		}

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		customer.setTin("000000001");
		customer.setBirthDate(formatter.parse("1990-05-28"));
		customer.setAddresses(Arrays.asList(
				new Address("home","123 Broadway Ave", null, "Philapedlphia", "PA", "10076"),
				new Address("mailing","123 Broadway Ave", null, "Philadelphia", "PA", "10076")
				)
		);		
		customer.setEmail("custone@gmail.com");
		customer.setFirstName("Alfred");
		customer.setHomePhone("614-555-0001");
		customer.setJoinDate(new Date());
		customer.setLastName("Morris");
		customer.setMiddleName("J");
		customer.setMobilePhone("614-555-0002");
		customer.setNotes("Large deposits in the fall");
		customer.setWorkPhone("614-555-0003");
		customers.add(customer);
		
		customer = new Customer();
		customer.setTin("000000002");
		customer.setBirthDate(formatter.parse("1984-10-08"));
		customer.setAddresses(Arrays.asList(
				new Address("home","1119 Main St", null, "St. Claire", "MN", "31167"),
				new Address("mailing","1284 Hope Ave", "Apartment 2", "Minneapolis", "MN", "31228")
				)
		);
		customer.setEmail("custtwo@gmail.com");
		customer.setFirstName("Bill");
		customer.setHomePhone("614-555-0004");
		customer.setJoinDate(new Date());
		customer.setLastName("Hill");
		customer.setMiddleName("Phillip");
		customer.setMobilePhone("614-555-0005");
		customer.setNotes("Goes by Jack");
		customer.setWorkPhone("614-555-0006");
		customers.add(customer);
		
		repository.saveAll(customers);
		
	}
}
