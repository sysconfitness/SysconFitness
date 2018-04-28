package br.com.sysconFitness.model;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "aux_venda_produto")
@SequenceGenerator(name = "seq_aux_venda_produto", sequenceName = "aux_venda_produto_seq", initialValue = 1, allocationSize = 1)
public class AuxVendaProduto {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_aux_venda_produto")
	private Integer id;	
	private Double quantidade;
	private Double desconto;
	
	@OneToOne
	private Venda venda;
	
	@ManyToMany( fetch = FetchType.EAGER)
	@JoinTable(name = "venda_produto",
			joinColumns = { @JoinColumn(name = "venda_id") }, inverseJoinColumns = {
					@JoinColumn(name = "produto_id") })
	private List<Produto> lstProduto;

	//Metodos Geters e Seters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

	public List<Produto> getLstProduto() {
		return lstProduto;
	}

	public void setLstProduto(List<Produto> lstProduto) {
		this.lstProduto = lstProduto;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}
	@Override
	public String toString() {
	    return String.format("%s[id=%d]", getClass().getSimpleName(), getId());
	}
}
