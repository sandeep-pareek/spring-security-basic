package com.sandeep.springsecuritybasic.resource;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello")
public class SecurityController {


    @GetMapping
    public String hello(@AuthenticationPrincipal final UserDetails userDetails){
        return "Hello, Spring security";
    }
}
