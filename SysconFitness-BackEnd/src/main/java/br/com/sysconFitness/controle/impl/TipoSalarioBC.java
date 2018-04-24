package br.com.sysconFitness.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.sysconFitness.controle.esp.TipoSalarioBCI;
import br.com.sysconFitness.dao.TipoSalarioDaoI;
import br.com.sysconFitness.model.TipoSalario;

@Controller
public class TipoSalarioBC implements TipoSalarioBCI{

	@Autowired
	private TipoSalarioDaoI dao;
	
	@Override
	public void insert(TipoSalario tipoSalario) {
		dao.save(tipoSalario);
	}

	@Override
	public void update(TipoSalario tipoSalario) {
		dao.save(tipoSalario);
	}

	@Override
	public void delete(TipoSalario tipoSalario) {
		dao.delete(tipoSalario);
	}

	@Override
	public List<TipoSalario> select() {
		return dao.findAll();
	}
}
