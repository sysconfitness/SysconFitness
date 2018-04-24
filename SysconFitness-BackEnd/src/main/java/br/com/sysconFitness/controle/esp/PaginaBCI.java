package br.com.sysconFitness.controle.esp;

import java.util.List;

import br.com.sysconFitness.model.Pagina;

public interface PaginaBCI {

	public void insert(Pagina atividades);
	public void update(Pagina atividades);
	public void delete(Pagina atividades);
	public List<Pagina> select();
	
}