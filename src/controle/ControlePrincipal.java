package controle;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "controlePrincipal")
@SessionScoped
public class ControlePrincipal implements Serializable {

	private static final long serialVersionUID = -1960369127474814329L;
	private String mensagem;
	
	public ControlePrincipal(){
		mensagem = "Bem vindo a sua primeira aplica��o com JSF 2";
	}
	
	public String sobre(){
		mensagem = "Voc� foi redirecionado de forma din�mica.";
		return "sobre";
	}
	
	public String sobreRedirecionado(){
		mensagem = "Voc� foi redirecionado para a p�gina sobre.xhtml";
		return "sobre?faces-redirect=true";
	}
	
	public String geraErro(){
		return "erro";
	}
	
	public String geraLogin(){
		return "login";
	}

	public String geraErroGrave(){
		return "erro";
	}
	
	//--> Getters e Setters
	
	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
}
