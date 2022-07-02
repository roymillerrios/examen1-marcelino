package com.biblioteca.app.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Prestamo {
	
	@Autowired
	private Usuario usuario;
	
	@Autowired
	private List<ItemsPrestamo> items;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<ItemsPrestamo> getItems() {
		return items;
	}

	public void setItems(List<ItemsPrestamo> items) {
		this.items = items;
	}
	
	
	
}
