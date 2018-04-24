package br.com.sysconFitness.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.sysconFitness.controle.esp.PlanoBCI;
import br.com.sysconFitness.dao.PlanoDaoI;
import br.com.sysconFitness.model.Plano;

@Controller
public class PlanoBC implements PlanoBCI{

	@Autowired
	private PlanoDaoI dao;
	
	@Override
	public void insert(Plano plano) {
		dao.save(plano);
	}

	@Override
	public void update(Plano plano) {
		dao.save(plano);
	}

	@Override
	public void delete(Plano plano) {
		dao.delete(plano);
	}

	@Override
	public List<Plano> select() {
		return dao.findAll();
	}
}
