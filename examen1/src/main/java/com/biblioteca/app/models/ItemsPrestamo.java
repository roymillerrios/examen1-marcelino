package com.biblioteca.app.models;


public class ItemsPrestamo {
	
	private Ejemplar ejemplar;
	
	private String fechaPrestamo;
	
	private String fechaDevolucion;

	public Ejemplar getEjemplar() {
		return ejemplar;
	}

	public void setEjemplar(Ejemplar ejemplar) {
		this.ejemplar = ejemplar;
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

	public ItemsPrestamo(Ejemplar ejemplar, String fechaPrestamo, String fechaDevolucion) {
		super();
		this.ejemplar = ejemplar;
		this.fechaPrestamo = fechaPrestamo;
		this.fechaDevolucion = fechaDevolucion;
	}

	
	
}
