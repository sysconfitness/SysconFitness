package br.com.sysconFitness.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sysconFitness.model.Estoque;

public interface EstoqueDaoI extends JpaRepository<Estoque, Long> {

}
