package com.Springmail.SpringApp.controller;

import com.Springmail.SpringApp.service.Emailservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Emailcontroller {
    @Autowired
    private Emailservice emailservice;
    @GetMapping("/sentmail")
    public String sentmail()
    {
        return emailservice.sendmail();
    }

}
