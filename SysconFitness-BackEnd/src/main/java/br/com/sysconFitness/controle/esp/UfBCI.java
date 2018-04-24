package br.com.sysconFitness.controle.esp;

import java.util.List;

import br.com.sysconFitness.model.Uf;

public interface UfBCI {

	public void insert(Uf bean);
	public void update(Uf bean);
	public void delete(Uf bean);
	public List<Uf> select();
	
}