package com.brytcode.advices;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAdvice {
    @AfterThrowing(pointcut="execution(* com.brytcode.service.*.*(..))", throwing = "ex")
    public void startLogger(Exception ex) throws Throwable {
//        Signature sig = joinPoint.getSignature();
//        System.out.println(joinPoint.getSignature().getName()+" Method Invoked with "+joinPoint.getArgs()[0].toString());
//        Object result = joinPoint.proceed();
//        System.out.println("Return with "+ result);
        System.out.println(ex.getMessage() +"Occured");
    }
}
