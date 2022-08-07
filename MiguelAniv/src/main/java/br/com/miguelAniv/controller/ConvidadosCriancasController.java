package br.com.miguelAniv.controller;

import java.util.Optional;

import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.miguelAniv.model.ConvidadosAdultos;
import br.com.miguelAniv.model.ConvidadosCriancas;
import br.com.miguelAniv.repository.ConvidadosCriancasRepository;

@Controller
public class ConvidadosCriancasController {
	
	@Autowired
	private ConvidadosCriancasRepository crepo;	
	
	
	@GetMapping("/cad/cri")
	public String exibirCadastro() {
		return "crianca";

	}

	@PostMapping("/cad/cri")
	public String enviarCadastro(@ModelAttribute  ConvidadosCriancas crianca) {
		
			crepo.save(crianca);
			
			return "crianca";
		}

	

}
