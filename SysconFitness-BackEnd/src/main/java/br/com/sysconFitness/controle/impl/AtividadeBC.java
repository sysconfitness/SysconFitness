package br.com.sysconFitness.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.sysconFitness.controle.esp.AtividadeBCI;
import br.com.sysconFitness.dao.AtividadeDaoI;
import br.com.sysconFitness.model.Atividade;

@Controller
public class AtividadeBC implements AtividadeBCI{

	@Autowired
	private AtividadeDaoI dao;

	@Override
	public void insert(Atividade atividades) {
		dao.save(atividades);
	}

	@Override
	public void update(Atividade atividades) {
		dao.save(atividades);	
	}

	@Override
	public void delete(Atividade atividades) {
		dao.delete(atividades);	
	}

	@Override
	public List<Atividade> select() {
		return dao.findAll();
	}
}