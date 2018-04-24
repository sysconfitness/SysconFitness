package br.com.sysconFitness.controle.esp;

import java.util.List;

import br.com.sysconFitness.model.Produto;

public interface ProdutoBCI {

	public void insert(Produto produto);
	public void update(Produto produto);
	public void delete(Produto produto);
	public List<Produto> select();
	
}