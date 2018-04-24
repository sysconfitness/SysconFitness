package br.com.sysconFitness.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sysconFitness.model.Anatomia;


public interface AnatomiaDaoI extends JpaRepository<Anatomia, Long> {
	
	public  List<Anatomia> findByCliente_id(Integer id_cliente);
}
