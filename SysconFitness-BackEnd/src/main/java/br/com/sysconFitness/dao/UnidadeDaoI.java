package br.com.sysconFitness.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sysconFitness.model.Unidade;

public interface UnidadeDaoI extends JpaRepository<Unidade, Long> {

}
