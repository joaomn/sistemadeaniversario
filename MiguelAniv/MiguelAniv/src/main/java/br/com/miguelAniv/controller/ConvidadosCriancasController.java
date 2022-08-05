package br.com.miguelAniv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.miguelAniv.model.ConvidadosCriancas;
import br.com.miguelAniv.repository.ConvidadosCriancasRepository;

@RequestMapping
public class ConvidadosCriancasController {
	
	
	private ConvidadosCriancasRepository repo;	
	
	
	@GetMapping
	public String cadastroCrianca() {
		return "/cadastrarcrianca";
				
	}
	
	
	@PostMapping
	public void enviarcadastroc(@ModelAttribute ConvidadosCriancas criancas) {
		
		repo.save(criancas);
	}

}
