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
@Table(name = "frequencia_cliente")
@SequenceGenerator(name = "seq_frequencia_cliente", sequenceName = "frequencia_cliente_seq", initialValue = 1, allocationSize = 1)
public class FrequenciaCliente {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_frequencia_cliente")
	private Integer id;	
	private Date entrada;
	private Date saida;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
	@JoinColumn(name = "fk_cliente")
	private Cliente cliente;

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
}