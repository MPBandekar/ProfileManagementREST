package com.rest.profilemanagement.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class DemoController {

    @GetMapping
    public String defaultText(){
        return "default Crap";
    }

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello Future CEOs";
    }


}
