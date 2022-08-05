package br.com.miguelAniv.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
		//Optional<ConvidadosAdultos> cpf = repo.findById(adultos.getCpf());

		

		//if (cpf.isEmpty() && cpf.isPresent()) {
			repo.save(adultos);
		}

	//}

	@GetMapping("/listar")
	public String listar() {
		return "/templates/listar";
	}

}
