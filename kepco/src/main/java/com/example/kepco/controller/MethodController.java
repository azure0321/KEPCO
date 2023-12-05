package com.example.kepco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RestController
public class MethodController {
    @RequestMapping(value="req/get", method=RequestMethod.GET)
    public String get(){
        return "GET";
    }
    @GetMapping("req/post")
    public String post(){
        return "POST";
    }
    // @GetMapping("req/http")
    // public String http(HttpServeletRequest request){
    // }
}