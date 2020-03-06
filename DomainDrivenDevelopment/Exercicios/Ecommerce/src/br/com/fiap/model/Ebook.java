package br.com.fiap.model;
public class Ebook {
    private String titulo;
    private String autor;
    private double valorUnitario;
    private int anoPublicacao;
    private String edicao;
    
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	public String getEdicao() {
		return edicao;
	}
	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

	public void setAll(String titulo, String autor, double valorUnitario, int anoPublicacao, String edicao) {
		this.titulo = titulo;
		this.autor = autor;
		this.valorUnitario = valorUnitario;
		this.anoPublicacao = anoPublicacao;
		this.edicao = edicao;
	}

	public String getAll() {
		return "Título: " + this.getTitulo() + "\n" +
		"Autor: " + this.getAutor() + "\n" +
		"Valor Unitário: " + this.getValorUnitario() + "\n" +
		"Ano Publicação: " + this.getAnoPublicacao() + "\n" +
		"Edição: " + this.getEdicao();
	}
}