package com.practice.java.ds.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class LoggerAspect {


    private Logger logger = LoggerFactory.getLogger(getClass());

    @Before("execution(* com.practice.java.ds..*.*(..))")
    public void before(JoinPoint joinPoint) {

        StringBuilder stringBuilder = new StringBuilder();
        for (Object object : joinPoint.getArgs()) {
            stringBuilder.append(object.toString().concat(","));
        }
        logger.info("{}", joinPoint);
        logger.info("Inbound params: {} ",stringBuilder.toString());
    }

    @After("execution(* com.practice.java.ds..*.*(..))")
    public void after(JoinPoint joinPoint) {

        StringBuilder stringBuilder = new StringBuilder();
        for (Object object : joinPoint.getArgs()) {
            stringBuilder.append(object.toString().concat(","));
        }
        logger.info("Return {}", joinPoint);
        logger.info("Outbound params {} ", stringBuilder.toString());
    }

}