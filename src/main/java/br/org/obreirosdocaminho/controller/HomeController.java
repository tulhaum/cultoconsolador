package br.org.obreirosdocaminho.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/malucos")
public class HomeController {
	
	@GetMapping("/hello-word")
	public String helloWord() {
		return "Eu sou o cabeça de gelo";
		
	}

}