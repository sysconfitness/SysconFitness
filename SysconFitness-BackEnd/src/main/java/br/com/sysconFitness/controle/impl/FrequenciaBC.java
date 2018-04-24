package br.com.sysconFitness.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.sysconFitness.controle.esp.FrequenciaBCI;
import br.com.sysconFitness.dao.FrequenciaDaoI;
import br.com.sysconFitness.model.FrequenciaCliente;

@Controller
public class FrequenciaBC implements FrequenciaBCI{

	@Autowired
	private FrequenciaDaoI dao;
	
	@Override
	public void insert(FrequenciaCliente frequencia) {
		dao.save(frequencia);
	}

	@Override
	public void update(FrequenciaCliente frequencia) {
		dao.save(frequencia);
	}

	@Override
	public void delete(FrequenciaCliente frequencia) {
		dao.delete(frequencia);
	}

	@Override
	public List<FrequenciaCliente> select() {
		return dao.findAll();
	}
}
