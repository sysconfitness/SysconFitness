package br.com.sysconFitness.mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import br.com.sysconFitness.controle.esp.UfBCI;
import br.com.sysconFitness.model.Uf;

@ManagedBean(name = "UfMB")
@ViewScoped
public class UfMB extends SpringBeanAutowiringSupport {

	private Uf bean;
	private Uf alterarBean;
	private List<Uf> listaBean;
	
	@Autowired
	private UfBCI controle;
	
	@PostConstruct
	public void init() {
		this.bean = new Uf();	
		this.listaBean= controle.select();
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
        				"Registro Excluído!!!" ) );
	}
	
	public void preparaUpdate(){
		this.bean = this.alterarBean;	
	}

//	Metodos Gets e Sets	
	public Uf getBean() {
		return bean;
	}

	public void setBean(Uf bean) {
		this.bean = bean;
	}

	public Uf getAlterarBean() {
		return alterarBean;
	}

	public void setAlterarBean(Uf alterarBean) {
		this.alterarBean = alterarBean;
	}

	public List<Uf> getlistaBean() {
		return listaBean;
	}

	public void setlistaBean(List<Uf> listaBean) {
		this.listaBean = listaBean;
	}
}