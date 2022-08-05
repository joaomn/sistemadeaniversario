package br.com.miguelAniv.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.miguelAniv.model.ConvidadosAdultos;
import br.com.miguelAniv.model.ConvidadosCriancas;
import br.com.miguelAniv.repository.ConvidadosCriancasRepository;


public class ConvidadosCriancasController {
	
	@Autowired
	private ConvidadosCriancasRepository crepo;	
	
	
	@GetMapping("/cadastrar/crianca")
	public String exibirCadastro() {
		return "/cadastrarcrianca";

	}

	@PostMapping("/cadastrar/crianca")
	public void enviarCadastro(@ModelAttribute ConvidadosCriancas criancas) {
		if (criancas.getNome() != "" && criancas.getIdade() != 00) {

		
			crepo.save(criancas);
			System.out.println(criancas);
		
		}
	}

}
