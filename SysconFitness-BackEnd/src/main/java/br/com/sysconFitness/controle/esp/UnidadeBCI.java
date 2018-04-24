package br.com.sysconFitness.controle.esp;

import java.util.List;

import br.com.sysconFitness.model.Unidade;

public interface UnidadeBCI {

	public void insert(Unidade unidade);
	public void update(Unidade unidade);
	public void delete(Unidade unidade);
	public List<Unidade> select();
	
}