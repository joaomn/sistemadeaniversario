package br.com.miguelAniv.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class ConvidadosCriancas {
	
	private String nome;
	private int idade;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	
//	@OneToOne
	//private Cartoes cartao;

}
