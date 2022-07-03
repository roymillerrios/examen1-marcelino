package com.biblioteca.app.models;


import javax.validation.constraints.NotEmpty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Usuario {
	
		@Value("${usuario.codigo}")
		private String codigo;
		@Value("${usuario.nombre}")
		private String nombre;
		@Value("${usuario.direccion}")
		private String direccion;
		@Value("${usuario.telefono}")
		private String telefono;
		@NotEmpty
		private String email;
		@NotEmpty
		private String password;

		
		public Usuario() {
			
		}
		
		
				
		public Usuario(String codigo, String nombre, String direccion, String telefono, @NotEmpty String email,
				@NotEmpty String password) {
			this.codigo = codigo;
			this.nombre = nombre;
			this.direccion = direccion;
			this.telefono = telefono;
			this.email = email;
			this.password = password;
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

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		
		
}
