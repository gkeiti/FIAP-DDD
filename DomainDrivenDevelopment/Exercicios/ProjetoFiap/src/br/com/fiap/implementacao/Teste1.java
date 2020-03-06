package br.com.fiap.implementacao;

import javax.swing.JOptionPane;

import br.com.fiap.modelo.Endereco;
import br.com.fiap.modelo.Professor;

public class Teste1 {

	public static void main(String[] args) {
		Professor professor = new Professor();
		professor.setNome(JOptionPane.showInputDialog("Digite o nome"));
		professor.setApelido("ChupChup");
		
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua X");
		endereco.setBairro("Aclimação");
		endereco.setCep("01234-000");
		endereco.setCidade("São Paulo");
		endereco.setNumero("28");
		endereco.setUf("SP");
		
		professor.setEndereco(endereco);
		
		System.out.println(professor.getAll());
		
		System.out.println(professor.getEndereco().getLogradouro());
	}

}
