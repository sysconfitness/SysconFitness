package br.com.sysconFitness.controle.esp;

import java.util.List;

import br.com.sysconFitness.model.Usuario;

public interface UsuarioBCI {

	public void insert(Usuario usuario);
	public void update(Usuario usuario);
	public void delete(Usuario usuario);
	public List<Usuario> select();
	public Usuario selectLogin(String usuario);
	
}