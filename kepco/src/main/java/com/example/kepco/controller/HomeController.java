package com.example.kepco.controller;

import java.util.Map;
import java.util.HashMap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    
    @RequestMapping("/") // 접속할 주소설정
    public String home(){
        return "Html/String";  // 접속할 주소의 페이지 정보     
    }
    @GetMapping("html/void") //주소이며 접속할 페이지 정보
    public void htmlVoid(){
    }

    @GetMapping("html/map")
    //Map중 HashMap으로 html에 전달 가능
    public Map<String, Object> htmlMap(Map<String,Object> map){
        Map<String, Object> map2 = new HashMap<String, Object>();
        return map2;
    }
    
    @GetMapping("html/model")     
    public Model htmlModel(Model model){ // Spring Framework model
        return model;
    }

    @GetMapping("html/model_view")
    public ModelAndView htmlModel(){
        ModelAndView mav = new ModelAndView();
        return mav;
    }

    // @GetMapping("html/object")
    // public Member htmlObject(){
    //     Member member = new Member();
    //     member.setName("kim");
    //     member.setAge(34);
    //     return member;
    // }

    @GetMapping("html/exam")
    public String exam(){
        return "html/test";
    }
    @GetMapping("req/http")
    public String reqhttp(){
        return "html/request";
    }

    @GetMapping("jdbc/html")
    public String jdbcHtml(){
        return "html/demo";
    }   
}