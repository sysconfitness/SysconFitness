package br.com.sysconFitness.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sysconFitness.model.Pagina;

public interface PaginaDaoI extends JpaRepository<Pagina, Long> {

}
