package com.lodging.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lodging.user.entity.UserHotels;

public interface UserHotelsRepository extends JpaRepository<UserHotels, Long> {

}
