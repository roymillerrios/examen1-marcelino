package com.biblioteca.app.models;

import java.util.List;

public class Autor {

	private String codigo;
	private String nombre;
	private List<Libro> listaLibros;
	
	public Autor(String codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Libro> getListaLibros() {
		return listaLibros;
	}
	public void setListaLibros(List<Libro> listaLibros) {
		this.listaLibros = listaLibros;
	}
	
	
	
}
