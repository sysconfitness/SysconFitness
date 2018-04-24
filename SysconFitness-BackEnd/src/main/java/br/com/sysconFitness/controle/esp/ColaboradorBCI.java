package br.com.sysconFitness.controle.esp;

import java.util.List;

import br.com.sysconFitness.model.Colaborador;

public interface ColaboradorBCI {

	public void insert(Colaborador colaborador);
	public void update(Colaborador colaborador);
	public void delete(Colaborador colaborador);
	public List<Colaborador> select();
	
}