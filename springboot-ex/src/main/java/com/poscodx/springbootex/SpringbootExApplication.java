package com.poscodx.springbootex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootExApplication {

    public static void main(String[] args) {

//        run 에서 일어나는 일
//        1. 어플리케이션 컨텍스트 (Application Context / Spring Container) 생성
//        2.
        SpringApplication.run(SpringbootExApplication.class, args);
    }

}
