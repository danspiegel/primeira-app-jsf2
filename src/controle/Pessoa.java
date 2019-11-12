package controle;

import java.io.Serializable;

public class Pessoa implements Serializable {

	private static final long serialVersionUID = -9025672479701803543L;
	
	private Integer id;
	private String nome;
	private String telefone;
	private Boolean editando;
	
	public Pessoa(Integer id, String nome, String telefone){
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
	}

	//--> Getters e Setters
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Boolean getEditando() {
		return editando;
	}

	public void setEditando(Boolean editando) {
		this.editando = editando;
	}
	
}
