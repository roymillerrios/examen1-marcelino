package com.biblioteca.app.models;

import java.util.Arrays;
import java.util.List;
import java.text.SimpleDateFormat;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean("itemsPrestamo")
	public List<ItemsPrestamo> registrarPrestamo(){
		Ejemplar ejemplar1 = new Ejemplar("1456","Biblioteca Central");
		Ejemplar ejemplar2 = new Ejemplar("5689","Biblioteca Central");
		
		ItemsPrestamo linea1 = new ItemsPrestamo(ejemplar1,"2020-06-16","2020-06-18");
		ItemsPrestamo linea2 = new ItemsPrestamo(ejemplar2,"2020-06-16","2020-06-19");
		
		return Arrays.asList(linea1,linea2);
	}
}
