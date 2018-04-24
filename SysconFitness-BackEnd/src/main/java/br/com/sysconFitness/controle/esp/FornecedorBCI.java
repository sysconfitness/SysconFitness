package br.com.sysconFitness.controle.esp;

import java.util.List;

import br.com.sysconFitness.model.Fornecedor;

public interface FornecedorBCI {

	public void insert(Fornecedor fornecedor);
	public void update(Fornecedor fornecedor);
	public void delete(Fornecedor fornecedor);
	public List<Fornecedor> select();
	
}