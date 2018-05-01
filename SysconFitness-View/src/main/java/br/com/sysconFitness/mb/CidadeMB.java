package br.com.sysconFitness.mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import br.com.sysconFitness.controle.esp.CidadeBCI;
import br.com.sysconFitness.controle.esp.UfBCI;
import br.com.sysconFitness.model.Cidade;
import br.com.sysconFitness.model.Uf;

@ManagedBean(name = "CidadeMB")
@ViewScoped
public class CidadeMB extends SpringBeanAutowiringSupport {

	private Cidade bean;
	private Cidade alterarBean;
	private List<Cidade> listaBean;
	private List<Uf> listaUfs; 
	
	@Autowired
	private CidadeBCI controle;
	@Autowired
	private UfBCI controleUf;
	
	@PostConstruct
	public void init() {
		this.bean = new Cidade();	
		this.listaBean = controle.select();
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
	public Cidade getBean() {
		return bean;
	}

	public void setBean(Cidade bean) {
		this.bean = bean;
	}

	public Cidade getAlterarBean() {
		return alterarBean;
	}

	public void setAlterarBean(Cidade alterarBean) {
		this.alterarBean = alterarBean;
	}

	public List<Cidade> getListaBean() {
		return listaBean;
	}

	public void setListaBean(List<Cidade> listaBean) {
		this.listaBean = listaBean;
	}

	public List<Uf> getListaUfs() {
		return listaUfs;
	}

	public void setListaUfs(List<Uf> listaUfs) {
		this.listaUfs = listaUfs;
	}


	
}