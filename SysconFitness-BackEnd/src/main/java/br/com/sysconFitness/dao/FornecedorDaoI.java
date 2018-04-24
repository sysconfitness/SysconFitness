package br.com.sysconFitness.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sysconFitness.model.Fornecedor;

public interface FornecedorDaoI extends JpaRepository<Fornecedor, Long> {

}
