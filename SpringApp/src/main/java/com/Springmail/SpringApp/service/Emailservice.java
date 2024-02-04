package com.Springmail.SpringApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class Emailservice {
    @Autowired
    private JavaMailSender javaMailSender;
    public String sendmail()
    {
        SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
        simpleMailMessage.setFrom("bharani240296@gmail.com");
        simpleMailMessage.setTo("bharani240296@gmail.com");
        simpleMailMessage.setCc("bharanitharan1132006@gmail.com");
        simpleMailMessage.setText("Hi \n Relax :) \n This is normal msg don't panic");
        simpleMailMessage.setSubject("Test mail");

javaMailSender.send(simpleMailMessage);
return "Mail sent success";
    }
}
