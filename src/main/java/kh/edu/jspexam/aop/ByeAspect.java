package kh.edu.jspexam.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/*
*
@Aspect
* = 공통 기능 모아둔 클래스
* (예) 로깅, 트랜잭션, 보안체크 등
*
@Component
* = 스프링이 HiAspect 클래스를 외부에서 사용하고 인지하도록 빈으로 자동등록
*
    @Around("@annotation(kh.edu.jspexam.annotation.hi)")
    * = 스프링이 메서드 실행 전후에 동작 삽입할수 있게 hi 란 어노테이션 붙은 모든 기능을 감싸주는 역할
    * 어디서부터 어디까지가 @hi 기능으로 호출해서 실행하는 공간이라고 범위설정
    *
    * ProceedingJoinPoint
    * = 현재 실행중인 메서드에 대한 정보 담고있는 객체
    * 메서드 이름, 파라미터, 반환값, 실행흐름 제어가능
    *
    *  .proceed() = 진행하다. 시작을 나타내는 메서드.
    *
    * .getSignature() = 실행한 메서드 이름, 시그니처(정보) 출력
    *
*
* 전체흐름
* 1. @hi 붙은 메서드 호출시
* 2. around 메서드 실행
* 3. 메서드 실행전 로그 출력
* 4. 원래 메서드 실행(joinPoint.proceed())
* 5. 메서드 실행 완료 후 실행정보 로그 출력
* 6. 원래 메서드 반환값 그대로 반환시 반환하기까지 완료
*
* 클라이언트 요청 -> AOP (HiAspect.around)
*                   ㄴ  실행 전 로그출력
*                   ㄴ  원래 메서드 실행(joinPoint.proceed())
*                   ㄴ  실행 후 로그 출력
* 클라이언트 응답 전달
*
* */
@Aspect
@Component
public class ByeAspect {
    // @Around("@annotation(bye)") -> 빌드 전이라 bye 어노테이션 호출 안되면
    // import 대신 직접적으로 bye 어노테이션 가져올 위치 설정
    // 만든 어노테이션 호출시 아래처럼 작성하는게 정석
    @Around("@annotation(kh.edu.jspexam.annotation.Bye)")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable{

        System.out.println("😊 @bye 어노테이션이 붙은 메서드가 호출됨");

        Object result = joinPoint.proceed();
        System.out.println("😁 메서드 실행 완료: " + joinPoint.getSignature());
        return result;
    }
}
