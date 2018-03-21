package com.huntington.moolah.rest.model;

public class Phone
{
	private String phoneType;
	private String phoneNumber;
	private boolean acceptedTcpa;
	
	public Phone(String phoneType, String phoneNumber, boolean acceptedTcpa)
	{
		super();
		this.phoneType = phoneType;
		this.phoneNumber = phoneNumber;
		this.acceptedTcpa = acceptedTcpa;
	}

	public String getPhoneType()
	{
		return phoneType;
	}

	public void setPhoneType(String phoneType)
	{
		this.phoneType = phoneType;
	}

	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	public boolean isAcceptedTcpa()
	{
		return acceptedTcpa;
	}

	public void setAcceptedTcpa(boolean acceptedTcpa)
	{
		this.acceptedTcpa = acceptedTcpa;
	}
	
	
	
}
