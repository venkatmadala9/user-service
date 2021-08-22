package com.lodging.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lodging.hotel.entity.Hotel;
import com.lodging.hotel.repository.HotelRepository;

@Service
public class HotelService {

	@Autowired
	private HotelRepository hotelRepo;
	
	public Hotel getHotel(Long id)
	{
		return hotelRepo.findByOid(id);
	}

	public Hotel saveHotel(Hotel hotel) 
	{
		return hotelRepo.save(hotel);
	}

	public List<Hotel> getHotels() 
	{
		return hotelRepo.findAll();
	}
}
