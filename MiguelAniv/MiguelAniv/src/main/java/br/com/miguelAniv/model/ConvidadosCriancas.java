package br.com.miguelAniv.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class ConvidadosCriancas {
	
	private String nome;
	private int idade;
	private int validacao;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	
//	@OneToOne
	//private Cartoes cartao;

}
