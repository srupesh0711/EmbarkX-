package com.embarkX.FirstSpring.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/embarkX/api/v1")
public class Hello {
// http://localhost:8080/embarkX/api/v1/hello
    @GetMapping(value = "/hello")
    public String helloWorld(){
        return "Hello World!";
    }
}
