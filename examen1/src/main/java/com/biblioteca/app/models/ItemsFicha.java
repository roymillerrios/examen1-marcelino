package com.biblioteca.app.models;

public class ItemsFicha {
	
	private Libro libro;
	
	private String fechaPublicacion;

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public String getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(String fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public ItemsFicha(Libro libro, String fechaPublicacion) {
		super();
		this.libro = libro;
		this.fechaPublicacion = fechaPublicacion;
	}
	
	

}
