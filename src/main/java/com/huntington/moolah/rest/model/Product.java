package com.huntington.moolah.rest.model;

public abstract class Product
{
	private long id;
	private String vendorProductId;
	private String vendorProductDescription; // "H25", can't really set up products cuz they're all vendor driven
	
	private ProductTypeCode productTypeCode;
	private SubProductTypeCode subProductTypeCode;
	
}
