package br.com.sysconFitness.mb;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import br.com.sysconFitness.controle.esp.AtividadeBCI;
import br.com.sysconFitness.model.Atividade;

@ManagedBean(name = "AtividadeMB")
@ViewScoped
public class AtividadeMB extends SpringBeanAutowiringSupport {

	private Atividade bean;
	private Atividade alterarBean;
	private List<Atividade> listaBean;
	
	@Autowired
	private AtividadeBCI controle;
	
	@PostConstruct
	public void init() {
		this.bean = new Atividade();	
		this.listaBean = controle.select();
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
        		new FacesMessage("SysconFitness - Avisoo",  
        				"Registro Excluído!!!" ) );
	}
	
	public void preparaUpdate(){
		this.bean = this.alterarBean;	
	}

	//Metodos Geters e Seters
	public Atividade getBean() {
		return bean;
	}

	public void setBean(Atividade bean) {
		this.bean = bean;
	}

	public Atividade getAlterarBean() {
		return alterarBean;
	}

	public void setAlterarBean(Atividade alterarBean) {
		this.alterarBean = alterarBean;
	}

	public List<Atividade> getListaBean() {
		return listaBean;
	}

	public void setListaBean(List<Atividade> listaBean) {
		this.listaBean = listaBean;
	}
}