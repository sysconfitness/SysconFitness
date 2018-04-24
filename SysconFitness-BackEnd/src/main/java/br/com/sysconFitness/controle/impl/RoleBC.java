package br.com.sysconFitness.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.sysconFitness.controle.esp.RoleBCI;
import br.com.sysconFitness.dao.RoleDaoI;
import br.com.sysconFitness.model.Role;

@Controller
public class RoleBC implements RoleBCI{

	@Autowired
	private RoleDaoI dao;
	
	@Override
	public void insert(Role role) {
		dao.save(role);
	}

	@Override
	public void update(Role role) {
		dao.save(role);
	}

	@Override
	public void delete(Role role) {
		dao.delete(role);
	}

	@Override
	public List<Role> select() {
		return dao.findAll();
	}
}
