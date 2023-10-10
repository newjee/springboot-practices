package ex04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *
 * @SpringBootApplication 메타 어노테이션
 * {
 *   @SpringBootConfiguration : cf) ex01, ex02
 *   @ComponentScan : ex04 :: 하부 패키지를 스캔 cf) ex03
 *   @EnableAutoConfiguration :
 *         -> MVC / Aop / Security / JPA 등을 자동으로 설정
 *
 *
 *  }
 *
 */

@SpringBootApplication
public class MyApplication {

    public static void main(String[] args) {
        try(ConfigurableApplicationContext ac = SpringApplication.run(MyApplication.class, args)){}
    }

}