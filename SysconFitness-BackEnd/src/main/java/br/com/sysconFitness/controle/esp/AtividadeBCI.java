package br.com.sysconFitness.controle.esp;

import java.util.List;

import br.com.sysconFitness.model.Atividade;

public interface AtividadeBCI {

	public void insert(Atividade atividades);
	public void update(Atividade atividades);
	public void delete(Atividade atividades);
	public List<Atividade> select();
	
}