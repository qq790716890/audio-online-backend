package com.audioOnline.controller;



import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

        @GetMapping(value = "/index")
        public String hello() {
            return "{age:20}";
        }






}
