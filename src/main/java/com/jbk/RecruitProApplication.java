package com.jbk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jbk.service.UserService;

@SpringBootApplication
public class RecruitProApplication {

	public static void main(String[] args) {
		ApplicationContext  applicationContext = SpringApplication.run(RecruitProApplication.class, args);
		
		UserService bean = applicationContext.getBean(UserService.class);
		
		System.out.println(bean);
		
	}

}
