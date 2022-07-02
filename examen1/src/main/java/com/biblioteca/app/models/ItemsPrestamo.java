package com.biblioteca.app.models;


public class ItemsPrestamo {
	
	private Ejemplar codigo;
	
	private String fechaPrestamo;
	
	private String fechaDevolucion;

	public Ejemplar getCodigo() {
		return codigo;
	}

	public void setCodigo(Ejemplar codigo) {
		this.codigo = codigo;
	}

	public String getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(String fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public String getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(String fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	public ItemsPrestamo(Ejemplar codigo, String fechaPrestamo, String fechaDevolucion) {
		this.codigo = codigo;
		this.fechaPrestamo = fechaPrestamo;
		this.fechaDevolucion = fechaDevolucion;
	}
	
	
}
