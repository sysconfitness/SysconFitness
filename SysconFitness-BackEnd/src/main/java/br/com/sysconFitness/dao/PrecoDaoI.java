package br.com.sysconFitness.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sysconFitness.model.Preco;

public interface PrecoDaoI extends JpaRepository<Preco, Long> {

}
