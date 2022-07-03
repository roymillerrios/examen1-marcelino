package com.biblioteca.app.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Prestamo {
	
	
	private String descripcion;
	
	@Autowired
	private Usuario usuario;
	
	@Autowired
	private List<ItemsPrestamo> items;
	
	public Prestamo() {
		
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<ItemsPrestamo> getItems() {
		return items;
	}

	public void setItems(List<ItemsPrestamo> items) {
		this.items = items;
	}

	public Prestamo(Usuario usuario, String descripcion, List<ItemsPrestamo> items) {
		this.usuario = usuario;
		this.descripcion = descripcion;
		this.items = items;
	}

	
	
	
}
