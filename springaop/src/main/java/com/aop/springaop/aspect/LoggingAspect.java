package com.aop.springaop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Pointcut("@annotation(Log)")
    public void logPointCut() {

    }

    @After("logPointCut()")
    public void logAllMethodCallsAdvice(){
        System.out.println("In Aspect");
    }
}
