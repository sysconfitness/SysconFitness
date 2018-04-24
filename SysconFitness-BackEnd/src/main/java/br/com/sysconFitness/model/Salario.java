package br.com.sysconFitness.model;

import java.util.Date;

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
@Table(name = "salario")
@SequenceGenerator(name = "seq_salario", sequenceName = "salario_seq", initialValue = 1, allocationSize = 1)
public class Salario {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_salario")
	private Integer id;
	private Date dataInicio;
	private Date dataFim;
	private Double valor;
	
	/*
	 * eu acho que não tem necessidade dessa entidade... Salário é um atributo da função.
	 */
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
	@JoinColumn(name = "fk_tipo")
	private TipoSalario tipoSalario;
	
	@OneToOne
	private Funcao funcao;

	//Metodos Geters e Seters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public TipoSalario getTipoSalario() {
		return tipoSalario;
	}

	public void setTipoSalario(TipoSalario tipoSalario) {
		this.tipoSalario = tipoSalario;
	}

	public Funcao getFuncao() {
		return funcao;
	}

	public void setFuncao(Funcao funcao) {
		this.funcao = funcao;
	}
}