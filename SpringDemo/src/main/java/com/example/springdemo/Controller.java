package com.example.springdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/api/test/{resourceId}")
    public String getString(@PathVariable String resourceId){
        return "Here is your kur: " + resourceId;
    }


}
