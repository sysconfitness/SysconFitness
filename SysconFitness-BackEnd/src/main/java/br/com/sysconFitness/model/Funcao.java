package br.com.sysconFitness.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "funcao")
@SequenceGenerator(name = "seq_funcao", sequenceName = "funcao_seq", initialValue = 1, allocationSize = 1)
public class Funcao {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_funcao")
	private Integer id;
	private String descricao;
	private Double salario;
	
	//Metodos Geters e Seters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
}