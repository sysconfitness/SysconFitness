package br.com.sysconFitness.controle.esp;

import java.util.List;

import br.com.sysconFitness.model.Role;

public interface RoleBCI {

	public void insert(Role atividades);
	public void update(Role atividades);
	public void delete(Role atividades);
	public List<Role> select();
	
}