package br.com.miguelAniv.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.miguelAniv.model.ConvidadosAdultos;
import br.com.miguelAniv.model.ConvidadosCriancas;
import br.com.miguelAniv.repository.ConvidadosCriancasRepository;
import br.com.miguelAniv.repository.ConvidadosRepository;

@Controller
public class ConvidadosAdultosController {
	@Autowired
	private ConvidadosRepository repo;
	
	
	@GetMapping("/")
	public String primeiraPage() {
		return "/index";
	}

	@GetMapping("/cadastrar")
	public String exibirCadastro() {
		return "/cadastrar";

	}

	@PostMapping("/cadastrar")
	public void enviarCadastro(@ModelAttribute ConvidadosAdultos adultos) {
		Optional<ConvidadosAdultos> cpf = repo.findById(adultos.getTel());

		if (cpf.isEmpty() && cpf.isPresent()) {
			repo.save(adultos);
		}

	}

	@GetMapping("/listar")
	public String listar() {
		return "/listar";
	}

	@GetMapping("/deletar")
	public String deletar() {
		return "/deletar";
	}
 
	@GetMapping("/atualizar")
	public String atualizar() {
		return "/atualizar";
	}

	
	@Autowired
	private ConvidadosCriancasRepository crepo;	
	
	
	@GetMapping("/cadastrar/crianca")
	public String exibirCadastroo() {
		return "/cadastrarcrianca";

	}

	@PostMapping("/cadastrar/crianca")
	public void enviarCadastro(@ModelAttribute ConvidadosCriancas criancas) {
		if (criancas.getNome() != "" && criancas.getIdade() != 00) {

		System.out.println(criancas);
			crepo.save(criancas);
			
		
		}
	}

}
