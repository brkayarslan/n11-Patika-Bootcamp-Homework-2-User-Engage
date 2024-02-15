package com.berkayarslan.UserEngage.controller;

import com.berkayarslan.UserEngage.dto.UserDTO;
import com.berkayarslan.UserEngage.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/findAll")
    public List<UserDTO> findAllUser(){
        return userService.findAllUsers();
    }

    @PostMapping("/save")
    public UserDTO saveUser(@RequestBody UserDTO userDTO){
        return userService.saveUser(userDTO);
    }
}
