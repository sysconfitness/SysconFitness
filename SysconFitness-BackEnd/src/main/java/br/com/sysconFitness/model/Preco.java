package br.com.sysconFitness.model;

import java.util.Date;


import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "preco")
@SequenceGenerator(name = "seq_preco", sequenceName = "preco_seq", initialValue = 1, allocationSize = 1)
public class Preco {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_preco")
	private Integer id;
	private Double preco;
	private Date dt_fim;
	
	@ManyToOne
	@JoinColumn(name = "fk_produto")
	private Produto produto;

	//Metodos Geters e Seters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Date getDt_fim() {
		return dt_fim;
	}

	public void setDt_fim(Date dt_fim) {
		this.dt_fim = dt_fim;
	}
}