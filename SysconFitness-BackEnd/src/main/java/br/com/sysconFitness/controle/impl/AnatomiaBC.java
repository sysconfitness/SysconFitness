package br.com.sysconFitness.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.sysconFitness.controle.esp.AnatomiaBCI;
import br.com.sysconFitness.dao.AnatomiaDaoI;
import br.com.sysconFitness.model.Anatomia;

@Controller
public class AnatomiaBC implements AnatomiaBCI{

	@Autowired
	private AnatomiaDaoI dao;
	
	@Override
	public void insert(Anatomia medidaAcompanhamento) {
		dao.save(medidaAcompanhamento);
	}

	@Override
	public void update(Anatomia medidaAcompanhamento) {
		dao.save(medidaAcompanhamento);
	}

	@Override
	public void delete(Anatomia medidaAcompanhamento) {
		dao.delete(medidaAcompanhamento);
	}

	@Override
	public List<Anatomia> select() {
		return dao.findAll();
	}

	@Override
	public List<Anatomia> findByCliente_id(Integer id_cliente) {
		
		return dao.findByCliente_id(id_cliente);
	}
}
