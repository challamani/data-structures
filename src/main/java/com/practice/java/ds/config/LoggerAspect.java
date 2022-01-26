package com.practice.java.ds.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class LoggerAspect {


    private Logger logger = LoggerFactory.getLogger(getClass());

    @Before("execution(* com.practice.java.ds.service.*.*(..))")
    public void before(JoinPoint joinPoint) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Object object : joinPoint.getArgs()) {
            stringBuilder.append(object.toString().concat(","));
        }
        logger.info("Inbound params: {} ",stringBuilder.toString());
    }

    @AfterReturning(pointcut = "execution(* com.practice.java.ds.service.*.*(..))",returning="retVal")
    public void afterReturn(Object retVal) {
        try {
            logger.info("Outbound params {} ", retVal.toString());
        } catch (Exception exception) {
        }
    }

}