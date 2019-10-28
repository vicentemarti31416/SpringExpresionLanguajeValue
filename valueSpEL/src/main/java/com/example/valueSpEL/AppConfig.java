package com.example.valueSpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.valueSpEL.bean.Bean1;
import com.example.valueSpEL.bean.Bean2;

@Configuration
public class AppConfig {

	@Bean 
	public Bean1 bean1() {
		return new Bean1();
	}
	
	@Bean
	public Bean2 bean2(@Value("#{bean1.saludo}")String saludo) {
		Bean2 bean2 = new Bean2();
		bean2.setSaludo(saludo);
		return bean2;
	}
}
