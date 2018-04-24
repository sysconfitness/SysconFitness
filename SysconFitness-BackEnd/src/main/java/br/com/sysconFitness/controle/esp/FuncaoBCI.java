package br.com.sysconFitness.controle.esp;

import java.util.List;

import br.com.sysconFitness.model.Funcao;

public interface FuncaoBCI {

	public void insert(Funcao funcao);
	public void update(Funcao funcao);
	public void delete(Funcao funcao);
	public List<Funcao> select();
	
}