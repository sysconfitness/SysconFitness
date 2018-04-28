package br.com.sysconFitness.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_salario")
@SequenceGenerator(name = "seq_tipo_salario", sequenceName = "tipo_salario_seq", initialValue = 1,allocationSize = 1)
public class TipoSalario {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_tipo_salario")
	private Integer id;
	private String descricao;
	
	/*
	 * eu acho que n�o tem necessidade dessa entidade... Sal�rio � um atributo da fun��o - e pra qu� esse "tipo de sal�rio".
	 */
	
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
	@Override
	public String toString() {
	    return String.format("%s[id=%d]", getClass().getSimpleName(), getId());
	}
}