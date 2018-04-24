package br.com.sysconFitness.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sysconFitness.model.Plano;

public interface PlanoDaoI extends JpaRepository<Plano, Long> {

}
