package br.com.sysconFitness.controle.esp;

import java.util.List;

import br.com.sysconFitness.model.Plano;

public interface PlanoBCI {

	public void insert(Plano plano);
	public void update(Plano plano);
	public void delete(Plano plano);
	public List<Plano> select();
	
}
