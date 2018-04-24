package br.com.sysconFitness.controle.esp;

import java.util.List;

import br.com.sysconFitness.model.Preco;

public interface PrecoBCI {

	public void insert(Preco preco);
	public void update(Preco preco);
	public void delete(Preco preco);
	public List<Preco> select();
	
}