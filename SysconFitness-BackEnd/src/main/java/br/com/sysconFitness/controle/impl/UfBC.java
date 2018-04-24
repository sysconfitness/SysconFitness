package br.com.sysconFitness.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.sysconFitness.controle.esp.UfBCI;
import br.com.sysconFitness.dao.UfDaoI;
import br.com.sysconFitness.model.Uf;

@Controller
public class UfBC implements UfBCI {

	@Autowired
	private UfDaoI dao;

	@Override
	public void insert(Uf bean) {
		dao.save(bean);
	}

	@Override
	public void update(Uf bean) {
		dao.save(bean);
	}

	@Override
	public void delete(Uf bean) {
		dao.delete(bean);
	}

	@Override
	public List<Uf> select() {

		return dao.findAll();
	}
}