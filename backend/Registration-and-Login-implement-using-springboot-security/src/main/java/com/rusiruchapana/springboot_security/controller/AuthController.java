package com.rusiruchapana.springboot_security.controller;

import com.rusiruchapana.springboot_security.dto.UserDto;
import com.rusiruchapana.springboot_security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth-controller")
public class AuthController {

    public AuthController(UserService userService) {
        this.userService = userService;
    }
    private UserService userService;



    @PostMapping("/save-user")
    public UserDto saveUser( @RequestBody UserDto userDto){
        UserDto userDto1 = userService.saveUser(userDto);
        return userDto1;
    }

}
