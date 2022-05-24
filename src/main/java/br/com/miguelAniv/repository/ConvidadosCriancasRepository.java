package br.com.miguelAniv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.miguelAniv.model.ConvidadosCriancas;

public interface ConvidadosCriancasRepository extends JpaRepository<ConvidadosCriancas, Long> {
	
	int set = 0;

}
