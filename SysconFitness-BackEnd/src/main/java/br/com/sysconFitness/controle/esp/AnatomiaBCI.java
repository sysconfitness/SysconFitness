package br.com.sysconFitness.controle.esp;

import java.util.List;

import br.com.sysconFitness.model.Anatomia;

public interface AnatomiaBCI {

	public void insert(Anatomia medidaAcompanhamento);
	public void update(Anatomia medidaAcompanhamento);
	public void delete(Anatomia medidaAcompanhamento);
	public List<Anatomia> select();
	
}