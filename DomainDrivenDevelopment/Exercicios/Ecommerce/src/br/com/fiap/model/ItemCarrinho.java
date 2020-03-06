package br.com.fiap.model;
public class ItemCarrinho {
    private Ebook ebook;
    private int quantidade;
    private double subtotal;
    
	public String getEbook() {
		return ebook.getAll();
	}
	public void setEbook(Ebook ebook) {
		this.ebook = ebook;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public void setAll(Ebook ebook, int qtde) {
		this.ebook = ebook;
		this.quantidade = qtde;
		this.subtotal = qtde * this.ebook.getValorUnitario();
	}

	public String getAll() {
		return "Ebook: " + this.getEbook() + "\n" +
		"Quantidade: " + this.getQuantidade() + "\n" +
		"Subtotal: " + this.getSubtotal();
	}
}