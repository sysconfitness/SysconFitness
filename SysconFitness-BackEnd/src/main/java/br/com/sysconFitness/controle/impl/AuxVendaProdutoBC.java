package br.com.sysconFitness.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.sysconFitness.controle.esp.AuxVendaProdutoBCI;
import br.com.sysconFitness.dao.AuxVendaProdutoDaoI;
import br.com.sysconFitness.model.AuxVendaProduto;

@Controller
public class AuxVendaProdutoBC implements AuxVendaProdutoBCI{

	@Autowired
	private AuxVendaProdutoDaoI dao;

	@Override
	public void insert(AuxVendaProduto auxVendaProduto) {
		dao.save(auxVendaProduto);
	}

	@Override
	public void update(AuxVendaProduto auxVendaProduto) {
		dao.save(auxVendaProduto);
	}

	@Override
	public void delete(AuxVendaProduto auxVendaProduto) {
		dao.delete(auxVendaProduto);
	}

	@Override
	public List<AuxVendaProduto> select() {
		return dao.findAll();
	}
}