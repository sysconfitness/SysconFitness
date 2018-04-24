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
@Table(name = "frequencia_colaborador")
@SequenceGenerator(name = "seq_frequencia_colaborador", sequenceName = "frequencia_colaborador_seq", initialValue = 1, allocationSize = 1)
public class FrequenciaColaborador {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_frequencia_colaborador")
	private Integer id;	
	private Date entrada;
	private Date saida;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
	@JoinColumn(name = "fk_colaborador")
	private Colaborador colaborador;

	//Metodos Geters e Seters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getEntrada() {
		return entrada;
	}

	public void setEntrada(Date entrada) {
		this.entrada = entrada;
	}

	public Date getSaida() {
		return saida;
	}

	public void setSaida(Date saida) {
		this.saida = saida;
	}

	public Colaborador getColaborador() {
		return colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}
}