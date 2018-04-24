package br.com.sysconFitness.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sysconFitness.model.Atividade;

public interface AtividadeDaoI extends JpaRepository<Atividade, Long> {

}
