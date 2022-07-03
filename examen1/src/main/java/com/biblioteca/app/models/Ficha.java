package com.biblioteca.app.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ficha {
	
	@Autowired
	private Autor autor;
	
	@Autowired
	private List<ItemsFicha> fichas;
	
	public Ficha() {
		
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public List<ItemsFicha> getFichas() {
		return fichas;
	}

	public void setFichas(List<ItemsFicha> fichas) {
		this.fichas = fichas;
	}

	public Ficha(Autor autor, List<ItemsFicha> fichas) {
		this.autor = autor;
		this.fichas = fichas;
	}
	


	

}
