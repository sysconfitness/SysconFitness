package br.com.sysconFitness.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.sysconFitness.controle.esp.PrecoBCI;
import br.com.sysconFitness.dao.PrecoDaoI;
import br.com.sysconFitness.model.Preco;

@Controller
public class PrecoBC implements PrecoBCI{

	@Autowired
	private PrecoDaoI dao;
	
	@Override
	public void insert(Preco preco) {
		dao.save(preco);
	}

	@Override
	public void update(Preco preco) {
		dao.save(preco);
	}

	@Override
	public void delete(Preco preco) {
		dao.delete(preco);
	}

	@Override
	public List<Preco> select() {
		return dao.findAll();
	}
}
