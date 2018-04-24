package br.com.sysconFitness.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.sysconFitness.controle.esp.UsuarioBCI;
import br.com.sysconFitness.dao.UsuarioDaoI;
import br.com.sysconFitness.model.Usuario;

@Controller
public class UsuarioBC implements UsuarioBCI{

	@Autowired
	private UsuarioDaoI dao;
	
	@Override
	public void insert(Usuario usuario) {
		dao.save(usuario);
	}

	@Override
	public void update(Usuario usuario) {
		dao.save(usuario);
	}

	@Override
	public void delete(Usuario usuario) {
		dao.delete(usuario);
	}

	@Override
	public List<Usuario> select() {
		
		return dao.findAll();
	}

	@Override
	public Usuario selectLogin(String login) {
		
		return dao.findByLogin(login);
	}
}
