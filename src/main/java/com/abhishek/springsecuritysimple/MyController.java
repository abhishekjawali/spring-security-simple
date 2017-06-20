package com.abhishek.springsecuritysimple;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jawala on 6/20/2017.
 */
@RestController
public class MyController {

    @RequestMapping(value = "/")
    public String home() {
        return "Hello!";
    }
}

