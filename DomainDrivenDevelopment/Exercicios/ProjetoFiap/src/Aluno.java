
public class Aluno {
    private String nome;
    private int rm;
    private String cpf;
    private Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getAll() {
        return "Nome: " + this.nome +
        "\nRM: " + this.rm +
        "\nCPF: " + this.cpf + 
        "\nEndereço: " + this.endereco.getAll();
    }

    public void setAll (String nome, int rm, String cpf, Endereco endereco) {
        this.nome = nome;
        this.rm = rm;
        this.cpf = cpf;
        this.endereco = endereco;
    }
} 