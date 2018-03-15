package com.example.eurekaprovider.controller;

import com.example.eurekaprovider.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @PostMapping("/provider")
    public String test(@RequestBody User user){
        return "HELLO EUREKA !! I AM " + user.getName();
    }
}
