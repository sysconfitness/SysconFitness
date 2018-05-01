package br.com.sysconFitness.mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import br.com.sysconFitness.controle.esp.BairroBCI;
import br.com.sysconFitness.controle.esp.CidadeBCI;
import br.com.sysconFitness.controle.esp.UfBCI;
import br.com.sysconFitness.model.Bairro;
import br.com.sysconFitness.model.Cidade;
import br.com.sysconFitness.model.Uf;

@ManagedBean(name = "BairroMB")
@ViewScoped
public class BairroMB extends SpringBeanAutowiringSupport {

	private Bairro bean;
	private Bairro alterarBean;
	private List<Bairro> listaBean;
	private List<Cidade> listaCidades;
	private List<Uf> listaUfs;
	
	@Autowired
	private BairroBCI controle;
	@Autowired
	private CidadeBCI controleCidade;
	@Autowired 
	private UfBCI controleUf;
	
	@PostConstruct
	public void init() {
		this.bean = new Bairro();	
		this.listaBean = controle.select();
		this.listaCidades = controleCidade.select();
		this.listaUfs = controleUf.select();
	}
	
	public void cadastrar() {
		this.controle.insert(this.bean);
		this.init();
	}
	
	public void cancelar(){
		this.init();
		FacesContext context = 
				FacesContext.getCurrentInstance();
                context.addMessage(null,
        		new FacesMessage("SysconFitness - Aviso",  
        				"Cancelado!!!" ) );
	}
	
	public void excluir(){
		this.controle.delete(this.bean);
		this.init();
		FacesContext context = 
				FacesContext.getCurrentInstance();
        context.addMessage(null,
        		new FacesMessage("SysconFitness - Aviso",  
        				"Registro Exclu�do!!!" ) );
	}
	
	public void preparaUpdate(){
		this.bean = this.alterarBean;	
	}

	//Metodos Geters e Seters
	public Bairro getBean() {
		return bean;
	}

	public void setBean(Bairro bean) {
		this.bean = bean;
	}

	public Bairro getAlterarBean() {
		return alterarBean;
	}

	public void setAlterarBean(Bairro alterarBean) {
		this.alterarBean = alterarBean;
	}

	public List<Bairro> getListaBean() {
		return listaBean;
	}

	public void setListaBean(List<Bairro> listaBean) {
		this.listaBean = listaBean;
	}

	public List<Cidade> getListaCidades() {
		return listaCidades;
	}

	public void setListaCidades(List<Cidade> listaCidades) {
		this.listaCidades = listaCidades;
	}

	public List<Uf> getListaUfs() {
		return listaUfs;
	}

	public void setListaUfs(List<Uf> listaUfs) {
		this.listaUfs = listaUfs;
	}
}