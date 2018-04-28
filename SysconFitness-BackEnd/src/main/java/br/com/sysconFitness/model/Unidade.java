package br.com.sysconFitness.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "unidade")
@SequenceGenerator(name = "seq_unidade", sequenceName = "unidade_seq", initialValue = 1, allocationSize = 1)
public class Unidade {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_unidade")
	private Integer id;
	private String Descricao;

	//Metodos Geters e Seters
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getDescricao() {
		return Descricao;
	}
	
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	@Override
	public String toString() {
	    return String.format("%s[id=%d]", getClass().getSimpleName(), getId());
	}
}