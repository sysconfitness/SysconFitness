package br.com.sysconFitness.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.sysconFitness.controle.esp.AuxCompraProdutoBCI;
import br.com.sysconFitness.dao.AuxCompraProdutoDaoI;
import br.com.sysconFitness.model.AuxCompraProduto;

@Controller
public class AuxCompraProdutoBC implements AuxCompraProdutoBCI{

	@Autowired
	private AuxCompraProdutoDaoI dao;

	@Override
	public void insert(AuxCompraProduto auxCompraProduto) {
		dao.save(auxCompraProduto);
	}

	@Override
	public void update(AuxCompraProduto auxCompraProduto) {
		dao.save(auxCompraProduto);
	}

	@Override
	public void delete(AuxCompraProduto auxCompraProduto) {
		dao.delete(auxCompraProduto);
	}

	@Override
	public List<AuxCompraProduto> select() {
		return dao.findAll();
	}
}