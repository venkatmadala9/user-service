package com.lodging.user.service;

import java.util.Map;
import java.util.Optional;
 
import org.springframework.security.oauth2.core.oidc.OidcIdToken;
import org.springframework.security.oauth2.core.oidc.OidcUserInfo;

import com.lodging.user.dto.LocalUser;
import com.lodging.user.dto.SignUpRequest;
import com.lodging.user.entity.User;
import com.lodging.user.exception.UserAlreadyExistAuthenticationException;
 

public interface UserService {
	 
    public User registerNewUser(SignUpRequest signUpRequest) throws UserAlreadyExistAuthenticationException;
 
    User findUserByEmail(String email);
 
    Optional<User> findUserById(Long id);
 
    LocalUser processUserRegistration(String registrationId, Map<String, Object> attributes, OidcIdToken idToken, OidcUserInfo userInfo);
}
