package com.example.webjava.service;


import com.example.webjava.dto.RegistrationDto;
import com.example.webjava.models.UserEntity;

public interface UserService {
    void saveUser(RegistrationDto registrationDto);
    UserEntity findByEmail(String email);
    UserEntity findByUsername(String username);
}