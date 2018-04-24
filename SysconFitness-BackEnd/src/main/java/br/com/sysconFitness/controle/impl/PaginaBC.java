package br.com.sysconFitness.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.sysconFitness.controle.esp.PaginaBCI;
import br.com.sysconFitness.dao.PaginaDaoI;
import br.com.sysconFitness.model.Pagina;

@Controller
public class PaginaBC implements PaginaBCI{

	@Autowired
	private PaginaDaoI dao;
	
	@Override
	public void insert(Pagina pagina) {
		dao.save(pagina);
	}

	@Override
	public void update(Pagina pagina) {
		dao.save(pagina);
	}

	@Override
	public void delete(Pagina pagina) {
		dao.delete(pagina);
	}

	@Override
	public List<Pagina> select() {
		return dao.findAll();
	}
}
