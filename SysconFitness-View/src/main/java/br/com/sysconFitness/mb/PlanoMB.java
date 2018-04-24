package br.com.sysconFitness.mb;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import br.com.sysconFitness.controle.esp.PlanoBCI;
import br.com.sysconFitness.model.Plano;

@ManagedBean(name = "PlanoMB")
@ViewScoped
public class PlanoMB extends SpringBeanAutowiringSupport {

	private Plano bean;
	private Plano alterarBean;
	private List<Plano> ListaBean;
	
	@Autowired
	private PlanoBCI controle;
	
	@PostConstruct
	public void init() {
		this.bean = new Plano();	
		this.ListaBean = controle.select();
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

	//Metodos Geters e Seters
	public Plano getBean() {
		return bean;
	}

	public void setBean(Plano bean) {
		this.bean = bean;
	}

	public Plano getAlterarBean() {
		return alterarBean;
	}

	public void setAlterarBean(Plano alterarBean) {
		this.alterarBean = alterarBean;
	}

	public List<Plano> getListaBean() {
		return ListaBean;
	}

	public void setListaBean(List<Plano> listaBean) {
		ListaBean = listaBean;
	}	
}