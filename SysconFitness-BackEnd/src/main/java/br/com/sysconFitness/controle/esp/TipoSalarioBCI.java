package br.com.sysconFitness.controle.esp;

import java.util.List;

import br.com.sysconFitness.model.TipoSalario;

public interface TipoSalarioBCI {

	public void insert(TipoSalario tipoSalario);
	public void update(TipoSalario tipoSalario);
	public void delete(TipoSalario tipoSalario);
	public List<TipoSalario> select();
	
}