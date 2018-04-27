package br.com.sysconFitness.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import br.com.sysconFitness.controle.esp.BairroBCI;
import br.com.sysconFitness.dao.BairroDaoI;
import br.com.sysconFitness.model.Bairro;

@Controller
public class BairroBC implements BairroBCI {

	@Autowired
	private BairroDaoI dao;

	@Override
	public void insert(Bairro bean) {
		dao.save(bean);
	}

	@Override
	public void update(Bairro bean) {
		dao.save(bean);
	}

	@Override
	public void delete(Bairro bean) {
		dao.delete(bean);
	}

	@Override
	public List<Bairro> select() {

		return dao.findAll();
	}

	@Override
	public Bairro buscaPeloId(Integer id) {
		
		return dao.findById(id);
	}
}