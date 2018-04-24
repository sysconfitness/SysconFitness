package br.com.sysconFitness.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import br.com.sysconFitness.model.Usuario;

public interface UsuarioDaoI extends JpaRepository<Usuario, Long> {
	
	Usuario findByLogin(String loign);

}
