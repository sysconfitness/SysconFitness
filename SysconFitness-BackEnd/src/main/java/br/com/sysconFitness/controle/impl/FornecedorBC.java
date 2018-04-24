package br.com.sysconFitness.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.sysconFitness.controle.esp.FornecedorBCI;
import br.com.sysconFitness.dao.FornecedorDaoI;
import br.com.sysconFitness.model.Fornecedor;

@Controller
public class FornecedorBC implements FornecedorBCI{

	@Autowired
	private FornecedorDaoI dao;
	
	@Override
	public void insert(Fornecedor fornecedor) {
		dao.save(fornecedor);
	}

	@Override
	public void update(Fornecedor fornecedor) {
		dao.save(fornecedor);
	}

	@Override
	public void delete(Fornecedor fornecedor) {
		dao.delete(fornecedor);
	}

	@Override
	public List<Fornecedor> select() {
		return dao.findAll();
	}
}
