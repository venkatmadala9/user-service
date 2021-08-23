package com.lodging.user.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="USER_HOTELS")
public class UserHotels extends AbstractAuditableEntity{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long oid;
	
	/*
	 * @JsonIgnore
	 * 
	 * @ManyToMany(mappedBy = "userHotels") private List<User> users;
	 */
	
	
}
