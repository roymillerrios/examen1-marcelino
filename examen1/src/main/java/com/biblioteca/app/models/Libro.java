package com.biblioteca.app.models;

import java.util.List;

public class Libro {

	private String codigo;
	private String titulo;
	private String isbn;
	private int nroPagina;
	private List<Autor> listaAutores;
	
	public Libro(String codigo, String titulo, String isbn, int nroPagina) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.isbn = isbn;
		this.nroPagina = nroPagina;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getNroPagina() {
		return nroPagina;
	}
	public void setNroPagina(int nroPagina) {
		this.nroPagina = nroPagina;
	}
	public List<Autor> getListaAutores() {
		return listaAutores;
	}
	public void setListaAutores(List<Autor> listaAutores) {
		this.listaAutores = listaAutores;
	}
	
	
}
