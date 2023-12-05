package com.example.kepco.controller;

import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.kepco.dto.Member;


@Controller
@ResponseBody // Return이 주소대신에 html 문자열로 보내는 
public class Json1Controller {
    @GetMapping("json/string") //요청하는 주소
    public String json(){
        return "<h1>json/string</h1>"; // html 문자열
    }

    @GetMapping("json/map")
    public Map<String, Object> jsonMap(Map<String, Object> map){
        Map<String, Object> map2 = new HashMap<String, Object>();
        map2.put("key1","value");
        map2.put("key2",1234);
        map2.put("key3",true);
        return map2;
    }
    
    // @GetMapping("json/object")
    // public Member jsonObject(){
    //     Member member = new Member();
    //     member.setName("kim");
    //     member.setAge(50);
    //     return member;
    // }
    
    @GetMapping("json/list")
    public List<String> jsonList(){
        List<String> list = new ArrayList<>();
        for (int i = 1; i<=3; i++){
            String a = Integer.toString(i);
            list.add(a);
        }
        return list;
    }

    @GetMapping("json/exam")
    public Map<String, Object> jsonExam(){
        Map<String, Object> map = new HashMap<String, Object>();
        List<Member> list = new ArrayList<Member>();
        int valueCount = 0;
        list.add(new Member("가","A","1"));
        list.add(new Member("나","B","2"));
        valueCount = list.size();
        map.put("count",valueCount);
        map.put("list",list);
        return map;
    }
}