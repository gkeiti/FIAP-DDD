public class Contato {
    private String nome;
    private String telefone;
    private Cliente cliente;

    public Cliente getCliente() {
		return cliente;
	}

	public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // public String getCliente() {
    //     return this.cliente.getAll();
    // }
}
