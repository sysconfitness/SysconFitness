package br.com.sysconFitness.controle.esp;

import java.util.List;

import br.com.sysconFitness.model.Venda;

public interface VendaBCI {

	public void insert(Venda venda);
	public void update(Venda venda);
	public void delete(Venda venda);
	public List<Venda> select();
	
}