package com.poscodx.springboot.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

// 1. BootStraping Class : Spring Application의 BootStraping 역할
// 2. 설정 클래스 역할 : Configuration Class
@SpringBootApplication
//이게 달려있는 파일 패키지 하부를 뒤짐
public class HelloWorldApplication {
    public static void main(String[] args) {

//        run 에서 일어나는 일
//        1. 어플리케이션 컨텍스트 (Application Context / Spring Container) 생성
//        2. 어노테이션 스캐닝 (Component Scanning) + Configuration Class을 통한  빈 클래스 생성 및 등록 작업
//              com.poscodx.helloworld
//                | MyApplicaion.java
//              com.poscodx.helloworld.config
//              com.poscodx.helloworld.controller
//              com.poscodx.helloworld.service


//        3. if, Web Application ( 확인법:Library에서 springMVC class 로딩... ), Web Appication Type 결정
//            (Spring MVC : 서버 필요 // Reactive : 서버 필요 없음)
//        4. if, WebApplication + Type->Spring MVC
//             -> 내장(embeded) Server /TomcatEmbadedServiceServletContainer/ 인스턴스 생성
//             -> 서버 인스턴스 WebApplication 배포...
//                  -> 서버 인스턴스 Start...
//        5. ApplicationRunner 인터페이스를 구현한 빈을 Applicaionㅗ Context 찾아서 실행
//안녕오라버니 안녕하세요아뇨ㅛㅛㄴ아뇨아뇬아아뇨그럴ㅗㅗㅗㅗㅗㅗ오오오오오오 오오오 오오오옹ㅇhellhello
//        ConfigurableApplicationContext ac = null;
//		try {
//			ac = SpringApplication.run(HelloWorldApplication.class, args);
//		} catch(Throwable ex) {
//			ex.printStackTrace();
//		} finally {
//			if(ac != null) {
//				ac.close();
//			}
//		}

        // try ~ with ~ resources 구문
        try (ConfigurableApplicationContext ac = SpringApplication.run(HelloWorldApplication.class, args)) {

            // wep application인 경우
            // SpringApplication.run(HelloWorldApplication.class, args);

            System.out.println("some code....");
            System.out.println("some code....");
            System.out.println("some code....");
            System.out.println("some code....");
        }

    }
    }

