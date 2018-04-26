package br.com.sysconFitness.mb;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import br.com.sysconFitness.controle.esp.BairroBCI;
import br.com.sysconFitness.controle.esp.ClienteBCI;
import br.com.sysconFitness.model.Bairro;
import br.com.sysconFitness.model.Cliente;

@ManagedBean(name = "ClienteMB")
@ViewScoped
public class ClienteMB extends SpringBeanAutowiringSupport {

	private Cliente bean;
	private Cliente alterarBean;
	private List<Cliente> listaBean;
	
	private List<SelectItem> bairroSelect;
	private Bairro bairroSelecionada ;
	//teste
	private List<Bairro> lstBairro;
	
	private String lableIndicacao;
	private String lableBairro;
	private String lableCidade;
	private String lableUf;
	private String lablePlano;
	private String lableUsuario;
	private Date hoje = new Date();
	
	@Autowired
	private ClienteBCI controle;
	@Autowired
	private BairroBCI ctrBairro;
	
	@PostConstruct
	public void init() {
		this.bean = new Cliente();	
		this.listaBean = controle.select();
		this.lstBairro = ctrBairro.select();
		this.lableIndicacao = "Selecione";
		this.lableBairro = "Selecione ";
		this.lableCidade = "Selecione ";
		this.lableUf = "Selecione";
		this.lablePlano  = "Selecione";
		this.lableUsuario= "Selecione";
	}
	
	
	public void cadastrar() {
		this.bean.setDataCadastro(hoje);
		this.bean.setBairro(bairroSelecionada);
		this.controle.insert(this.bean);
		this.init();
	}
	
	public void cancelar(){
		this.init();
		FacesContext context = 
				FacesContext.getCurrentInstance();
                context.addMessage(null,
        		new FacesMessage("SysconFitness - Aviso",  
        				"Cancelado com sucesso!" ) );
	}
	
	public void excluir(){
		this.controle.delete(this.bean);
		this.init();
		FacesContext context = 
				FacesContext.getCurrentInstance();
        context.addMessage(null,
        		new FacesMessage("SysconFitness - Aviso",  
        				"Deletado com sucesso!" ) );

	}
	
	public void preparaUpdate(){
		init();
		this.bean = this.alterarBean;
		this.alterarBean = new Cliente();
		mostrarSelecaoBairro();
	}
	
	//Mostrar Label na tela

	public void mostrarSelecaoIndicacao() {
		this.lableIndicacao = this.bean.getIndicacao().getNome();
	}
	
	public void mostrarSelecaoBairro() {
		
			if(this.bean.getBairro().getNome() != null) {
			this.lableBairro = this.bean.getBairro().getNome();
			}else {
				this.lableBairro = "OK";
			}
	}
	
	public void mostrarSelecaoCidade() {
		this.lableCidade = this.bean.getCidade().getNome();
	}
	
	public void mostrarSelecaoUf() {
		this.lableUf =  this.bean.getUf().getPrefixo();
	}
	
	public void mostrarSelecaoPlano() {
		this.lablePlano = this.bean.getPlano().getNome();
	}
	
	public void mostrarSelecaoUsuario() {
		this.lableUsuario = this.bean.getUsuario().getLogin();
	}
	
//	Metodos Gets e Sets	
	public String getLableBairro() {
		return lableBairro;
	}

	public void setLableBairro(String lableBairro) {
		this.lableBairro = lableBairro;
	}

	public String getLableIndicacao() {
		return lableIndicacao;
	}
	
	public void setLableIndicacao(String lableIndicacao) {
		this.lableIndicacao = lableIndicacao;
	}

	public Cliente getBean() {
		return bean;
	}
	
	public void setBean(Cliente bean) {
		this.bean = bean;
	}

	public Cliente getAlterarBean() {
		return alterarBean;
	}

	public void setAlterarBean(Cliente alterarBean) {
		this.alterarBean = alterarBean;
	}

	public List<Cliente> getListaBean() {
		return listaBean;
	}

	public void setListaBean(List<Cliente> listaBean) {
		this.listaBean = listaBean;
	}

	public String getLableCidade() {
		return lableCidade;
	}

	public void setLableCidade(String lableCidade) {
		this.lableCidade = lableCidade;
	}

	public String getLableUf() {
		return lableUf;
	}

	public void setLableUf(String lableUf) {
		this.lableUf = lableUf;
	}

	public String getLablePlano() {
		return lablePlano;
	}

	public void setLablePlano(String lablePlano) {
		this.lablePlano = lablePlano;
	}

	public String getLableUsuario() {
		return lableUsuario;
	}

	public void setLableUsuario(String lableUsuario) {
		this.lableUsuario = lableUsuario;
	}

	public Date getHoje() {
		return hoje;
	}

	public void setHoje(Date hoje) {
		this.hoje = hoje;
	}

	public List<SelectItem> getBairroSelect() {
		return bairroSelect;
	}

	public void setBairroSelect(List<SelectItem> bairroSelect) {
		this.bairroSelect = bairroSelect;
	}

	public Bairro getBairroSelecionada() {
		if(this.bairroSelect == null) {
			
			this.bairroSelect = new ArrayList<SelectItem>();
			
	List<Bairro> lstBairro = ctrBairro.select();
			if(lstBairro != null && !lstBairro.isEmpty()) {
				SelectItem item;
				
				for(Bairro bairroLista : lstBairro) {
					item = new SelectItem(bairroLista,bairroLista.getNome());
					this.bairroSelect.add(item);
				}
			}
		}
		
		return bairroSelecionada;
	}

	public void setBairroSelecionada(Bairro bairroSelecionada) {
		this.bairroSelecionada = bairroSelecionada;
	}


	public List<Bairro> getLstBairro() {
		return lstBairro;
	}


	public void setLstBairro(List<Bairro> lstBairro) {
		this.lstBairro = lstBairro;
	}

}