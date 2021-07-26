package com.lodging.user.VO;

public class Address {

	private Long oid;
	
	private String street;
	
	private String city;
	
	private String state;
	
	private Long zipcode;

	public Long getOid() {
		return oid;
	}

	public void setOid(Long oid) {
		this.oid = oid;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Long getZipcode() {
		return zipcode;
	}

	public void setZipcode(Long zipcode) {
		this.zipcode = zipcode;
	}

	public Address(Long oid, String street, String city, String state, Long zipcode) {
		super();
		this.oid = oid;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}

	public Address() {
		super();
	}
}
