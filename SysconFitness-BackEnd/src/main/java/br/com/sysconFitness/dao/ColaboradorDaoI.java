package br.com.sysconFitness.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sysconFitness.model.Colaborador;

public interface ColaboradorDaoI extends JpaRepository<Colaborador, Long> {

}
