package com.github.yeecode.easyrpc.client;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
public class SimpleTest {

    @Autowired
    ApplicationContext app;

    @Test
    public void test1(){
        System.out.println(app.getClass());
        System.out.println(app.getBean(""));
    }

}
