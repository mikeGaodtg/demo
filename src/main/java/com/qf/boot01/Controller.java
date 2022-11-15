package com.qf.boot01;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/receive")
public class Controller {

    @PostMapping("/status")
    public String status (){

        System.out.println("got msg");
        return "SUCCESS from github";
    }
}
