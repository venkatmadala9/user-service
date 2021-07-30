package com.lodging.user.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.lodging.user.VO.Hotel;
import com.lodging.user.VO.ResponseEntityVO;
import com.lodging.user.entity.User;
import com.lodging.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping("/")
	public User saveUser(@RequestBody User user)
	{
		return userService.saveUser(user);
	}
	
	@GetMapping("/{id}")
	public ResponseEntityVO getUser(@PathVariable ("id") String id)
	{
		ResponseEntityVO vo = new ResponseEntityVO();
		
		Optional<User> user = userService.getUser(new Long(id));
		
		Hotel hotel = restTemplate.getForObject("http://HOTEL-SERVICE/hotel/" +user.get().getHotelId(), Hotel.class);
		
		vo.setHotel(hotel);
		vo.setUser(user);
		
		return vo;
	}
}
