package com.example.mqEnvio.controllers;
import com.example.mqEnvio.services.SendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendController {

    @Autowired
    private SendService sendService;

    @GetMapping("/send/{name}")
    public String sendName(@PathVariable("name") String name){
       sendService.sendName(name); 
       return name;
    }
    
}
