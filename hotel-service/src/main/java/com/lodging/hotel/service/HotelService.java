package com.lodging.hotel.service;

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

	public Hotel saveHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		return hotelRepo.save(hotel);
	}
}
