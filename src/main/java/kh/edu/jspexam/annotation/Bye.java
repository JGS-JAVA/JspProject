package kh.edu.jspexam.annotation;

// bye 어노테이션을 메서드에서만 사용가능, 런타임 환경에서만 사용하게 설정
// ByeAspect 만들어 return 으로
// 기능종료!
// 1. 시스템 출력문으로 bye 종료 어노테이션 붙은 메서드 호출됨
// proceed 로 원래 메서드 실행후
// return result;

// api 에서 endpoint /bye 주소로 접속시
// 실행종료가 restController 로 나오게 설정

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Bye {
    String value() default "기본값";
}
