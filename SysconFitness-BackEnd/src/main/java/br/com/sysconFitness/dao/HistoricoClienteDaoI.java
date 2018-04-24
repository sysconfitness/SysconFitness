package br.com.sysconFitness.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sysconFitness.model.HistoricoCliente;

public interface HistoricoClienteDaoI extends JpaRepository<HistoricoCliente, Long> {

}
