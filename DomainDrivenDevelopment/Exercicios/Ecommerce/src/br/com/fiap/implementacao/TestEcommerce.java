package br.com.fiap.implementacao;

import br.com.fiap.model.Ebook;
import br.com.fiap.model.ItemCarrinho;

public class TestEcommerce {

	public static void main(String[] args) {
		Ebook ebook = new Ebook();

		ebook.setAll("Fight Club", "Chuck Palahniuk", 34.9, 1996, "Colecionador 2010");

		ItemCarrinho itemCarrinho = new ItemCarrinho();
		itemCarrinho.setAll(ebook, 2);
		
		System.out.println(itemCarrinho.getAll());
	}

}
