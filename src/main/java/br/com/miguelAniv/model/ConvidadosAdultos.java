package br.com.miguelAniv.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ConvidadosAdultos {
	private String nome;
	private int idade;
	@Id
	private Long cpf;
	
	@OneToMany(cascade = CascadeType.PERSIST)
	private List<ConvidadosCriancas> criancas;

}
