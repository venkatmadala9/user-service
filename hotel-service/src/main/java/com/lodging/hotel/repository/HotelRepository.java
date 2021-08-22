package com.lodging.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lodging.hotel.entity.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {

	Hotel findByOid(Long id);

}
