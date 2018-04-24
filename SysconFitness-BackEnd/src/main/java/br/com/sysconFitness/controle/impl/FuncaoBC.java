package br.com.sysconFitness.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.sysconFitness.controle.esp.FuncaoBCI;
import br.com.sysconFitness.dao.FuncaoDaoI;
import br.com.sysconFitness.model.Funcao;

@Controller
public class FuncaoBC implements FuncaoBCI{

	@Autowired
	private FuncaoDaoI dao;
	
	@Override
	public void insert(Funcao funcao) {
		dao.save(funcao);
	}

	@Override
	public void update(Funcao funcao) {
		dao.save(funcao);
	}

	@Override
	public void delete(Funcao funcao) {
		dao.delete(funcao);
	}

	@Override
	public List<Funcao> select() {
		return dao.findAll();
	}
}
