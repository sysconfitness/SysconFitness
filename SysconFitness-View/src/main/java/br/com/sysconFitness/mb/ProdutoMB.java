package br.com.sysconFitness.mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import br.com.sysconFitness.controle.esp.ProdutoBCI;
import br.com.sysconFitness.model.Produto;

@ManagedBean(name = "ProdutoMB")
@ViewScoped
public class ProdutoMB extends SpringBeanAutowiringSupport {

	private Produto bean;
	private Produto alterarBean;
	private List<Produto> listaBean;
	
	@Autowired
	private ProdutoBCI controle;
	
	@PostConstruct
	public void init() {
		this.bean = new Produto();	
		this.listaBean = controle.select();
	}
	
	public void cadastrar() {
		this.controle.insert(this.bean);
		this.init();
	}
	
	public void preparaUpdate(){
		this.bean = this.alterarBean;
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
        				"Deletado!!!" ) );
	}

//	Metodos Gets e Sets
	public Produto getAlterarBean() {
		return alterarBean;
	}

	public void setAlterarBean(Produto alterarBean) {
		this.alterarBean = alterarBean;
	}
	
	public Produto getBean() {
		return bean;
	}

	public void setBean(Produto bean) {
		this.bean = bean;
	}

	public List<Produto> getListaBean() {
		return listaBean;
	}

	public void setListaBean(List<Produto> listaBean) {
		this.listaBean = listaBean;
	}
}