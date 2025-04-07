package kh.edu.jspexam.controller;
/*
* AOP annotation 생성후 빌드 작업 안하면
* 스스로 import 로 폴더위치 작성필요
* ctrl + F9 로 빌드작업 후
* @interface 로 만든 어노테이션 호출해 사용시
* import 직접 작성 안해도 됨
* */
import kh.edu.jspexam.annotation.hi;
import kh.edu.jspexam.aop.HiAspect;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @hi
    @GetMapping("/hello")
    public String hello() {
        System.out.println("@hi 어노테이션 실행 확인중");
        return "hello, AOP!!!";
    }
}
