package com.pepe.holaMundo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HomeController {

	@GetMapping("/")  //con esto definimos la ruta en la que esta clase será llamada. Este método responde a las peticiones get que se realicen sobre la ruta definida
	public String inicio() {
		return "Hola Mundo";
	}
}
