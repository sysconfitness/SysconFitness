package br.com.sysconFitness.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sysconFitness.model.Funcao;

public interface FuncaoDaoI extends JpaRepository<Funcao, Long> {

}
