package br.com.sysconFitness.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.sysconFitness.controle.esp.UnidadeBCI;
import br.com.sysconFitness.dao.UnidadeDaoI;
import br.com.sysconFitness.model.Unidade;

@Controller
public class UnidadeBC implements UnidadeBCI{

	@Autowired
	private UnidadeDaoI dao;
	
	@Override
	public void insert(Unidade unidade) {
		dao.save(unidade);
	}

	@Override
	public void update(Unidade unidade) {
		dao.save(unidade);
	}

	@Override
	public void delete(Unidade unidade) {
		dao.delete(unidade);
	}

	@Override
	public List<Unidade> select() {
		return dao.findAll();
	}
}
