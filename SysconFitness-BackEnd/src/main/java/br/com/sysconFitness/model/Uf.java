package br.com.sysconFitness.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "uf")
@SequenceGenerator(name = "seq_uf", sequenceName = "uf_seq", initialValue = 1, allocationSize = 1)
public class Uf {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_uf")
	private Integer id;
	private String nome;
	private String prefixo;
	
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

	public String getPrefixo() {
		return prefixo;
	}

	public void setPrefixo(String prefixo) {
		this.prefixo = prefixo;
	}
}