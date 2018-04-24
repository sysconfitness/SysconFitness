package br.com.sysconFitness.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.sysconFitness.controle.esp.HistoricoClienteBCI;
import br.com.sysconFitness.dao.HistoricoClienteDaoI;
import br.com.sysconFitness.model.HistoricoCliente;

@Controller
public class HistoricoClienteBC implements HistoricoClienteBCI{

	@Autowired
	private HistoricoClienteDaoI dao;
	
	@Override
	public void insert(HistoricoCliente historicoCliente) {
		dao.save(historicoCliente);
	}

	@Override
	public void update(HistoricoCliente historicoCliente) {
		dao.save(historicoCliente);
	}

	@Override
	public void delete(HistoricoCliente historicoCliente) {
		dao.delete(historicoCliente);
	}

	@Override
	public List<HistoricoCliente> select() {
		return dao.findAll();
	}
}
