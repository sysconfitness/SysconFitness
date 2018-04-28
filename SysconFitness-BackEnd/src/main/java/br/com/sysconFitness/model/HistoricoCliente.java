package br.com.sysconFitness.model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "historico_cliente")
@SequenceGenerator(name = "seq_historico_cliente", sequenceName = "historico_cliente_seq", initialValue = 1, allocationSize = 1)
public class HistoricoCliente {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_historico_cliente")
	private Integer id;
	private String descricao;
	private Calendar data;
	
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

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}
	@Override
	public String toString() {
	    return String.format("%s[id=%d]", getClass().getSimpleName(), getId());
	}
}