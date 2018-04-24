package br.com.sysconFitness.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
@SequenceGenerator(name = "seq_plano", sequenceName = "plano_seq", initialValue = 1, allocationSize = 1)
public class Plano {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_plano")
	private Integer id;
	private String nome;
	private Date dataInicio;
	private Date dataFim;
	private Double valor;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.DETACH, targetEntity = Cliente.class, mappedBy = "plano")
	private List<Cliente> listaClientes;
	
	@ManyToMany
	@JoinTable(name = "Plano_Atividade",
	joinColumns = { @JoinColumn(name = "atidividade_id") }, inverseJoinColumns = {@JoinColumn(name = "plano_id")})
	private List<Atividade> listaAtividades;

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

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public List<Atividade> getListaAtividades() {
		return listaAtividades;
	}

	public void setListaAtividades(List<Atividade> listaAtividades) {
		this.listaAtividades = listaAtividades;
	}	
}