package com.huntington.moolah.rest.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Document(collection = "customers")
public class Customer
{
	@Id private UUID customerId = UUID.randomUUID();
	private String tin;
	private Date birthDate;
	private List<Address> addresses;
	private String firstName;
	private String middleName;
	private String lastName;
	private String mobilePhone;
	private String homePhone;
	private String workPhone;
	private String email;
	private Date joinDate;
	private String notes;

	public Customer()
	{
		
	}
	
	public Customer(String tin, Date birthDate, List<Address> addresses, 
			String firstName, String middleName, String lastName, String mobilePhone, 
			String homePhone, String workPhone, String email, Date joinDate, String notes)
	{
		this.tin = tin;
		this.birthDate = birthDate;
		this.addresses = addresses;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.mobilePhone = mobilePhone;
		this.homePhone = homePhone;
		this.workPhone = workPhone;
		this.email = email;
		this.joinDate = joinDate;
		this.notes = notes;
	}

	public UUID getCustomerId()
	{
		return customerId;
	}

	public void setCustomerId(UUID customerId)
	{
		this.customerId = customerId;
	}

	public String getTin()
	{
		return tin;
	}

	public void setTin(String tin)
	{
		this.tin = tin;
	}

	public Date getBirthDate()
	{
		return birthDate;
	}

	public void setBirthDate(Date birthDate)
	{
		this.birthDate = birthDate;
	}

	public List<Address> getAddresses()
	{
		return addresses;
	}

	public void setAddresses(List<Address> addresses)
	{
		this.addresses = addresses;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getMiddleName()
	{
		return middleName;
	}

	public void setMiddleName(String middleName)
	{
		this.middleName = middleName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getMobilePhone()
	{
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone)
	{
		this.mobilePhone = mobilePhone;
	}

	public String getHomePhone()
	{
		return homePhone;
	}

	public void setHomePhone(String homePhone)
	{
		this.homePhone = homePhone;
	}

	public String getWorkPhone()
	{
		return workPhone;
	}

	public void setWorkPhone(String workPhone)
	{
		this.workPhone = workPhone;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public Date getJoinDate()
	{
		return joinDate;
	}

	public void setJoinDate(Date joinDate)
	{
		this.joinDate = joinDate;
	}

	public String getNotes()
	{
		return notes;
	}

	public void setNotes(String notes)
	{
		this.notes = notes;
	}
	
	
	
}
