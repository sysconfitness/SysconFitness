package br.com.sysconFitness.mb;

import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import br.com.sysconFitness.controle.esp.AnatomiaBCI;
import br.com.sysconFitness.model.Anatomia;

@ManagedBean(name = "AnatomiaMB")
@ViewScoped
public class AnatomiaMB extends SpringBeanAutowiringSupport {

	private Anatomia bean;
	private Anatomia alterarBean;
	private List<Anatomia> ListaBean;
	private Date hoje = new Date();
	
	//teste de commite
	private String lableCliente;
	
	@Autowired
	private AnatomiaBCI controle;
	
	@PostConstruct
	public void init() {
		this.bean = new Anatomia();	
		this.ListaBean = controle.select();
		this.lableCliente = "Selecione ";
	}
	
	public void cadastrar() {
		this.bean.setDataColeta(hoje);
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
	
	public void mostrarSelecaoCliente() {
		this.lableCliente = this.bean.getCliente().getNome();
	}
	
	//	Metodos Gets e Sets	
	public Anatomia getBean() {
		return bean;
	}

	public void setBean(Anatomia bean) {
		this.bean = bean;
	}

	public Anatomia getAlterarBean() {
		return alterarBean;
	}

	public void setAlterarBean(Anatomia alterarBean) {
		this.alterarBean = alterarBean;
	}

	public List<Anatomia> getListaBean() {
		return ListaBean;
	}

	public void setListaBean(List<Anatomia> listaBean) {
		ListaBean = listaBean;
	}

	public Date getHoje() {
		return hoje;
	}

	public void setHoje(Date hoje) {
		this.hoje = hoje;
	}

	public String getLableCliente() {
		return lableCliente;
	}

	public void setLableCliente(String lableCliente) {
		this.lableCliente = lableCliente;
	}
}