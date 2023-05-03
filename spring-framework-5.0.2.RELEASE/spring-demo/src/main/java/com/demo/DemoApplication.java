package com.demo;

import com.demo.service.HomeService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:spring/spring-config.xml");
		HomeService welcomeService = applicationContext.getBean(HomeService.class);
		welcomeService.hello("spring.xml get bean success!");
	}
}