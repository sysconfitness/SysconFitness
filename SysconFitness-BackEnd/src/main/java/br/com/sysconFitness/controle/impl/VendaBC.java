package br.com.sysconFitness.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.sysconFitness.controle.esp.VendaBCI;
import br.com.sysconFitness.dao.VendaDaoI;
import br.com.sysconFitness.model.Venda;

@Controller
public class VendaBC implements VendaBCI{

	@Autowired
	private VendaDaoI dao;
	
	@Override
	public void insert(Venda venda) {
		dao.save(venda);
	}

	@Override
	public void update(Venda venda) {
		dao.save(venda);
	}

	@Override
	public void delete(Venda venda) {
		dao.delete(venda);
	}

	@Override
	public List<Venda> select() {
		return dao.findAll();
	}
}
