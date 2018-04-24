package br.com.sysconFitness.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sysconFitness.model.Cidade;

public interface CidadeDaoI extends JpaRepository<Cidade, Long> {

}
