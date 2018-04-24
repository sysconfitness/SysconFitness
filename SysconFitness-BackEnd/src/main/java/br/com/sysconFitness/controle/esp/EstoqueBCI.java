package br.com.sysconFitness.controle.esp;

import java.util.List;

import br.com.sysconFitness.model.Estoque;

public interface EstoqueBCI {

	public void insert(Estoque estoque);
	public void update(Estoque estoque);
	public void delete(Estoque estoque);
	public List<Estoque> select();
	
}