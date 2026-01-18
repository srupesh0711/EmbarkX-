package com.embarkX.FirstSpring.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/embarkX/api/v1")
public class Hello {
// http://localhost:8080/embarkX/api/v1/hello
    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World!";
    }

    @PostMapping("/hello")
    public String helloPost(@RequestBody String name){
        return "Hello" +" "+ name + "!";
    }
}
