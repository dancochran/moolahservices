package com.huntington.moolah.rest.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

// a vendor checking account, enough details to call the vendor to get one and work with it
@Document(collection = "savingsaccounts")
public class SavingsAccount
{
	@Id private UUID savingsAccountId = UUID.randomUUID();
	private UUID savingsAccountProductId;
	private Date openDate;
	private BigDecimal interestRate;
	private String applicationStatus;
	private String routingNumber;
	private String accountNumber;
	
	public SavingsAccount()
	{
		
	}
	
	public SavingsAccount(UUID savingsAccountProductId, Date openDate,
			BigDecimal interestRate, String applicationStatus,
			String routingNumber, String accountNumber)
	{
		this.savingsAccountProductId = savingsAccountProductId;
		this.openDate = openDate;
		this.interestRate = interestRate;
		this.applicationStatus = applicationStatus;
		this.routingNumber = routingNumber;
		this.accountNumber = accountNumber;
	}
	
	
	
}
