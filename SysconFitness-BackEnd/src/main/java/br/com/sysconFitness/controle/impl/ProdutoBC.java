package br.com.sysconFitness.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.sysconFitness.controle.esp.ProdutoBCI;
import br.com.sysconFitness.dao.ProdutoDaoI;
import br.com.sysconFitness.model.Produto;

@Controller
public class ProdutoBC implements ProdutoBCI{

	@Autowired
	private ProdutoDaoI dao;
	
	@Override
	public void insert(Produto produto) {
		dao.save(produto);
	}

	@Override
	public void update(Produto produto) {
		dao.save(produto);
	}

	@Override
	public void delete(Produto produto) {
		dao.delete(produto);
	}

	@Override
	public List<Produto> select() {
		return dao.findAll();
	}
}
