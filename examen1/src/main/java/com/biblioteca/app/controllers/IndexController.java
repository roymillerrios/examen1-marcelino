package com.biblioteca.app.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.biblioteca.app.models.Ficha;
import com.biblioteca.app.models.Prestamo;
import com.biblioteca.app.models.Usuario;
import com.biblioteca.app.validations.UsuarioValidador;

@Controller
@SessionAttributes("usuario")
public class IndexController {

	@Value("$(texto.indexcontroller.index.usuarios")
	private String textoUsuarios;
	@Value("$(texto.indexcontroller.index.libros")
	private String textoLibros;
	@Value("$(texto.indexcontroller.index.ejemplares")
	private String textoEjemplares;
	@Value("$(texto.indexcontroller.index.autores")
	private String textoAutores;
	
<<<<<<< HEAD
	@Autowired
	private UsuarioValidador validador;
	
=======
	//Vista login
>>>>>>> branch 'main' of https://github.com/roymillerrios/examen1-marcelino
	@GetMapping({"/"})
	public String index(Model model){
		Usuario usuario= new Usuario();
		 model.addAttribute("titulo","Sistema Web - Biblioteca G5");
		 model.addAttribute("usuario",usuario);
		 return "login";
		 
		}
	
<<<<<<< HEAD
	@PostMapping("/form")
	public String procesar(@Valid Usuario usuario,BindingResult result,Model model,SessionStatus status){
		
		validador.validate(usuario,result);
		model.addAttribute("titulo","Resultado Form");
		if(result.hasErrors()) {
			return "login";
		}
		model.addAttribute("usuario",usuario);
		status.setComplete();
		return "index";
	}
	
=======
	//Vista principal/index
	@GetMapping({"/index","/home"})
	public String principal(Model model){
		 model.addAttribute("titulo","Sistema Web - Biblioteca G5");
		 return "index";
		}
	
	
	//Vista Usuario
>>>>>>> branch 'main' of https://github.com/roymillerrios/examen1-marcelino
	@RequestMapping("/usuario")
	public String usuario(Model model) {
		model.addAttribute("titulo","Usuario");
		return "usuarios";
	}
	
	// Vista prestamo
	@Autowired
	private Prestamo prestamo;
	
	@RequestMapping("/prestamo")
	public String prestamo(Model model) {
		
		model.addAttribute("prestamo",prestamo);
		return "prestamo";
	}
	
	//Vista ficha
	@Autowired
	private Ficha ficha;
	
	@RequestMapping("/ficha")
	public String ficha(Model model) {
		
		model.addAttribute("ficha",ficha);
		return "ficha";
	}

}
