package com.biblioteca.app.models;

public class Libro {

	private String codigo;
	private String titulo;
	private String isbn;
	private Integer nroPagina;
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
	public Integer getNroPagina() {
		return nroPagina;
	}
	public void setNroPagina(Integer nroPagina) {
		this.nroPagina = nroPagina;
	}
	public Libro(String codigo, String titulo, String isbn, Integer nroPagina) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.isbn = isbn;
		this.nroPagina = nroPagina;
	}
	
	

}
