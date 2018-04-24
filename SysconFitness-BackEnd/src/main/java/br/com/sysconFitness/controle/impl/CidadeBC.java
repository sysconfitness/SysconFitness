package br.com.sysconFitness.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.sysconFitness.controle.esp.CidadeBCI;
import br.com.sysconFitness.dao.CidadeDaoI;
import br.com.sysconFitness.model.Cidade;

@Controller
public class CidadeBC implements CidadeBCI{

	@Autowired
	private CidadeDaoI dao;

	@Override
	public void insert(Cidade bean) {
		dao.save(bean);
	}

	@Override
	public void update(Cidade bean) {
		dao.save(bean);			
	}

	@Override
	public void delete(Cidade bean) {
		dao.delete(bean);
		
	}
	@Override
	public List<Cidade> select() {
		return dao.findAll();
	}
}