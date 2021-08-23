package com.lodging.user.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.lodging.user.VO.Hotel;
import com.lodging.user.VO.ResponseEntityVO;
import com.lodging.user.config.CurrentUser;
import com.lodging.user.dto.LocalUser;
import com.lodging.user.entity.User;
import com.lodging.user.service.UserService;
import com.lodging.user.util.GeneralUtils;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/user/me")
    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<?> getCurrentUser(@CurrentUser LocalUser user) {
        return ResponseEntity.ok(GeneralUtils.buildUserInfo(user));
    }
 
	@PostMapping("/post")
	public User saveUser(@RequestBody User user)
	{
		return null;
		//return userService.saveUser(user);
	}
	
	@GetMapping("/{id}")
	@CircuitBreaker(name = "USER_SERVICE")
	public ResponseEntityVO getUser(@PathVariable ("id") String id)
	{
		ResponseEntityVO vo = new ResponseEntityVO();
		
	//	Optional<User> user = userService.getUser(new Long(id));
		
	//	Hotel hotel = restTemplate.getForObject("http://HOTEL-SERVICE/hotel/" +user.get().getHotelId(), Hotel.class);
		
	//	vo.setHotel(hotel);
	//	vo.setUser(user);
		
		return vo;
	}
	
	@GetMapping("/all")
    public ResponseEntity<?> getContent() {
        return ResponseEntity.ok("Public content goes here");
    }
 
    @GetMapping("/user")
    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<?> getUserContent() {
        return ResponseEntity.ok("User content goes here");
    }
 
    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<?> getAdminContent() {
        return ResponseEntity.ok("Admin content goes here");
    }
 
    @GetMapping("/mod")
    @PreAuthorize("hasRole('MODERATOR')")
    public ResponseEntity<?> getModeratorContent() {
        return ResponseEntity.ok("Moderator content goes here");
    }
}
