package br.com.sysconFitness.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "estoque")
@SequenceGenerator(name = "seq_estoque", sequenceName = "estoque_seq", initialValue = 1, allocationSize = 1)
public class Estoque {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_estoque")
	private Integer id;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
	@JoinColumn(name = "fk_Produto")	
	private Produto produto;

	private Double estoqueAtual;
	private Double estoqueMinimo;
	private Double estoqueMaximo;
	private Date primeiraCompra;
	private Date ultimaCompra;
	
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
	public Double getEstoqueAtual() {
		return estoqueAtual;
	}
	public void setEstoqueAtual(Double estoqueAtual) {
		this.estoqueAtual = estoqueAtual;
	}
	public Double getEstoqueMinimo() {
		return estoqueMinimo;
	}
	public void setEstoqueMinimo(Double estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}
	public Double getEstoqueMaximo() {
		return estoqueMaximo;
	}
	public void setEstoqueMaximo(Double estoqueMaximo) {
		this.estoqueMaximo = estoqueMaximo;
	}
	public Date getPrimeiraCompra() {
		return primeiraCompra;
	}
	public void setPrimeiraCompra(Date primeiraCompra) {
		this.primeiraCompra = primeiraCompra;
	}
	public Date getUltimaCompra() {
		return ultimaCompra;
	}
	public void setUltimaCompra(Date ultimaCompra) {
		this.ultimaCompra = ultimaCompra;
	}
}