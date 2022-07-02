package com.biblioteca.app.models;

public class Usuario {
	
		private String codigo;
		private String Nombre;
		private String direccion;
		private String telefono;
		
		
		public Usuario(String codigo, String nombre, String direccion, String telefono) {
			this.codigo = codigo;
			Nombre = nombre;
			this.direccion = direccion;
			this.telefono = telefono;
		}
				
		public String getCodigo() {
			return codigo;
		}
		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}
		public String getNombre() {
			return Nombre;
		}
		public void setNombre(String nombre) {
			Nombre = nombre;
		}
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		public String getTelefono() {
			return telefono;
		}
		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}

		
		
}
