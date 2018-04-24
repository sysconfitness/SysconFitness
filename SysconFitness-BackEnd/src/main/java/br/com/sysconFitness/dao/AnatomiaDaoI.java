package br.com.sysconFitness.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sysconFitness.model.Anatomia;

public interface AnatomiaDaoI extends JpaRepository<Anatomia, Long> {

}
