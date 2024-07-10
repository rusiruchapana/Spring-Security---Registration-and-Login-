package com.rusiruchapana.springboot_security.service.impl;

import com.rusiruchapana.springboot_security.dto.UserDto;
import com.rusiruchapana.springboot_security.entity.Role;
import com.rusiruchapana.springboot_security.entity.User;
import com.rusiruchapana.springboot_security.repository.RoleRepository;
import com.rusiruchapana.springboot_security.repository.UserRepository;
import com.rusiruchapana.springboot_security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    public UserServiceImpl(UserRepository userRepository,RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }
    private UserRepository userRepository;
    private RoleRepository roleRepository;

    @Override
    public void saveUser(UserDto userDto) {

        User user = new User();
        user.setName(userDto.getFirstName()+ " " +userDto.getLastName());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());

        Role role = roleRepository.findByName("ROLE_ADMIN");
        if(role==null){
            role = checkExist();
        }
        user.setRoles(Arrays.asList(role));
        userRepository.save(user);


    }

    private Role checkExist(){
        Role role =  new Role();
        role.setName("ROLE_ADMIN");
        return roleRepository.save(role);
    }



}
