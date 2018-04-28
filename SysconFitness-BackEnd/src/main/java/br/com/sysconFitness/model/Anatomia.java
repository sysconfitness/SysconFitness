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
@Table(name = "anatomia")
@SequenceGenerator(name = "seq_anatomia", sequenceName = "anatomia_seq", initialValue = 1, allocationSize = 1)
public class Anatomia {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_anatomia")
	private Integer id;
	private Date dataColeta;
	private Double altura;
	private Double peso;
	private Double coxa;
	private Double panturrilha;
	private Double peitoral;
	private Double cintura;
	private Double quadril;
	private Double braco;
	private Double antebraco;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
	@JoinColumn(name = "fk_Cliente")
	private Cliente cliente;

	//Metodos Geters e Seters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataColeta() {
		return dataColeta;
	}

	public void setDataColeta(Date dataColeta) {
		this.dataColeta = dataColeta;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getCoxa() {
		return coxa;
	}

	public void setCoxa(Double coxa) {
		this.coxa = coxa;
	}

	public Double getPanturrilha() {
		return panturrilha;
	}

	public void setPanturrilha(Double panturrilha) {
		this.panturrilha = panturrilha;
	}

	public Double getPeitoral() {
		return peitoral;
	}

	public void setPeitoral(Double peitoral) {
		this.peitoral = peitoral;
	}

	public Double getCintura() {
		return cintura;
	}

	public void setCintura(Double cintura) {
		this.cintura = cintura;
	}

	public Double getQuadril() {
		return quadril;
	}

	public void setQuadril(Double quadril) {
		this.quadril = quadril;
	}

	public Double getBraco() {
		return braco;
	}

	public void setBraco(Double braco) {
		this.braco = braco;
	}

	public Double getAntebraco() {
		return antebraco;
	}

	public void setAntebraco(Double antebraco) {
		this.antebraco = antebraco;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	@Override
	public String toString() {
	    return String.format("%s[id=%d]", getClass().getSimpleName(), getId());
	}
}