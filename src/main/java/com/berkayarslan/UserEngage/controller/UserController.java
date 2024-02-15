package com.berkayarslan.UserEngage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usercontroller")
public class UserController {

    @GetMapping("/findAll")
    public String findAll(){
        return "null";
    }
}
