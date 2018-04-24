package br.com.sysconFitness.controle.esp;

import java.util.List;

import br.com.sysconFitness.model.Cliente;

public interface ClienteBCI {

	public void insert(Cliente cliente);
	public void update(Cliente cliente);
	public void delete(Cliente cliente);
	public List<Cliente> select();
	
}