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
	private String lableIndicacao;
	private String lableBairro;
	private String lableCidade;
	private String lableUf;
	private String lablePlano;
	private String lableUsuario;
	private Date hoje = new Date();
	
	
	//teste
	private List<Bairro> listarBairro;
	
	@Autowired
	private ClienteBCI controle;
	
	@Autowired
	private BairroBCI controleBairro;
	
	@PostConstruct
	public void init() {
		this.bean = new Cliente();	
		this.listaBean = controle.select();
		this.listarBairro = controleBairro.select();
		
		
		
		this.lableIndicacao = "Selecione";
		this.lableBairro = "Selecione ";
		this.lableCidade = "Selecione ";
		this.lableUf = "Selecione";
		this.lablePlano  = "Selecione";
		this.lableUsuario= "Selecione";
	}
	
	public void cadastrar() {
		this.bean.setDataCadastro(hoje);
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
		this.bean = this.alterarBean;	
	}

	public void mostrarSelecaoIndicacao() {
		this.lableIndicacao =this.bean.getIndicacao().getNome();
	}
	
	public void mostrarSelecaoBairro() {
		this.lableBairro =this.bean.getBairro().getNome();
	}
	
	public void mostrarSelecaoCidade() {
		this.lableCidade =this.bean.getCidade().getNome();
	}
	
	public void mostrarSelecaoUf() {
		this.lableUf =this.bean.getUf().getPrefixo();
	}
	
	public void mostrarSelecaoPlano() {
		this.lablePlano =this.bean.getPlano().getNome();
	}
	
	public void mostrarSelecaoUsuario() {
		this.lableUsuario =this.bean.getUsuario().getLogin();
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

	public List<Bairro> getListarBairro() {
		return listarBairro;
	}

	public void setListarBairro(List<Bairro> listarBairro) {
		this.listarBairro = listarBairro;
	}	
}