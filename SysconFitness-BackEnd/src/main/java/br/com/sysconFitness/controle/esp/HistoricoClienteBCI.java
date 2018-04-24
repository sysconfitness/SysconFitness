package br.com.sysconFitness.controle.esp;

import java.util.List;

import br.com.sysconFitness.model.HistoricoCliente;

public interface HistoricoClienteBCI {

	public void insert(HistoricoCliente historicoCliente);
	public void update(HistoricoCliente historicoCliente);
	public void delete(HistoricoCliente historicoCliente);
	public List<HistoricoCliente> select();
	
}