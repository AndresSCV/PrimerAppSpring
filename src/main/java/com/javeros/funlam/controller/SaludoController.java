package com.javeros.funlam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("saludo/")
public class SaludoController {
	
	@GetMapping("saludar")
	public String saludar(){
		return "holamundo";
	}

	@GetMapping("saludarvariable")
	public String saludarvariable(Model modeloNombre){
		modeloNombre.addAttribute("nombreenlavista","Nestor");
		return "holamundo";
	}
}
