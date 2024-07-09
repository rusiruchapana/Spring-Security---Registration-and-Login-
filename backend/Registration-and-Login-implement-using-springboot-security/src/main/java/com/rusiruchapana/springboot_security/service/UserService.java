package com.rusiruchapana.springboot_security.service;

import com.rusiruchapana.springboot_security.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    public UserDto saveUser(UserDto userDto);
}
