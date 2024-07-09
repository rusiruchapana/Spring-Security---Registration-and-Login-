package com.rusiruchapana.springboot_security.controller;

import com.rusiruchapana.springboot_security.dto.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth-controller")
public class AuthController {

    @PostMapping("/save-user")
    public ResponseEntity<UserDto> saveUser( @RequestBody UserDto userDto){
        return null;
    }

}
