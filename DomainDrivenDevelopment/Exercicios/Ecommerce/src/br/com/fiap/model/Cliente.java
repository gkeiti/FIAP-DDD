package br.com.fiap.model;

public class Cliente {
	private String nome;
	private String document;
	private String email;
	private int tipoCliente;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTipoCliente() {
		return tipoCliente;
	}
	
	public void setTipoCliente(int tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
}
