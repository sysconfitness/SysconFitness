package br.com.sysconFitness.mb;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import br.com.sysconFitness.controle.esp.UsuarioBCI;
import br.com.sysconFitness.model.Usuario;

@ManagedBean(name = "UsuarioMB")
@ViewScoped
public class UsuarioMB extends SpringBeanAutowiringSupport {

	private Usuario bean;
	private Usuario alterarBean;
	private List<Usuario> listaBean;
	
	@Autowired
	private UsuarioBCI controle;
	
	@PostConstruct
	public void init() {
		this.bean = new Usuario();	
		this.listaBean = controle.select();
	}
	
	public void cadastrar() {
		this.bean.setSenha(new BCryptPasswordEncoder().encode(this.bean.getSenha()));
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
	
	public void preparaUpdate(){
		this.bean = this.alterarBean;	
	}
	
//	Metodos Gets e Sets	
	public Usuario getalterarBean() {
		return alterarBean;
	}

	public void setalterarBean(Usuario alterarBean) {
		this.alterarBean = alterarBean;
	}
	
	public Usuario getBean() {
		return bean;
	}

	public void setBean(Usuario bean) {
		this.bean = bean;
	}

	public List<Usuario> getListaBean() {
		return listaBean;
	}

	public void setListaBean(List<Usuario> listaBean) {
		this.listaBean = listaBean;
	}	
}