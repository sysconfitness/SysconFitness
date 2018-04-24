package br.com.sysconFitness.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sysconFitness.model.FrequenciaCliente;

public interface FrequenciaDaoI extends JpaRepository<FrequenciaCliente, Long> {

}
