package com.biblioteca.app.validations;

import javax.validation.Validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.biblioteca.app.models.Usuario;

@Component
public class UsuarioValidador {

	public boolean supports(Class<?> clazz){
		return Usuario.class.isAssignableFrom(clazz);
	}


	public void validate(Object target, Errors errors) {
		Usuario usuario = (Usuario)target;
		
		ValidationUtils.rejectIfEmpty(errors, "email", "NotEmpty.usuario.email");
	
	}
}
