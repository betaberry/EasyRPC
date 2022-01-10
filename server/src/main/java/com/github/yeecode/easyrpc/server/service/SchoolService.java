package com.github.yeecode.easyrpc.server.service;

import org.springframework.stereotype.Component;

@Component
public class SchoolService {
    public String querySchoolName(Integer id) {
        System.out.println("Method querySchoolName called:");
        System.out.println("Arg id=" + id);
        System.out.println("*************************");
        return "Sunny School";
    }
}
