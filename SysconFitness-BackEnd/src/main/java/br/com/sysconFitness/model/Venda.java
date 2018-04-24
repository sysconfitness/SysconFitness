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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "venda")
@SequenceGenerator(name = "seq_venda", sequenceName = "venda_seq", initialValue = 1, allocationSize = 1)
public class Venda {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_venda")
	private Integer id;
	private Date dtVenda;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
	private AuxVendaProduto auxVendaProduto;
	
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
	@JoinColumn(name = "fk_Colaborador")	
	private Colaborador colaborador;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
	@JoinColumn(name = "fk_cliente")	
	private Cliente cliente;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public AuxVendaProduto getAuxVendaProduto() {
		return auxVendaProduto;
	}

	public void setAuxVendaProduto(AuxVendaProduto auxVendaProduto) {
		this.auxVendaProduto = auxVendaProduto;
	}

	public Colaborador getColaborador() {
		return colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getDtVenda() {
		return dtVenda;
	}

	public void setDtVenda(Date dtVenda) {
		this.dtVenda = dtVenda;
	}
}