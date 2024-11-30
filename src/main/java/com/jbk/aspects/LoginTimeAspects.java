package com.jbk.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoginTimeAspects {
	
	Logger logger = LoggerFactory.getLogger(LoginTimeAspects.class);
	
//	@Before("execution(* com.jbk.controller.*.*(..))")
//	public void captureStartTime() {
//		System.out.println("Start Time = "+LocalDateTime.now());
//	}
//	@After("execution(* com.jbk.controller.*.*(..))")
//	public void captureEndtTime() {
//		System.out.println("End Time = "+LocalDateTime.now());
//	}
	
	@Around("execution(* com.jbk.controller.*.*(..))")
	public Object trackExectionTime( ProceedingJoinPoint joinPoint) throws Throwable {
		
		long startTime = System.currentTimeMillis();
		Object obj = joinPoint.proceed();
		long endTime = System.currentTimeMillis();
		
		logger.info("Eecution Time ="+(endTime-startTime));
		
		return obj;
		
	}
	

}
