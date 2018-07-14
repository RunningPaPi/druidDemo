package com.artqiyi.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect 
public class DruidInterceptor {
	@Pointcut("execution (* com.artqiyi.dao.mapper.*(..))")
	private void cut() {
		
	}
}
