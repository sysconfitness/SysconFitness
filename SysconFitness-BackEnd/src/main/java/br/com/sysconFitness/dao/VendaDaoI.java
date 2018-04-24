package br.com.sysconFitness.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sysconFitness.model.Venda;

public interface VendaDaoI extends JpaRepository<Venda, Long> {

}
