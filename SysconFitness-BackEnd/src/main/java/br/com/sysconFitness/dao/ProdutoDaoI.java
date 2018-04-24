package br.com.sysconFitness.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sysconFitness.model.Produto;

public interface ProdutoDaoI extends JpaRepository<Produto, Long> {

}
