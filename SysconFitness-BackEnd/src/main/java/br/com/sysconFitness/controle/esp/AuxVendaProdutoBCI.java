package br.com.sysconFitness.controle.esp;

import java.util.List;

import br.com.sysconFitness.model.AuxVendaProduto;

public interface AuxVendaProdutoBCI {

	public void insert(AuxVendaProduto auxVendaProduto);
	public void update(AuxVendaProduto auxVendaProduto);
	public void delete(AuxVendaProduto auxVendaProduto);
	public List<AuxVendaProduto> select();
	
}