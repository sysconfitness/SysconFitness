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
	private List<Anatomia> listaBean;
	private List<Anatomia> listaBeanPorCliente;
	private Integer cliente_id=0;
	private Date hoje = new Date();
	
	//teste de commite
	private String lableCliente;
	
	@Autowired
	private AnatomiaBCI controle;
	
	@PostConstruct
	public void init() {
		this.bean = new Anatomia();	
		this.listaBean = controle.select();
		this.lableCliente = "Selecione ";
		
	}
	
	public void cadastrar() {
		this.bean.setDataColeta(this.hoje);
		this.controle.insert(this.bean);
		//*this.init();
	}
	
	public void cancelar(){
		this.init();
		this.listaBeanPorCliente.clear();
		FacesContext context = 
				FacesContext.getCurrentInstance();
                context.addMessage(null,
        		new FacesMessage("SysconFitness - Aviso",  
        				"Cancelado!!!" ) );
	}
	
	public void excluir(){
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
	
	public void mostrarSelecaoCliente() {
		this.lableCliente = this.bean.getCliente().getNome();
		this.listaBeanPorCliente = controle.findByCliente_id(this.bean.getCliente().getId());	
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
		return listaBean;
	}

	public void setListaBean(List<Anatomia> listaBean) {
		this.listaBean = listaBean;
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

	public List<Anatomia> getListaBeanPorCliente() {
		return listaBeanPorCliente;
	}

	public void setListaBeanPorCliente(List<Anatomia> listaBeanPorCliente) {
		this.listaBeanPorCliente = listaBeanPorCliente;
	}

	public Integer getCliente_id() {
		return cliente_id;
	}

	public void setCliente_id(Integer cliente_id) {
		this.cliente_id = cliente_id;
	}
}