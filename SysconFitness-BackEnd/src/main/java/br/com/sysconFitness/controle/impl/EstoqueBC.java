package br.com.sysconFitness.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.sysconFitness.controle.esp.EstoqueBCI;
import br.com.sysconFitness.dao.EstoqueDaoI;
import br.com.sysconFitness.model.Estoque;

@Controller
public class EstoqueBC implements EstoqueBCI{

	@Autowired
	private EstoqueDaoI dao;
	
	@Override
	public void insert(Estoque estoque) {
		dao.save(estoque);
	}

	@Override
	public void update(Estoque estoque) {
		dao.save(estoque);
	}

	@Override
	public void delete(Estoque estoque) {
		dao.delete(estoque);
	}

	@Override
	public List<Estoque> select() {
		return dao.findAll();
	}
}
