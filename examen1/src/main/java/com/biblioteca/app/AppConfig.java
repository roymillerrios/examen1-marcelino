package com.biblioteca.app;

import java.util.Arrays;
import java.util.List;
import java.text.SimpleDateFormat;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.biblioteca.app.models.Ejemplar;
import com.biblioteca.app.models.ItemsFicha;
import com.biblioteca.app.models.ItemsPrestamo;
import com.biblioteca.app.models.Libro;

@Configuration
public class AppConfig {

	@Bean("itemsPrestamo")
	public List<ItemsPrestamo> registrarPrestamo(){
		Ejemplar ejemplar1 = new Ejemplar("A1456","Biblioteca Central");
		Ejemplar ejemplar2 = new Ejemplar("A5689","Biblioteca Central");
		Ejemplar ejemplar3 = new Ejemplar("B1456","Biblioteca Sistemas");
		Ejemplar ejemplar4 = new Ejemplar("B5689","Biblioteca Sistemas");
		
		ItemsPrestamo linea1 = new ItemsPrestamo(ejemplar1,"2020-06-16","2020-06-18");
		ItemsPrestamo linea2 = new ItemsPrestamo(ejemplar2,"2020-06-06","2020-06-19");
		ItemsPrestamo linea3 = new ItemsPrestamo(ejemplar3,"2020-05-10","2020-05-11");
		ItemsPrestamo linea4 = new ItemsPrestamo(ejemplar4,"2020-05-15","2020-05-30");
		
		return Arrays.asList(linea1,linea2,linea3,linea4);
	}
	
	
	@Bean("itemsFicha")
	public List<ItemsFicha> registrarFicha(){
		Libro libro1 = new Libro("A14","Calculo 1","45631245123661",650);
		Libro libro2 = new Libro("A56","Programacion 2","05631245123661",250);
		
		
		ItemsFicha tema1 = new ItemsFicha(libro1,"2015-02-27");
		ItemsFicha tema2 = new ItemsFicha(libro1,"2019-05-22");
		
		return Arrays.asList(tema1,tema2);
	}
}

