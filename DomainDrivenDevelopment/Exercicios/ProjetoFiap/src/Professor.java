
public class Professor {
    private String nome;
	private String apelido;
	private Endereco endereco;

	public String getNome() {
		return nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	
	public String getAll() {
		return "Nome: " + this.nome + "\nApelido: " + this.apelido + "\nEndereço:\n" + endereco.getAll();
	}
	
	public void setAll(String nome, String apelido, Endereco endereco) {
		this.nome = nome;
		this.apelido = apelido;
		this.endereco = endereco;
	}
}
