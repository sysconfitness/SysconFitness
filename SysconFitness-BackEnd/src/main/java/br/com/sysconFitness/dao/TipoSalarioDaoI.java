package br.com.sysconFitness.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sysconFitness.model.TipoSalario;

public interface TipoSalarioDaoI extends JpaRepository<TipoSalario, Long> {

}
