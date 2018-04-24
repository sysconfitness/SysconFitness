package br.com.sysconFitness.controle.esp;

import java.util.List;

import br.com.sysconFitness.model.FrequenciaCliente;

public interface FrequenciaBCI {

	public void insert(FrequenciaCliente frequencia);
	public void update(FrequenciaCliente frequencia);
	public void delete(FrequenciaCliente frequencia);
	public List<FrequenciaCliente> select();
	
}