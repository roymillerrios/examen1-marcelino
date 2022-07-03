package com.biblioteca.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.biblioteca.app.models.Ficha;
import com.biblioteca.app.models.Prestamo;

@Controller
public class IndexController {
 //Este es otro cambio
	@Value("$(texto.indexcontroller.index.usuarios")
	private String textoUsuarios;
	@Value("$(texto.indexcontroller.index.libros")
	private String textoLibros;
	@Value("$(texto.indexcontroller.index.ejemplares")
	private String textoEjemplares;
	@Value("$(texto.indexcontroller.index.autores")
	private String textoAutores;
	
	//Vista login
	@GetMapping({"/"})
	public String index(Model model){
		 model.addAttribute("titulo","Sistema Web - Biblioteca G5");
		 return "login";
		}
	
	//Vista principal/index
	@GetMapping({"/index","/home"})
	public String principal(Model model){
		 model.addAttribute("titulo","Sistema Web - Biblioteca G5");
		 return "index";
		}
	
	
	//Vista Usuario
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
}
