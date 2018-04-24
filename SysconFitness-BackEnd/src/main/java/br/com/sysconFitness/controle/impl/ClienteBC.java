package br.com.sysconFitness.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.sysconFitness.controle.esp.ClienteBCI;
import br.com.sysconFitness.dao.ClienteDaoI;
import br.com.sysconFitness.model.Cliente;

@Controller
public class ClienteBC implements ClienteBCI{

	@Autowired
	private ClienteDaoI dao;
	
	@Override
	public void insert(Cliente cliente) {
		dao.save(cliente);
	}

	@Override
	public void update(Cliente cliente) {
		dao.save(cliente);
	}

	@Override
	public void delete(Cliente cliente) {
		dao.delete(cliente);
	}

	@Override
	public List<Cliente> select() {
		return dao.findAll();
	}
}
