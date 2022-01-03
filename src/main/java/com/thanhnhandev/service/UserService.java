package com.thanhnhandev.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.thanhnhandev.model.User;
import com.thanhnhandev.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
