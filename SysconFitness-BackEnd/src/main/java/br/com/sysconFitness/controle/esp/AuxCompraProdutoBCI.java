package br.com.sysconFitness.controle.esp;

import java.util.List;

import br.com.sysconFitness.model.AuxCompraProduto;

public interface AuxCompraProdutoBCI {

	public void insert(AuxCompraProduto auxCompraProduto);
	public void update(AuxCompraProduto auxCompraProduto);
	public void delete(AuxCompraProduto auxCompraProduto);
	public List<AuxCompraProduto> select();
	
}