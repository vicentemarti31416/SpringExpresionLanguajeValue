package com.example.valueSpEL.bean;

import org.springframework.stereotype.Component;

@Component
public class Bean2 {

	private String saludo;

	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}
}
