package com.lodging.user.VO;

import java.util.Optional;

import com.lodging.user.entity.User;

public class ResponseEntityVO {

	private Hotel hotel;
	private Optional<User> user;
	
	public ResponseEntityVO() {
		super();
	}
	
	public ResponseEntityVO(Hotel hotel, Optional<User> user) {
		super();
		this.hotel = hotel;
		this.user = user;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public Optional<User> getUser() {
		return user;
	}
	public void setUser(Optional<User> user2) {
		this.user = user2;
	}
	
}
