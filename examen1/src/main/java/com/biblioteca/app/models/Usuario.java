package com.biblioteca.app.models;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Usuario {
	
		@Value("${usuario.codigo}")
		private String codigo;
		@Value("${usuario.nombre}")
		private String Nombre;
		@Value("${usuario.direccion}")
		private String direccion;
		@Value("${usuario.telefono}")
		private String telefono;
		
		public Usuario() {
			
		}
		
		public Usuario(String codigo, String nombre, String direccion, String telefono) {
			this.codigo = codigo;
			this.Nombre = nombre;
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
			this.Nombre = nombre;
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
