package com.huntington.moolah.rest.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.UUID;

// a vendor checking account, enough details to call the vendor to get one and work with it
@Document(collection = "savingsaccountproducts")
public class SavingsAccount
{
	@Id private UUID savingsAccountProductId = UUID.randomUUID();
	private String vendorProductId;
	private String vendorProductDescription;
	
}
