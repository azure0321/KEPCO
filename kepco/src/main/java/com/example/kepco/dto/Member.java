package com.example.kepco.dto;

// public class Member {
//     public String name;
//     public int age;
//     public String setName(String name){
//         this.name = name;
//         return this.name;
//     }
//     public int setAge(int age){
//         this.age = age;
//         return this.age;
//     }
// }

public class Member{
    public String name;
    public String userId;
    public String userPassword;

    public Member(String name, String userId, String userPassword){
        this.name = name;
        this.userId = userId;
        this.userPassword = userPassword;
    }
}