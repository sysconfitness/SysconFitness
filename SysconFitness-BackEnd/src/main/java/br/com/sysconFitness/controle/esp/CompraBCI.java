package br.com.sysconFitness.controle.esp;

import java.util.List;

import br.com.sysconFitness.model.Compra;

public interface CompraBCI {

	public void insert(Compra compra);
	public void update(Compra compra);
	public void delete(Compra compra);
	public List<Compra> select();
	
}