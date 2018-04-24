package br.com.sysconFitness.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sysconFitness.model.Cliente;

public interface ClienteDaoI extends JpaRepository<Cliente, Long> {

}
