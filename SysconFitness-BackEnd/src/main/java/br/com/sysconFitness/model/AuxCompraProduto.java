package br.com.sysconFitness.model;

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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "aux_compra_produto")
@SequenceGenerator(name = "seq_aux_compra_produto", sequenceName = "aux_compra_produto_seq", initialValue = 1, allocationSize = 1)
public class AuxCompraProduto {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_aux_compra_produto")
	private Integer id;
	
	private Double qdte;
	private Double valor;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
	private Compra compra;
	
	@ManyToMany( fetch = FetchType.EAGER)
	@JoinTable(name = "compra_produto",
			joinColumns = { @JoinColumn(name = "compra_id") }, inverseJoinColumns = {
					@JoinColumn(name = "produto_id") })
	private List<Produto> lstProduto;
	
	//Metodos Geters e Seters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public List<Produto> getLstProduto() {
		return lstProduto;
	}

	public void setLstProduto(List<Produto> lstProduto) {
		this.lstProduto = lstProduto;
	}

	public Double getQdte() {
		return qdte;
	}

	public void setQdte(Double qdte) {
		this.qdte = qdte;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
}
