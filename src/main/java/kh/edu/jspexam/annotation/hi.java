package kh.edu.jspexam.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
@Target(ElementType.METHOD)
= 어디에 붙일 수 있는지 지정
ElementType 기본 타입으로 METHOD 기능에만 붙일 수 있다
@Service 나 @Controller 처럼 클래스에 붙이고 싶다면
ElementType.METHOD 메서드에 사용
ElementType.TYPE 클래스, 인터페이스에 사용
ElementType.FIELD  멤버변수에 사용
ElementType.PARAMETER  메서드 파라미터에 사용

@Retention(RetentionPolicy.RUNTIME)
= 어노테이션이 언제까지 유지될지 기간, 시간 설정
RetentionPolicy.RUNTIME = 어노테이션이 언제까지 유지될지 정함
RetentionPolicy.SOURCE = 컴파일할 때만 존재, 클래스파일에 유지 X(실제 실행중에 사용 안함)
-> 컴파일 = 자바언어에서 컴퓨터언어로 변환
RetentionPolicy.CLASS = 클래스 파일까지 존재, 실행환경에서 사용불가
-> 실행중 사용시 문제 발생할수 있으니까

 @interface
 = 어노테이션 만드는 키워드
 안에 속성(ATTRIBUTE) 추가 가능
*
어노테이션은 대소문자 구분없이 생성가능
이름 첫 앞글자 대문자면 어디서든 쉽게 호출 가능
* */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface hi {
    // 아래 속성 필수 아님!
    String value() default "기본값";

}
