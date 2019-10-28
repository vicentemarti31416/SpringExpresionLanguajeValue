package com.example.valueSpEL;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.valueSpEL.bean.Bean2;

public class App {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Bean2 bean2 = context.getBean(Bean2.class);
		System.out.println(bean2.getSaludo());
	}
}
