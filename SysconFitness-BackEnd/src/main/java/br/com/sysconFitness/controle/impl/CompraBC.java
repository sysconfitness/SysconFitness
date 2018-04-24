package br.com.sysconFitness.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.sysconFitness.controle.esp.CompraBCI;
import br.com.sysconFitness.dao.CompraDaoI;
import br.com.sysconFitness.model.Compra;

@Controller
public class CompraBC implements CompraBCI{

	@Autowired
	private CompraDaoI dao;
	
	@Override
	public void insert(Compra compra) {
		dao.save(compra);
	}

	@Override
	public void update(Compra compra) {
		dao.save(compra);
	}

	@Override
	public void delete(Compra compra) {
		dao.delete(compra);
	}

	@Override
	public List<Compra> select() {
		return dao.findAll();
	}
}
