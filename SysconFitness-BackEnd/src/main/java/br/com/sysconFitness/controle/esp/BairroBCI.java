package br.com.sysconFitness.controle.esp;

import java.util.List;
import br.com.sysconFitness.model.Bairro;

public interface BairroBCI {

	public void insert(Bairro bean);
	public void update(Bairro bean);
	public void delete(Bairro bean);
	public List<Bairro> select();
	
}