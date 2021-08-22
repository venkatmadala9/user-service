package com.lodging.user.dto;

import lombok.Value;

@Value
public class JwtAuthenticationResponse 
{
    private String accessToken;
    private UserInfo user;
    
	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public UserInfo getUser() {
		return user;
	}

	public void setUser(UserInfo user) {
		this.user = user;
	}

	public JwtAuthenticationResponse(String accessToken, UserInfo user) {
		super();
		this.accessToken = accessToken;
		this.user = user;
	}
}
