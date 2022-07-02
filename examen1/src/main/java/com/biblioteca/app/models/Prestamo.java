package com.biblioteca.app.models;

import java.util.Date;

public class Prestamo {

	private Date fechaPrestamo;
	private Date fechaDevolucion;
	
	public Prestamo(Date fechaPrestamo, Date fechaDevolucion) {
		this.fechaPrestamo = fechaPrestamo;
		this.fechaDevolucion = fechaDevolucion;
	}
	
	public Date getFechaPrestamo() {
		return fechaPrestamo;
	}
	public void setFechaPrestamo(Date fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}
	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}
	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}
	
	
}
