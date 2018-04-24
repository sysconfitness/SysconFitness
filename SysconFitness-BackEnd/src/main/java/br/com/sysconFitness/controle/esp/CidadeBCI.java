package br.com.sysconFitness.controle.esp;

import java.util.List;

import br.com.sysconFitness.model.Cidade;

public interface CidadeBCI {

	public void insert(Cidade bean);
	public void update(Cidade bean);
	public void delete(Cidade bean);
	public List<Cidade> select();
	
}