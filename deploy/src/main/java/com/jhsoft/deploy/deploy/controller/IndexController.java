package com.jhsoft.deploy.deploy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index(Model model){
		model.addAttribute("titulo", "Hola mundo!");
		model.addAttribute("mensaje", "Despliegue Automatico - ejecución de pruebas");
		return "index";
	}
	
	public void mayorDeEdad(int edad){
		if(edad < 5){
			throw new RuntimeException("usted es menor de edad");
		}
	}
}
