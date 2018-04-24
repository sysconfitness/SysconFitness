package br.com.sysconFitness.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sysconFitness.model.Salario;

public interface SalarioDaoI extends JpaRepository<Salario, Long> {

}
