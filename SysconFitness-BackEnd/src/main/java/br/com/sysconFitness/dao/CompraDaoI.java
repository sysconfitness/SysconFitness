package br.com.sysconFitness.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sysconFitness.model.Compra;

public interface CompraDaoI extends JpaRepository<Compra, Long> {

}
