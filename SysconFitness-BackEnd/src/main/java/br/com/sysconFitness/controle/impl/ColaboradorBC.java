package br.com.sysconFitness.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.sysconFitness.controle.esp.ColaboradorBCI;
import br.com.sysconFitness.dao.ColaboradorDaoI;
import br.com.sysconFitness.model.Colaborador;

@Controller
public class ColaboradorBC implements ColaboradorBCI{

	@Autowired
	private ColaboradorDaoI dao;

	@Override
	public void insert(Colaborador colaborador) {
		dao.save(colaborador);
	}

	@Override
	public void update(Colaborador colaborador) {
		dao.save(colaborador);
	}

	@Override
	public void delete(Colaborador colaborador) {
		dao.delete(colaborador);
	}

	@Override
	public List<Colaborador> select() {
		return dao.findAll();
	}
}