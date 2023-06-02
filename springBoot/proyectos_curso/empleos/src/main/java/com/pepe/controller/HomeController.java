package com.pepe.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //con esto establecemos que la clase va a actuar como controladora
public class HomeController {

	@GetMapping("/")
	public String mostrarHome(Model model ) {
		
		model.addAttribute("mensaje", "Bienvenidos a EmpleosApp");
		model.addAttribute("fecha", new Date());
		
		return "home";
		
	}
	
}
