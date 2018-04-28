package br.com.sysconFitness.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "bairro")
@SequenceGenerator(name = "seq_bairro", sequenceName = "bairro_seq", initialValue = 1, allocationSize = 1)
public class Bairro {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_bairro")
	private Integer id;
	private String nome;
	
	//Metodos Geters e Seters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}	
}
