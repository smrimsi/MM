package com.example.mmv3.MarketMate.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @GetMapping("/get-all-users")
    public String Hellow(){
        return "hellowwwwwww";
    }

}
