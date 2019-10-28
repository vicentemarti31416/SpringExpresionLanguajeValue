package com.example.valueSpEL.bean;

import org.springframework.stereotype.Component;

@Component
public class Bean1 {

	private String saludo = "Hola desde el Bean1";

	public String getSaludo() {
		return saludo;
	}

}
