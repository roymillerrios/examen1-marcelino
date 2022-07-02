package com.biblioteca.app.models;

public class Ejemplar {
	
	private String codigo;
	private String localizacion;
	
	public Ejemplar(String codigo, String localizacion) {
		this.codigo = codigo;
		this.localizacion = localizacion;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getLocalizacion() {
		return localizacion;
	}
	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}
	
	

}
