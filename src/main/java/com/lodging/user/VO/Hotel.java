package com.lodging.user.VO;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.lodging.user.entity.User;

public class Hotel {

	private Long oid;
	
	private String name;
	
	private String facilityCode;
	
	private Integer hotelRooms;
	
	private Long hotelNumber;
	
	private Address address;
	
	public Long getOid() {
		return oid;
	}

	public void setOid(Long oid) {
		this.oid = oid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFacilityCode() {
		return facilityCode;
	}

	public void setFacilityCode(String facilityCode) {
		this.facilityCode = facilityCode;
	}

	public Integer getHotelRooms() {
		return hotelRooms;
	}

	public void setHotelRooms(Integer hotelRooms) {
		this.hotelRooms = hotelRooms;
	}

	public Long getHotelNumber() {
		return hotelNumber;
	}

	public void setHotelNumber(Long hotelNumber) {
		this.hotelNumber = hotelNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Hotel(Long oid, String name, String facilityCode, Integer hotelRooms, Long hotelNumber, Address address) {
		super();
		this.oid = oid;
		this.name = name;
		this.facilityCode = facilityCode;
		this.hotelRooms = hotelRooms;
		this.hotelNumber = hotelNumber;
		this.address = address;
	}

	public Hotel() {
		super();
	}
}
