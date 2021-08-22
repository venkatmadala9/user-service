package com.lodging.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lodging.hotel.entity.Hotel;
import com.lodging.hotel.service.HotelService;

@RestController
@RequestMapping("/hotel")
@CrossOrigin(origins = "http://localhost:4200")
public class HotelController {

	@Autowired
	private HotelService hotelService;
	
	@PostMapping("/add")
	public Hotel saveHotel(@RequestBody Hotel hotel)
	{
		return hotelService.saveHotel(hotel);
	}
	
	@GetMapping("/{id}")
	public Hotel getHotelById(@PathVariable("id") Long id)
	{
		return hotelService.getHotel(id);
	}
	
	@GetMapping("/all")
	public List<Hotel> getAllHotels()
	{
		return hotelService.getHotels();
	}
}
