package br.com.fiap.model;
public class Carrinho {
	private ItemCarrinho itemCarrinho;
    private double valorTotal;
    private boolean efetuada;
    private int entrega;
    private Cliente cliente;
    
    public ItemCarrinho getItemCarrinho() {
		return itemCarrinho;
	}
	public void setItemCarrinho(ItemCarrinho itemCarrinho) {
		this.itemCarrinho = itemCarrinho;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public boolean isEfetuada() {
		return efetuada;
	}
	public void setEfetuada(boolean efetuada) {
		this.efetuada = efetuada;
	}
	public int getEntrega() {
		return entrega;
	}
	public void setEntrega(int entrega) {
		this.entrega = entrega;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}